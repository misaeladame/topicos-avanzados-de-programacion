/*------------------------------------------------------------------------------------------
:*                       INSTITUTO TECNOLOGICO DE LA LAGUNA
:*                     INGENIERIA EN SISTEMAS COMPUTACIONALES
:*                       TOPICOS AVANZADOS DE PROGRAMACION "B"
:*
:*                   SEMESTRE: ENE-JUN/2020    HORA: 17-18 HRS
:*
:*           Aplicación GUI para editar o crear registros en el Módulo 3
:*        
:*  Archivo     : Modulo3EditarDialog.java
:*  Autor       : José Misael Adame Sandoval     18131209
:*                Ricardo Raúl Castro Luna       18131227
:*                Jorge Arturo Galindo Uribe     18131238
:*  Fecha       : 24/May/2020
:*  Compilador  : JAVA J2SE v1.8.0
:*  Descripción : Aplicación que crea o edita un registro de la tabla Kardex con los 
:*                siguientes datos:
:*                  1. Alumno
:*                  2. Materia
:*                  3. Periodo
:*                  4. Calificacion
:*                     
:*                
:*  Ultima modif:
:*  Fecha       Modificó             Motivo
:*========================================================================================== 
:*  24/May/2020 Misael Adame         Agregar prólogo.
:*------------------------------------------------------------------------------------------*/

package app;

import mx.edu.itl.jdbc.EjecutorSQL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.Icon;
import javax.swing.JOptionPane;
import modelo.Modelo1;
import modelo.Modelo2;
import modelo.Modelo3;
import mx.edu.itl.util.Imagenes;

public class Modulo3EditarDialog extends javax.swing.JDialog {
    
    //----------------------------------------------------------------------------------------

    private PrincipalFrame frmPrincipal;
    private Modelo3 modelo;
    private String accion;
    private Vector<String> vecTiposColumnas;
    private String sql;
    
    //----------------------------------------------------------------------------------------
    
    public Modulo3EditarDialog(java.awt.Frame parent, Modelo3 modelo ) {
        super ( parent, true );
        initComponents ();
        
        frmPrincipal = ( PrincipalFrame ) parent;
        this.modelo = modelo;
        vecTiposColumnas = frmPrincipal.getVecTiposColumnas ();
        
        accion = ( modelo == null )? PrincipalFrame.NUEVO : PrincipalFrame.EDITAR;
        setTitle ( accion );
        
        Icon kardex = Imagenes.escalarImagen ( jlblLogo.getIcon(), 
                                               jlblLogo.getWidth(),
                                               jlblLogo.getHeight() );
        
        jlblLogo.setIcon ( kardex );
        
        llenarCombo1DesdeTabla ();
        llenarCombo2DesdeTabla ();
        inicializarFormulario ();
    }

    //----------------------------------------------------------------------------------------
    
    private void llenarCombo1DesdeTabla () {
        ResultSet rs;
        Modelo1 modelo1;
        
        // Llenado del comboBox de alumnos
        sql = frmPrincipal.getPropConsultasSQL ()
                          .getProperty ( PrincipalFrame.ALUMNOS_TODOS_POR_NOMBRE );
        try {
            rs = EjecutorSQL.sqlQuery ( sql );
            
            jcboAlumno.addItem ( new Modelo1 ( "", "--Seleccione--", "", 0, 0.0f ) );
            while ( rs.next () ) {
                String matricula = rs.getString ( "matricula" );
                String nombre = rs.getString ( "nombre" );
                String apellidos = rs.getString ( "apellidos" );
                
                modelo1 = new Modelo1 ( matricula, nombre, apellidos, 0, 0.0f );
                jcboAlumno.addItem ( modelo1 );
                
                if ( modelo != null && 
                     matricula.equals ( modelo.getMatricula () ) ) {
                    int index = jcboAlumno.getModel ().getSize ();
                    jcboAlumno.setSelectedIndex ( index - 1 );
                }
            }
            rs.close ();
            
        } catch (SQLException ex) {
            dialogoMensaje ( ex.toString() );
        }
    }
    
