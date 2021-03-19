/*------------------------------------------------------------------------------------------
:*                       INSTITUTO TECNOLOGICO DE LA LAGUNA 
:*                     INGENIERIA EN SISTEMAS COMPUTACIONALES
:*                       TOPICOS AVANZADOS DE PROGRAMACION "B"
:*
:*                   SEMESTRE: ENE-JUN/2020    HORA: 17-18 HRS
:*
:*                          Clase que define a un Producto
:*        
:*  Archivo     : Producto.java
:*  Autor       : José Misael Adame Sandoval     18131209
:*                Ricardo Raúl Castro Luna       18131227
:*                Jorge Arturo Galindo Uribe     18131238
:*  Fecha       : 14/Jun/2020
:*  Compilador  : JAVA J2SE v1.8.0
:*  Descripción : Clase que contiene getters/setters de los atributos de un producto que son:
:*                  - id_Producto
:*                  - id_Fabricante
:*                  - id_Distribuidor
:*                  - modelo_Producto
:*                  - precio_Producto
:*                     
:*                
:*  Ultima modif:
:*  Fecha       Modificó             Motivo
:*========================================================================================== 
:*  14/Jun/2020 Arturo Galindo     Agregar prólogo.
:*------------------------------------------------------------------------------------------*/
package modelo;

public class Producto {

    private int id_Producto;
    private int id_Fabricante;
    private int id_Distribuidor;
    private String modelo_Producto;
    private double precio_Producto;

    //----------------------------------------------------------------------------------------
    public Producto(int id_Producto, int id_Fabricante, int id_Distribuidor, String modelo_Producto, double precio_Producto) {
        this.id_Producto = id_Producto;
        this.id_Fabricante = id_Fabricante;
        this.id_Distribuidor = id_Distribuidor;
        this.modelo_Producto = modelo_Producto;
        this.precio_Producto = precio_Producto;
    }
    //----------------------------------------------------------------------------------------

    public int getId_Producto() {
        return id_Producto;
    }
    //----------------------------------------------------------------------------------------

    public void setId_Producto(int id_Producto) {
        this.id_Producto = id_Producto;
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

    public int getId_Distribuidor() {
        return id_Distribuidor;
    }
    //----------------------------------------------------------------------------------------

    public void setId_Distribuidor(int id_Distribuidor) {
        this.id_Distribuidor = id_Distribuidor;
    }
    //----------------------------------------------------------------------------------------

    public String getModelo_Producto() {
        return modelo_Producto;
    }
    //----------------------------------------------------------------------------------------

    public void setModelo_Producto(String modelo_Producto) {
        this.modelo_Producto = modelo_Producto;
    }
    //----------------------------------------------------------------------------------------

    public double getPrecio_Producto() {
        return precio_Producto;
    }
    //----------------------------------------------------------------------------------------

    public void setPrecio_Producto(double precio_Producto) {
        this.precio_Producto = precio_Producto;
    }
    
    //----------------------------------------------------------------------------------------
   
    
    @Override
    public String toString()
    {
        return modelo_Producto;
    }

}
