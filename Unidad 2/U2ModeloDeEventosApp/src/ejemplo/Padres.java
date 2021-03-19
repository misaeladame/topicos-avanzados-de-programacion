package ejemplo;

import java.util.List;
import javax.swing.JOptionPane;

public class Padres implements CalificacionesFinalesListener {

    //--------------------------------------------------------------------------
    // Los padres felicitarán si aprueba todas las materias no importa que sea con 70
    
    @Override
    public void calificacionesFinalesObtenidas ( CalificacionesFinalesEvent evento ) {
        int aprobadas = 0;
        
        List<Integer> calificaciones = evento.getCalificaciones ();
        for ( Integer calificacion  :  calificaciones  ) {
            if ( calificacion >= 70 )
                aprobadas++;
        }
        
        if ( aprobadas == 3 )
            JOptionPane.showMessageDialog ( null, "Felicidades bebé, no reprobaste ninguna!!", 
                    "Papá y Mamá", JOptionPane.INFORMATION_MESSAGE );
        else
            JOptionPane.showMessageDialog ( null, "Reprobaste alguna. Ni vengas a la casa condenado!!", 
                    "Papá y Mamá", JOptionPane.ERROR_MESSAGE );
            
    }

    //--------------------------------------------------------------------------
    
}
