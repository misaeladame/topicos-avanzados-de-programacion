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
:*  Descripción : Aplicación que crea o edita un registro de la tabla Producto con los 
:*                siguientes datos:
:*                  - id_Producto
:*                  - id_Fabricante
:*                  - id_Distribuidor
:*                  - modelo_Producto
:*                  - precio_Producto
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
    private Modelo3 modelo3;
    private String accion;
    private Vector<String> vecTiposColumnas;
    private String sql;

    //----------------------------------------------------------------------------------------
    
    public Modulo3EditarDialog ( java.awt.Frame parent, Modelo3 modelo ) {
        super ( parent, true );
        initComponents ();

        frmPrincipal = ( PrincipalFrame ) parent;
        this.modelo3 = modelo;
        vecTiposColumnas = frmPrincipal.getVecTiposColumnas ();

        accion = ( modelo == null ) ? PrincipalFrame.NUEVO : PrincipalFrame.EDITAR;
        setTitle ( accion );

        Icon producto = Imagenes.escalarImagen ( jlblLogo.getIcon (),
                jlblLogo.getWidth (),
                jlblLogo.getHeight () );

        jlblLogo.setIcon ( producto );

        llenarCombo1DesdeTabla ();
        llenarCombo2DesdeTabla ();
        inicializarFormulario ();
    }

    //----------------------------------------------------------------------------------------
    
    private void llenarCombo1DesdeTabla() {
        ResultSet rs;
        Modelo1 modelo1;

        // Llenado del comboBox de Fabricantes
        sql = frmPrincipal.getPropConsultasSQL ()
                .getProperty(PrincipalFrame.FABRICA_TODOS_POR_NOMBRE);
        try { 
            rs = EjecutorSQL.sqlQuery ( sql );

            jcboFabricante.addItem ( new Modelo1 ( 0, "--Seleccione--", "", "" ) );
            while (rs.next()) {
                int id_Fab = rs.getInt ( "Id_Fabricante" );
                String nom_Fab = rs.getString ( "Nombre_Fabricante" );
                String dir_Fab = rs.getString ( "Direccion_Fabricante" );
                String presidente = rs.getString ( "Presidente_Fabricante" );

                modelo1 = new Modelo1 ( id_Fab, nom_Fab, dir_Fab, presidente );
                jcboFabricante.addItem ( modelo1 );

                if ( modelo3 != null
                        && id_Fab == modelo3.getId_Fabricante () ) {
                    int index = jcboFabricante.getModel ().getSize ();
                    jcboFabricante.setSelectedIndex ( index - 1 );
                }
            }
            rs.close ();

        } catch  ( SQLException ex ) {
            dialogoMensaje ( ex.toString () );
        }
    }

    //----------------------------------------------------------------------------------------
    
    private void llenarCombo2DesdeTabla() {
        ResultSet rs;
        Modelo2 modelo2;

        // Llenado del comboBox de Distribuidores
        sql = frmPrincipal.getPropConsultasSQL ()
                .getProperty ( PrincipalFrame.DISTRIBUIDOR_TODOS_POR_NOMBRE );
        try {
            rs = EjecutorSQL.sqlQuery ( sql );

            jcboMateria.addItem ( new Modelo2 ( 0, "--Seleccione--", "", "" ) );
            while ( rs.next () ) {
                int id_Dis = rs.getInt ( "Id_Distribuidor" );
                String nom_dis = rs.getString ( "Nombre_Distribuidor" );
                String dir_Dis = rs.getString ( "Direccion_Distribuidor" );
                String transporte = rs.getString ( "Tipo_Transporte" );

                modelo2 = new Modelo2 ( id_Dis, nom_dis, dir_Dis, transporte );
                jcboMateria.addItem ( modelo2 );

                if ( modelo3 != null
                        && id_Dis == modelo3.getId_Distribuidor () ) {
                    int index = jcboMateria.getModel ().getSize ();
                    jcboMateria.setSelectedIndex ( index - 1 );
                }
            }
            rs.close ();

        } catch ( SQLException ex ) {
            dialogoMensaje ( ex.toString () );
        }
    }

    //----------------------------------------------------------------------------------------
    
    private void inicializarFormulario () {
        if ( accion.equals ( PrincipalFrame.NUEVO ) ) {

        } else if ( accion.equals ( PrincipalFrame.EDITAR ) ) {
            jtxfModelo.setText ( modelo3.getModelo_Producto () );
            jftxfPrecio.setText ( modelo3.getPrecio_Producto () + "");
        }
        jcboFabricante.requestFocus ();
    }

    //----------------------------------------------------------------------------------------
    
    private void dialogoMensaje ( String mensaje ) {
        JOptionPane.showMessageDialog ( this, mensaje, "Error", JOptionPane.ERROR_MESSAGE );
    }

    //----------------------------------------------------------------------------------------
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jftxfPrecio = new javax.swing.JFormattedTextField();
        jcboMateria = new javax.swing.JComboBox<>();
        jcboFabricante = new javax.swing.JComboBox<>();
        jlblLogo = new javax.swing.JLabel();
        jbtnCancelar = new javax.swing.JButton();
        jbtnGuardar = new javax.swing.JButton();
        jtxfModelo = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));

        jLabel1.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        jLabel1.setText("Distribuidor");

        jLabel2.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        jLabel2.setText("Fabricante");

        jLabel3.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        jLabel3.setText("Modelo");

        jLabel4.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        jLabel4.setText("Precio:");

        jftxfPrecio.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        jftxfPrecio.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jftxfPrecio.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N

        jlblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/img_hardware.png"))); // NOI18N
        jlblLogo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jbtnCancelar.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        jbtnCancelar.setText("Cancelar");
        jbtnCancelar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jbtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCancelarActionPerformed(evt);
            }
        });

        jbtnGuardar.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        jbtnGuardar.setText("Guardar");
        jbtnGuardar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jbtnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnGuardarActionPerformed(evt);
            }
        });

        jtxfModelo.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jftxfPrecio, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jcboFabricante, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jcboMateria, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jtxfModelo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jbtnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(66, 66, 66)
                                .addComponent(jbtnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(jlblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jcboFabricante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jcboMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jtxfModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jftxfPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jlblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jbtnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(jbtnGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    PrincipalFrame.PRODUCTO_INSERTA_NUEVO );
            args = new Object[][] {
                { vecTiposColumnas.elementAt ( 1 ), modelo3.getId_Fabricante () }, 
                { vecTiposColumnas.elementAt ( 3 ), modelo3.getId_Distribuidor () },
                { vecTiposColumnas.elementAt ( 5 ), modelo3.getModelo_Producto () },
                { vecTiposColumnas.elementAt ( 6 ), modelo3.getPrecio_Producto () }
            };

        } else if ( accion.equals ( PrincipalFrame.EDITAR ) ) {
            mensaje = "El registro ha sido actualizado";
            sql = frmPrincipal.getPropConsultasSQL ().getProperty (
                    PrincipalFrame.PRODUCTO_ACTUALIZA_DATOS );
            args = new Object[][] {
                { vecTiposColumnas.elementAt ( 1 ), modelo3.getId_Fabricante () },
                { vecTiposColumnas.elementAt ( 3 ), modelo3.getId_Distribuidor () },
                { vecTiposColumnas.elementAt ( 5 ), modelo3.getModelo_Producto () },
                { vecTiposColumnas.elementAt ( 6 ), modelo3.getPrecio_Producto () },
                { vecTiposColumnas.elementAt ( 0 ), modelo3.getId_Producto () }
            };
        }

        try {
            int regs = EjecutorSQL.sqlEjecutar ( sql, args );
            if (regs == 1) {
                frmPrincipal.getJbtnModulo3 ().doClick ();
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
        Modelo1 modelo1 = ( Modelo1 ) jcboFabricante.getSelectedItem ();
        int id_Fabricante = modelo1.getId_Fabricante ();
        String nombre = modelo1.getNombre_Fabricante ();
        if (nombre.equals ( "--Seleccione--" ) ) {
            dialogoMensaje ( "Debe de seleccionar un elemento de la lista" );
            jcboFabricante.requestFocus ();
            return false;
        }

        Modelo2 modelo2 = ( Modelo2 ) jcboMateria.getSelectedItem ();
        int id_Distribuidor = modelo2.getId_Distribuidor ();
        String nombre_Distribuidor = modelo2.getNombre_Distribuidor ();
        if (nombre_Distribuidor.equals ( "--Seleccione--" ) ) {
            dialogoMensaje ( "Debe desleccionar un elemento de la lista" );
            jcboMateria.requestFocus ();
            return false;
        }

        String modeloP = jtxfModelo.getText ();
        if ( modeloP.trim ().equals ( "" ) ) {
            dialogoMensaje ( "No se permite un valor en blanco" );
            jtxfModelo.requestFocus ();
            return false;
        }

        double precio = 0;
        try {
            precio = Double.parseDouble ( jftxfPrecio.getText () );

        } catch ( NumberFormatException ex ) {
            dialogoMensaje ( "Debe capturar un valor numerico valido" );
            jftxfPrecio.requestFocus ();
            return false;
        } 

        int idProd = modelo3 == null ? 0 : modelo3.getId_Distribuidor ();

        modelo3 = new Modelo3 ( idProd, id_Fabricante, id_Distribuidor, modeloP, precio );
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
    
    public static void main ( String args[] ) {
        ejecutar ();
    }

    //----------------------------------------------------------------------------------------

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbtnCancelar;
    private javax.swing.JButton jbtnGuardar;
    private javax.swing.JComboBox<Modelo1> jcboFabricante;
    private javax.swing.JComboBox<Modelo2> jcboMateria;
    private javax.swing.JFormattedTextField jftxfPrecio;
    private javax.swing.JLabel jlblLogo;
    private javax.swing.JTextField jtxfModelo;
    // End of variables declaration//GEN-END:variables
}
