package jdbc;

import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class ConexionDBFrame extends javax.swing.JFrame {

    private Frame frmPadre = null; 
    
    public ConexionDBFrame () {
        initComponents ();
        // Inicializar la lista de DBMS
        jcboDBMS.addItem ( ConexionDB.JAVADB );
        jcboDBMS.addItem ( ConexionDB.ACCESS );
        jcboDBMS.addItem ( ConexionDB.MYSQL );
        jcboDBMS.addItem ( ConexionDB.SQLSERVER );
        jcboDBMS.addItem ( ConexionDB.ORACLEXE );
        
        jcboDBMS.addActionListener ( new ActionListener () {
            
            @Override
	    public void actionPerformed ( ActionEvent e ) {
                if ( jcboDBMS.getSelectedIndex () == 4 ) {
                    jLabelTextoUsuario.setText("Base de Datos:");
                    
                    jLabelTextoBD.setVisible ( false );
                    jtxfBaseDeDatos.setVisible( false );
                    
                    jtxfServidor.setEnabled ( true );
                    jtxfPuerto.setEnabled ( true );
                    jtxfUsuario.setEnabled ( true );
                    jpswContrasena.setEnabled ( true );
                    
                } else if ( jcboDBMS.getSelectedIndex () == 1 ) {
                    jLabelTextoUsuario.setText ( "Usuario:" );
                    jLabelTextoBD.setText ( "URL Base de Datos:" );
                    
                    jtxfBaseDeDatos.setVisible ( true );                    
                    jLabelTextoBD.setVisible ( true );
                    
                    jtxfServidor.setEnabled ( false );
                    jtxfPuerto.setEnabled ( false );
                    jtxfUsuario.setEnabled ( false );
                    jpswContrasena.setEnabled ( false );
                    
                } else {
                    jLabelTextoUsuario.setText ( "Usuario:" );
                    jLabelTextoBD.setText ( "Base de Datos:" );
                    
                    jLabelTextoBD.setVisible ( true );
                    jtxfBaseDeDatos.setVisible ( true );
                    
                    jtxfServidor.setEnabled ( true );
                    jtxfPuerto.setEnabled ( true );
                    jtxfUsuario.setEnabled ( true );
                    jpswContrasena.setEnabled ( true );
                }
            }
	});
    }
    
    

    public ConexionDBFrame ( Frame padre ) {
        this ();
        frmPadre = padre;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabelTextoBD = new javax.swing.JLabel();
        jLabelTextoUsuario = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jcboDBMS = new javax.swing.JComboBox();
        jtxfServidor = new javax.swing.JTextField();
        jtxfPuerto = new javax.swing.JTextField();
        jtxfBaseDeDatos = new javax.swing.JTextField();
        jtxfUsuario = new javax.swing.JTextField();
        jpswContrasena = new javax.swing.JPasswordField();
        jbtnAceptar = new javax.swing.JButton();
        jbtnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Información de la conexión");

        jLabel1.setText("DBMS:");

        jLabel2.setText("Servidor:");

        jLabel3.setText("Puerto:");

        jLabelTextoBD.setText("Base de Datos:");

        jLabelTextoUsuario.setText("Usuario:");

        jLabel6.setText("Contraseña:");

        jcboDBMS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcboDBMSActionPerformed(evt);
            }
        });

        jtxfServidor.setText("localhost");
        jtxfServidor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxfServidorActionPerformed(evt);
            }
        });

        jtxfBaseDeDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxfBaseDeDatosActionPerformed(evt);
            }
        });

        jbtnAceptar.setText("Aceptar");
        jbtnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAceptarActionPerformed(evt);
            }
        });

        jbtnSalir.setText("Salir");
        jbtnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jtxfServidor, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(jtxfPuerto, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jcboDBMS, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(52, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelTextoBD)
                            .addComponent(jLabelTextoUsuario)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtxfBaseDeDatos)
                            .addComponent(jtxfUsuario)
                            .addComponent(jpswContrasena, javax.swing.GroupLayout.DEFAULT_SIZE, 282, Short.MAX_VALUE)
                            .addComponent(jbtnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbtnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(135, 135, 135))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jcboDBMS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jtxfServidor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxfPuerto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTextoBD)
                    .addComponent(jtxfBaseDeDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTextoUsuario)
                    .addComponent(jtxfUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jpswContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnAceptar)
                    .addComponent(jbtnSalir))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jtxfServidorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxfServidorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxfServidorActionPerformed

    private void jtxfBaseDeDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxfBaseDeDatosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxfBaseDeDatosActionPerformed

    private void jbtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSalirActionPerformed
        ConexionDB.getInstancia ().desconectar ();
        dispose ();
    }//GEN-LAST:event_jbtnSalirActionPerformed

    private void jbtnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAceptarActionPerformed
        ConexionDB.getInstancia ().conectar (
                jcboDBMS.getSelectedItem ().toString (),
                jtxfServidor.getText (),               
                jtxfPuerto.getText (),
                jtxfBaseDeDatos.getText (),
                jtxfUsuario.getText (), 
                new String ( jpswContrasena.getPassword () ) 
        );
        
        if ( ConexionDB.getInstancia().conectado() ) {
            if ( frmPadre != null ) {
                frmPadre.setVisible ( true );
                dispose ();
            } else 
                JOptionPane.showMessageDialog ( this, "Conectado!" );
        } else {
            JOptionPane.showMessageDialog ( this, "No se logró la conexión. Verifique la información." );
        }
        
    }//GEN-LAST:event_jbtnAceptarActionPerformed

    private void jcboDBMSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcboDBMSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcboDBMSActionPerformed

    public static void main ( String args[] ) {
        ejecutar ();
    }
    
    public static void ejecutar () {
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
            java.util.logging.Logger.getLogger(ConexionDBFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConexionDBFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConexionDBFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConexionDBFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConexionDBFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelTextoBD;
    private javax.swing.JLabel jLabelTextoUsuario;
    private javax.swing.JButton jbtnAceptar;
    private javax.swing.JButton jbtnSalir;
    private javax.swing.JComboBox jcboDBMS;
    private javax.swing.JPasswordField jpswContrasena;
    private javax.swing.JTextField jtxfBaseDeDatos;
    private javax.swing.JTextField jtxfPuerto;
    private javax.swing.JTextField jtxfServidor;
    private javax.swing.JTextField jtxfUsuario;
    // End of variables declaration//GEN-END:variables
}
