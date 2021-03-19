package globos;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

public class GlobosFrame extends javax.swing.JFrame {

    public static final int MAX_GLOBOS = 10;
    
    private Globo [] globos = new Globo [ MAX_GLOBOS ];
    private Color [] colores = new Color [] {
        Color.BLUE, Color.CYAN, Color.GRAY, Color.GREEN, Color.MAGENTA, Color.MAGENTA,
        Color.PINK, Color.RED, Color.YELLOW
    };
    
    private int ancho;
    private int alto;
    
    private Image image;
    Graphics grpImage;

    public GlobosFrame() {
        initComponents();
        
        ancho = this.getWidth ();
        alto = this.getHeight ();
        
        for ( int i = 0; i < MAX_GLOBOS; i++ ) {
            Color color = colores [ (int) ( Math.random () * 8 ) ];
            int radio = 5 + (int) ( Math.random () * alto * 0.2 );
            int sleep = 10 + (int) ( Math.random () * 40 );
            int x = radio + (int) ( Math.random () * ( ancho - radio * 2 ) );
            int y = radio + (int) ( Math.random () * ( alto - radio * 2 ) );
            globos [ i ] = new Globo ( this, color, radio, sleep, x, y );
            globos [ i ].start ();
        }
    }
    
    // repaint () -> update () -> paint ()
    @Override
    public void paint ( Graphics g ) {
        
        if ( image == null ) {
            image = this.createImage ( ancho, alto );
            grpImage = image.getGraphics ();
        }
        grpImage.setColor ( Color.WHITE );
        grpImage.fillRect ( 0, 0, ancho, alto );
        for ( int i = 0; i < MAX_GLOBOS; i++ ) {
            globos [ i ].dibujar ( grpImage );
        }
        
        g.drawImage( image, 0, 0, null );
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Globos");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 588, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 427, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    public static void main(String args[]) {
        /* Set the Windows look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GlobosFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GlobosFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GlobosFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GlobosFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GlobosFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
