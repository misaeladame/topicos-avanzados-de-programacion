/*------------------------------------------------------------------------------------------
:*                       INSTITUTO TECNOLOGICO DE LA LAGUNA
:*                     INGENIERIA EN SISTEMAS COMPUTACIONALES
:*                       TOPICOS AVANZADOS DE PROGRAMACION "B"
:*
:*                   SEMESTRE: ENE-JUN/2020    HORA: 17-18 HRS
:*
:*                        Clase que ejecuta sentencias SQL
:*        
:*  Archivo     : EjecutorSQL.java
:*  Autor       : José Misael Adame Sandoval     18131209
:*                Ricardo Raúl Castro Luna       18131227
:*                Jorge Arturo Galindo Uribe     18131238
:*  Fecha       : 24/May/2020
:*  Compilador  : JAVA J2SE v1.8.0
:*  Descripción : Clase que prepara y ejecuta sentencias SQL ya sea de manera directa
:*                o parametrizada, es decir que sustituye argumentos en este caso de 
:*                tipo INT, FLOAT o STRING.
:*
:*                
:*  Ultima modif:
:*  Fecha       Modificó             Motivo
:*========================================================================================== 
:*  24/May/2020 Misael Adame         Agregar prólogo.
:*------------------------------------------------------------------------------------------*/

package mx.edu.itl.jdbc;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EjecutorSQL {
    
    //----------------------------------------------------------------------------------------
    
    public static final String INT = "int";
    public static final String FLOAT = "float";
    public static final String STRING = "string";
       
    //----------------------------------------------------------------------------------------
    // Ejecucion de una sentencia sql directa, no parametrizada. es decir que
    // no requiere sustituir argumentos en ella
    
    public static ResultSet sqlQuery ( String sql ) throws SQLException {
        return sqlQuery ( sql, null );
    }
    
    //----------------------------------------------------------------------------------------
    
    public static ResultSet sqlQuery ( String sql, Object [][] args ) throws SQLException {
              
        PreparedStatement ps = ConexionDB.getInstancia ().getConexion ()                                           .prepareStatement ( sql ); 
       
        prepararArgumentos ( ps, args );
        return ps.executeQuery ();
    }
    
    //----------------------------------------------------------------------------------------
    
    public static int sqlEjecutar ( String sql ) throws SQLException {
        return sqlEjecutar ( sql, null );
    }
    
    //----------------------------------------------------------------------------------------
    
    public static int sqlEjecutar ( String sql, Object [][] args ) throws SQLException {
        PreparedStatement ps = ConexionDB.getInstancia ().getConexion ()
                                                      .prepareStatement ( sql );
        
        prepararArgumentos ( ps, args );
        return ps.executeUpdate ();
    }
    
    //----------------------------------------------------------------------------------------
    
    public static void prepararArgumentos ( PreparedStatement ps, Object [][] args ) 
                                                           throws SQLException {
        
        final int TIPO = 0;
        final int VALOR = 1;
        
        // Verificar si se debe realizar la sustitución de parametros
        if ( args != null ) {
            int numArg = 1;
            for ( Object [] arg : args ) {
                switch ( arg [ TIPO ].toString() ) {
                    case INT : ps.setInt ( 
                                    numArg, 
                                    Integer.parseInt ( arg [ VALOR ].toString() )
                                 );
                                 break;
                        
                    case FLOAT : ps.setFloat (
                                      numArg,
                                      Float.parseFloat ( arg [ VALOR ].toString() )
                                   ); 
                                   break;
                        
                    case STRING : ps.setString (
                                        numArg, 
                                        arg [ VALOR ].toString () 
                                    );                                
                                    break;
                }
                numArg++;
            }
        }   
    }
}