    //----------------------------------------------------------------------------------------
    
    private void llenarCombo2DesdeTabla () {
        ResultSet rs;
        Modelo2 modelo2;
        
        // Llenado del comboBox de materias
        sql = frmPrincipal.getPropConsultasSQL ()
                          .getProperty ( PrincipalFrame.MATERIAS_TODOS_POR_MATERIA );
        try {
            rs = EjecutorSQL.sqlQuery ( sql );
            
            jcboMateria.addItem ( new Modelo2 ( "", "--Seleccione--", 0 ) );
            while ( rs.next () ) {
                String idmateria = rs.getString ( "idmateria" );
                String materia = rs.getString ( "materia" );
                
                modelo2 = new Modelo2 ( idmateria, materia, 0 );
                jcboMateria.addItem ( modelo2 );
                
                if ( modelo != null && 
                    idmateria.equals ( modelo.getIdmateria () ) ) {
                    int index = jcboMateria.getModel ().getSize ();
                    jcboMateria.setSelectedIndex ( index - 1 );
                }
            }  
            rs.close ();
            
        } catch (SQLException ex) {
            dialogoMensaje ( ex.toString() );
        }
    }
    
    //----------------------------------------------------------------------------------------
    
    private void inicializarFormulario () {
        if ( accion.equals ( PrincipalFrame.NUEVO ) ) {

        } else if ( accion.equals ( PrincipalFrame.EDITAR ) ) {
            jcboPeriodo.setSelectedItem ( modelo.getPeriodo() );
            jftxfCalificacion.setText ( modelo.getCalificacion () + ""  );
        }
        jcboAlumno.requestFocus ();
    }
    
    //----------------------------------------------------------------------------------------
    
    private void dialogoMensaje ( String mensaje ) {
        JOptionPane.showMessageDialog ( this, mensaje, "Error", JOptionPane.ERROR_MESSAGE );
    }
    
    //----------------------------------------------------------------------------------------
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jcboAlumno = new javax.swing.JComboBox<Modelo1>();
        jcboPeriodo = new javax.swing.JComboBox();
        jftxfCalificacion = new javax.swing.JFormattedTextField();
        jlblLogo = new javax.swing.JLabel();
        jbtnGuardar = new javax.swing.JButton();
        jbtnCancelar = new javax.swing.JButton();
        jcboMateria = new javax.swing.JComboBox<Modelo2>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Alumno:");

        jLabel2.setText("Materia:");

        jLabel3.setText("Periodo:");

        jLabel4.setText("Calificación:");

        jcboPeriodo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2018A", "2018B", "2019A", "2019B", "2020A", "2020B", "2021A", "2021B", "2022A", "2022B" }));

        jftxfCalificacion.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        jftxfCalificacion.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jftxfCalificacion.setText("0");

        jlblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/img_Kardex.jpg"))); // NOI18N
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
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbtnGuardar)
                        .addGap(103, 103, 103)
                        .addComponent(jbtnCancelar))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jftxfCalificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(204, 204, 204))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(jLabel3))
                            .addGap(33, 33, 33)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jcboPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jcboAlumno, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jcboMateria, 0, 293, Short.MAX_VALUE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jlblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbtnGuardar)
                            .addComponent(jbtnCancelar))
                        .addGap(21, 21, 21))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jcboAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jcboMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jcboPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jftxfCalificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
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
                                    PrincipalFrame.KARDEX_INSERTA_NUEVO );
            args = new Object [][] {
                        { vecTiposColumnas.elementAt ( 0 ), modelo.getIdcalific () },
                        { vecTiposColumnas.elementAt ( 1 ), modelo.getMatricula () },
                        { vecTiposColumnas.elementAt ( 4 ), modelo.getIdmateria () },
                        { vecTiposColumnas.elementAt ( 6 ), modelo.getPeriodo () },
                        { vecTiposColumnas.elementAt ( 7 ), modelo.getCalificacion () }
                    };
            
        } else if ( accion.equals ( PrincipalFrame.EDITAR ) ) {
            mensaje = "El registro ha sido actualizado";
            sql = frmPrincipal.getPropConsultasSQL().getProperty (
                                    PrincipalFrame.KARDEX_ACTUALIZA_DATOS );
            args = new Object [][] {
                        { vecTiposColumnas.elementAt ( 1 ), modelo.getMatricula () },
                        { vecTiposColumnas.elementAt ( 4 ), modelo.getIdmateria () },
                        { vecTiposColumnas.elementAt ( 6 ), modelo.getPeriodo () },
                        { vecTiposColumnas.elementAt ( 7 ), modelo.getCalificacion () },
                        { vecTiposColumnas.elementAt ( 0 ), modelo.getIdcalific () }
                    };
        }
        
        try {
            int regs = EjecutorSQL.sqlEjecutar ( sql, args );
            if ( regs == 1 ) {
                frmPrincipal.getJbtnModulo3 ().doClick();
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
        Modelo1 modelo1 = ( Modelo1 ) jcboAlumno.getSelectedItem ();
        String matricula = modelo1.getMatricula ();
        String nombre = modelo1.getNombre ();
        if ( nombre.equals ( "--Seleccione--" ) ) {
            dialogoMensaje ( "Debede seleccionar un elemento de la lista" );
            jcboAlumno.requestFocus ();
            return false;
        }
        
        Modelo2 modelo2 = ( Modelo2 ) jcboMateria.getSelectedItem ();
        String idmateria = modelo2.getIdmateria ();
        String materia = modelo2.getMateria ();
        if ( materia.equals ( "--Seleccione--" ) ) {
            dialogoMensaje ( "Debe desleccionar un elemento de la lista" );
            jcboMateria.requestFocus ();
            return false;
        }
        
        int calificacion = 0;
        try {
            calificacion = Integer.parseInt ( jftxfCalificacion.getText () );
            if ( calificacion < 0 || calificacion > 100 ) {
                dialogoMensaje ( "Debe capturar un valor numerico valido" );
                jftxfCalificacion.requestFocus ();
                return false;
            }
        } catch ( NumberFormatException ex ) {
            dialogoMensaje ( "Debe capturar un valor numerico valido" );
            jftxfCalificacion.requestFocus ();
            return false;
        }
        
        String periodo = jcboPeriodo.getSelectedItem ().toString ();
        
        int idcalific = 0;
        if ( accion.equals ( PrincipalFrame.NUEVO ) ) {
            ResultSet rs;
            
            // Determinar el consecutivo del ID CALIFICACION e incrementarlo en 1
            sql = frmPrincipal.getPropConsultasSQL().getProperty( PrincipalFrame.KARDEX_OBT_MAX_ID );
            try {
                rs = EjecutorSQL.sqlQuery ( sql );
                if ( rs.next() ) {
                    idcalific = rs.getInt ( "maxid" );
                    idcalific++;
                }
            } catch ( SQLException ex ) {
                dialogoMensaje ( ex.toString () );
            }
        } else if ( accion.equals ( PrincipalFrame.EDITAR ) ) {
            idcalific = modelo.getIdcalific ();
        }
        
        modelo = new Modelo3 ( idcalific, matricula, idmateria, periodo, calificacion );
        return true;   
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
            java.util.logging.Logger.getLogger(Modulo3EditarDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Modulo3EditarDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Modulo3EditarDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Modulo3EditarDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Modulo3EditarDialog dialog = new Modulo3EditarDialog(new javax.swing.JFrame(), null);
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
    private javax.swing.JButton jbtnCancelar;
    private javax.swing.JButton jbtnGuardar;
    private javax.swing.JComboBox<Modelo1> jcboAlumno;
    private javax.swing.JComboBox<Modelo2> jcboMateria;
    private javax.swing.JComboBox jcboPeriodo;
    private javax.swing.JFormattedTextField jftxfCalificacion;
    private javax.swing.JLabel jlblLogo;
    // End of variables declaration//GEN-END:variables
}
