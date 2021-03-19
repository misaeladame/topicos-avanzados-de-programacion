/*------------------------------------------------------------------------------------------
:*                       INSTITUTO TECNOLOGICO DE LA LAGUNA
:*                     INGENIERIA EN SISTEMAS COMPUTACIONALES
:*                       TOPICOS AVANZADOS DE PROGRAMACION "B"
:*
:*                   SEMESTRE: ENE-JUN/2020    HORA: 17-18 HRS
:*
:*                          Clase que hereda de Producto
:*        
:*  Archivo     : Modelo3.java
:*  Autor       : José Misael Adame Sandoval     18131209
:*                Ricardo Raúl Castro Luna       18131227
:*                Jorge Arturo Galindo Uribe     18131238
:*  Fecha       : 24/May/2020
:*  Compilador  : JAVA J2SE v1.8.0
:*  Descripción : Clase que hereda los atributos de Producto y los coloca en un constructor
:*                que permite ser llamado.
:*
:*                
:*  Ultima modif:
:*  Fecha       Modificó             Motivo
:*========================================================================================== 
:*  24/May/2020 Misael Adame         Agregar prólogo.
:*------------------------------------------------------------------------------------------*/

package modelo;

public class Modelo3 extends Producto {

    public Modelo3(int id_Producto, int id_Fabricante, int id_Distribuidor, String modelo_Producto, double precio_Producto){
        super(id_Producto, id_Fabricante, id_Distribuidor, modelo_Producto, precio_Producto);
    }
    
}
