/*------------------------------------------------------------------------------------------
:*                       INSTITUTO TECNOLOGICO DE LA LAGUNA
:*                     INGENIERIA EN SISTEMAS COMPUTACIONALES
:*                       TOPICOS AVANZADOS DE PROGRAMACION "B"
:*
:*                   SEMESTRE: ENE-JUN/2020    HORA: 17-18 HRS
:*
:*                  Aplicacion GUI para el filtrado de consultas
:*        
:*  Archivo     : FiltrarDialog.java
:*  Autor       : José Misael Adame Sandoval     18131209
:*                Ricardo Raúl Castro Luna       18131227
:*                Jorge Arturo Galindo Uribe     18131238
:*  Fecha       : 24/May/2020
:*  Compilador  : JAVA J2SE v1.8.0
:*  Descripción : Aplicación que realiza un filtrado de consultas SQL de un módulo 
:*                seleccionado con los siguientes campos:
:*                  1. Columna
:*                  2. Comparador
:*                  3. Valor
:*                     
:*                
:*  Ultima modif:
:*  Fecha       Modificó             Motivo
:*========================================================================================== 
:*  24/May/2020 Misael Adame         Agregar prólogo.
:*------------------------------------------------------------------------------------------*/

package app;

import mx.edu.itl.jdbc.EjecutorSQL;
import java.util.Vector;
import javax.swing.JOptionPane;

public class FiltrarDialog extends javax.swing.JDialog {
    
    //----------------------------------------------------------------------------------------

    private PrincipalFrame frmPrincipal;
    private Vector<String> vecColumnas;
    private Vector<String> vecColumnasBD;
    private Vector<String> vecTipos;
    private boolean inicializando = true;
    
    //----------------------------------------------------------------------------------------
    
    public FiltrarDialog ( java.awt.Frame parent, boolean modal ) {
        super ( parent, modal );
        initComponents ();
        
        frmPrincipal = ( PrincipalFrame ) parent;
        vecColumnas = frmPrincipal.getVecNombresColumnas ();
        vecColumnasBD = frmPrincipal.getVecNombresColumnasBD ();
        vecTipos = frmPrincipal.getVecTiposColumnas ();
   
        jcboColumna.removeAllItems ();
        for ( int i = 0; i < vecColumnas.size (); i++ ) {
            jcboColumna.addItem ( vecColumnas.elementAt ( i ) );
        }
        
        cargarComparadores ( 0 );
        jcboColumna.setSelectedIndex ( 0 );
        jcboColumna.requestFocus ();
        inicializando = false;
    }
    
    //----------------------------------------------------------------------------------------
    
    private void cargarComparadores ( int pos ) {
        jcboComparador.removeAllItems ();
        switch ( vecTipos.elementAt ( pos ) ) {
            case EjecutorSQL.STRING:
                jcboComparador.addItem ( "Sea igual a" );
                jcboComparador.addItem ( "Empiece con" );
                jcboComparador.addItem ( "Termine con" );
                jcboComparador.addItem ( "Contenga" );
                jcboComparador.addItem ( "Sea diferente" );
                break;
            case EjecutorSQL.INT:
            case EjecutorSQL.FLOAT:
                jcboComparador.addItem ( "=" );
                jcboComparador.addItem ( "<>" );
                jcboComparador.addItem ( ">" );
                jcboComparador.addItem ( "<" );
                jcboComparador.addItem ( ">=" );
                jcboComparador.addItem ( "<=" );
                break;
        }
        jcboComparador.setSelectedIndex ( 0 );
    }

