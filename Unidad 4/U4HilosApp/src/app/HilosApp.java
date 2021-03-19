package app;

import hilo.runnable.MiHilo;

public class HilosApp {

    public static void main ( String [] args ) {
        MiHilo hilo1 = new MiHilo ( "Tio Rios" );
        MiHilo hilo2 = new MiHilo ( "Tio Oswi" );
        MiHilo hilo3 = new MiHilo ( "Tio Ulloita" );
        
        hilo1.start ();
        hilo2.start ();
        hilo3.start ();
    }
}
