package hilo.thread;

import app.HilosFrame;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MiHilo extends Thread {
    
    private HilosFrame frame;
    
    public MiHilo () {
        super ();
    }
    
    public MiHilo ( String nombre ) {
        super ( nombre );
    }
    
    public MiHilo ( String nombre, HilosFrame frame ) {
        super ( nombre );
        this.frame = frame;
    }
    
    @Override
    public void run () {
        for ( int i = 0; i <= 100; i++ ) {
            System.out.println ( getName () + ": " + i );
            if ( frame != null )
                frame.setProgreso ( getName (), i );
            
            try {
                Thread.sleep ( 100 );
            } catch ( InterruptedException ex ) {
                Logger.getLogger ( MiHilo.class.getName()).log(Level.SEVERE, null, ex );
            }
        }
    }
}
