/*------------------------------------------------------------------------------------------
:*                       INSTITUTO TECNOLOGICO DE LA LAGUNA
:*                     INGENIERIA EN SISTEMAS COMPUTACIONALES
:*                       TOPICOS AVANZADOS DE PROGRAMACION "B"
:*
:*                   SEMESTRE: ENE-JUN/2020    HORA: 17-18 HRS
:*
:*                       Clase que realiza cálculos de conversiones
:*        
:*  Archivo     : Conversiones.java
:*  Autor       : José Misael Adame Sandoval     18131209
:*  Fecha       : 15/Feb/2020
:*  Compilador  : JAVA J2SE v1.8.0
:*  Descripción : Clase que contiene metodos de calculo estaticos para 
:*                realizar las siguientes conversiones
:*                     1. De °C a °F
:*                     2. De °F a °C
:*                     3. De yardas a metros
:*                     4. De metros a yardas
:*                     5. De libras a kilos
:*                     6. De kilos a libras
:*                     7. De decimal a binario
:*                     8. De binario a decimal
:*                
:*  Ultima modif:
:*  Fecha       Modificó             Motivo
:*========================================================================================== 
:*  16/feb/2020 Misael Adame         Agregar prólogo.
:*------------------------------------------------------------------------------------------*/

package conversiones;

public class Conversiones {
    
    //---------------------------------------------------------------------------

    // Atributos
    private static final float yarda_metro = 0.9144F;
    private static final float libra_kg = 0.454F;
    
    //---------------------------------------------------------------------------
    
    // Metodos de calculo    
    public static float celsiusToFarenheit ( float celsius ) {        
        return  ( celsius * 9 / 5 ) + 32;
    }
    
    //---------------------------------------------------------------------------
    
    public static float farenheitToCelsius ( float farenheit ) {
        return  ( farenheit - 32 ) * 5 / 9 ;
    }
    
    //----------------------------------------------------------------------------
    
    public static float yardasToMetros ( float yardas ) {
        return yardas * yarda_metro;
    }
    
    //---------------------------------------------------------------------------
    
    public static float metrosToYardas ( float metros ) {
        return metros / yarda_metro;
    }
    
    //---------------------------------------------------------------------------
    
    public static float librasToKilogramos ( float libras ) {
        return libras * libra_kg;
    }
    
    //---------------------------------------------------------------------------
    
    public static float kilogramosToLibras ( float kg ) {
        return kg / libra_kg;
    }
    
    //---------------------------------------------------------------------------
    
    public static String decimalToBinario ( int num_dec ) {
        String binario = "";
        int modulo = 0;
        while ( num_dec > 0 ) {
            modulo = num_dec % 2;
            binario = modulo + "" + binario;
            num_dec = num_dec / 2;                
        }
        return binario;       
    }    
    
    //---------------------------------------------------------------------------
    
    public static int binarioToDecimal ( int num_bin ) {
        int decimal = 0, base = 0;
        while( num_bin > 0 ) {
            int ult_digito = num_bin % 10;
            decimal += ult_digito * Math.pow(2, base);
            num_bin = num_bin / 10;          
            base++;
        } 
        return decimal; 
    } 
}
    

