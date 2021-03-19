/*------------------------------------------------------------------------------------------
:*                       INSTITUTO TECNOLOGICO DE LA LAGUNA
:*                     INGENIERIA EN SISTEMAS COMPUTACIONALES
:*                       TOPICOS AVANZADOS DE PROGRAMACION "B"
:*
:*                   SEMESTRE: ENE-JUN/2020    HORA: 17-18 HRS
:*
:*               Aplicación JUnit que realiza prueba de los métodos
:*        
:*  Archivo     : PrismasTest.java
:*  Autor       : José Misael Adame Sandoval     18131209
:*  Fecha       : 23/Feb/2020
:*  Compilador  : JAVA J2SE v1.8.0
:*  Descripción : Clase que contiene métodos de prueba (testing) e invoca
:*                a cada uno de los métodos de las clases Cilindro,
:*                Prisma Rectangular, Prisma Triangular para
:*                comprobar su funcionamiento asignando un valor y su
:*                resultado esperado.
:*                
:*  Ultima modif:
:*  Fecha       Modificó             Motivo
:*========================================================================================== 
:*  24/feb/2020 Misael Adame         Agregar prólogo.
:*------------------------------------------------------------------------------------------*/

package pruebas;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import mx.edu.itl.prismas.Cilindro;
import mx.edu.itl.prismas.PrismaRectangular;
import mx.edu.itl.prismas.PrismaTriangular;

public class PrismasTest {
    
    //--------------------------------------------------------------------------
    
    public PrismasTest() {
    }
    
    //--------------------------------------------------------------------------
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    //--------------------------------------------------------------------------
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    //--------------------------------------------------------------------------
    
    @Before
    public void setUp() {
    }
    
    //--------------------------------------------------------------------------
    
    @After
    public void tearDown() {
    }
    
    //--------------------------------------------------------------------------
    
    @Test
    public void cilindroTest () {
        // Prueba del constructor de default
        Cilindro c = new Cilindro ();
        assertEquals ( "Cilindro Area de Base", 0.0, c.areaBase(), 0.1 );
        assertEquals ( "Cilindro Area Lateral", 0.0, c.areaLateral(), 0.1 );
        assertEquals ( "Cilindro Area Total", 0.0, c.areaTotal(), 0.1 );
        assertEquals ( "Cilindro volumen", 0.0, c.volumen(), 0.1 );
        
        // Prueba de cilindro con dimensiones
        c = new Cilindro ( 5.1f, 12.82f );
        assertEquals ( "Cilindro Area de Base", 81.7128, c.areaBase(), 0.0001 );
        assertEquals ( "Cilindro Area Lateral", 410.8072, c.areaLateral(), 0.0001 );
        assertEquals ( "Cilindro Area Total", 574.2328, c.areaTotal(), 0.0001 );
        assertEquals ( "Cilindro volumen", 1047.5583, c.volumen(), 0.0001 );
        
        // Prueba estableciendo las dimensiones con los metodos setter
        c = new Cilindro();
        c.setRadio( 5.1f );
        c.setAltura ( 12.82f );
        assertEquals ( "Cilindro Area de Base", 81.7128, c.areaBase(), 0.0001 );
        assertEquals ( "Cilindro Area Lateral", 410.8072, c.areaLateral(), 0.0001 );
        assertEquals ( "Cilindro Area Total", 574.2328, c.areaTotal(), 0.0001 );
        assertEquals ( "Cilindro volumen", 1047.5583, c.volumen(), 0.0001 );
    }
    
    //--------------------------------------------------------------------------
    
    @Test
    public void prismaRectangularTest () {
         // Prueba del constructor de default
        PrismaRectangular pr = new PrismaRectangular ();
        assertEquals ( "Prisma Rectangular Area de Base", 0.0, pr.areaBase(), 0.1 );
        assertEquals ( "Prisma Rectangular Area Lateral", 0.0, pr.areaLateral(), 0.1 );
        assertEquals ( "Prisma Rectangular Area Total", 0.0, pr.areaTotal(), 0.1 );
        assertEquals ( "Prisma Rectangular volumen", 0.0, pr.volumen(), 0.1 );
        
        // Prueba con dimensiones
        pr = new PrismaRectangular( 8.0f, 4.0f, 7.0f );
        assertEquals ( "Prisma Rectangular Area de Base", 32.0, pr.areaBase(), 0.0001 );
        assertEquals ( "Prisma Rectangular Area Lateral", 168.0, pr.areaLateral(), 0.0001 );
        assertEquals ( "Prisma Rectangular Area Total", 232.0, pr.areaTotal(), 0.0001 );
        assertEquals ( "Prisma Rectangular volumen", 224.0, pr.volumen(), 0.0001 );
        
    }
    
    //--------------------------------------------------------------------------
    
    @Test
    public void prismaTriangularTest () {
         // Prueba del constructor de default
        PrismaTriangular pt = new PrismaTriangular ();
        assertEquals ( "Prisma Triangular Area de Base", 0.0, pt.areaBase(), 0.1 );
        assertEquals ( "Prisma Triangular Area Lateral", 0.0, pt.areaLateral(), 0.1 );
        assertEquals ( "Prisma Triangular Area Total", 0.0, pt.areaTotal(), 0.1 );
        assertEquals ( "Prisma Triangular volumen", 0.0, pt.volumen(), 0.1 );
        
        // Prueba con dimensiones
        pt = new PrismaTriangular( 5.5f, 4.5f, 6.2f );
        assertEquals ( "Prisma Triangular Area de Base", 12.375, pt.areaBase(), 0.001 );
        assertEquals ( "Prisma Triangular Area Lateral", 106.059, pt.areaLateral(), 0.001 );
        assertEquals ( "Prisma Triangular Area Total", 130.809, pt.areaTotal(), 0.001 );
        assertEquals ( "Prisma Triangular volumen", 76.725, pt.volumen(), 0.001 );    
    }
}
