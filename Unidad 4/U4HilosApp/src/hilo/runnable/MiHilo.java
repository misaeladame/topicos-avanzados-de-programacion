package hilo.runnable;

import java.util.logging.Level;
import java.util.logging.Logger;

public class MiHilo implements Runnable {

    private String nombre = "";
    
    public MiHilo () {
        
    }
    
    public MiHilo ( String nombre ) {
        this.nombre = nombre;
    }
    
    public void start () {
        Thread thread = new Thread ( this );
        thread.start ();
    }
    
    @Override
    public void run () {
        for ( int i = 0; i <= 100; i++ ) {
            System.out.println ( getNombre () + ": " + i );
            try {
                Thread.sleep ( 100 );
            } catch ( InterruptedException ex ) {
                Logger.getLogger ( hilo.thread.MiHilo.class.getName()).log(Level.SEVERE, null, ex );
            }
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
