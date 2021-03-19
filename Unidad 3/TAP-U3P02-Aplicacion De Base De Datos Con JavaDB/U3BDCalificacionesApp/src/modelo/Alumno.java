/*------------------------------------------------------------------------------------------
:*                       INSTITUTO TECNOLOGICO DE LA LAGUNA
:*                     INGENIERIA EN SISTEMAS COMPUTACIONALES
:*                       TOPICOS AVANZADOS DE PROGRAMACION "B"
:*
:*                   SEMESTRE: ENE-JUN/2020    HORA: 17-18 HRS
:*
:*                          Clase que define a un Alumno
:*        
:*  Archivo     : Alumno.java
:*  Autor       : José Misael Adame Sandoval     18131209
:*                Ricardo Raúl Castro Luna       18131227
:*                Jorge Arturo Galindo Uribe     18131238
:*  Fecha       : 24/May/2020
:*  Compilador  : JAVA J2SE v1.8.0
:*  Descripción : Clase que contiene getters/setters de los atributos de un alumno que son:
:*                  - Matricula
:*                  - Nombre
:*                  - Apellidos
:*                  - Edad
:*                  - Promedio
:*                     
:*                
:*  Ultima modif:
:*  Fecha       Modificó             Motivo
:*========================================================================================== 
:*  24/May/2020 Misael Adame         Agregar prólogo.
:*------------------------------------------------------------------------------------------*/

package modelo;

public class Alumno {
    
    //----------------------------------------------------------------------------------------
    
    private String matricula;
    private String nombre;
    private String apellidos;
    private int edad;
    private float promedio;
    
    //----------------------------------------------------------------------------------------

    public Alumno ( String matricula, String nombre, String apellidos, int edad, float promedio ) {
        this.matricula = matricula;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.promedio = promedio;
    }

    //----------------------------------------------------------------------------------------
    
    public String getMatricula() {
        return matricula;
    }

    //----------------------------------------------------------------------------------------
    
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    //----------------------------------------------------------------------------------------
    
    public String getNombre() {
        return nombre;
    }

    //----------------------------------------------------------------------------------------
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //----------------------------------------------------------------------------------------
    
    public String getApellidos() {
        return apellidos;
    }

    //----------------------------------------------------------------------------------------
    
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    //----------------------------------------------------------------------------------------
    
    public int getEdad() {
        return edad;
    }

    //----------------------------------------------------------------------------------------
    
    public void setEdad(int edad) {
        this.edad = edad;
    }

    //----------------------------------------------------------------------------------------
    
    public float getPromedio() {
        return promedio;
    }

    //----------------------------------------------------------------------------------------
    
    public void setPromedio(float promedio) {
        this.promedio = promedio;
    } 
    
    //----------------------------------------------------------------------------------------
    
    @Override
    public String toString () {
        return nombre + " " +apellidos;
    }
}
