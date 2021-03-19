/*------------------------------------------------------------------------------------------
:*                       INSTITUTO TECNOLOGICO DE LA LAGUNA
:*                     INGENIERIA EN SISTEMAS COMPUTACIONALES
:*                       TOPICOS AVANZADOS DE PROGRAMACION "B"
:*
:*                   SEMESTRE: ENE-JUN/2020    HORA: 17-18 HRS
:*
:*                          Clase que hereda de Distribuidor
:*        
:*  Archivo     : Modelo2.java
:*  Autor       : José Misael Adame Sandoval     18131209
:*                Ricardo Raúl Castro Luna       18131227
:*                Jorge Arturo Galindo Uribe     18131238
:*  Fecha       : 24/May/2020
:*  Compilador  : JAVA J2SE v1.8.0
:*  Descripción : Clase que hereda los atributos de Distribuidor y los coloca en un constructor
:*                que permite ser llamado.
:*
:*                
:*  Ultima modif:
:*  Fecha       Modificó             Motivo
:*========================================================================================== 
:*  24/May/2020 Misael Adame         Agregar prólogo.
:*------------------------------------------------------------------------------------------*/

package modelo;

public class Modelo2 extends Distribuidor {

    public Modelo2(int id_Distribuidor, String nombre_Distribuidor, String direccion_Distribuidor, String tipo_Transporte) {
        super(id_Distribuidor, nombre_Distribuidor, direccion_Distribuidor, tipo_Transporte);
    }
    
}
