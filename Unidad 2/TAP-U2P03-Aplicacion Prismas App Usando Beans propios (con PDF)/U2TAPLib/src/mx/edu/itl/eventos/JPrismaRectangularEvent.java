/*------------------------------------------------------------------------------------------
:*                       INSTITUTO TECNOLOGICO DE LA LAGUNA
:*                     INGENIERIA EN SISTEMAS COMPUTACIONALES
:*                       TOPICOS AVANZADOS DE PROGRAMACION "B"
:*
:*                   SEMESTRE: ENE-JUN/2020    HORA: 17-18 HRS
:*
:*                       Clase del evento del JPrismaRectangular
:*        
:*  Archivo     : JPrismaRectangularEvent.java
:*  Autor       : José Misael Adame Sandoval     18131209
:*  Fecha       : 06/Abr/2020
:*  Compilador  : JAVA J2SE v1.8.0
:*  Descripción : Clase en donde se llama al evento desde el JPrismaRectangular
:*                en donde se realizan modificaciones al mismo Bean
:*                     
:*                
:*  Ultima modif:
:*  Fecha       Modificó             Motivo
:*========================================================================================== 
:*  06/Abr/2020 Misael Adame         Agregar prólogo.
:*------------------------------------------------------------------------------------------*/

package mx.edu.itl.eventos;

public class JPrismaRectangularEvent {
    
    //----------------------------------------------------------------------------------------
    
    private float nuevoLargo, nuevoAncho, nuevaAltura;
    private float anteriorLargo, anteriorAncho, anteriorAltura;
    
    //----------------------------------------------------------------------------------------
    
    public JPrismaRectangularEvent() {
        this.nuevoLargo = 0;
        this.nuevoAncho = 0;
        this.nuevaAltura = 0;
        this.anteriorLargo = 0;
        this.anteriorAncho = 0;
        this.anteriorAltura = 0;
    }

    //----------------------------------------------------------------------------------------
    
    public JPrismaRectangularEvent (float nuevoLargo, float nuevoAncho, float nuevaAltura, 
                                    float anteriorLargo, float anteriorAncho, float anteriorAltura) {
        this.nuevoLargo = nuevoLargo;
        this.nuevoAncho = nuevoAncho;
        this.nuevaAltura = nuevaAltura;
        this.anteriorLargo = anteriorLargo;
        this.anteriorAncho = anteriorAncho;
        this.anteriorAltura = anteriorAltura;
    }
    
    //----------------------------------------------------------------------------------------

    public float getNuevoLargo() {
        return nuevoLargo;
    }

    //----------------------------------------------------------------------------------------
    
    public void setNuevoLargo(float nuevoLargo) {
        this.nuevoLargo = nuevoLargo;
    }

    //----------------------------------------------------------------------------------------
    
    public float getNuevoAncho() {
        return nuevoAncho;
    }

    //----------------------------------------------------------------------------------------
    
    public void setNuevoAncho(float nuevoAncho) {
        this.nuevoAncho = nuevoAncho;
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
    
    public float getAnteriorLargo() {
        return anteriorLargo;
    }

    //----------------------------------------------------------------------------------------
    
    public void setAnteriorLargo(float anteriorLargo) {
        this.anteriorLargo = anteriorLargo;
    }

    //----------------------------------------------------------------------------------------
    
    public float getAnteriorAncho() {
        return anteriorAncho;
    }

    //----------------------------------------------------------------------------------------
    
    public void setAnteriorAncho(float anteriorAncho) {
        this.anteriorAncho = anteriorAncho;
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
