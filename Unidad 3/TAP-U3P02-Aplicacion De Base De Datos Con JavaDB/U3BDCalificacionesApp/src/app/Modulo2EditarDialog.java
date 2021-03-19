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
:*  Descripción : Aplicación que crea o edita un registro de la tabla Materias con los 
:*                siguientes datos:
:*                  1. ID Materia
:*                  2. Materia
:*                  3. Creditos
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
        
        frmPrincipal = (PrincipalFrame) parent;
        this.modelo = modelo;
        vecTiposColumnas = frmPrincipal.getVecTiposColumnas ();
        
        accion = ( modelo == null )? PrincipalFrame.NUEVO : PrincipalFrame.EDITAR;
        setTitle ( accion );
        
        Icon materia = Imagenes.escalarImagen ( jlblLogo.getIcon(), 
                                                jlblLogo.getWidth(),
                                                jlblLogo.getHeight() );
        
        jlblLogo.setIcon ( materia );
        
        inicializarFormulario ();
    }
    
    //----------------------------------------------------------------------------------------
    
    public void inicializarFormulario () {
        if ( accion.equals ( PrincipalFrame.NUEVO ) ) {
            jtxfIDMateria.requestFocus ();
        } else if ( accion.equals ( PrincipalFrame.EDITAR ) ) {
            jtxfIDMateria.setText ( modelo.getIdmateria () );
            jtxfMateria.setText ( modelo.getMateria () );
            jspnCreditos.setValue ( modelo.getCreditos() );
            
            jtxfMateria.requestFocus ();
            jtxfIDMateria.setEditable ( false );
        }
    }
    
    //----------------------------------------------------------------------------------------
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jbtnGuardar = new javax.swing.JButton();
        jbtnCancelar = new javax.swing.JButton();
        jtxfMateria = new javax.swing.JTextField();
        jtxfIDMateria = new javax.swing.JTextField();
        jlblLogo = new javax.swing.JLabel();
        jspnCreditos = new javax.swing.JSpinner();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("ID Materia:");

        jLabel2.setText("Materia:");

        jLabel3.setText("Creditos:");

        jbtnGuardar.setText("Guardar");
        jbtnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnGuardarActionPerformed(evt);
            }
        });

        jbtnCancelar.setText("Cancelar");
        jbtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCancelarActionPerformed(evt);
            }
        });

        jlblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/img_Materia.png"))); // NOI18N
        jlblLogo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jspnCreditos.setModel(new javax.swing.SpinnerNumberModel(2, 2, 10, 1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtxfMateria, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                            .addComponent(jtxfIDMateria)
                            .addComponent(jspnCreditos, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addComponent(jbtnGuardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                        .addComponent(jbtnCancelar)))
                .addGap(27, 27, 27)
                .addComponent(jlblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jtxfIDMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jtxfMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jspnCreditos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbtnGuardar)
                            .addComponent(jbtnCancelar)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jlblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(15, Short.MAX_VALUE))
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
        Object [][] args = null;
        String mensaje = "";
        
        if ( validarDatos () == false ) 
            return;
        
        // Se determina la sentencia SQL a ejecutar y formar la matriz de argumentos
        if ( accion.equals ( PrincipalFrame.NUEVO ) ) {
            mensaje = "El registro ha sido agregado";
            sql = frmPrincipal.getPropConsultasSQL().getProperty (
                                    PrincipalFrame.MATERIAS_INSERTA_NUEVO );
            args = new Object [][] {
                        { vecTiposColumnas.elementAt ( 0 ), modelo.getIdmateria () },
                        { vecTiposColumnas.elementAt ( 1 ), modelo.getMateria () },
                        { vecTiposColumnas.elementAt ( 2 ), modelo.getCreditos () },
                    };
            
        } else if ( accion.equals ( PrincipalFrame.EDITAR ) ) {
            mensaje = "El registro ha sido actualizado";
            sql = frmPrincipal.getPropConsultasSQL().getProperty (
                                    PrincipalFrame.MATERIAS_ACTUALIZA_DATOS );
            args = new Object [][] {
                        { vecTiposColumnas.elementAt ( 1 ), modelo.getMateria () },
                        { vecTiposColumnas.elementAt ( 2 ), modelo.getCreditos () },
                        { vecTiposColumnas.elementAt ( 0 ), modelo.getIdmateria () }
                    };
        }
        
        try {
            int regs = EjecutorSQL.sqlEjecutar ( sql, args );
            if ( regs == 1 ) {
                frmPrincipal.getJbtnModulo2 ().doClick();
                JOptionPane.showMessageDialog(
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
        String idmateria = jtxfIDMateria.getText ();
        if ( idmateria.trim ().equals ( "" ) ) {
            dialogoMensaje ( "No se permite un valor en blanco" );
            jtxfIDMateria.requestFocus ();
            return false;
        }
        
        String materia = jtxfMateria.getText ();
        if ( materia.trim ().equals ( "" ) ) {
            dialogoMensaje ( "No se permite un valor en blanco" );
            jtxfMateria.requestFocus ();
            return false;
        }
        
        int creditos = 0;
        try {
            creditos = Integer.parseInt ( jspnCreditos.getValue ().toString() );
        } catch ( NumberFormatException ex ) {
            dialogoMensaje ( "Debe capturar un valor numerico valido" );
            jspnCreditos.requestFocus ();
            return false;
        }
        
        modelo = new Modelo2 ( idmateria, materia, creditos );
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
    
    public static void main(String args[]) {
        ejecutar ();
    }
    
    //----------------------------------------------------------------------------------------

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton jbtnCancelar;
    private javax.swing.JButton jbtnGuardar;
    private javax.swing.JLabel jlblLogo;
    private javax.swing.JSpinner jspnCreditos;
    private javax.swing.JTextField jtxfIDMateria;
    private javax.swing.JTextField jtxfMateria;
    // End of variables declaration//GEN-END:variables
}
