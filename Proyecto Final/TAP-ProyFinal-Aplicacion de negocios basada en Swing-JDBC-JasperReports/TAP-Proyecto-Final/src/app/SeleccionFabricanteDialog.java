/*------------------------------------------------------------------------------------------
:*                       INSTITUTO TECNOLOGICO DE LA LAGUNA
:*                     INGENIERIA EN SISTEMAS COMPUTACIONALES
:*                       TOPICOS AVANZADOS DE PROGRAMACION "B"
:*
:*                   SEMESTRE: ENE-JUN/2020    HORA: 17-18 HRS
:*
:*                      Dialogo para seleccionar un fabricante
:*        
:*  Archivo     : SeleccionFabricanteDialog.java
:*  Autor       : José Misael Adame Sandoval     18131209
:*                Ricardo Raúl Castro Luna       18131227
:*                Jorge Arturo Galindo Uribe     18131238
:*  Fecha       : 15/Jun/2020
:*  Compilador  : JAVA J2SE v1.8.0
:*  Descripción : Dialog que permite al usuario seleccionar uno de los  
:*                registros de fabricante para crear el reporte de productos
:*                en base al fabricante elegido.
:*                
:*                     
:*                
:*  Ultima modif:
:*  Fecha       Modificó             Motivo
:*========================================================================================== 
:*  16/Jun/2020 Misael Adame         Agregar prólogo.
:*------------------------------------------------------------------------------------------*/
package app;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;
import javax.swing.JOptionPane;
import modelo.Modelo1;
import modelo.Modelo3;
import mx.edu.itl.jdbc.ConexionDB;
import mx.edu.itl.jdbc.EjecutorSQL;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

public class SeleccionFabricanteDialog extends javax.swing.JDialog {

    //----------------------------------------------------------------------------------------
    
    private PrincipalFrame frmPrincipal;
    private Modelo3 modelo3;

    private Vector<String> vecTiposColumnas;
    private String sql;

    //----------------------------------------------------------------------------------------
    
    public SeleccionFabricanteDialog ( java.awt.Frame parent, boolean modal ) {
        super ( parent, modal );
        initComponents ();
        frmPrincipal = ( PrincipalFrame ) parent;
       
        vecTiposColumnas = frmPrincipal.getVecTiposColumnas ();

       
        setTitle ( "Seleccione fabricante" );
        
        this.setLocationRelativeTo ( null );
        
        llenarCombo1DesdeTabla ();
    }

    //----------------------------------------------------------------------------------------
    
    private void llenarCombo1DesdeTabla () {
        ResultSet rs;
        Modelo1 modelo1;

        // Llenado del comboBox de Fabricantes
        sql = frmPrincipal.getPropConsultasSQL ()
                .getProperty(PrincipalFrame.FABRICA_TODOS_POR_NOMBRE);
        try { 
            rs = EjecutorSQL.sqlQuery ( sql );

            jcboFabricante.addItem ( new Modelo1 ( 0, "--Seleccione--", "", "" ));
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
    
    private void dialogoMensaje ( String mensaje ) {
        JOptionPane.showMessageDialog ( this, mensaje, "Error", JOptionPane.ERROR_MESSAGE );
    }
    
    //----------------------------------------------------------------------------------------
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jbtnCancelar = new javax.swing.JButton();
        jbtnCrear = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jcboFabricante = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));

        jbtnCancelar.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        jbtnCancelar.setText("Cancelar");
        jbtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCancelarActionPerformed(evt);
            }
        });

        jbtnCrear.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        jbtnCrear.setText("Crear reporte");
        jbtnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCrearActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        jLabel1.setText("Seleccione al fabricante para crear el reporte de productos:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(59, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jbtnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(42, 42, 42)
                    .addComponent(jbtnCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(218, Short.MAX_VALUE)))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(83, 83, 83)
                    .addComponent(jcboFabricante, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(83, 83, 83)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(74, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(116, 116, 116)
                .addComponent(jbtnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(206, Short.MAX_VALUE)
                    .addComponent(jbtnCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(41, 41, 41)))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(135, 135, 135)
                    .addComponent(jcboFabricante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(135, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //----------------------------------------------------------------------------------------
    
    private void jbtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCancelarActionPerformed
        dispose ();
    }//GEN-LAST:event_jbtnCancelarActionPerformed

    //----------------------------------------------------------------------------------------
    
    private void jbtnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCrearActionPerformed
       
        String reporte = "src\\reportes\\ProductosReport.jrxml";
        JasperReport jr;
        try {
            
            Map parametro = new HashMap ();
            parametro.put ( "id_fabricante", jcboFabricante.getSelectedItem () );
            jr = JasperCompileManager.compileReport ( reporte );
            JasperPrint jp;
            jp = JasperFillManager.fillReport ( jr, parametro, ConexionDB.getInstancia ().getConexion () );
            JasperViewer jv ;
            jv = new JasperViewer ( jp, false );
            dispose ();
            jv.setTitle ( "Reporte Producto" );
            jv.setVisible ( true );
        } catch ( JRException ex ) {
            dispose ();
            JOptionPane.showMessageDialog ( this,
                    ex, "Error", JOptionPane.ERROR_MESSAGE );
        }    
    }//GEN-LAST:event_jbtnCrearActionPerformed

    //----------------------------------------------------------------------------------------  
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(SeleccionFabricanteDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SeleccionFabricanteDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SeleccionFabricanteDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SeleccionFabricanteDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                SeleccionFabricanteDialog dialog = new SeleccionFabricanteDialog(new javax.swing.JFrame(), true);
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbtnCancelar;
    private javax.swing.JButton jbtnCrear;
    private javax.swing.JComboBox<Modelo1> jcboFabricante;
    // End of variables declaration//GEN-END:variables
}
