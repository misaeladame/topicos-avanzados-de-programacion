package pelotas;

import java.awt.Color;
import java.awt.Graphics;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;

public class Pelota extends Thread {
    
    private JPanel jpnlMarcoPelota;
    int x;
    int y;
    int ancho, alto;
    int despX, despY;
    int periodo;
    
    boolean seguirRebotando = true;
    Graphics lienzo;
    
    public Pelota ( JPanel jpnlMarcoPelota ) {
        super ();
        this.jpnlMarcoPelota = jpnlMarcoPelota;
        lienzo = jpnlMarcoPelota.getGraphics ();
        ancho = jpnlMarcoPelota.getWidth ();
        alto = jpnlMarcoPelota.getHeight ();
        x = ancho / 2;
        y = alto / 2;
        despX = 1 + (int) ( Math.random () * 7 );
        despY = 1 + (int) ( Math.random () * 3 );
        periodo = 10 + (int) ( Math.random () * 40 );
    }
    
    @Override
    public void run () {
        while ( seguirRebotando ) {
            mover ();
            rebotar ();
            limpiar ();
            dibujar ();
            pausa ();
        }
    }
    
    private void mover () {
        x += despX;
        y += despY;
    }
    
    private void rebotar () {
        if ( x <= 0 || x >= ancho ) {
           despX *= -1;
        }
        if ( y <= 0 || y >= alto ) {
            despY *= -1;
        }
    }
    
    private void limpiar () {
        lienzo.setColor ( Color.WHITE );
        lienzo.fillRect ( 0, 0, ancho, alto );
    }
    
    private void dibujar () {        
        lienzo.setColor ( Color.red );
        lienzo.fillOval( x, y, 20, 20 );
    }
    
    private void pausa () {
        try {
            Thread.sleep ( periodo );
        } catch ( InterruptedException ex ) {
            Logger.getLogger(Pelota.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
