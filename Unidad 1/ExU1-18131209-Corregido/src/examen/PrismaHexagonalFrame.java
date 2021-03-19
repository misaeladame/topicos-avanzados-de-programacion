/*------------------------------------------------------------------------------------------
:*                       INSTITUTO TECNOLOGICO DE LA LAGUNA
:*                     INGENIERIA EN SISTEMAS COMPUTACIONALES
:*                       TOPICOS AVANZADOS DE PROGRAMACION "B"
:*
:*                   SEMESTRE: ENE-JUN/2020    HORA: 17-18 HRS
:*
:*                      Aplicación GUI para 
:*        
:*  Archivo     : PrismaHexagonalFrame.java
:*  Autor       : José Misael Adame Sandoval     18131209
:*  Fecha       : 20/Feb/2020
:*  Compilador  : JAVA J2SE v1.8.0
:*  Descripción : Aplicación examen
:*                
:*  Ultima modif:
:*  Fecha       Modificó             Motivo
:*========================================================================================== 
:*  24/feb/2020 Misael Adame         Agregar prólogo y realizar validaciones.
:*------------------------------------------------------------------------------------------*/

package examen;

import javax.swing.JOptionPane;


public class PrismaHexagonalFrame extends javax.swing.JFrame {
    
    //--------------------------------------------------------------------------    

    private AcercaDeDialog acercaDeDialog;
    
    //--------------------------------------------------------------------------
    
    public PrismaHexagonalFrame()  {
        initComponents();
                
        
    }

