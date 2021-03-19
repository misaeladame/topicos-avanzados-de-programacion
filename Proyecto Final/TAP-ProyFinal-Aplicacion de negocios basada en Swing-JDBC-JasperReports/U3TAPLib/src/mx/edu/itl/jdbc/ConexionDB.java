/*------------------------------------------------------------------------------------------
:*                       INSTITUTO TECNOLOGICO DE LA LAGUNA
:*                     INGENIERIA EN SISTEMAS COMPUTACIONALES
:*                       TOPICOS AVANZADOS DE PROGRAMACION "B"
:*
:*                   SEMESTRE: ENE-JUN/2020    HORA: 17-18 HRS
:*
:*                      Clase que conecta a una Base de Datos
:*        
:*  Archivo     : ConexionDB.java
:*  Autor       : José Misael Adame Sandoval     18131209
:*                Ricardo Raúl Castro Luna       18131227
:*                Jorge Arturo Galindo Uribe     18131238
:*  Fecha       : 24/May/2020
:*  Compilador  : JAVA J2SE v1.8.0
:*  Descripción : Clase que permite conectarse a diversas bases de datos como:
:*                  - Java DB
:*                  - SQL Server
:*                  - MySQL
:*                  - Oracle XE
:*                  - Access
:*
:*                
:*  Ultima modif:
:*  Fecha       Modificó             Motivo
:*========================================================================================== 
:*  24/May/2020 Misael Adame         Agregar prólogo.
:*------------------------------------------------------------------------------------------*/

package mx.edu.itl.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConexionDB {
    
    public static final String JAVADB = "Java DB";
    public static final String SQLSERVER = "SQL Server";
    public static final String MYSQL = "MySQL";
    public static final String ORACLEXE = "Oracle XE";
    public static final String ACCESS = "MS Access";
    
    private static ConexionDB instancia = null;
    private Connection conexion;
    
    private static String driverJDBC  = "";
    private static String urlConexion = "";
    private static String servidor = "";
    private static String puerto = "";
    private static String baseDeDatos = "";
    private static String usuario     = "";
    private static String contrasena  = "";
    
    private ConexionDB () {
        
        
    }
    
    public static ConexionDB getInstancia () {
        if ( instancia == null )
            instancia = new ConexionDB ();
        return instancia;
    }
    
    
    
    public void conectar ( String dbms, String servidor, String puerto, String bd, 
                           String usuario, String contrasena ) {
        
        ConexionDB.servidor = servidor;
        ConexionDB.puerto = puerto;
        ConexionDB.baseDeDatos = bd;
        ConexionDB.usuario = usuario;
        ConexionDB.contrasena = contrasena;
        
        if ( dbms.equals ( JAVADB ) ) {
            driverJDBC = "org.apache.derby.jdbc.ClientDriver";
            urlConexion = "jdbc:derby://" + servidor + ":" + puerto + "/";
        } else if ( dbms.equals ( SQLSERVER ) ) {
            driverJDBC = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
            urlConexion = "jdbc:sqlserver://" + servidor + ":" + puerto + ";databaseName=";
        } else if ( dbms.equals ( MYSQL ) ) {
            driverJDBC = "com.mysql.cj.jdbc.Driver";
            urlConexion = "jdbc:mysql://" +servidor +":" +puerto +"/?useJDBCCompliantTimezone"
                    + "Shift=true&useLegacyDatetimeCode=false&serverTimezone=UTC&";
        } else if ( dbms.equals ( ORACLEXE ) ) {
            driverJDBC = "oracle.jdbc.OracleDriver";
            urlConexion = "jdbc:oracle:thin:@" +servidor +":" +puerto +":XE";                               
        } else if ( dbms.equals ( ACCESS ) ) {
            driverJDBC = "net.ucanaccess.jdbc.UcanaccessDriver";
            urlConexion = "jdbc:ucanaccess://";
        }
        
        // Intentar hacer la conexión con la BD
        conexion = null;
        try {
            // Realizar la conexion a la DB
            Class.forName ( driverJDBC );
    
            conexion = DriverManager.getConnection ( urlConexion + baseDeDatos,
                                                        usuario, contrasena);
        } catch ( Exception ex ) {
            System.out.println ( ex );
        }
    } 
    
    public Connection getConexion () {
        return conexion;
    }
    
    public void desconectar () {
        if ( conexion != null ) {
            try {
                conexion.close();
            } catch ( SQLException ex ) {
                System.out.println ( ex );
            }
        }
    }
    
    public boolean conectado () {
        if ( conexion != null ) {
            return true;
        }
        return false;
    }
}
