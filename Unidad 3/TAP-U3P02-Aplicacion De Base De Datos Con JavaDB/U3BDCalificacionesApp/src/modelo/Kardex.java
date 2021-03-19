/*------------------------------------------------------------------------------------------
:*                       INSTITUTO TECNOLOGICO DE LA LAGUNA
:*                     INGENIERIA EN SISTEMAS COMPUTACIONALES
:*                       TOPICOS AVANZADOS DE PROGRAMACION "B"
:*
:*                   SEMESTRE: ENE-JUN/2020    HORA: 17-18 HRS
:*
:*                          Clase que define a un Kardex
:*        
:*  Archivo     : Kardex.java
:*  Autor       : José Misael Adame Sandoval     18131209
:*                Ricardo Raúl Castro Luna       18131227
:*                Jorge Arturo Galindo Uribe     18131238
:*  Fecha       : 24/May/2020
:*  Compilador  : JAVA J2SE v1.8.0
:*  Descripción : Clase que contiene getters/setters de los atributos de un kardex que son:
:*                  - ID Calific
:*                  - Matricula
:*                  - ID Materia
:*                  - Periodo
:*                  - Calificacion
:*                     
:*                
:*  Ultima modif:
:*  Fecha       Modificó             Motivo
:*========================================================================================== 
:*  24/May/2020 Misael Adame         Agregar prólogo.
:*------------------------------------------------------------------------------------------*/

package modelo;

public class Kardex {
    
    //----------------------------------------------------------------------------------------
    
    private int idcalific;
    private String matricula;
    private String idmateria;
    private String periodo;
    private int calificacion;
    
    //----------------------------------------------------------------------------------------

    public Kardex(int idcalific, String matricula, String idmateria, String periodo, int calificacion) {
        this.idcalific = idcalific;
        this.matricula = matricula;
        this.idmateria = idmateria;
        this.periodo = periodo;
        this.calificacion = calificacion;
    }

    //----------------------------------------------------------------------------------------
    
    public int getIdcalific() {
        return idcalific;
    }

    //----------------------------------------------------------------------------------------
    
    public void setIdcalific(int idcalific) {
        this.idcalific = idcalific;
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
    
    public String getIdmateria() {
        return idmateria;
    }

    //----------------------------------------------------------------------------------------
    
    public void setIdmateria(String idmateria) {
        this.idmateria = idmateria;
    }

    //----------------------------------------------------------------------------------------
    
    public String getPeriodo() {
        return periodo;
    }

    //----------------------------------------------------------------------------------------
    
    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    //----------------------------------------------------------------------------------------
    
    public int getCalificacion() {
        return calificacion;
    }

    //----------------------------------------------------------------------------------------
    
    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }  
}