    //----------------------------------------------------------------------------------------
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jtxfValor = new javax.swing.JTextField();
        jbtnCancelar = new javax.swing.JButton();
        jcboComparador = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jcboColumna = new javax.swing.JComboBox();
        jbtnAceptar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Filtrar");
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 5, true));

        jtxfValor.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N

        jbtnCancelar.setBackground(new java.awt.Color(255, 255, 255));
        jbtnCancelar.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        jbtnCancelar.setText("Cancelar");
        jbtnCancelar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jbtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCancelarActionPerformed(evt);
            }
        });

        jcboComparador.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        jcboComparador.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel3.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        jLabel3.setText("Valor");

        jLabel2.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        jLabel2.setText("Comparador");

        jLabel1.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        jLabel1.setText("Columna");

        jcboColumna.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        jcboColumna.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jcboColumna.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcboColumnaItemStateChanged(evt);
            }
        });

        jbtnAceptar.setBackground(new java.awt.Color(255, 255, 255));
        jbtnAceptar.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        jbtnAceptar.setText("Aceptar");
        jbtnAceptar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jbtnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAceptarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(54, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(129, 129, 129)
                        .addComponent(jLabel2)
                        .addGap(114, 114, 114)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jcboColumna, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jcboComparador, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jtxfValor, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addComponent(jbtnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(80, 80, 80)
                        .addComponent(jbtnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(47, 47, 47))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcboColumna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcboComparador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxfValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jbtnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(jbtnAceptar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //----------------------------------------------------------------------------------------
    
    private void jbtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCancelarActionPerformed
        dispose ();
    }//GEN-LAST:event_jbtnCancelarActionPerformed

    //----------------------------------------------------------------------------------------
    
    private void jbtnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAceptarActionPerformed
        if ( jtxfValor.getText ().trim ().equals ( "" ) ) {
            JOptionPane.showMessageDialog (
                   this, "Proporcione un valor", "Filtrar", JOptionPane.ERROR_MESSAGE );
            jtxfValor.requestFocus ();
            return;
        }
        
        String sql = "";
        String orderBy = "";
        switch ( frmPrincipal.getModuloActual () ) {
            case PrincipalFrame.TIT_MODULO1:
                sql = frmPrincipal.getPropConsultasSQL ().getProperty (
                         PrincipalFrame.FABRICA_TODOS_SIN_ORDEN
                      );
                orderBy = " ORDER BY Nombre_Fabricante "; 
                break;
                
                
            case PrincipalFrame.TIT_MODULO2:
                sql = frmPrincipal.getPropConsultasSQL ().getProperty (
                         PrincipalFrame.DISTRIBUIDOR_TODOS_SIN_ORDEN
                      );  
                orderBy = " ORDER BY Nombre_Distribuidor "; 
                break;
            case PrincipalFrame.TIT_MODULO3:
                sql = frmPrincipal.getPropConsultasSQL ().getProperty (
                         PrincipalFrame.PRODUCTO_TODOS_SIN_ORDEN
                      ); 
                orderBy = " ORDER BY Id_Fabricante "; 
                break;
        }
        
        sql += " WHERE " + vecColumnasBD.elementAt ( jcboColumna.getSelectedIndex () );
        
        String tipo = vecTipos.elementAt( jcboColumna.getSelectedIndex () );
        String valor = jtxfValor.getText ();
        
        switch ( jcboComparador.getSelectedItem ().toString () ) {
            case "Sea igual a":
                sql += " = ? ";
                break;
            case "Empiece con":
                sql += " LIKE ? ";
                valor += "%";
                break;
            case "Termine con":
                sql += " LIKE ? ";
                valor = "%" + valor;
                break;
            case "Contenga":
                sql += " LIKE ? ";
                valor = "%" + valor + "%";
                break;
            case "Sea diferente":
                sql += " <> ? ";
                break;
            default:
                sql += " " + jcboComparador.getSelectedItem ().toString () + " ? ";
        }
        
        sql += orderBy;
        
        Object [][] args = { { tipo, valor } };
        frmPrincipal.desplegarRegistros ( sql, args );
        dispose ();
    }//GEN-LAST:event_jbtnAceptarActionPerformed

    //----------------------------------------------------------------------------------------
    
    private void jcboColumnaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcboColumnaItemStateChanged
        if ( ! inicializando ) {
            cargarComparadores ( jcboColumna.getSelectedIndex () );
        }
    }//GEN-LAST:event_jcboColumnaItemStateChanged

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
            java.util.logging.Logger.getLogger(FiltrarDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FiltrarDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FiltrarDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FiltrarDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FiltrarDialog dialog = new FiltrarDialog(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton jbtnAceptar;
    private javax.swing.JButton jbtnCancelar;
    private javax.swing.JComboBox jcboColumna;
    private javax.swing.JComboBox jcboComparador;
    private javax.swing.JTextField jtxfValor;
    // End of variables declaration//GEN-END:variables
}
