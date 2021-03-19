/*------------------------------------------------------------------------------------------
:*                       INSTITUTO TECNOLOGICO DE LA LAGUNA
:*                     INGENIERIA EN SISTEMAS COMPUTACIONALES
:*                       TOPICOS AVANZADOS DE PROGRAMACION "B"
:*
:*                   SEMESTRE: ENE-JUN/2020    HORA: 17-18 HRS
:*
:*                 Aplicacion GUI que conecta a una Base de Datos 
:*        
:*  Archivo     : ConexionDBFrame.java
:*  Autor       : José Misael Adame Sandoval     18131209
:*                Ricardo Raúl Castro Luna       18131227
:*                Jorge Arturo Galindo Uribe     18131238
:*  Fecha       : 24/May/2020
:*  Compilador  : JAVA J2SE v1.8.0
:*  Descripción : Aplicación que accede a la clase ConexionDB y permite conectarse a una Base 
:*                de Datos de manera gráfica en que el usuario ingresa los datos de conexión.
:*
:*                
:*  Ultima modif:
:*  Fecha       Modificó             Motivo
:*========================================================================================== 
:*  24/May/2020 Misael Adame         Agregar prólogo.
:*------------------------------------------------------------------------------------------*/

package mx.edu.itl.jdbc;

import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class ConexionDBFrame extends javax.swing.JFrame {
    
    //----------------------------------------------------------------------------------------

    private Frame frmPadre = null; 
    
    //----------------------------------------------------------------------------------------
    
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
    
    //----------------------------------------------------------------------------------------

    public ConexionDBFrame ( Frame padre ) {
        this ();
        frmPadre = padre;
    }
    //----------------------------------------------------------------------------------------
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jbtnAceptar = new javax.swing.JButton();
        jbtnSalir = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jpswContrasena = new javax.swing.JPasswordField();
        jtxfUsuario = new javax.swing.JTextField();
        jLabelTextoUsuario = new javax.swing.JLabel();
        jLabelTextoBD = new javax.swing.JLabel();
        jtxfBaseDeDatos = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jtxfServidor = new javax.swing.JTextField();
        jcboDBMS = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jtxfPuerto = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Información de la conexión");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));

        jbtnAceptar.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        jbtnAceptar.setText("Aceptar");
        jbtnAceptar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jbtnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAceptarActionPerformed(evt);
            }
        });

        jbtnSalir.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        jbtnSalir.setText("Salir");
        jbtnSalir.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jbtnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSalirActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        jLabel6.setText("Contraseña:");

        jpswContrasena.setText("2020");
        jpswContrasena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jpswContrasenaActionPerformed(evt);
            }
        });

        jtxfUsuario.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        jtxfUsuario.setText("Topicos");

        jLabelTextoUsuario.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        jLabelTextoUsuario.setText("Usuario:");

        jLabelTextoBD.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        jLabelTextoBD.setText("Base de Datos:");

        jtxfBaseDeDatos.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        jtxfBaseDeDatos.setText("Hardware");
        jtxfBaseDeDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxfBaseDeDatosActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        jLabel1.setText("DBMS:");

        jLabel2.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        jLabel2.setText("Servidor:");

        jtxfServidor.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        jtxfServidor.setText("localhost");
        jtxfServidor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxfServidorActionPerformed(evt);
            }
        });

        jcboDBMS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcboDBMSActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        jLabel3.setText("Puerto:");

        jtxfPuerto.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        jtxfPuerto.setText("1527");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jtxfServidor, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(jtxfPuerto, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jcboDBMS, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelTextoBD)
                            .addComponent(jLabelTextoUsuario)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jtxfBaseDeDatos)
                                .addComponent(jtxfUsuario)
                                .addComponent(jpswContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jbtnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(78, 78, 78)
                                .addComponent(jbtnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jcboDBMS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jtxfServidor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxfPuerto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTextoBD)
                    .addComponent(jtxfBaseDeDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTextoUsuario)
                    .addComponent(jtxfUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jpswContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jbtnAceptar, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                    .addComponent(jbtnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(57, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //----------------------------------------------------------------------------------------
    
    private void jtxfServidorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxfServidorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxfServidorActionPerformed

    private void jtxfBaseDeDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxfBaseDeDatosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxfBaseDeDatosActionPerformed

    //----------------------------------------------------------------------------------------
    
    private void jbtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSalirActionPerformed
        ConexionDB.getInstancia ().desconectar ();
        dispose ();
    }//GEN-LAST:event_jbtnSalirActionPerformed

    //----------------------------------------------------------------------------------------
    
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

    //----------------------------------------------------------------------------------------
    
    private void jcboDBMSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcboDBMSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcboDBMSActionPerformed

    private void jpswContrasenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jpswContrasenaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jpswContrasenaActionPerformed

    //----------------------------------------------------------------------------------------
    
    public static void main ( String args[] ) {
        ejecutar ();
    }
    
    //----------------------------------------------------------------------------------------
    
    public static void ejecutar () {
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

    //----------------------------------------------------------------------------------------
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelTextoBD;
    private javax.swing.JLabel jLabelTextoUsuario;
    private javax.swing.JPanel jPanel1;
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
