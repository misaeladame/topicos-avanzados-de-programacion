/*------------------------------------------------------------------------------------------
:*                       INSTITUTO TECNOLOGICO DE LA LAGUNA
:*                     INGENIERIA EN SISTEMAS COMPUTACIONALES
:*                       TOPICOS AVANZADOS DE PROGRAMACION "B"
:*
:*                   SEMESTRE: ENE-JUN/2020    HORA: 17-18 HRS
:*
:*                          Clase que define a un Distribuidor
:*        
:*  Archivo     : Distribuidor.java
:*  Autor       : José Misael Adame Sandoval     18131209
:*                Ricardo Raúl Castro Luna       18131227
:*                Jorge Arturo Galindo Uribe     18131238
:*  Fecha       : 14/Jun/2020
:*  Compilador  : JAVA J2SE v1.8.0
:*  Descripción : Clase que contiene getters/setters de los atributos de un Distribuidor que son:
:*                  - id_Distribuidor
:*                  - nombre_Distribuidor
:*                  - direccion_Distribuidor
:*                  - tipo_Transporte
:*                 
:*                
:*  Ultima modif:
:*  Fecha       Modificó             Motivo
:*========================================================================================== 
:*  14/Jun/2020 Arturo Galindo     Agregar prólogo.
:*------------------------------------------------------------------------------------------*/
package modelo;

public class Distribuidor {

    private int id_Distribuidor;
    private String nombre_Distribuidor;
    private String direccion_Distribuidor;
    private String tipo_Transporte;
    
     //----------------------------------------------------------------------------------------

    public Distribuidor(int id_Distribuidor, String nombre_Distribuidor, String direccion_Distribuidor, String tipo_Transporte) {
        this.id_Distribuidor = id_Distribuidor;
        this.nombre_Distribuidor = nombre_Distribuidor;
        this.direccion_Distribuidor = direccion_Distribuidor;
        this.tipo_Transporte = tipo_Transporte;
    }
    
     //----------------------------------------------------------------------------------------

    public int getId_Distribuidor() {
        return id_Distribuidor;
    }

     //----------------------------------------------------------------------------------------
    public void setId_Distribuidor(int id_Distribuidor) {
        this.id_Distribuidor = id_Distribuidor;
    }
    
     //----------------------------------------------------------------------------------------
    public String getNombre_Distribuidor() {
        return nombre_Distribuidor;
    }

     //----------------------------------------------------------------------------------------
    public void setNombre_Distribuidor(String nombre_Distribuidor) {
        this.nombre_Distribuidor = nombre_Distribuidor;
    }

     //----------------------------------------------------------------------------------------
    public String getDireccion_Distribuidor() {
        return direccion_Distribuidor;
    }

     //----------------------------------------------------------------------------------------
    public void setDireccion_Distribuidor(String direccion_Distribuidor) {
        this.direccion_Distribuidor = direccion_Distribuidor;
    }

     //----------------------------------------------------------------------------------------
    public String getTipo_Transporte() {
        return tipo_Transporte;
    }

     //----------------------------------------------------------------------------------------
    public void setTipo_Transporte(String tipo_Transporte) {
        this.tipo_Transporte = tipo_Transporte;
    }
    
    //----------------------------------------------------------------------------------------
    
        @Override
    public String toString () {
        return nombre_Distribuidor;
    }

}
