package ejemplo;

import java.util.ArrayList;

public class CalificacionesFinalesEvent {

    private ArrayList<Integer> calificaciones = new ArrayList ();
    
    //--------------------------------------------------------------------------
    // Constructor
    
    public CalificacionesFinalesEvent ( int calif1, int calif2, int calif3 ) {
       calificaciones.add ( calif1 );
       calificaciones.add ( calif2 );
       calificaciones.add ( calif3 );
    }
    
    //--------------------------------------------------------------------------
    
    public ArrayList getCalificaciones () {
        return calificaciones;
    }
    
    //--------------------------------------------------------------------------
    
    public float getPromedio () {
        int suma = 0;
        for ( Integer calificacion : calificaciones ) {
            suma += calificacion;
        }
        return suma / 3f;
    }
    
    //--------------------------------------------------------------------------    
}
