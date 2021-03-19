package app;

import java.sql.*;
import jdbc.ConexionDB;

public class ConexionJavaDBSingletonApp {
    
    public static void main (String args [] ) {
        
        try {
            
            ConexionDB.getInstancia().conectar ( ConexionDB.JAVADB, "localhost", 
                                                "1527", "TAPdb", "topicos", "1234" );
            Connection con = ConexionDB.getInstancia().getConexion();
            
            if ( ConexionDB.getInstancia().conectado() ) {
                System.out.println ( "Si se logró la conexion =) !!" );
                Statement st = con.createStatement ();
                ResultSet rs = st.executeQuery( "SELECT * FROM Alumnos " );
                while ( rs.next() ) {
                    System.out.println(
                            rs.getString ( "matricula" ) + " " +
                            rs.getString ( "nombre" ) + " " +
                            rs.getString ( "apellidos" ) + " " +
                            rs.getString ( "edad" ) + " " +
                            rs.getString ( "promedio" )
                    );
                }
                rs.close ();
                st.close ();
                ConexionDB.getInstancia().desconectar();
                
            } else {
                System.out.println ( "No se logró la conexion =(" );
            }
        } catch ( SQLException ex ) {
            System.out.println ( "No se logró la conexión o error en isntrucción SQL: " + ex );
        }
    }    
}

