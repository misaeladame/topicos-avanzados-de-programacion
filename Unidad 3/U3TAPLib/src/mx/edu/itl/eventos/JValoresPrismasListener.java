/*------------------------------------------------------------------------------------------
:*                       INSTITUTO TECNOLOGICO DE LA LAGUNA
:*                     INGENIERIA EN SISTEMAS COMPUTACIONALES
:*                       TOPICOS AVANZADOS DE PROGRAMACION "B"
:*
:*                   SEMESTRE: ENE-JUN/2020    HORA: 17-18 HRS
:*
:*                    Clase Interface del JValoresPrismasListener
:*        
:*  Archivo     : JValoresPrismasListener.java
:*  Autor       : José Misael Adame Sandoval     18131209
:*  Fecha       : 06/Abr/2020
:*  Compilador  : JAVA J2SE v1.8.0
:*  Descripción : Clase Interface que es en donde se basarán los eventos
:*                de los prismas (Listener)
:*                     
:*                
:*  Ultima modif:
:*  Fecha       Modificó             Motivo
:*========================================================================================== 
:*  06/Abr/2020 Misael Adame         Agregar prólogo.
:*------------------------------------------------------------------------------------------*/

package mx.edu.itl.eventos;

public interface JValoresPrismasListener {
    
    public void valoresCilindro( JCilindroEvent evento );
    
    //----------------------------------------------------------------------------------------
    
    public void valoresPrismaRectangular( JPrismaRectangularEvent evento );
    
    //----------------------------------------------------------------------------------------
    
    public void valoresPrismaTriangular ( JPrismaTriangularEvent evento );
    
    //----------------------------------------------------------------------------------------
}
