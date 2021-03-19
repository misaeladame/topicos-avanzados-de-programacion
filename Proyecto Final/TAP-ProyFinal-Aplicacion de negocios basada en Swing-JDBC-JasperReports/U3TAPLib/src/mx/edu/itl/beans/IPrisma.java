/*------------------------------------------------------------------------------------------
:*                       INSTITUTO TECNOLOGICO DE LA LAGUNA
:*                     INGENIERIA EN SISTEMAS COMPUTACIONALES
:*                       TOPICOS AVANZADOS DE PROGRAMACION "B"
:*
:*                   SEMESTRE: ENE-JUN/2020    HORA: 17-18 HRS
:*
:*                           Clase Interface del Prisma
:*        
:*  Archivo     : IPrisma.java
:*  Autor       : José Misael Adame Sandoval     18131209
:*  Fecha       : 06/Abr/2020
:*  Compilador  : JAVA J2SE v1.8.0
:*  Descripción : Clase Interface que es en donde se basarán los beans
:*                de los Prismas
:*                     
:*                
:*  Ultima modif:
:*  Fecha       Modificó             Motivo
:*========================================================================================== 
:*  06/Abr/2020 Misael Adame         Agregar prólogo.
:*------------------------------------------------------------------------------------------*/

package mx.edu.itl.beans;

public interface IPrisma {
    
    public float areaBase ();

    //----------------------------------------------------------------------------------------
    
    public float areaLateral ();
    
    //----------------------------------------------------------------------------------------

    public float areaTotal ();
    
    //----------------------------------------------------------------------------------------

    public float volumen ();
}
