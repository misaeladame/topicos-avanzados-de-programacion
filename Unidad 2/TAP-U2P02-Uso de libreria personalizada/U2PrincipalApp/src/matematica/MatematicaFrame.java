/*------------------------------------------------------------------------------------------
:*                       INSTITUTO TECNOLOGICO DE LA LAGUNA
:*                     INGENIERIA EN SISTEMAS COMPUTACIONALES
:*                       TOPICOS AVANZADOS DE PROGRAMACION "B"
:*
:*                   SEMESTRE: ENE-JUN/2020    HORA: 17-18 HRS
:*
:*                      Aplicación GUI para probar la clase Matematica
:*        
:*  Archivo     : MatematicaFrame.java
:*  Autor       : José Misael Adame Sandoval     18131209
:*  Fecha       : 05/Feb/2020
:*  Compilador  : JAVA J2SE v1.8.0
:*  Descripción : Aplicación que accede a la clase matemática e invoca a cada
:*                uno de sus métodos para comprobar su funcionamiento
:*                
:*  Ultima modif:
:*  Fecha       Modificó             Motivo
:*========================================================================================== 
:*  09/feb/2020 Misael Adame         Agregar prólogo y realizar validaciones.
:*------------------------------------------------------------------------------------------*/

package matematica;

import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import mx.edu.itl.calculos.Matematica;
import principal.SplashPrincipalFrame;

public class MatematicaFrame extends javax.swing.JFrame {

    public MatematicaFrame() {
        initComponents();
    }

    //--------------------------------------------------------------------------
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jcboOperacion = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jlblResultado = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jtxfN = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jtxfX = new javax.swing.JTextField();
        jbtnCalcular = new javax.swing.JButton();
        jbtnAcercaDe = new javax.swing.JButton();
        jbtnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MatematicaApp");
        setAutoRequestFocus(false);
        setResizable(false);

        jLabel1.setText("Operación: ");

        jcboOperacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Factorial", "Permutaciones", "Combinaciones" }));
        jcboOperacion.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcboOperacionItemStateChanged(evt);
            }
        });
        jcboOperacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcboOperacionActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Resultado"));

        jlblResultado.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jlblResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlblResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos"));

        jLabel3.setText("n : ");

        jLabel4.setText("x : ");

        jtxfX.setEnabled(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtxfN))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtxfX, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtxfN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtxfX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(79, Short.MAX_VALUE))
        );

        jbtnCalcular.setText("Calcular");
        jbtnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCalcularActionPerformed(evt);
            }
        });

        jbtnAcercaDe.setText("?");
        jbtnAcercaDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAcercaDeActionPerformed(evt);
            }
        });

        jbtnSalir.setText("Salir");
        jbtnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSalirActionPerformed(evt);
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
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jcboOperacion, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jbtnAcercaDe))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jbtnSalir)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                                .addComponent(jbtnCalcular)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(23, 23, 23))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jcboOperacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(jbtnCalcular)
                        .addGap(29, 29, 29)
                        .addComponent(jbtnSalir)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbtnAcercaDe)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //--------------------------------------------------------------------------
    
    private void jcboOperacionItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcboOperacionItemStateChanged
        if ( jcboOperacion.getSelectedItem ().equals ( "Factorial" ) )  
            jtxfX.setEnabled ( false );        
        else
            jtxfX.setEnabled ( true );
    }//GEN-LAST:event_jcboOperacionItemStateChanged

    //--------------------------------------------------------------------------
    
    private void jbtnAcercaDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAcercaDeActionPerformed
        ImageIcon tec = new ImageIcon("ITL.png");
        JOptionPane.showMessageDialog (
                this,
                "Tecnológico Nacional de México\n" +
                "Instituto Tecnológico de La Laguna\n\n" +
                "MatematicaApp v1.0 \n\n" +
                "Autor: José Misael Adame Sandoval 18131209",
                "Acerca de",
                JOptionPane.INFORMATION_MESSAGE,
                tec
        );
    }//GEN-LAST:event_jbtnAcercaDeActionPerformed

    //--------------------------------------------------------------------------------------
    
    private void jbtnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCalcularActionPerformed
        if ( datosValidos () ) {
            int n = Integer.parseInt ( jtxfN.getText () );
            if ( jcboOperacion.getSelectedItem ().equals( "Factorial" ) ) 
                jlblResultado.setText ( Long.toString ( Matematica.factorial ( n ) ) );
            else if ( jcboOperacion.getSelectedItem ().equals ( "Combinaciones" ) ) {
                int x = Integer.parseInt ( jtxfX.getText () );
                jlblResultado.setText ( Integer.toString ( Matematica.combinaciones ( n , x ) ) );                               
            } else {
                int x = Integer.parseInt ( jtxfX.getText () );
                jlblResultado.setText ( Integer.toString ( Matematica.permutaciones ( n , x ) ) );
            }
        }    
    }//GEN-LAST:event_jbtnCalcularActionPerformed

    //--------------------------------------------------------------------------------------
    
    public boolean datosValidos () {
        boolean result = true;    
        
        try {            
            int n = Integer.parseInt ( jtxfN.getText () );
            if ( jcboOperacion.getSelectedItem ().equals ( "Factorial" ) ) {            
                if ( n < 0 || n > 25) {
                    result = false;
                    JOptionPane.showMessageDialog (
                        this, 
                        "N debe estar en el rango de 0 a 25",
                        "Error",
                        JOptionPane.ERROR_MESSAGE
                    );
                }              
            } else {
                int x = Integer.parseInt ( jtxfX.getText () );
                if ( n < x ) {                  
                    result = false;
                    JOptionPane.showMessageDialog (
                        this, 
                        "Para permutaciones y combinaciones N debe ser >= X",
                        "Error",
                        JOptionPane.ERROR_MESSAGE
                    );
                } 
            }                
        } catch ( NumberFormatException ex ) {
            result = false;               
            if ( jcboOperacion.getSelectedItem ().equals ( "Factorial" ) )
                JOptionPane.showMessageDialog (
                    this, 
                    "Debe proporcionar un valor numérico entero para N",
                    "Error",
                    JOptionPane.ERROR_MESSAGE
                );
            else { 
                if ( ( jtxfN.getText ().trim ().equals ( "" ) &&
                       jtxfX.getText ().trim ().equals ( "" ) ) 
                   ) {                          
                    JOptionPane.showMessageDialog (
                        this, 
                        "Debe proporcionar un valor numérico entero para N y X",
                        "Error",
                        JOptionPane.ERROR_MESSAGE
                    );
                    return result; 
                } 
                try {
                    int n = Integer.parseInt ( jtxfN.getText () );
                        
                    if ( n >= 0 )  {
                        JOptionPane.showMessageDialog (
                            this, 
                            "Debe proporcionar un valor numérico para X",
                            "Error",
                            JOptionPane.ERROR_MESSAGE                                    
                        );  
                        return result;                             
                    } else {                            
                        JOptionPane.showMessageDialog (
                            this, 
                            "Debe proporcionar un valor numérico para X y que N >= 0",
                            "Error",
                            JOptionPane.ERROR_MESSAGE                                    
                        );  
                        return result;
                    }                                                    
                } catch ( NumberFormatException exc ) {
                    try {
                        int x = Integer.parseInt ( jtxfX.getText () );
                        if ( x > 0 ) {
                            JOptionPane.showMessageDialog (
                                this, 
                                "Debe proporcionar un valor numérico para N",
                                "Error",
                                JOptionPane.ERROR_MESSAGE                                    
                            );  
                            return result; 
                        } else {
                            JOptionPane.showMessageDialog (
                                this, 
                                "Debe proporcionar un valor numérico para N",
                                "Error",
                                JOptionPane.ERROR_MESSAGE                                    
                            );  
                            return result; 
                        }
                    } catch ( NumberFormatException exce ) {
                        JOptionPane.showMessageDialog (
                            this, 
                            "Debe proporcionar un valor numérico entero para N y X",
                            "Error",
                            JOptionPane.ERROR_MESSAGE
                        );
                        return result;
                    }                        
                }
            }                                        
        }         
        return result;
    } 
    
    private void jcboOperacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcboOperacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcboOperacionActionPerformed

    //----------------------------------------------------------------------------------
    
    private void jbtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSalirActionPerformed

        dispose();
        SplashPrincipalFrame.ejecutar();
    }//GEN-LAST:event_jbtnSalirActionPerformed

    //----------------------------------------------------------------------------------
    
    public static void ejecutar() {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MatematicaFrame().setVisible(true);
            }
        });
    }
    
    //-----------------------------------------------------------------------------------
    
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(MatematicaFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MatematicaFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MatematicaFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MatematicaFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        ejecutar();
    }

    //------------------------------------------------------------------------------------
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton jbtnAcercaDe;
    private javax.swing.JButton jbtnCalcular;
    private javax.swing.JButton jbtnSalir;
    private javax.swing.JComboBox<String> jcboOperacion;
    private javax.swing.JLabel jlblResultado;
    private javax.swing.JTextField jtxfN;
    private javax.swing.JTextField jtxfX;
    // End of variables declaration//GEN-END:variables
}
