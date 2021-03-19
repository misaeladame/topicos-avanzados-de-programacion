package ejemplo;

import java.util.List;
import javax.swing.JOptionPane;


public class Novia  implements CalificacionesFinalesListener {

    //--------------------------------------------------------------------------
    // La novia aceptará casarse si las 3 calificaciones son minimo de 85.
    
    @Override
    public void calificacionesFinalesObtenidas ( CalificacionesFinalesEvent evento ) {
        int aprobadas = 0;
        
        List<Integer> calificaciones = evento.getCalificaciones ();
        for ( Integer calificacion  :  calificaciones  ) {
            if ( calificacion >= 85 )
                aprobadas++;
        }
        
        if ( aprobadas == 3 )
            JOptionPane.showMessageDialog ( null, "Pasaste todas con minimo 85. Sí me caso contigo!!", 
                    "Novia", JOptionPane.INFORMATION_MESSAGE );
        else
            JOptionPane.showMessageDialog ( null, "No pasaste alguna con 85. Ni me hables, cortalas!!", 
                    "Novia", JOptionPane.ERROR_MESSAGE );
            
    }

    //--------------------------------------------------------------------------
    
}
