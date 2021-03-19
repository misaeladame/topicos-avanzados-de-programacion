/*------------------------------------------------------------------------------------------
:*                       INSTITUTO TECNOLOGICO DE LA LAGUNA
:*                     INGENIERIA EN SISTEMAS COMPUTACIONALES
:*                       TOPICOS AVANZADOS DE PROGRAMACION "B"
:*
:*                   SEMESTRE: ENE-JUN/2020    HORA: 17-18 HRS
:*
:*                       Clase del evento del JCilindro
:*        
:*  Archivo     : JCilindroEvent.java
:*  Autor       : José Misael Adame Sandoval     18131209
:*  Fecha       : 06/Abr/2020
:*  Compilador  : JAVA J2SE v1.8.0
:*  Descripción : Clase en donde se llama al evento desde el JCilindro
:*                en donde se realizan modificaciones al mismo Bean
:*                     
:*                
:*  Ultima modif:
:*  Fecha       Modificó             Motivo
:*========================================================================================== 
:*  06/Abr/2020 Misael Adame         Agregar prólogo.
:*------------------------------------------------------------------------------------------*/

package mx.edu.itl.eventos;

public class JCilindroEvent {
    
    //----------------------------------------------------------------------------------------
    
    private float nuevoRadio, nuevaAltura, anteriorRadio, anteriorAltura;
    
    //----------------------------------------------------------------------------------------

    public JCilindroEvent () {
        this.nuevoRadio = 0;
        this.nuevaAltura = 0;
        this.anteriorRadio = 0;
        this.anteriorAltura = 0;
    }
    
    //----------------------------------------------------------------------------------------

    public JCilindroEvent ( float nuevoRadio, float nuevaAltura, float anteriorRadio, 
                            float anteriorAltura ) {
        this.nuevoRadio = nuevoRadio;
        this.nuevaAltura = nuevaAltura;
        this.anteriorRadio = anteriorRadio;
        this.anteriorAltura = anteriorAltura;
    }

    //----------------------------------------------------------------------------------------
    
    public float getNuevoRadio () {
        return nuevoRadio;
    }

    //----------------------------------------------------------------------------------------
    
    public void setNuevoRadio ( float nuevoRadio ) {
        this.nuevoRadio = nuevoRadio;
    }

    //----------------------------------------------------------------------------------------
    
    public float getNuevaAltura () {
        return nuevaAltura;
    }

    //----------------------------------------------------------------------------------------
    
    public void setNuevaAltura ( float nuevaAltura ) {
        this.nuevaAltura = nuevaAltura;
    }

    //----------------------------------------------------------------------------------------
    
    public float getAnteriorRadio () {
        return anteriorRadio;
    }

    //----------------------------------------------------------------------------------------
    
    public void setAnteriorRadio ( float anteriorRadio ) {
        this.anteriorRadio = anteriorRadio;
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
