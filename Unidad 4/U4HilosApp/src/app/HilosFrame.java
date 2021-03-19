package app;

import hilo.thread.MiHilo;
import javax.swing.JLabel;
import javax.swing.JProgressBar;

public class HilosFrame extends javax.swing.JFrame {

    private boolean hayGanador;
    
    
    public HilosFrame() {
        initComponents();
        
        jlblGanador1.setVisible ( false );
        jlblGanador2.setVisible ( false );
        jlblGanador3.setVisible ( false );
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtxfHilo1 = new javax.swing.JTextField();
        jtxfHilo2 = new javax.swing.JTextField();
        jtxfHilo3 = new javax.swing.JTextField();
        jpbrHilo1 = new javax.swing.JProgressBar();
        jlblGanador1 = new javax.swing.JLabel();
        jpbrHilo2 = new javax.swing.JProgressBar();
        jpbrHilo3 = new javax.swing.JProgressBar();
        jlblGanador2 = new javax.swing.JLabel();
        jlblGanador3 = new javax.swing.JLabel();
        jbtnIniciar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Hilos");

        jLabel1.setText("1:");

        jLabel2.setText("2:");

        jLabel3.setText("3:");

        jtxfHilo1.setText("Tio Rios");

        jtxfHilo2.setText("Tio Oswi");

        jtxfHilo3.setText("Tio Ulloita");

        jpbrHilo1.setStringPainted(true);

        jlblGanador1.setForeground(new java.awt.Color(0, 153, 51));
        jlblGanador1.setText("Ganador");

        jpbrHilo2.setStringPainted(true);

        jpbrHilo3.setStringPainted(true);

        jlblGanador2.setForeground(new java.awt.Color(0, 153, 51));
        jlblGanador2.setText("Ganador");

        jlblGanador3.setForeground(new java.awt.Color(0, 153, 51));
        jlblGanador3.setText("Ganador");

        jbtnIniciar.setText("Iniciar");
        jbtnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnIniciarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jtxfHilo3))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jtxfHilo2))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jtxfHilo1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jpbrHilo1, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jlblGanador1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jpbrHilo3, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jlblGanador3))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jpbrHilo2, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jlblGanador2)))
                .addContainerGap(29, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbtnIniciar)
                .addGap(236, 236, 236))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jtxfHilo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jpbrHilo1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jlblGanador1)))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxfHilo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jpbrHilo2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlblGanador2))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxfHilo3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jpbrHilo3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlblGanador3))
                .addGap(40, 40, 40)
                .addComponent(jbtnIniciar)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnIniciarActionPerformed
        
        hayGanador = false;
        
        jlblGanador1.setVisible ( false );
        jlblGanador2.setVisible ( false );
        jlblGanador3.setVisible ( false );
        
        MiHilo hilo1 = new MiHilo ( "Tio Rios", this );
        MiHilo hilo2 = new MiHilo ( "Tio Oswi", this );
        MiHilo hilo3 = new MiHilo ( "Tio Ulloita", this );
        
        hilo1.start ();
        hilo2.start ();
        hilo3.start ();
    }//GEN-LAST:event_jbtnIniciarActionPerformed

    synchronized public void setProgreso ( String nombre, int progreso ) {
        if ( nombre.equals ( jtxfHilo1.getText () ) ) {
            mostrarProgreso ( progreso, jpbrHilo1, jlblGanador1 );
        } else if ( nombre.equals ( jtxfHilo2.getText () ) ) {
            mostrarProgreso ( progreso, jpbrHilo2, jlblGanador2 );
        } else if ( nombre.equals ( jtxfHilo3.getText () ) ) {
            mostrarProgreso ( progreso, jpbrHilo3, jlblGanador3 );
        }
    }
    
    private void mostrarProgreso ( int progreso, JProgressBar jpbrProgreso, 
                                   JLabel jlblGanador ) {
        jpbrProgreso.setValue ( progreso );
        if ( progreso == 100 && ! hayGanador ) {
            hayGanador = true;
            jlblGanador.setVisible ( true );
        }
    }
    
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
            java.util.logging.Logger.getLogger(HilosFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HilosFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HilosFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HilosFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HilosFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton jbtnIniciar;
    private javax.swing.JLabel jlblGanador1;
    private javax.swing.JLabel jlblGanador2;
    private javax.swing.JLabel jlblGanador3;
    private javax.swing.JProgressBar jpbrHilo1;
    private javax.swing.JProgressBar jpbrHilo2;
    private javax.swing.JProgressBar jpbrHilo3;
    private javax.swing.JTextField jtxfHilo1;
    private javax.swing.JTextField jtxfHilo2;
    private javax.swing.JTextField jtxfHilo3;
    // End of variables declaration//GEN-END:variables
}
