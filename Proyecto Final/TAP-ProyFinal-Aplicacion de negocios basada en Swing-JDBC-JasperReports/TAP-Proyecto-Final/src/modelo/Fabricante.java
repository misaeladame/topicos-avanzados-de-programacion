/*------------------------------------------------------------------------------------------
:*                       INSTITUTO TECNOLOGICO DE LA LAGUNA
:*                     INGENIERIA EN SISTEMAS COMPUTACIONALES
:*                       TOPICOS AVANZADOS DE PROGRAMACION "B"
:*
:*                   SEMESTRE: ENE-JUN/2020    HORA: 17-18 HRS
:*
:*                          Clase que define a un Fabricante
:*        
:*  Archivo     : Fabricante.java
:*  Autor       : José Misael Adame Sandoval     18131209
:*                Ricardo Raúl Castro Luna       18131227
:*                Jorge Arturo Galindo Uribe     18131238
:*  Fecha       : 14/Jun/2020
:*  Compilador  : JAVA J2SE v1.8.0
:*  Descripción : Clase que contiene getters/setters de los atributos de un Fabricante que son:
:*                  - id_Fabricante
:*                  - nombre_Fabricante
:*                  - direccion_Fabricante
:*                  - presidente_Fabricante
:*                 
:*                
:*  Ultima modif:
:*  Fecha       Modificó             Motivo
:*========================================================================================== 
:*  14/Jun/2020 Arturo Galindo     Agregar prólogo.
:*------------------------------------------------------------------------------------------*/
package modelo;

public class Fabricante {

    //----------------------------------------------------------------------------------------
    private int id_Fabricante;
    private String nombre_Fabricante;
    private String direccion_Fabricante;
    private String presidente_Fabricante;

    //----------------------------------------------------------------------------------------
    public Fabricante(int id_Fabricante, String nombre_Fabricante, String direccion_Fabricante, String presidente_Fabricante) {
        this.id_Fabricante = id_Fabricante;
        this.nombre_Fabricante = nombre_Fabricante;
        this.direccion_Fabricante = direccion_Fabricante;
        this.presidente_Fabricante = presidente_Fabricante;
    }
    //----------------------------------------------------------------------------------------

    public int getId_Fabricante() {
        return id_Fabricante;
    }

     //----------------------------------------------------------------------------------------
    
    public void setId_Fabricante(int id_Fabricante) {
        this.id_Fabricante = id_Fabricante;
    }
     //----------------------------------------------------------------------------------------

    public String getNombre_Fabricante() {
        return nombre_Fabricante;
    }

     //----------------------------------------------------------------------------------------
    public void setNombre_Fabricante(String nombre_Fabricante) {
        this.nombre_Fabricante = nombre_Fabricante;
    }

     //----------------------------------------------------------------------------------------
    public String getDireccion_Fabricante() {
        return direccion_Fabricante;
    }

     //----------------------------------------------------------------------------------------
    public void setDireccion_Fabricante(String direccion_Fabricante) {
        this.direccion_Fabricante = direccion_Fabricante;
    }

     //----------------------------------------------------------------------------------------
    public String getPresidente_Fabricante() {
        return presidente_Fabricante;
    }

     //----------------------------------------------------------------------------------------
    public void setPresidente_Fabricante(String presidente_Fabricante) {
        this.presidente_Fabricante = presidente_Fabricante;
    }
//----------------------------------------------------------------------------------------
   @Override
    public String toString()
    {
        return nombre_Fabricante;
    }
}
