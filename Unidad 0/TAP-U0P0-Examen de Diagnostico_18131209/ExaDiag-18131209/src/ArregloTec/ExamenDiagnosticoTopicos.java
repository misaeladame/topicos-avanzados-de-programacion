/*------------------------------------------------------------------------------------------
:*                       INSTITUTO TECNOLOGICO DE LA LAGUNA
:*                     INGENIERIA EN SISTEMAS COMPUTACIONALES
:*                       TOPICOS AVANZADOS DE PROGRAMACION "B"
:*
:*                   SEMESTRE: ENE-JUN/2020    HORA: 17-18 HRS
:*
:*                       Aplicación de consola para probar la clase Arreglo Tec
:*        
:*  Archivo     : ExamenDiagnosticoTopicos.java
:*  Autor       : José Misael Adame Sandoval     18131209
:*  Fecha       : 29/Ene/2020
:*  Compilador  : JAVA J2SE v1.8.0
:*  Descripción : Aplicacion que crea un objeto ArregloTec e invoca cada uno
:*                de sus metodos para comprobar su funcionamiento.
:*  Ultima modif:
:*  Fecha       Modificó             Motivo
:*========================================================================================== 
:*  30/Ene/2020 Misael Adame       Agregar prólogo.
:*------------------------------------------------------------------------------------------*/
package ArregloTec;


public class ExamenDiagnosticoTopicos {
    
    //--------------------------------------------------------------------------------------
    
    public static void main(String[] args) {
        int vec [] = new int[]{12, 8, 47, 61, 26, 3, 55};
        
        ArregloTec numeros = new ArregloTec(vec);
        numeros.getAscendente();
        numeros.getDescendente();
        numeros.getMayor();
        numeros.getMenor();
        numeros.getPromedioCuadrados();
        numeros.getInfo();       
    }
}
