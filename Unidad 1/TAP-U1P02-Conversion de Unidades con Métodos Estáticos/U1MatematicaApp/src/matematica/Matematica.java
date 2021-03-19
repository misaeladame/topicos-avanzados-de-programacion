/*------------------------------------------------------------------------------------------
:*                       INSTITUTO TECNOLOGICO DE LA LAGUNA
:*                     INGENIERIA EN SISTEMAS COMPUTACIONALES
:*                       TOPICOS AVANZADOS DE PROGRAMACION "B"
:*
:*                   SEMESTRE: ENE-JUN/2020    HORA: 17-18 HRS
:*
:*                       Clase que realiza cálculos de probalidad
:*        
:*  Archivo     : Matematica.java
:*  Autor       : José Misael Adame Sandoval     18131209
:*  Fecha       : 05/Feb/2020
:*  Compilador  : JAVA J2SE v1.8.0
:*  Descripción : Clase que contiene metodos de calculo estaticos para 
:*                realizar las siguientes formulas y operaciones
:*                     1. Factorial
:*                     2. Permutaciones
:*                     3. Combinaciones
:*                
:*  Ultima modif:
:*  Fecha       Modificó             Motivo
:*========================================================================================== 
:*  08/feb/2020 Misael Adame         Agregar prólogo.
:*------------------------------------------------------------------------------------------*/

package matematica;

public class Matematica {
    
    //-------------------------------------------------------------------------
    
    public static long factorial ( int n ) {
        int fact = 1;
        for ( int i = 1; i <= n; i++ )
            fact *= i;
        return fact;
    }
    
    //------------------------------------------------------------------------
    
    public static int permutaciones ( int n, int x ) {
        return ( int ) ( factorial ( n ) / factorial ( n - x) );
    }
    
    //------------------------------------------------------------------------
    
    public static int combinaciones ( int n, int x ) {
        return ( int ) ( permutaciones ( n, x ) / factorial ( x ) );
    }
}