    //--------------------------------------------------------------------------
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jtxfPrismaHexagonalLado = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jtxfPrismaHexagonalAltura = new javax.swing.JTextField();
        jbtnCilindroCalcular = new javax.swing.JButton();
        jtxfPrismaHexagonalApotema = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jlblPrismaHexagonalAreaBase = new javax.swing.JLabel();
        jlblPrismaHexagonalAreaLateral = new javax.swing.JLabel();
        jlblPrismaHexagonalAreaTotal = new javax.swing.JLabel();
        jlblPrismaHexagonalVolumen = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jmniArchivoSalir = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jmniAyudaAcercaDe = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Prismas App");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos"));

        jLabel2.setText("Lado (l) : ");

        jtxfPrismaHexagonalLado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxfPrismaHexagonalLadoActionPerformed(evt);
            }
        });

        jLabel3.setText("Altura (h) :");

        jtxfPrismaHexagonalAltura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxfPrismaHexagonalAlturaActionPerformed(evt);
            }
        });

        jbtnCilindroCalcular.setText("Calcular");
        jbtnCilindroCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCilindroCalcularActionPerformed(evt);
            }
        });

        jtxfPrismaHexagonalApotema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxfPrismaHexagonalApotemaActionPerformed(evt);
            }
        });

        jLabel8.setText("Apotema (r) : ");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtxfPrismaHexagonalLado, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                            .addComponent(jtxfPrismaHexagonalAltura)
                            .addComponent(jtxfPrismaHexagonalApotema)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(jbtnCilindroCalcular)))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jtxfPrismaHexagonalLado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtxfPrismaHexagonalApotema, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxfPrismaHexagonalAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addComponent(jbtnCilindroCalcular)
                .addGap(20, 20, 20))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Resultados"));

        jLabel4.setText("Área de la base:");

        jLabel5.setText("Área lateral:");

        jLabel6.setText("Área Total:");

        jLabel7.setText("Volumen:");

        jlblPrismaHexagonalAreaBase.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jlblPrismaHexagonalAreaLateral.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jlblPrismaHexagonalAreaTotal.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jlblPrismaHexagonalVolumen.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jlblPrismaHexagonalAreaBase, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                            .addComponent(jlblPrismaHexagonalAreaLateral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(42, 42, 42)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlblPrismaHexagonalAreaTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jlblPrismaHexagonalVolumen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
                    .addComponent(jlblPrismaHexagonalAreaBase, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(12, 12, 12)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jlblPrismaHexagonalAreaLateral, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jlblPrismaHexagonalAreaTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlblPrismaHexagonalVolumen, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/examen/iconos/prismaHexagonal .jpg"))); // NOI18N

        jMenu1.setText("Archivo");

        jmniArchivoSalir.setText("Salir");
        jmniArchivoSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniArchivoSalirActionPerformed(evt);
            }
        });
        jMenu1.add(jmniArchivoSalir);

        jMenuBar1.add(jMenu1);

        jMenu3.setText("Ayuda");

        jmniAyudaAcercaDe.setText("Acerca de...");
        jmniAyudaAcercaDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniAyudaAcercaDeActionPerformed(evt);
            }
        });
        jMenu3.add(jmniAyudaAcercaDe);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jLabel9)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 72, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //--------------------------------------------------------------------------
    
    private void jmniAyudaAcercaDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmniAyudaAcercaDeActionPerformed
        acercaDeDialog = new AcercaDeDialog( this, true );
        acercaDeDialog.setVisible( true );
        
    }//GEN-LAST:event_jmniAyudaAcercaDeActionPerformed

    //--------------------------------------------------------------------------
    
    private void jmniArchivoSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmniArchivoSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jmniArchivoSalirActionPerformed

    private void jtxfPrismaHexagonalLadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxfPrismaHexagonalLadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxfPrismaHexagonalLadoActionPerformed

    private void jtxfPrismaHexagonalAlturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxfPrismaHexagonalAlturaActionPerformed

    }//GEN-LAST:event_jtxfPrismaHexagonalAlturaActionPerformed

    private void jbtnCilindroCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCilindroCalcularActionPerformed
        try {
            float lado = Float.parseFloat ( jtxfPrismaHexagonalLado.getText() );
            float apotema = Float.parseFloat ( jtxfPrismaHexagonalApotema.getText() );
            float altura = Float.parseFloat ( jtxfPrismaHexagonalAltura.getText() );
            
            PrismaHexagonal ph = new PrismaHexagonal ( lado, apotema, altura );
            if ( lado < 0 || apotema < 0 || altura < 0 )
            JOptionPane.showMessageDialog (
                this,
                "Debe proporcionar un valor numérico positivo en todos los campos",
                "Error",
                JOptionPane.ERROR_MESSAGE
            );
            else {
                jlblPrismaHexagonalAreaBase.setText ( ph.areaBase() + "" );
                jlblPrismaHexagonalAreaLateral.setText ( ph.areaLateral() + "" );
                jlblPrismaHexagonalAreaTotal.setText ( ph.areaTotal() + "" );
                jlblPrismaHexagonalVolumen.setText( ph.volumen() + "" );
            }
        } catch ( NumberFormatException exc ) {
            JOptionPane.showMessageDialog (
                this,
                "Debe proporcionar un valor numérico positivo en todos los campos",
                "Error",
                JOptionPane.ERROR_MESSAGE
            );
        }
    }//GEN-LAST:event_jbtnCilindroCalcularActionPerformed

    private void jtxfPrismaHexagonalApotemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxfPrismaHexagonalApotemaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxfPrismaHexagonalApotemaActionPerformed

    //--------------------------------------------------------------------------
    
    public static void main(String args[]) {
        
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
            java.util.logging.Logger.getLogger(PrismaHexagonalFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrismaHexagonalFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrismaHexagonalFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrismaHexagonalFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        
        ejecutar();
    }
    
    //--------------------------------------------------------------------------
    
    public static void ejecutar() {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrismaHexagonalFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JButton jbtnCilindroCalcular;
    private javax.swing.JLabel jlblPrismaHexagonalAreaBase;
    private javax.swing.JLabel jlblPrismaHexagonalAreaLateral;
    private javax.swing.JLabel jlblPrismaHexagonalAreaTotal;
    private javax.swing.JLabel jlblPrismaHexagonalVolumen;
    private javax.swing.JMenuItem jmniArchivoSalir;
    private javax.swing.JMenuItem jmniAyudaAcercaDe;
    private javax.swing.JTextField jtxfPrismaHexagonalAltura;
    private javax.swing.JTextField jtxfPrismaHexagonalApotema;
    private javax.swing.JTextField jtxfPrismaHexagonalLado;
    // End of variables declaration//GEN-END:variables
}
