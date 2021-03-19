/*------------------------------------------------------------------------------------------
:*                       INSTITUTO TECNOLOGICO DE LA LAGUNA
:*                     INGENIERIA EN SISTEMAS COMPUTACIONALES
:*                       TOPICOS AVANZADOS DE PROGRAMACION "B"
:*
:*                   SEMESTRE: ENE-JUN/2020    HORA: 17-18 HRS
:*
:*                Clase que realiza cálculos de un Prisma Triangular
:*        
:*  Archivo     : PrismaTriangular.java
:*  Autor       : José Misael Adame Sandoval     18131209
:*  Fecha       : 20/Feb/2020
:*  Compilador  : JAVA J2SE v1.8.0
:*  Descripción : Clase que contiene metodos de calculo para realizar
:*                las siguientes operaciones para un prisma triangular
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
import mx.edu.itl.figuras.TrianguloRectangulo;

public class PrismaTriangular {
    
    //--------------------------------------------------------------------------
    
    private float cateto_a, cateto_b, altura;
    private TrianguloRectangulo baseInf, baseSup;
    private Rectangulo cuerpo;
    
    //--------------------------------------------------------------------------
    
    public PrismaTriangular () {
        cateto_a = 0;
        cateto_b = 0;
        altura = 0;
        baseInf = new TrianguloRectangulo ();
        baseSup = new TrianguloRectangulo ();
        cuerpo = new Rectangulo ();       
    }
    
    //--------------------------------------------------------------------------
    
    public PrismaTriangular ( float cateto_a, float cateto_b, float altura ) {
        this.cateto_a = cateto_a;
        this.cateto_b = cateto_b;
        this.altura = altura;
        baseInf = new TrianguloRectangulo ( cateto_a, cateto_b);
        baseSup = new TrianguloRectangulo ( cateto_a, cateto_b );
        cuerpo = new Rectangulo ( baseInf.perimetro (), altura );
    }
    
    //--------------------------------------------------------------------------
    
    public float areaBase () {
        return baseInf.area ();
    }
    
    //--------------------------------------------------------------------------
    
    public float areaLateral () {
        return cuerpo.area ();
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
        return "Prisma triangular de cateto a = " + cateto_a + " cateto b = " + cateto_b
                + " altura = " + altura;        
    }   
    
    //--------------------------------------------------------------------------
    
    public float getCateto_a () {
        return cateto_a;
    }
    
    //--------------------------------------------------------------------------
    
    public void setCateto_a ( float cateto_a ) {
        this.cateto_a = cateto_a;
        baseInf.setCateto_a ( cateto_a );
        baseSup.setCateto_a ( cateto_a );
        cuerpo.setLargo ( baseInf.perimetro () );
    }
    
    public float getCateto_b () {
        return cateto_b;
    }
    
    //--------------------------------------------------------------------------
    
    public void setCateto_b ( float cateto_b ) {
        this.cateto_b = cateto_b;
        baseInf.setCateto_b ( cateto_b );
        baseSup.setCateto_b ( cateto_b );    
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
