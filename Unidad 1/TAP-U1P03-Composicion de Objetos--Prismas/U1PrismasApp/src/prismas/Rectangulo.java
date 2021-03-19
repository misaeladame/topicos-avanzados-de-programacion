/*------------------------------------------------------------------------------------------
:*                       INSTITUTO TECNOLOGICO DE LA LAGUNA
:*                     INGENIERIA EN SISTEMAS COMPUTACIONALES
:*                       TOPICOS AVANZADOS DE PROGRAMACION "B"
:*
:*                   SEMESTRE: ENE-JUN/2020    HORA: 17-18 HRS
:*
:*                   Clase que realiza cálculos de un Rectangulo
:*        
:*  Archivo     : Rectangulo.java
:*  Autor       : José Misael Adame Sandoval     18131209
:*  Fecha       : 20/Feb/2020
:*  Compilador  : JAVA J2SE v1.8.0
:*  Descripción : Clase que contiene metodos de calculo para realizar
:*                las siguientes formulas y operaciones para un rectangulo
:*                     1. Area
:*                     2. Perimetro
:*                     3. Diagonal
:*                
:*  Ultima modif:
:*  Fecha       Modificó             Motivo
:*========================================================================================== 
:*  23/feb/2020 Misael Adame         Agregar prólogo.
:*------------------------------------------------------------------------------------------*/

package prismas;

public class Rectangulo {
    
    //--------------------------------------------------------------------------
    
    private float largo, ancho;
    
    //--------------------------------------------------------------------------
    
    public Rectangulo () {
        largo = 0;
        ancho = 0;
    }
    
    //--------------------------------------------------------------------------

    public Rectangulo ( float largo, float ancho ) {
        this.largo = largo;
        this.ancho = ancho;
    }
    
    //--------------------------------------------------------------------------

    public float getLargo() {
        return largo;
    }
    
    //--------------------------------------------------------------------------

    public void setLargo(float largo) {
        this.largo = largo;
    }
    
    //--------------------------------------------------------------------------

    public float getAncho() {
        return ancho;
    }
    
    //--------------------------------------------------------------------------

    public void setAncho(float ancho) {
        this.ancho = ancho;
    }
    
    //--------------------------------------------------------------------------

    public float area () {
        return largo * ancho;
    }    
    
    //--------------------------------------------------------------------------
   
    public float perimetro () {
        return ( 2 * largo ) + ( 2 * ancho );
    }
    
    //--------------------------------------------------------------------------
    
    public float diagonal () {
        return ( float ) Math.sqrt ( Math.pow ( largo , 2 ) + Math.pow ( ancho , 2 ) );
    }
}
