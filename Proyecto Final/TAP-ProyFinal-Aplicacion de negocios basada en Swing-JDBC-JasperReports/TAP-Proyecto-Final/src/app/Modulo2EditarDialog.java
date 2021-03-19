/*------------------------------------------------------------------------------------------
:*                       INSTITUTO TECNOLOGICO DE LA LAGUNA
:*                     INGENIERIA EN SISTEMAS COMPUTACIONALES
:*                       TOPICOS AVANZADOS DE PROGRAMACION "B"
:*
:*                   SEMESTRE: ENE-JUN/2020    HORA: 17-18 HRS
:*
:*           Aplicación GUI para editar o crear registros en el Módulo 2
:*        
:*  Archivo     : Modulo2EditarDialog.java
:*  Autor       : José Misael Adame Sandoval     18131209
:*                Ricardo Raúl Castro Luna       18131227
:*                Jorge Arturo Galindo Uribe     18131238
:*  Fecha       : 24/May/2020
:*  Compilador  : JAVA J2SE v1.8.0
:*  Descripción : Aplicación que crea o edita un registro de la tabla Distribuidor con los 
:*                siguientes datos:
:*                  - id_Distribuidor
:*                  - nombre_Distribuidor
:*                  - direccion_Distribuidor
:*                  - tipo_Transporte
:*                     
:*                
:*  Ultima modif:
:*  Fecha       Modificó             Motivo
:*========================================================================================== 
:*  24/May/2020 Misael Adame         Agregar prólogo.
:*------------------------------------------------------------------------------------------*/
package app;

import java.sql.SQLException;
import java.util.Vector;
import javax.swing.Icon;
import javax.swing.JOptionPane;
import modelo.Modelo2;
import mx.edu.itl.jdbc.EjecutorSQL;
import mx.edu.itl.util.Imagenes;

public class Modulo2EditarDialog extends javax.swing.JDialog {

    //----------------------------------------------------------------------------------------
    
    private PrincipalFrame frmPrincipal;
    private Modelo2 modelo;
    private String accion;
    private Vector<String> vecTiposColumnas;
    private String sql;

    //----------------------------------------------------------------------------------------
    
    public Modulo2EditarDialog ( java.awt.Frame parent, Modelo2 modelo ) {
        super ( parent, true );
        initComponents ();

        frmPrincipal = ( PrincipalFrame ) parent;
        this.modelo = modelo;
        vecTiposColumnas = frmPrincipal.getVecTiposColumnas ();

        accion = ( modelo == null ) ? PrincipalFrame.NUEVO : PrincipalFrame.EDITAR;
        setTitle ( accion );

        Icon distribuidor = Imagenes.escalarImagen ( jlblLogo.getIcon (),
                jlblLogo.getWidth (),
                jlblLogo.getHeight () );

        jlblLogo.setIcon ( distribuidor );

        inicializarFormulario ();
    }

    //----------------------------------------------------------------------------------------
    
    public void inicializarFormulario () {

        if ( accion.equals ( PrincipalFrame.EDITAR ) ) {

            jtxfNombreDis.setText ( modelo.getNombre_Distribuidor () );
            jtxfDirDis.setText ( modelo.getDireccion_Distribuidor () );
            jtxfTransporte.setText ( modelo.getTipo_Transporte() );

            jtxfNombreDis.requestFocus ();

        }
    }

