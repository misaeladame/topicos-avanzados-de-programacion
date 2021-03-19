/*------------------------------------------------------------------------------------------
:*                       INSTITUTO TECNOLOGICO DE LA LAGUNA
:*                     INGENIERIA EN SISTEMAS COMPUTACIONALES
:*                       TOPICOS AVANZADOS DE PROGRAMACION "B"
:*
:*                   SEMESTRE: ENE-JUN/2020    HORA: 17-18 HRS
:*
:*                       Clase que mantiene un arreglo de enteros
:*        
:*  Archivo     : ArregloTec.java
:*  Autor       : José Misael Adame Sandoval     18131209
:*  Fecha       : 29/Ene/2020
:*  Compilador  : JAVA J2SE v1.8.0
:*  Descripción : Clase que permite especificar una lista de enteros dados 
:*                en su constructor y ofrece métodos para determinar:
:*                  1. Lista en orden ascendente
:*                  2. Lista en orden descendente
:*                  3. El número mayor
:*                  4. El número menor
:*                  5. El promedio del cuadrado de los numeros.
:*  Ultima modif:
:*  Fecha       Modificó             Motivo
:*========================================================================================== 
:*  30/Ene/2020 Misael Adame       Agregar prólogo.
:*------------------------------------------------------------------------------------------*/

package ArregloTec;


public class ArregloTec {
    
    private int arreglo [];
    
    public ArregloTec(int arreglo []) {
        this.arreglo = arreglo;      
    }
    
    //-----------------------------------------------------------------------------------
    
    public void getAscendente() {       
        for(int i = 0; i < arreglo.length - 1; i++)
        {
            for(int j = 0; j < arreglo.length - 1; j++)
            {
                if (arreglo[j] > arreglo[j + 1])
                {
                    int tmp = arreglo[j+1];
                    arreglo[j + 1] = arreglo[j];
                    arreglo[j] = tmp;
                }
            }
        }      
        System.out.println("ASCENDENTE:");
        for(int i = 0; i < arreglo.length; i++)
        {  
            System.out.print(arreglo[i] + ", ");
        }
    }
    
    //-----------------------------------------------------------------------------------
    
    public void getDescendente() {
        for(int i = 0; i < arreglo.length - 1; i++)
        {
            for(int j = 0; j < arreglo.length - 1; j++)
            {
                if (arreglo[j] < arreglo[j + 1])
                {
                    int tmp = arreglo[j + 1];
                    arreglo[j + 1] = arreglo[j];
                    arreglo[j] = tmp;
                }
            }
        }      
        System.out.println("\n"); 
        System.out.println("DESCENDENTE:");
        for(int i = 0; i < arreglo.length; i++)
        {  
            System.out.print(arreglo[i] + ", ");
        }
    }
    
    //-----------------------------------------------------------------------------------
    
    public void getMayor() {
        int numeromayor = arreglo[0];
        for(int i = 0; i < arreglo.length; i++) {
            if(arreglo[i] > numeromayor) {
                numeromayor = arreglo[i];               
            } 
        }
        System.out.println("\n");
        System.out.println("MAYOR:");
        System.out.println(numeromayor);
    }
    
    //-----------------------------------------------------------------------------------
    
    public void getMenor() {
        int numeromenor = arreglo[0];
        for(int i = 0; i < arreglo.length; i++) {
            if(arreglo[i] < numeromenor) {
                numeromenor = arreglo[i];               
            } 
        }
        System.out.println();
        System.out.println("MENOR:");
        System.out.println(numeromenor);
    }
    
    //-----------------------------------------------------------------------------------
    
    public void getPromedioCuadrados() {
        int suma = 0;
        for(int i = 0; i < arreglo.length; i++) {
            suma += Math.pow(arreglo[i], 2);
        }
        int promedio = suma / arreglo.length;
        System.out.println("");
        System.out.println("PROMEDIO DE LOS CUADRADOS:");
        System.out.println(promedio);
        
    }
    
    //-----------------------------------------------------------------------------------
    
    public void getInfo() {
        System.out.println("");
        System.out.println("INFORMACION DEL ALUMNO:");
        System.out.println("18131209 ADAME SANDOVAL JOSE MISAEL");
    }
}
