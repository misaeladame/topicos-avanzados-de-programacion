/*------------------------------------------------------------------------------------------
:*                       INSTITUTO TECNOLOGICO DE LA LAGUNA
:*                     INGENIERIA EN SISTEMAS COMPUTACIONALES
:*                       TOPICOS AVANZADOS DE PROGRAMACION "B"
:*
:*                   SEMESTRE: ENE-JUN/2020    HORA: 17-18 HRS
:*
:*                          Clase que define a una Materia
:*        
:*  Archivo     : Materia.java
:*  Autor       : José Misael Adame Sandoval     18131209
:*                Ricardo Raúl Castro Luna       18131227
:*                Jorge Arturo Galindo Uribe     18131238
:*  Fecha       : 24/May/2020
:*  Compilador  : JAVA J2SE v1.8.0
:*  Descripción : Clase que contiene getters/setters de los atributos de una materia que son:
:*                  - ID Materia
:*                  - Materia
:*                  - Creditos
:*                     
:*                
:*  Ultima modif:
:*  Fecha       Modificó             Motivo
:*========================================================================================== 
:*  24/May/2020 Misael Adame         Agregar prólogo.
:*------------------------------------------------------------------------------------------*/

package modelo;

public class Materia {
    
    //----------------------------------------------------------------------------------------
    
    private String idmateria;
    private String materia;
    private int creditos;

    //----------------------------------------------------------------------------------------
    
    public Materia ( String idmateria, String materia, int creditos ) {
        this.idmateria = idmateria;
        this.materia = materia;
        this.creditos = creditos;
    }

    //----------------------------------------------------------------------------------------
    
    public String getIdmateria() {
        return idmateria;
    }

    //----------------------------------------------------------------------------------------
    
    public void setIdmateria(String idmateria) {
        this.idmateria = idmateria;
    }

    //----------------------------------------------------------------------------------------
    
    public String getMateria() {
        return materia;
    }

    //----------------------------------------------------------------------------------------
    
    public void setMateria(String materia) {
        this.materia = materia;
    }

    //----------------------------------------------------------------------------------------
    
    public int getCreditos() {
        return creditos;
    }

    //----------------------------------------------------------------------------------------
    
    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }
    
    //----------------------------------------------------------------------------------------
    
    @Override
    public String toString () {
        return materia;
    }
}
