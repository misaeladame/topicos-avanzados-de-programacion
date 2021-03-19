package matematicatest;

import mx.edu.itl.calculos.Matematica;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class MatematicaTest {
    
     
    public MatematicaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void factorialTest () {
        assertEquals ( "Factorial ( 0 ): ", 
                        1, Matematica.factorial ( 0 ) );
        assertEquals ( "Facotiral ( 5 ): ",
                        120, Matematica.factorial ( 5 ) );
    }
    
    @Test 
    public void permutacionesTest () {
        assertEquals ( "P ( 8, 5 ): ",
                       6720,
                       Matematica.permutaciones ( 8, 5 ) );
    }
    
    @Test
    public void combinacionesTest () {
        assertEquals ( "C ( 8, 5 ): ",
                       56, Matematica.combinaciones( 8, 5 ) );
    }
}
