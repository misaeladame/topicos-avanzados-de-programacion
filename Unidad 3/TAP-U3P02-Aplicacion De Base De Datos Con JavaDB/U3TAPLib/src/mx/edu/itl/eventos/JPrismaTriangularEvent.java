/*------------------------------------------------------------------------------------------
:*                       INSTITUTO TECNOLOGICO DE LA LAGUNA
:*                     INGENIERIA EN SISTEMAS COMPUTACIONALES
:*                       TOPICOS AVANZADOS DE PROGRAMACION "B"
:*
:*                   SEMESTRE: ENE-JUN/2020    HORA: 17-18 HRS
:*
:*                       Clase del evento del JPrismaTriangular
:*        
:*  Archivo     : JPrismaTriangularEvent.java
:*  Autor       : José Misael Adame Sandoval     18131209
:*  Fecha       : 06/Abr/2020
:*  Compilador  : JAVA J2SE v1.8.0
:*  Descripción : Clase en donde se llama al evento desde el JPrismaTriangular
:*                en donde se realizan modificaciones al mismo Bean
:*                     
:*                
:*  Ultima modif:
:*  Fecha       Modificó             Motivo
:*========================================================================================== 
:*  06/Abr/2020 Misael Adame         Agregar prólogo.
:*------------------------------------------------------------------------------------------*/

package mx.edu.itl.eventos;

public class JPrismaTriangularEvent {
    
    //----------------------------------------------------------------------------------------
    
    private float nuevoCatetoA, nuevoCatetoB, nuevaAltura;
    private float anteriorCatetoA, anteriorCatetoB, anteriorAltura;
    
    //----------------------------------------------------------------------------------------
    
    public JPrismaTriangularEvent() {
        this.nuevoCatetoA = 0;
        this.nuevoCatetoB = 0;
        this.nuevaAltura = 0;
        this.anteriorCatetoA = 0;
        this.anteriorCatetoB = 0;
        this.anteriorAltura = 0;
    }

    //----------------------------------------------------------------------------------------
    
    public JPrismaTriangularEvent(float nuevoCatetoA, float nuevoCatetoB, float nuevaAltura, 
                                 float anteriorCatetoA, float anteriorCatetoB, float anteriorAltura) {
        this.nuevoCatetoA = nuevoCatetoA;
        this.nuevoCatetoB = nuevoCatetoB;
        this.nuevaAltura = nuevaAltura;
        this.anteriorCatetoA = anteriorCatetoA;
        this.anteriorCatetoB = anteriorCatetoB;
        this.anteriorAltura = anteriorAltura;
    }

    //----------------------------------------------------------------------------------------
    
    public float getNuevoCatetoA() {
        return nuevoCatetoA;
    }

    //----------------------------------------------------------------------------------------
    
    public void setNuevoCatetoA(float nuevoCatetoA) {
        this.nuevoCatetoA = nuevoCatetoA;
    }

    //----------------------------------------------------------------------------------------
    
    public float getNuevoCatetoB() {
        return nuevoCatetoB;
    }

    //----------------------------------------------------------------------------------------
    
    public void setNuevoCatetoB(float nuevoCatetoB) {
        this.nuevoCatetoB = nuevoCatetoB;
    }

    //----------------------------------------------------------------------------------------
    
    public float getNuevaAltura() {
        return nuevaAltura;
    }

    //----------------------------------------------------------------------------------------
    
    public void setNuevaAltura(float nuevaAltura) {
        this.nuevaAltura = nuevaAltura;
    }

    //----------------------------------------------------------------------------------------
    
    public float getAnteriorCatetoA() {
        return anteriorCatetoA;
    }

    //----------------------------------------------------------------------------------------
    
    public void setAnteriorCatetoA(float anteriorCatetoA) {
        this.anteriorCatetoA = anteriorCatetoA;
    }

    //----------------------------------------------------------------------------------------
    
    public float getAnteriorCatetoB() {
        return anteriorCatetoB;
    }

    //----------------------------------------------------------------------------------------
    
    public void setAnteriorCatetoB(float anteriorCatetoB) {
        this.anteriorCatetoB = anteriorCatetoB;
    }

    //----------------------------------------------------------------------------------------
    
    public float getAnteriorAltura() {
        return anteriorAltura;
    }

    //----------------------------------------------------------------------------------------
    
    public void setAnteriorAltura(float anteriorAltura) {
        this.anteriorAltura = anteriorAltura;
    } 
}
