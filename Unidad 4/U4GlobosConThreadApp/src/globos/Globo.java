
package globos;

import java.awt.Color;
import java.awt.Graphics;


public class Globo extends Thread {
    
    GlobosFrame parent;
    Color color;
    int radioInicial;
    int radioActual;
    int periodoSleep;
    int x;
    int y;
    boolean creciendo;
    
    public Globo ( GlobosFrame parent, Color color, int radioInicial, 
                   int periodoSleep, int x, int y ) {
        this.parent = parent;
        this.color = color;
        this.radioInicial = radioInicial;
        this.radioActual = radioInicial;
        this.periodoSleep = periodoSleep;
        this.x = x;
        this.y = y;
        creciendo = ( Math.random () > 0.5 ) ? true : false;
    }
    
    @Override
    public void run () {
        while ( true ) {
            if ( creciendo )
                radioActual++;
            else 
                radioActual--;
            
            if ( radioActual < 5  || radioActual > radioInicial * 2 )
                creciendo = ! creciendo;
            
            parent.repaint ();
            
            try {
                Thread.sleep ( periodoSleep );
            } catch ( InterruptedException ex ) {
                System.out.println ( ex );
            }
        }
    }
    
    public void dibujar ( Graphics g ) {
        g.setColor ( color );
        g.fillOval ( x - radioActual, y - radioActual, 2 * radioActual, 2 * radioActual );
    }
}
