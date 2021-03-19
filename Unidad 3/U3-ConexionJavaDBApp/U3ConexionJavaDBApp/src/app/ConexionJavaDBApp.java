package app;

import java.sql.*;

public class ConexionJavaDBApp {
    
    static String driverJDBC  = "org.apache.derby.jdbc.ClientDriver";
    static String urlConexion = "jdbc:derby://localhost:1527/TAPdb";
    static String usuario     = "topicos";
    static String contrasena  = "1234";
    
    public static void main (String args [] ) {
        
        try {
            // Cargar el driver JDBC
            Class.forName ( driverJDBC );
            
            // Hacer la conexión
            Connection con = DriverManager.getConnection ( urlConexion,
                                                           usuario, contrasena );
            
            if ( con != null ) {
                System.out.println ( "Conexión exitosa =) !!" );
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
                rs.close();
                st.close();
                con.close();
                
            } else {
                System.out.println ( "Conexión no establecida !! " );
            }
        } catch ( ClassNotFoundException ex ) {
            System.out.println ( "Error al cargar el controlador !! " + ex );
        } catch ( SQLException ex ) {
            System.out.println ( "Error de SQL: " + ex );
        }
    }    
}

