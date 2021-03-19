/*------------------------------------------------------------------------------------------
:*                       INSTITUTO TECNOLOGICO DE LA LAGUNA
:*                     INGENIERIA EN SISTEMAS COMPUTACIONALES
:*                       TOPICOS AVANZADOS DE PROGRAMACION "B"
:*
:*                   SEMESTRE: ENE-JUN/2020    HORA: 17-18 HRS
:*
:*                      Clase JUnit que realiza pruebas de los métodos
:*        
:*  Archivo     : ConversionesTest.java
:*  Autor       : José Misael Adame Sandoval     18131209
:*  Fecha       : 15/Feb/2020
:*  Compilador  : JAVA J2SE v1.8.0
:*  Descripción : Clase que contiene métodos de prueba (testing) e invoca
:*                a cada uno de los métodos de la clase Conversiones para
:*                comprobar su funcionamiento asignando un valor y su 
:*                resultado esperado.
:*                
:*                
:*  Ultima modif:
:*  Fecha       Modificó             Motivo
:*========================================================================================== 
:*  17/feb/2020 Misael Adame         Agregar prólogo 
:*------------------------------------------------------------------------------------------*/

package conversionestest;

import conversiones.Conversiones;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ConversionesTest {
    
    //--------------------------------------------------------------------------
    
    public ConversionesTest() {
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
    public void celsiusToFarenheitTest () {
        assertEquals ("38 °C a °F: " , 100.4, 
                      Conversiones.celsiusToFarenheit ( 38 ), 0.0005 );
    }

    //--------------------------------------------------------------------------    
    
    @Test
    public void farenheitToCelsiusTest () {
        assertEquals ("73.4 °F a °C: " , 23.0, 
                      Conversiones.farenheitToCelsius ( 73.4f ), 0.0005 );
    }

    //--------------------------------------------------------------------------
    
    @Test
    public void yardasToMetrosTest () {
        assertEquals ("8 Yardas a Metros: " , 7.3152, 
                      Conversiones.yardasToMetros ( 8 ), 0.00005 );
    }

    //--------------------------------------------------------------------------
    
    @Test
    public void metrosToYardasTest () {
        assertEquals ("15 Metros a : " , 16.4042, 
                      Conversiones.metrosToYardas ( 15 ), 0.00005 );
    }

    //--------------------------------------------------------------------------
    
    @Test
    public void librasToKilogramosTest () {
        assertEquals ("0.5 libras a Kilogramos: " , 0.227, 
                      Conversiones.librasToKilogramos ( 0.5f ), 0.0005 );
    }

    //--------------------------------------------------------------------------
    
    @Test
    public void kilogramosToMetrosTest () {
        assertEquals ("22 Kilogramos a Libras: " , 48.45815, 
                      Conversiones.kilogramosToLibras ( 22 ), 0.000005 );
    }

    //--------------------------------------------------------------------------
    
    @Test
    public void decimalToBinarioTest () {
        assertEquals ("29 en Decimal a Binario: " , "11101", 
                      Conversiones.decimalToBinario ( 29 ) );
    }

    //--------------------------------------------------------------------------
    
    @Test
    public void binarioToDecimalTest () {
        assertEquals ("10101 en Binario a Decimal: " , 21, 
                      Conversiones.binarioToDecimal ( 10101 ) );
    }
}
