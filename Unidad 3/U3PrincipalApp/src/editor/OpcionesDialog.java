/*------------------------------------------------------------------------------------------
:*                       INSTITUTO TECNOLOGICO DE LA LAGUNA
:*                     INGENIERIA EN SISTEMAS COMPUTACIONALES
:*                       TOPICOS AVANZADOS DE PROGRAMACION "B"
:*
:*                   SEMESTRE: ENE-JUN/2020    HORA: 17-18 HRS
:*
:*               Aplicación GUI para las Opciones del Editor de Texto
:*        
:*  Archivo     : OpcionesDialog.java
:*  Autor       : José Misael Adame Sandoval     18131209
:*  Fecha       : 04/Mar/2020
:*  Compilador  : JAVA J2SE v1.8.0
:*  Descripción : Aplicación que realiza modificaciones en el editor
:*                  1. Apariencia: permite modificar el color de la fuente y el fondo
:*                     del editor
:*                  2. Fuente: permite modificar el estilo de la fuente y el tamaño
:*                  3. Corrector: Si encuentra unas palabras determinadas
:*                     mal escritas las corrige.
:*              
:*                
:*  Ultima modif:
:*  Fecha       Modificó             Motivo
:*========================================================================================== 
:*  6/mar/2020 Misael Adame         Agregar prólogo.
:*------------------------------------------------------------------------------------------*/

package editor;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JOptionPane;

public class OpcionesDialog extends javax.swing.JDialog {
    
    //----------------------------------------------------------------------------------------
    
    private EditorFrame editorFrame;
    private Font fuentePredet;

    //----------------------------------------------------------------------------------------
    
    public OpcionesDialog ( java.awt.Frame parent, boolean modal ) {
        super ( parent, modal );
        initComponents ();
        
        // Conservar la referencia a EditorFrame
        editorFrame = ( EditorFrame ) parent;
        // Guardamos la fuente predeterminada del TextArea
        fuentePredet = editorFrame.jtxaTexto.getFont ();
    }

    //----------------------------------------------------------------------------------------
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgTam = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jlblfondo = new javax.swing.JLabel();
        jlbltexto = new javax.swing.JLabel();
        jcboColorFondo = new javax.swing.JComboBox<>();
        jcboColorTexto = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jrbtTamPredeterminada = new javax.swing.JRadioButton();
        jrbtTam8 = new javax.swing.JRadioButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jlstFamilia = new javax.swing.JList<>();
        jrbtTam10 = new javax.swing.JRadioButton();
        jrbtTam14 = new javax.swing.JRadioButton();
        jrbtTam20 = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtblCorrector = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jbtnAceptar = new javax.swing.JButton();
        jbtnCancelar = new javax.swing.JButton();

        setTitle("Opciones");

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Color"));

        jlblfondo.setText("Fondo: ");

        jlbltexto.setText("Texto:");

