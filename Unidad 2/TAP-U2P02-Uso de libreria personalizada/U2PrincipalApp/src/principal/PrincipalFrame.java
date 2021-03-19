/*------------------------------------------------------------------------------------------
:*                       INSTITUTO TECNOLOGICO DE LA LAGUNA
:*                     INGENIERIA EN SISTEMAS COMPUTACIONALES
:*                       TOPICOS AVANZADOS DE PROGRAMACION "B"
:*
:*                   SEMESTRE: ENE-JUN/2020    HORA: 17-18 HRS
:*
:*                            Aplicación GUI Principal
:*        
:*  Archivo     : SplashFrame.java
:*  Autor       : José Misael Adame Sandoval     18131209
:*  Fecha       : 10/Mar/2020
:*  Compilador  : JAVA J2SE v1.8.0
:*  Descripción : Aplicación que hace realiza la función de iniciar otras
:*                aplicaciones creadas anteriormente:
:*                   1. MatematicaApp
:*                   2. ConversionesApp
:*                   3. PrismasApp
:*                   4. EditorApp
:*                
:*  Ultima modif:
:*  Fecha       Modificó             Motivo
:*========================================================================================== 
:*  11/mar/2020 Misael Adame         Agregar prólogo.
:*------------------------------------------------------------------------------------------*/

package principal;

import conversiones.SplashConversionesFrame;
import editor.SplashEditorFrame;
import javax.swing.Icon;
import matematica.SplashMatematicaFrame;
import mx.edu.itl.util.Imagenes;
import prismas.SplashPrismasFrame;

public class PrincipalFrame extends javax.swing.JFrame {

    //----------------------------------------------------------------------------------------
    
    public PrincipalFrame() {
        initComponents();
        
        Icon matematica = Imagenes.escalarImagen ( jbtnMatematicaApp.getIcon (), 
                                                   jbtnMatematicaApp.getWidth (),
                                                   jbtnMatematicaApp.getHeight ());
        
        Icon conversiones = Imagenes.escalarImagen ( jbtnConversionesApp.getIcon (), 
                                                     jbtnConversionesApp.getWidth (),
                                                     jbtnConversionesApp.getHeight ());
        
        Icon prismas = Imagenes.escalarImagen ( jbtnPrismasApp.getIcon (), 
                                                jbtnPrismasApp.getWidth (),
                                                jbtnPrismasApp.getHeight () );
        
        Icon editor = Imagenes.escalarImagen ( jbtnEditorApp.getIcon (), 
                                                jbtnEditorApp.getWidth (),
                                                jbtnEditorApp.getHeight () );
        
        jbtnMatematicaApp.setIcon ( matematica );
        jbtnConversionesApp.setIcon ( conversiones );
        jbtnPrismasApp.setIcon ( prismas );
        jbtnEditorApp.setIcon ( editor );  
    }

    //----------------------------------------------------------------------------------------
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbtnMatematicaApp = new javax.swing.JButton();
        jbtnConversionesApp = new javax.swing.JButton();
        jbtnPrismasApp = new javax.swing.JButton();
        jbtnEditorApp = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PrincipalApp");

        jbtnMatematicaApp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/iconos/logo_matematicaapp.png"))); // NOI18N
        jbtnMatematicaApp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jbtnMatematicaApp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnMatematicaAppActionPerformed(evt);
            }
        });

        jbtnConversionesApp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/iconos/logo_ConversionesApp.jpg"))); // NOI18N
        jbtnConversionesApp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jbtnConversionesApp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnConversionesAppActionPerformed(evt);
            }
        });

        jbtnPrismasApp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/iconos/logo_PrismasApp.jpg"))); // NOI18N
        jbtnPrismasApp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jbtnPrismasApp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPrismasAppActionPerformed(evt);
            }
        });

        jbtnEditorApp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/iconos/logo_EditorApp.png"))); // NOI18N
        jbtnEditorApp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jbtnEditorApp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnEditorAppActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jbtnMatematicaApp, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                    .addComponent(jbtnPrismasApp, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jbtnEditorApp, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jbtnConversionesApp, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnMatematicaApp, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnConversionesApp, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbtnPrismasApp, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnEditorApp, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //----------------------------------------------------------------------------------------
    
    private void jbtnMatematicaAppActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnMatematicaAppActionPerformed
        SplashMatematicaFrame.ejecutar ();
        this.setVisible ( false );
    }//GEN-LAST:event_jbtnMatematicaAppActionPerformed

    //----------------------------------------------------------------------------------------
    
    private void jbtnConversionesAppActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnConversionesAppActionPerformed
        SplashConversionesFrame.ejecutar ();
        this.setVisible ( false );
    }//GEN-LAST:event_jbtnConversionesAppActionPerformed

    //----------------------------------------------------------------------------------------
    
    private void jbtnPrismasAppActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPrismasAppActionPerformed
        SplashPrismasFrame.ejecutar ();
        this.setVisible( false );
    }//GEN-LAST:event_jbtnPrismasAppActionPerformed

    //----------------------------------------------------------------------------------------
    
    private void jbtnEditorAppActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnEditorAppActionPerformed
        SplashEditorFrame.ejecutar ();
        this.setVisible( false );
    }//GEN-LAST:event_jbtnEditorAppActionPerformed

    //----------------------------------------------------------------------------------------
    
    public static void ejecutar() {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PrincipalFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrincipalFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrincipalFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrincipalFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrincipalFrame().setVisible(true);
            }
        });  
    }
    
    //----------------------------------------------------------------------------------------
    
    public static void main(String args[]) {
        ejecutar();
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbtnConversionesApp;
    private javax.swing.JButton jbtnEditorApp;
    private javax.swing.JButton jbtnMatematicaApp;
    private javax.swing.JButton jbtnPrismasApp;
    // End of variables declaration//GEN-END:variables
}
