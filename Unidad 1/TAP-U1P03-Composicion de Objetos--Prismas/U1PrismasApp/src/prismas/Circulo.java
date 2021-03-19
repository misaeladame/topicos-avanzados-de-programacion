/*------------------------------------------------------------------------------------------
:*                       INSTITUTO TECNOLOGICO DE LA LAGUNA
:*                     INGENIERIA EN SISTEMAS COMPUTACIONALES
:*                       TOPICOS AVANZADOS DE PROGRAMACION "B"
:*
:*                   SEMESTRE: ENE-JUN/2020    HORA: 17-18 HRS
:*
:*                       Clase que realiza cálculos de un circulo
:*        
:*  Archivo     : Circulo.java
:*  Autor       : José Misael Adame Sandoval     18131209
:*  Fecha       : 20/Feb/2020
:*  Compilador  : JAVA J2SE v1.8.0
:*  Descripción : Clase que contiene metodos de calculo para realizar
:*                las siguientes formulas y operaciones para un circulo
:*                     1. Diametro
:*                     2. Area
:*                     3. Circunferencia
:*                
:*  Ultima modif:
:*  Fecha       Modificó             Motivo
:*========================================================================================== 
:*  23/feb/2020 Misael Adame         Agregar prólogo.
:*------------------------------------------------------------------------------------------*/

package prismas;

public class Circulo {
    
    //--------------------------------------------------------------------------
    
    private float radio;
    
    //--------------------------------------------------------------------------
    
    public Circulo () {
        radio = 0;
    }
    
    //--------------------------------------------------------------------------
    
    public Circulo ( float radio ) {
        this.radio = radio;
    }
    
    //--------------------------------------------------------------------------
    
    public float getRadio () {
        return radio;
    }
    
    //--------------------------------------------------------------------------
    
    public void setRadio ( float radio ) {
        this.radio = radio;
    }
    
    //--------------------------------------------------------------------------
    
    public float diametro () {
        return 2 * radio;
    }
    
    //--------------------------------------------------------------------------
    
    public float area () {
        return (float) (Math.PI * Math.pow(radio, 2));
    } 
    
    //--------------------------------------------------------------------------
    
    public float circunferencia () {
        return (float) (Math.PI * diametro () );
    }
}
