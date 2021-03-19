package ejemplo;

import javax.swing.JOptionPane;


public class ServEscolares  implements CalificacionesFinalesListener {

    //--------------------------------------------------------------------------
    // Servicios escolares le retira la beca si el promedio es menor de 90
    
    @Override
    public void calificacionesFinalesObtenidas ( CalificacionesFinalesEvent evento ) {
       
        if ( evento.getPromedio() >= 90 )
            JOptionPane.showMessageDialog ( null, "Obtuvo buen promedio (" + 
                                            evento.getPromedio() + ") "    + 
                                            ", se mantiene su beca.",
                                            "Servicios Escolares", JOptionPane.INFORMATION_MESSAGE );
        else
            JOptionPane.showMessageDialog ( null, "Bajó su promedio menos de 90 (" +
                                            evento.getPromedio() + ") " +
                                            ", se le retira su beca.",
                                            "Servicios Escolares", JOptionPane.ERROR_MESSAGE );
            
    }

    //--------------------------------------------------------------------------
    
    
}
