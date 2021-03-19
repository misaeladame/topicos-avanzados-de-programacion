/*------------------------------------------------------------------------------------------
:*                       INSTITUTO TECNOLOGICO DE LA LAGUNA
:*                     INGENIERIA EN SISTEMAS COMPUTACIONALES
:*                       TOPICOS AVANZADOS DE PROGRAMACION "B"
:*
:*                   SEMESTRE: ENE-JUN/2020    HORA: 17-18 HRS
:*
:*               Clase que realiza cálculos de un Prisma Rectangular
:*        
:*  Archivo     : PrismaRectangular.java
:*  Autor       : José Misael Adame Sandoval     18131209
:*  Fecha       : 20/Feb/2020
:*  Compilador  : JAVA J2SE v1.8.0
:*  Descripción : Clase que contiene metodos de calculo para realizar
:*                las siguientes operaciones para un Prisma Rectangular
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

package mx.edu.itl.prismas;

import mx.edu.itl.figuras.Rectangulo;

public class PrismaRectangular {
    
    //--------------------------------------------------------------------------
    
    private float largo, ancho, altura;
    private Rectangulo baseInf, baseSup, cuerpo;
    
    //--------------------------------------------------------------------------
    
    public PrismaRectangular () {
        largo = 0;
        ancho = 0;
        altura = 0;
        baseInf = new Rectangulo ();
        baseSup = new Rectangulo ();
        cuerpo = new Rectangulo ();       
    }
    
    //--------------------------------------------------------------------------

    public PrismaRectangular ( float largo, float ancho, float altura ) {
        this.largo = largo;
        this.ancho = ancho;
        this.altura = altura;
        baseInf = new Rectangulo ( largo, ancho );
        baseSup = new Rectangulo ( largo, ancho );
        cuerpo = new Rectangulo ( baseInf.perimetro(), altura );
    }
    
    //--------------------------------------------------------------------------
    
    public float areaBase () {
        return baseInf.area ();
    }
    
    //--------------------------------------------------------------------------
    
    public float areaLateral () {
        return cuerpo.area();
    }
    
    //--------------------------------------------------------------------------
    
    public float areaTotal () {
        return baseInf.area () + baseSup.area () + cuerpo.area ();
    }
    
    //--------------------------------------------------------------------------
    
    public float volumen () {
        return baseInf.area () * altura;
    }
    
    //--------------------------------------------------------------------------
    
    public String toString () {
        return "Prisma rectangular de largo = " + largo + " ancho = " + ancho 
                + " altura = " + altura;       
    }
    
    //--------------------------------------------------------------------------
    
    public float getLargo () {
        return largo;
    }
    
    //--------------------------------------------------------------------------
    
    public void setLargo ( float largo ) {
        this.largo = largo;
        baseInf.setLargo ( largo );
        baseSup.setLargo ( largo );
        cuerpo.setLargo ( baseInf.perimetro () );
    }
    
    //--------------------------------------------------------------------------
    
    public float getAncho () {
        return ancho;
    }
    
    //--------------------------------------------------------------------------
    
    public void setAncho ( float ancho ) {
        this.ancho = ancho;
        baseInf.setAncho ( ancho );
        baseSup.setAncho ( ancho );    
    }
    
    //--------------------------------------------------------------------------
    
    public float getAltura () {
        return altura;
    }
    
    //--------------------------------------------------------------------------
    
    public void setAltura ( float altura ) {
        this.altura = altura;
        cuerpo.setAncho ( altura );
    }        
}