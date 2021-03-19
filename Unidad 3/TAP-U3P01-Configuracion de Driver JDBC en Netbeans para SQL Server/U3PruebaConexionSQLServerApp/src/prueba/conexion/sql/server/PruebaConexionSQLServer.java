/*------------------------------------------------------------------------------------------
:*                       INSTITUTO TECNOLOGICO DE LA LAGUNA
:*                     INGENIERIA EN SISTEMAS COMPUTACIONALES
:*                       TOPICOS AVANZADOS DE PROGRAMACION "B"
:*
:*                   SEMESTRE: ENE-JUN/2020    HORA: 17-18 HRS
:*
:*                     Clase que conecta a la base de datos
:*        
:*  Archivo     : PruebaConexionSQLServer.java
:*  Autor       : José Misael Adame Sandoval 18131209
:*                Ricardo Raúl Castro Luna 18131227
:*                Jorge Arturo Galindo Uribe 18131238
:*  Fecha       : 26/Abr/2020
:*  Compilador  : JAVA J2SE v1.8.0
:*  Descripción : Esta clase permite la conexión a la base de datos
:*                de sql server, donde se comprueba si la conexión
:*                tuvo éxito o no, donde en caso de éxito hace una
:*                consulta.
:*
:*  Ultima modif:
:*  Fecha       Modificó                   Motivo
:*========================================================================================== 
:*  27/Abr/2020 Ricardo, José, Jorge       Agregar prologo.
:*------------------------------------------------------------------------------------------*/

package prueba.conexion.sql.server;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class PruebaConexionSQLServer {
    
    //----------------------------------------------------------------------------------
    
    static String driverJDBC_SQL = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    static String urlConexion = "jdbc:sqlserver://localhost:1433;databaseName=Topicos";
    static String usuario = "admin";
    static String contrasena = "12345";

    //----------------------------------------------------------------------------------
    
    public static void main ( String args[] ) {
      
        System.out.println ( "CONEXION A BASE DE DATOS SQL Server" );
        
        try {
            Class.forName ( driverJDBC_SQL );
            
            Connection con = DriverManager.getConnection ( urlConexion,
                                                           usuario, contrasena );
            
            if ( con != null ) {
                System.out.println ( "Conexión exitosa!!" );
                System.out.println ( "" );
                Statement st = con.createStatement ();
                ResultSet rs = st.executeQuery( "SELECT * FROM db_accessadmin.Alumnos "
                                              + "ORDER BY Promedio ASC" );
                while ( rs.next() ) {
                    System.out.println(
                            rs.getString ( "numero_control" ) + "    " +
                            rs.getString ( "nombre" ) + "    " +
                            rs.getString ( "edad" ) + "    " +
                            rs.getString ( "promedio" )                                    
                    );
                }
                System.out.println ( "" );
                System.out.println ( "Desarrollado por:" );
                System.out.println ( "1. 18131209 Adame Sandoval José Misael" );
                System.out.println ( "2. 18131227 Castro Luna Ricardo Raúl" );
                System.out.println ( "3. 18131238 Galindo Uribe Jorge Arturo" );
                rs.close();
                st.close();
                con.close();
                
            } else {
                System.out.println ( "Conexión no establecida: " );
            }
        } catch ( ClassNotFoundException ex ) {
            System.out.println ( "Error al cargar el controlador: " + ex );
        } catch ( SQLException ex ) {
            System.out.println ( "Error de SQL: " + ex );
        }
    }      
    
    //----------------------------------------------------------------------------------
}
