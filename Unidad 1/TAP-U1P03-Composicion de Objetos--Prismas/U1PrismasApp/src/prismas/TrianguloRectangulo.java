/*------------------------------------------------------------------------------------------
:*                       INSTITUTO TECNOLOGICO DE LA LAGUNA
:*                     INGENIERIA EN SISTEMAS COMPUTACIONALES
:*                       TOPICOS AVANZADOS DE PROGRAMACION "B"
:*
:*                   SEMESTRE: ENE-JUN/2020    HORA: 17-18 HRS
:*
:*           Clase que realiza cálculos de un triangulo rectangulo
:*        
:*  Archivo     : TrianguloRectangulo.java
:*  Autor       : José Misael Adame Sandoval     18131209
:*  Fecha       : 20/Feb/2020
:*  Compilador  : JAVA J2SE v1.8.0
:*  Descripción : Clase que contiene metodos de calculo para realizar
:*                las siguientes formulas y operaciones para un triangulo
:*                rectángulo.
:*                     1. Area
:*                     2. Hipotenusa
:*                     3. Circunferencia
:*                
:*  Ultima modif:
:*  Fecha       Modificó             Motivo
:*========================================================================================== 
:*  23/feb/2020 Misael Adame         Agregar prólogo.
:*------------------------------------------------------------------------------------------*/

package prismas;

public class TrianguloRectangulo {
    
    //--------------------------------------------------------------------------
    
    private float cateto_a, cateto_b;
    
    //--------------------------------------------------------------------------
    
    public TrianguloRectangulo() {
        cateto_a = 0;
        cateto_b = 0;
    }
    
    //--------------------------------------------------------------------------

    public TrianguloRectangulo(float cateto_a, float cateto_b) {
        this.cateto_a = cateto_a;
        this.cateto_b = cateto_b;
    }
    
    //--------------------------------------------------------------------------

    public float getCateto_a() {
        return cateto_a;
    }
    
    //--------------------------------------------------------------------------

    public void setCateto_a(float cateto_a) {
        this.cateto_a = cateto_a;
    }
    
    //--------------------------------------------------------------------------

    public float getCateto_b() {
        return cateto_b;
    }
    
    //--------------------------------------------------------------------------

    public void setCateto_b(float cateto_b) {
        this.cateto_b = cateto_b;
    }

    //--------------------------------------------------------------------------
    
    public float area() {
        return ( cateto_a * cateto_b ) / 2;
    }
    
    //--------------------------------------------------------------------------
    
    public float hipotenusa () {
        return (float) Math.sqrt(Math.pow(cateto_a, 2) + Math.pow(cateto_b, 2) );
    }
    
    //--------------------------------------------------------------------------
    
    public float perimetro() {
        return cateto_a + cateto_b + hipotenusa();
    }
}
