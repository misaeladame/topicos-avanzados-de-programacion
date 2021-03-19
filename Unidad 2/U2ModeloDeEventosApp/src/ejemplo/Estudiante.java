package ejemplo;

import java.util.ArrayList;

public class Estudiante {

    private int calif1;
    private int calif2;
    private int calif3;
    
    // Se declara la lista de listeners para el evento Calificaciones Finales
    private ArrayList<CalificacionesFinalesListener> listeners = new ArrayList ();

    //--------------------------------------------------------------------------
    // Constructor
    
    public Estudiante () {
       calif1 = calif2 = calif3 = 0;    
    }

    //--------------------------------------------------------------------------
    // Agrega un nuevo listener a la lista
    
    public void addCalificacionesFinalesListener ( CalificacionesFinalesListener listener ) {
        listeners.add ( listener );
    }

    //--------------------------------------------------------------------------
    // Elimina un listener dado de la lista
    
    public void removeCalificacionesFinalesListener ( CalificacionesFinalesListener listener ) {
        listeners.remove ( listener );
    }
    
    //--------------------------------------------------------------------------
    // Notifica a cada listener el evento CalificacionesFinales
    
    public void fireCalificacionesFinalesEvent (  CalificacionesFinalesEvent evento ) {
        for ( CalificacionesFinalesListener listener : listeners ) {
            listener.calificacionesFinalesObtenidas ( evento );
        }
    }

    //--------------------------------------------------------------------------
    // Un metodo set para las 3 calificaciones.

    public void setCalificaciones ( int calif1, int calif2, int calif3 ) {
        this.calif1 = calif1;
        this.calif2 = calif2;
        this.calif3 = calif3;
        
        // Al tener las calificaciones de todas las materias preparamos el EventObject
        // y disparamos el evento.
        CalificacionesFinalesEvent evento = new CalificacionesFinalesEvent ( calif1, calif2, calif3 );
        fireCalificacionesFinalesEvent ( evento );
    }
    
    //--------------------------------------------------------------------------    
}
