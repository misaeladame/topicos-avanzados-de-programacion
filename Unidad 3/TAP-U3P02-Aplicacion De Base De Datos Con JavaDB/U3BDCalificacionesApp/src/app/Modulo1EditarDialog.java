/*------------------------------------------------------------------------------------------
:*                       INSTITUTO TECNOLOGICO DE LA LAGUNA
:*                     INGENIERIA EN SISTEMAS COMPUTACIONALES
:*                       TOPICOS AVANZADOS DE PROGRAMACION "B"
:*
:*                   SEMESTRE: ENE-JUN/2020    HORA: 17-18 HRS
:*
:*           Aplicación GUI para editar o crear registros en el Módulo 1
:*        
:*  Archivo     : Modulo1EditarDialog.java
:*  Autor       : José Misael Adame Sandoval     18131209
:*                Ricardo Raúl Castro Luna       18131227
:*                Jorge Arturo Galindo Uribe     18131238
:*  Fecha       : 24/May/2020
:*  Compilador  : JAVA J2SE v1.8.0
:*  Descripción : Aplicación que crea o edita un registro de la tabla Alumnos con los 
:*                siguientes datos:
:*                  1. Matricula
:*                  2. Nombre
:*                  3. Apellidos
:*                  4. Edad
:*                  5. Promedio
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
import modelo.Modelo1;
import mx.edu.itl.jdbc.EjecutorSQL;
import mx.edu.itl.util.Imagenes;

public class Modulo1EditarDialog extends javax.swing.JDialog {
    
    //----------------------------------------------------------------------------------------

    private PrincipalFrame frmPrincipal;
    private Modelo1 modelo;
    private String accion;
    private Vector<String> vecTiposColumnas;
    private String sql;
    
    //----------------------------------------------------------------------------------------
    
    public Modulo1EditarDialog ( java.awt.Frame parent, Modelo1 modelo ) {
        super ( parent, true );
        initComponents ();
        
        frmPrincipal = (PrincipalFrame) parent;
        this.modelo = modelo;
        vecTiposColumnas = frmPrincipal.getVecTiposColumnas ();
        
        accion = ( modelo == null )? PrincipalFrame.NUEVO : PrincipalFrame.EDITAR;
        setTitle ( accion );
        
        Icon alumno = Imagenes.escalarImagen ( jlblLogo.getIcon(), 
                                               jlblLogo.getWidth(),
                                               jlblLogo.getHeight() );
        
        jlblLogo.setIcon ( alumno );
        
        inicializarFormulario ();
    }   

    //----------------------------------------------------------------------------------------
    
    public void inicializarFormulario () {
        if ( accion.equals ( PrincipalFrame.NUEVO ) ) {
            jtxfMatricula.requestFocus ();
        } else if ( accion.equals ( PrincipalFrame.EDITAR ) ) {
            jtxfMatricula.setText ( modelo.getMatricula () );
            jtxfNombre.setText ( modelo.getNombre() );
            jtxfApellidos.setText ( modelo.getApellidos () );
            jspnEdad.setValue ( modelo.getEdad() );
            jftxfPromedio.setText ( modelo.getPromedio () + "" );
            
            jtxfNombre.requestFocus ();
            jtxfMatricula.setEditable ( false );
        }
    }
    
    //----------------------------------------------------------------------------------------
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jtxfMatricula = new javax.swing.JTextField();
        jtxfNombre = new javax.swing.JTextField();
        jtxfApellidos = new javax.swing.JTextField();
        jspnEdad = new javax.swing.JSpinner();
        jftxfPromedio = new javax.swing.JFormattedTextField();
        jlblLogo = new javax.swing.JLabel();
        jbtnGuardar = new javax.swing.JButton();
        jbtnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Matricula: ");

        jLabel2.setText("Nombre:");

        jLabel3.setText("Apellidos: ");

        jLabel4.setText("Edad:");

        jLabel5.setText("Promedio:");

        jspnEdad.setModel(new javax.swing.SpinnerNumberModel(1, 1, 100, 1));

        jftxfPromedio.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jftxfPromedio.setText("0.0");

        jlblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/img_Alumno.jpg"))); // NOI18N
        jlblLogo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(jftxfPromedio, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jspnEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jtxfMatricula)
                                .addComponent(jtxfNombre)
                                .addComponent(jtxfApellidos, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jlblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32))
            .addGroup(layout.createSequentialGroup()
                .addGap(135, 135, 135)
                .addComponent(jbtnGuardar)
                .addGap(121, 121, 121)
                .addComponent(jbtnCancelar)
                .addContainerGap(154, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jtxfMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jtxfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jtxfApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jspnEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jlblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jftxfPromedio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnGuardar)
                    .addComponent(jbtnCancelar))
                .addGap(29, 29, 29))
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
                                    PrincipalFrame.ALUMNOS_INSERTA_NUEVO );
            args = new Object [][] {
                        { vecTiposColumnas.elementAt ( 0 ), modelo.getMatricula () },
                        { vecTiposColumnas.elementAt ( 1 ), modelo.getNombre () },
                        { vecTiposColumnas.elementAt ( 2 ), modelo.getApellidos() },
                        { vecTiposColumnas.elementAt ( 3 ), modelo.getEdad () },
                        { vecTiposColumnas.elementAt ( 4 ), modelo.getPromedio ()}
                    };
            
        } else if ( accion.equals ( PrincipalFrame.EDITAR ) ) {
            mensaje = "El registro ha sido actualizado";
            sql = frmPrincipal.getPropConsultasSQL().getProperty (
                                    PrincipalFrame.ALUMNOS_ACTUALIZA_DATOS );
            args = new Object [][] {
                        { vecTiposColumnas.elementAt ( 1 ), modelo.getNombre () },
                        { vecTiposColumnas.elementAt ( 2 ), modelo.getApellidos() },
                        { vecTiposColumnas.elementAt ( 3 ), modelo.getEdad () },
                        { vecTiposColumnas.elementAt ( 4 ), modelo.getPromedio ()},
                        { vecTiposColumnas.elementAt ( 0 ), modelo.getMatricula () }
                    };
        }
        
        try {
            int regs = EjecutorSQL.sqlEjecutar ( sql, args );
            if ( regs == 1 ) {
                frmPrincipal.getJbtnModulo1 ().doClick();
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
        String matricula = jtxfMatricula.getText ();
        if ( matricula.trim ().equals ( "" ) ) {
            dialogoMensaje ( "No se permite un valor en blanco" );
            jtxfMatricula.requestFocus ();
            return false;
        }
        
        String nombre = jtxfNombre.getText ();
        if ( nombre.trim ().equals ( "" ) ) {
            dialogoMensaje ( "No se permite un valor en blanco" );
            jtxfNombre.requestFocus ();
            return false;
        }
        
        String apellidos = jtxfApellidos.getText ();
        if ( apellidos.trim ().equals ( "" ) ) {
            dialogoMensaje ( "No se permite un valor en blanco" );
            jtxfApellidos.requestFocus ();
            return false;
        }
        
        int edad = 0;
        try {
            edad = Integer.parseInt( jspnEdad.getValue ().toString() );
        } catch ( NumberFormatException ex ) {
            dialogoMensaje ( "Debe capturar un valor numerico valido" );
            jspnEdad.requestFocus ();
            return false;
        }
        
        float promedio;
        try {
            promedio = Float.parseFloat ( jftxfPromedio.getText () );
            if ( promedio < 0 || promedio > 100 ) {
                dialogoMensaje ( "Debe capturar un valor numerico valido");
                jftxfPromedio.requestFocus ();
                return false;
            }
        } catch ( NumberFormatException ex ) {
            dialogoMensaje ( "Debe capturar un valor numerico valido");
            jftxfPromedio.requestFocus ();
            return false;
        }
        
        modelo = new Modelo1 ( matricula, nombre, apellidos, edad, promedio );
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
            java.util.logging.Logger.getLogger(Modulo1EditarDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Modulo1EditarDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Modulo1EditarDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Modulo1EditarDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Modulo1EditarDialog dialog = new Modulo1EditarDialog(new javax.swing.JFrame(), null );
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
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton jbtnCancelar;
    private javax.swing.JButton jbtnGuardar;
    private javax.swing.JFormattedTextField jftxfPromedio;
    private javax.swing.JLabel jlblLogo;
    private javax.swing.JSpinner jspnEdad;
    private javax.swing.JTextField jtxfApellidos;
    private javax.swing.JTextField jtxfMatricula;
    private javax.swing.JTextField jtxfNombre;
    // End of variables declaration//GEN-END:variables
}