        jcboColorFondo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Blanco", "Negro", "Azul", "Rojo" }));
        jcboColorFondo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcboColorFondoActionPerformed(evt);
            }
        });

        jcboColorTexto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Negro", "Blanco", "Verde", "Azul" }));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jlbltexto)
                        .addGap(18, 18, 18)
                        .addComponent(jcboColorTexto, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jlblfondo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jcboColorFondo, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(61, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblfondo)
                    .addComponent(jcboColorFondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbltexto)
                    .addComponent(jcboColorTexto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(67, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Apariencia", jPanel1);

        bgTam.add(jrbtTamPredeterminada);
        jrbtTamPredeterminada.setSelected(true);
        jrbtTamPredeterminada.setText("Predeterminada");
        jrbtTamPredeterminada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbtTamPredeterminadaActionPerformed(evt);
            }
        });

        bgTam.add(jrbtTam8);
        jrbtTam8.setText("8");

        jlstFamilia.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "<Predeterminado>", "Arial", "Calibri", "Courier New", "Times New Roman" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jlstFamilia.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jlstFamilia.setSelectedIndex(0);
        jScrollPane3.setViewportView(jlstFamilia);

        bgTam.add(jrbtTam10);
        jrbtTam10.setText("10");

        bgTam.add(jrbtTam14);
        jrbtTam14.setText("14");

        bgTam.add(jrbtTam20);
        jrbtTam20.setText("20");

        jLabel1.setText("Familia:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(54, 54, 54)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jrbtTam8)
                    .addComponent(jrbtTamPredeterminada)
                    .addComponent(jrbtTam10)
                    .addComponent(jrbtTam14)
                    .addComponent(jrbtTam20))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jrbtTamPredeterminada)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jrbtTam8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jrbtTam10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jrbtTam14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jrbtTam20)))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Fuente", jPanel2);

        jtblCorrector.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"pus", "pues"},
                {"haiga", "haya"},
                {"dijistes", "dijiste"},
                {"poruque", "porque"},
                {"poes", "pues"},
                {"fuites", "fuiste"}
            },
            new String [] {
                "Si se encuentra...", "Remplazar por..."
            }
        ));
        jScrollPane2.setViewportView(jtblCorrector);
        if (jtblCorrector.getColumnModel().getColumnCount() > 0) {
            jtblCorrector.getColumnModel().getColumn(0).setResizable(false);
            jtblCorrector.getColumnModel().getColumn(1).setResizable(false);
        }

        jButton1.setText("Corrregir ahora...");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Corrector", jPanel3);

        jbtnAceptar.setText("Aceptar");
        jbtnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAceptarActionPerformed(evt);
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbtnAceptar)
                        .addGap(18, 18, 18)
                        .addComponent(jbtnCancelar))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnAceptar)
                    .addComponent(jbtnCancelar))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //----------------------------------------------------------------------------------------
    
    private void jbtnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAceptarActionPerformed
        // Cambiar el color del fondo y del texto        
        switch ( jcboColorFondo.getSelectedIndex () ) {
            case 0 : editorFrame.jtxaTexto.setBackground ( Color.white ); break;
            case 1 : editorFrame.jtxaTexto.setBackground ( Color.black ); break;
            case 2 : editorFrame.jtxaTexto.setBackground ( Color.blue );  break;
            case 3 : editorFrame.jtxaTexto.setBackground ( Color.red );  break;            
        }
        
        switch ( jcboColorTexto.getSelectedIndex () ) {
            case 0 : editorFrame.jtxaTexto.setForeground ( Color.white ); setVisible ( false ); break;
            case 1 : editorFrame.jtxaTexto.setForeground ( Color.black ); setVisible ( false ); break;
            case 2 : editorFrame.jtxaTexto.setForeground ( Color.green ); setVisible ( false ); break;
            case 3 : editorFrame.jtxaTexto.setForeground ( Color.blue ); setVisible ( false ); break;            
        }
        
        // Cambiar la fuente y Tamaño
        String familia = jlstFamilia.getSelectedValue ();
        if ( familia.equals ( "<Predeterminada>" ) ) 
            familia = fuentePredet.getFamily ();
        int tamano = fuentePredet.getSize ();
        if ( jrbtTam8.isSelected () ) 
            tamano = 8;
        else if ( jrbtTam10.isSelected () ) 
            tamano = 10;
        else if ( jrbtTam14.isSelected () ) 
            tamano = 14;
        else if (  jrbtTam20.isSelected () ) 
            tamano = 20;         
        Font f = new Font ( familia, Font.PLAIN, tamano );
        editorFrame.jtxaTexto.setFont ( f );     
    }//GEN-LAST:event_jbtnAceptarActionPerformed

    //----------------------------------------------------------------------------------------
    
    private void jbtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCancelarActionPerformed
        setVisible ( false );
    }//GEN-LAST:event_jbtnCancelarActionPerformed

    //----------------------------------------------------------------------------------------
    
    private void jcboColorFondoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcboColorFondoActionPerformed

    }//GEN-LAST:event_jcboColorFondoActionPerformed

    private void jrbtTamPredeterminadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbtTamPredeterminadaActionPerformed

    }//GEN-LAST:event_jrbtTamPredeterminadaActionPerformed

    //----------------------------------------------------------------------------------------
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        String texto = editorFrame.jtxaTexto.getText();
        int totFilas = jtblCorrector.getRowCount ();
        for ( int i = 0; i < totFilas; i++ ) {
            // Obtenenmos de la tabla corrector la palabra en turno a procesar
            String buscar = jtblCorrector.getValueAt ( i, 0 ).toString();
            String reemplazarPor = jtblCorrector.getValueAt (i , 1).toString();
            
            // Proceder a la busqueda y reemplazo 
            int pos = texto.indexOf ( buscar );
            while ( pos != -1 ) {
                texto = texto.substring(0, pos) + reemplazarPor + 
                        texto.substring(pos + buscar.length());
                pos = texto.indexOf ( buscar, pos + 1);
            }
            // Sustituir el texto del editor con el texto corregido
            editorFrame.jtxaTexto.setText ( texto );            
            
        } 
        JOptionPane.showMessageDialog ( 
            this, 
            "Correcion finalizada!", 
            "Corrector", 
            JOptionPane.INFORMATION_MESSAGE 
        );
    }//GEN-LAST:event_jButton1ActionPerformed

    //----------------------------------------------------------------------------------------
    
    public static void main(String args[]) {
        ejecutar ();
    }
    
    //----------------------------------------------------------------------------------------
    
    public static void ejecutar () {
        
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
            java.util.logging.Logger.getLogger(OpcionesDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OpcionesDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OpcionesDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OpcionesDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                OpcionesDialog dialog = new OpcionesDialog(new javax.swing.JFrame(), true);
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
    private javax.swing.ButtonGroup bgTam;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton jbtnAceptar;
    private javax.swing.JButton jbtnCancelar;
    private javax.swing.JComboBox<String> jcboColorFondo;
    private javax.swing.JComboBox<String> jcboColorTexto;
    private javax.swing.JLabel jlblfondo;
    private javax.swing.JLabel jlbltexto;
    private javax.swing.JList<String> jlstFamilia;
    private javax.swing.JRadioButton jrbtTam10;
    private javax.swing.JRadioButton jrbtTam14;
    private javax.swing.JRadioButton jrbtTam20;
    private javax.swing.JRadioButton jrbtTam8;
    private javax.swing.JRadioButton jrbtTamPredeterminada;
    private javax.swing.JTable jtblCorrector;
    // End of variables declaration//GEN-END:variables
}
