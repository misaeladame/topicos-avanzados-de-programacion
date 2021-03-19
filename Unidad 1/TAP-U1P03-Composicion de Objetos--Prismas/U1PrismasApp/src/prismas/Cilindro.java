/*------------------------------------------------------------------------------------------
:*                       INSTITUTO TECNOLOGICO DE LA LAGUNA
:*                     INGENIERIA EN SISTEMAS COMPUTACIONALES
:*                       TOPICOS AVANZADOS DE PROGRAMACION "B"
:*
:*                   SEMESTRE: ENE-JUN/2020    HORA: 17-18 HRS
:*
:*                       Clase que realiza cálculos de un Cilindro
:*        
:*  Archivo     : Cilindro.java
:*  Autor       : José Misael Adame Sandoval     18131209
:*  Fecha       : 20/Feb/2020
:*  Compilador  : JAVA J2SE v1.8.0
:*  Descripción : Clase que contiene metodos de calculo para realizar
:*                las siguientes operaciones para un cilindro
:*                     1. Area Base
:*                     2. Area Lateral
:*                     3. Area Total
:*                     4. Volumen
:*                
:*  Ultima modif:
:*  Fecha       Modificó             Motivo
:*========================================================================================== 
:*  23/feb/2020 Misael Adame         Agregar prólogo.
:*------------------------------------------------------------------------------------------*/

package prismas;

public class Cilindro {
    
    //--------------------------------------------------------------------------
    
    private float radio, altura;
    private Circulo baseInf, baseSup;
    private Rectangulo cuerpo;
    
    //--------------------------------------------------------------------------
    
    public Cilindro(){
        radio = 0;
        altura = 0;
        baseInf = new Circulo ();
        baseSup = new Circulo ();
        cuerpo = new Rectangulo ();        
    }
    
    //--------------------------------------------------------------------------
    
    public Cilindro ( float radio, float altura ) {
        this.radio = radio;
        this.altura = altura;
        baseInf = new Circulo ( radio );
        baseSup = new Circulo ( radio );
        cuerpo = new Rectangulo ( baseInf.circunferencia (), altura );
    }
    
    //--------------------------------------------------------------------------
    
    public float areaBase(){
        return baseInf.area();
    }
    
    //--------------------------------------------------------------------------
    
    public float areaLateral(){
        return cuerpo.area();
    }
    
    //--------------------------------------------------------------------------
    
    public float areaTotal(){
        return baseInf.area() + baseSup.area() + cuerpo.area();
    }
    
    //--------------------------------------------------------------------------
    
    public float volumen(){
        return baseInf.area() * altura;
    }
    
    //--------------------------------------------------------------------------
    
    public String toString(){
        return "Cilindro de radio = " +radio +" altura = " +altura;
    }
    
    //--------------------------------------------------------------------------
    
    public float getRadio(){
        return radio;
    }
    
    //--------------------------------------------------------------------------
    
    public void setRadio ( float radio ) {
        this.radio = radio;
        baseInf.setRadio ( radio );
        baseSup.setRadio ( radio );
        cuerpo.setLargo ( baseInf.circunferencia () );
    }
    
    //--------------------------------------------------------------------------
    
    public float getAltura(){
        return altura;
    }
    
    //--------------------------------------------------------------------------
    
    public void setAltura ( float altura ) {
        this.altura = altura;
        cuerpo.setAncho ( altura );
    }        
}