    //----------------------------------------------------------------------------------------
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jlblLogo = new javax.swing.JLabel();
        jbtnCancelar = new javax.swing.JButton();
        jbtnGuardar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jtxfNombreDis = new javax.swing.JTextField();
        jtxfDirDis = new javax.swing.JTextField();
        jtxfTransporte = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 5, true));

        jlblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/img_distribuidor.jpg"))); // NOI18N
        jlblLogo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jbtnCancelar.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        jbtnCancelar.setText("Cancelar");
        jbtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCancelarActionPerformed(evt);
            }
        });

        jbtnGuardar.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        jbtnGuardar.setText("Guardar");
        jbtnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnGuardarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        jLabel3.setText("Tipo de transporte");

        jLabel2.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        jLabel2.setText("Dirección:");

        jLabel1.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        jLabel1.setText("Nombre del distribuidor:");

        jtxfNombreDis.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N

        jtxfDirDis.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N

        jtxfTransporte.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtxfDirDis)
                            .addComponent(jtxfNombreDis, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxfTransporte, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addComponent(jbtnGuardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbtnCancelar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jtxfNombreDis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jtxfDirDis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jtxfTransporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jlblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnGuardar)
                    .addComponent(jbtnCancelar))
                .addGap(34, 34, 34))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //----------------------------------------------------------------------------------------

    private void jbtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCancelarActionPerformed
        dispose ();
    }//GEN-LAST:event_jbtnCancelarActionPerformed

    //----------------------------------------------------------------------------------------

    private void jbtnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnGuardarActionPerformed
        Object[][] args = null;
        String mensaje = "";

        if ( validarDatos() == false ) {
            return;
        }

        // Se determina la sentencia SQL a ejecutar y formar la matriz de argumentos
        if ( accion.equals ( PrincipalFrame.NUEVO ) ) {
            mensaje = "El registro ha sido agregado";
            sql = frmPrincipal.getPropConsultasSQL ().getProperty (
                    PrincipalFrame.DISTRIBUIDOR_INSERTA_NUEVO );
            args = new Object[][]{
                
                { vecTiposColumnas.elementAt ( 1 ), modelo.getNombre_Distribuidor () },
                { vecTiposColumnas.elementAt ( 2 ), modelo.getDireccion_Distribuidor () },
                { vecTiposColumnas.elementAt ( 3 ), modelo.getTipo_Transporte () },
            };

        } else if ( accion.equals ( PrincipalFrame.EDITAR ) ) {
            mensaje = "El registro ha sido actualizado";
            sql = frmPrincipal.getPropConsultasSQL ().getProperty (
                    PrincipalFrame.DISTRIBUIDOR_ACTUALIZA_DATOS );
            args = new Object[][] {
                { vecTiposColumnas.elementAt ( 1 ), modelo.getNombre_Distribuidor () },
                { vecTiposColumnas.elementAt ( 2 ), modelo.getDireccion_Distribuidor () },
                { vecTiposColumnas.elementAt ( 3 ), modelo.getTipo_Transporte () },
                { vecTiposColumnas.elementAt ( 0 ), modelo.getId_Distribuidor () }
            };
        }

        try {
            int regs = EjecutorSQL.sqlEjecutar ( sql, args );
            if ( regs == 1 ) {
                frmPrincipal.getJbtnModulo2 ().doClick ();
                JOptionPane.showMessageDialog (
                        this,
                        "El registro ha sido actualizado",
                        mensaje,
                        JOptionPane.INFORMATION_MESSAGE );
            }
        } catch ( SQLException ex ) {
            dialogoMensaje ( ex.toString () );
        }
        dispose ();
    }//GEN-LAST:event_jbtnGuardarActionPerformed

    //----------------------------------------------------------------------------------------
    
    private boolean validarDatos () {
          String nombre = jtxfNombreDis.getText ();
        if ( nombre.trim ().equals ( "" ) ) {
            dialogoMensaje ( "No se permite un valor en blanco" );
            jtxfNombreDis.requestFocus ();
            return false;
        }
         
        String transporte = jtxfTransporte.getText ();
        if ( transporte.trim ().equals ( "" ) ) {
            dialogoMensaje ( "No se permite un valor en blanco" );
            jtxfTransporte.requestFocus ();
            return false;
        }
         String direccion = jtxfDirDis.getText ();
        if ( direccion.trim ().equals ( "" ) ) {
            dialogoMensaje ( "No se permite un valor en blanco" );
            jtxfDirDis.requestFocus ();
            return false;
        }
        
        int id = modelo == null ? 0 : modelo.getId_Distribuidor ();

    

        modelo = new Modelo2 ( id, nombre, direccion, transporte );
        return true;
    }

    //----------------------------------------------------------------------------------------
    
    private void dialogoMensaje ( String mensaje ) {
        JOptionPane.showMessageDialog ( this, mensaje, "Error", JOptionPane.ERROR_MESSAGE );
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
            java.util.logging.Logger.getLogger(Modulo2EditarDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Modulo2EditarDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Modulo2EditarDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Modulo2EditarDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Modulo2EditarDialog dialog = new Modulo2EditarDialog(new javax.swing.JFrame(), null);
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

    //----------------------------------------------------------------------------------------

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbtnCancelar;
    private javax.swing.JButton jbtnGuardar;
    private javax.swing.JLabel jlblLogo;
    private javax.swing.JTextField jtxfDirDis;
    private javax.swing.JTextField jtxfNombreDis;
    private javax.swing.JTextField jtxfTransporte;
    // End of variables declaration//GEN-END:variables
}
