/*------------------------------------------------------------------------------------------
:*                       INSTITUTO TECNOLOGICO DE LA LAGUNA
:*                     INGENIERIA EN SISTEMAS COMPUTACIONALES
:*                       TOPICOS AVANZADOS DE PROGRAMACION "B"
:*
:*                   SEMESTRE: ENE-JUN/2020    HORA: 17-18 HRS
:*
:*                       Aplicacion GUI de un Cilindro
:*        
:*  Archivo     : JDialogCilindro.java
:*  Autor       : José Misael Adame Sandoval     18131209
:*  Fecha       : 06/Abr/2020
:*  Compilador  : JAVA J2SE v1.8.0
:*  Descripción : Aplicación JDialog que permite ingresar los valores del radio y altura
:*                del JCilindro
:*                     
:*                
:*  Ultima modif:
:*  Fecha       Modificó             Motivo
:*========================================================================================== 
:*  06/Abr/2020 Misael Adame         Agregar prólogo.
:*------------------------------------------------------------------------------------------*/

package mx.edu.itl.beans;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class JDialogCilindro extends javax.swing.JDialog {

    //----------------------------------------------------------------------------------------
    
    private JCilindro jCilindro;
    public float anteriorAltura;
    public float anteriorRadio;
    
    //----------------------------------------------------------------------------------------
    
    public JDialogCilindro ( JPanel parent, boolean modal ) {

        initComponents ();
        
        jCilindro = ( JCilindro ) parent;
        
        anteriorRadio = jCilindro.getRadio ();
        anteriorAltura = jCilindro.getAltura ();
        
        jtxfRadio.setText ( anteriorRadio + "" );
        jtxfAltura.setText ( anteriorAltura + "" );
    }

    //----------------------------------------------------------------------------------------
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jtxfRadio = new javax.swing.JTextField();
        jtxfAltura = new javax.swing.JTextField();
        jbtnAceptar = new javax.swing.JButton();
        jbtnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Valores del cilindro");

        jLabel2.setText("radio (r):");

        jLabel4.setText("altura (h):");

        jtxfRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxfRadioActionPerformed(evt);
            }
        });

        jbtnAceptar.setText("Aceptar");
        jbtnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAceptarActionPerformed(evt);
            }
        });

        jbtnCancelar.setText("Cancelar");
        jbtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtxfRadio, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                            .addComponent(jtxfAltura)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jbtnAceptar)
                        .addGap(18, 18, 18)
                        .addComponent(jbtnCancelar)))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jtxfRadio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxfAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnAceptar)
                    .addComponent(jbtnCancelar))
                .addGap(14, 14, 14))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    //----------------------------------------------------------------------------------------
    
    private void jtxfRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxfRadioActionPerformed
        
    }//GEN-LAST:event_jtxfRadioActionPerformed

    //----------------------------------------------------------------------------------------
    
    private void jbtnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAceptarActionPerformed
        try {
            float nuevoRadio = Float.parseFloat ( jtxfRadio.getText () );
            float nuevaAltura = Float.parseFloat ( jtxfAltura.getText () );
            if ( nuevoRadio < 0 || nuevaAltura < 0 ) 
                JOptionPane.showMessageDialog (
                    this, 
                    "Debe proporcionar un valor numérico positivo en todos los campos", 
                    "Error", 
                    JOptionPane.ERROR_MESSAGE
                );
            else {
                jCilindro.setRadio ( nuevoRadio );
                jCilindro.setAltura ( nuevaAltura );
                jCilindro.update ();
                dispose ();  
            }
        } catch ( NumberFormatException ex ) {
            JOptionPane.showMessageDialog (
                this, 
                "Debe proporcionar un valor numérico positivo en todos los campos", 
                "Error", 
                JOptionPane.ERROR_MESSAGE
            );
        }          
    }//GEN-LAST:event_jbtnAceptarActionPerformed

    //----------------------------------------------------------------------------------------
    
    private void jbtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCancelarActionPerformed
        this.setVisible ( false );
    }//GEN-LAST:event_jbtnCancelarActionPerformed

    //----------------------------------------------------------------------------------------
    
    public static void ejecutar() {
        /* Set the Nimbus look and feel */
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
            java.util.logging.Logger.getLogger(JDialogCilindro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDialogCilindro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDialogCilindro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDialogCilindro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDialogCilindro dialog = new JDialogCilindro(new JPanel(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    
    //----------------------------------------------------------------------------------------
    
    public static void main ( String args[] ) {
        ejecutar ();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton jbtnAceptar;
    private javax.swing.JButton jbtnCancelar;
    private javax.swing.JTextField jtxfAltura;
    private javax.swing.JTextField jtxfRadio;
    // End of variables declaration//GEN-END:variables
}
