/*------------------------------------------------------------------------------------------
:*                       INSTITUTO TECNOLOGICO DE LA LAGUNA
:*                     INGENIERIA EN SISTEMAS COMPUTACIONALES
:*                       TOPICOS AVANZADOS DE PROGRAMACION "B"
:*
:*                   SEMESTRE: ENE-JUN/2020    HORA: 17-18 HRS
:*
:*                      Aplicación GUI para probar la clase Conversiones
:*        
:*  Archivo     : ConversionesFrame.java
:*  Autor       : José Misael Adame Sandoval     18131209
:*  Fecha       : 15/Feb/2020
:*  Compilador  : JAVA J2SE v1.8.0
:*  Descripción : Aplicación que accede a la clase Conversiones e invoca a cada
:*                uno de sus métodos para comprobar su funcionamiento
:*                
:*  Ultima modif:
:*  Fecha       Modificó             Motivo
:*========================================================================================== 
:*  16/feb/2020 Misael Adame         Agregar prólogo y realizar validaciones.
:*------------------------------------------------------------------------------------------*/

package conversiones;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import mx.edu.itl.calculos.Conversiones;
import principal.SplashPrincipalFrame;

public class ConversionesFrame extends javax.swing.JFrame {

    //-----------------------------------------------------------------------------
    
    public ConversionesFrame() {
        initComponents();
    }

    //---------------------------------------------------------------------------------------

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jCboBoxConversion = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jtxfDato = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jbtnCalcular = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jlblResult = new javax.swing.JLabel();
        jBtnAcercaDe = new javax.swing.JButton();
        jbtnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ConversionesApp");
        setResizable(false);

        jLabel1.setText("Conversión:");

        jCboBoxConversion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "°C a °F", "°F a °C", "Yardas a Metros", "Metros a Yardas", "Libras a Kilogramos", "Kilogramos a Libras", "Decimal a Binario", "Binario a Decimal" }));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Dato", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        jLabel2.setText("Número:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jtxfDato, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jtxfDato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(70, Short.MAX_VALUE))
        );

        jbtnCalcular.setText("Calcular");
        jbtnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCalcularActionPerformed(evt);
            }
        });

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Resultado", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        jlblResult.setText(" ");
        jlblResult.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jlblResult, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jlblResult)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jBtnAcercaDe.setText("?");
        jBtnAcercaDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAcercaDeActionPerformed(evt);
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
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jBtnAcercaDe)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(18, 18, 18)
                            .addComponent(jCboBoxConversion, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jbtnCalcular)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(10, 10, 10)
                                    .addComponent(jbtnSalir)))
                            .addGap(18, 18, 18)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jCboBoxConversion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(jbtnCalcular)
                        .addGap(32, 32, 32)
                        .addComponent(jbtnSalir)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBtnAcercaDe)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //------------------------------------------------------------------------------
    
    private void jbtnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCalcularActionPerformed
        if ( validarDatos () ) {    
            if ( ! ( jCboBoxConversion.getSelectedIndex () == 6 || 
                     jCboBoxConversion.getSelectedIndex () == 7 ) ) {   
                float num = Float.parseFloat ( jtxfDato.getText () );
                switch ( jCboBoxConversion.getSelectedIndex () ) {
                    case 0:
                        jlblResult.setText ( Float.toString ( Conversiones.celsiusToFarenheit ( num ) ) + " °F" );
                        break;
                    case 1:
                        jlblResult.setText ( Float.toString ( Conversiones.farenheitToCelsius ( num ) ) + " °C" );
                        break;
                    case 2:
                        jlblResult.setText ( Float.toString ( Conversiones.yardasToMetros ( num ) ) + " m" );
                        break;
                    case 3:
                        jlblResult.setText ( Float.toString ( Conversiones.metrosToYardas ( num ) ) + " yd" );            
                        break;
                    case 4:
                        jlblResult.setText ( Float.toString ( Conversiones.librasToKilogramos ( num ) ) +" kg" );
                        break;
                    default:
                        jlblResult.setText ( Float.toString ( Conversiones.kilogramosToLibras ( num ) ) +" lb");
                        break;
                }
            } else {
                int num = Integer.parseInt( jtxfDato.getText () );
                if ( jCboBoxConversion.getSelectedIndex() == 6 )
                    jlblResult.setText ( Conversiones.decimalToBinario (num) ) ;
                else 
                    jlblResult.setText ( Integer.toString ( Conversiones.binarioToDecimal (num) ) ) ;            
            }   
        }
    }//GEN-LAST:event_jbtnCalcularActionPerformed

    //-------------------------------------------------------------------------------------------
    
    private void jBtnAcercaDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAcercaDeActionPerformed
        ImageIcon tec = new ImageIcon ( "ITL.png" );
        JOptionPane.showMessageDialog (
                this,
                "Tecnológico Nacional de México\n" +
                "Instituto Tecnológico de La Laguna\n\n" +
                "ConversionesApp v1.0 \n\n" +
                "Autor: José Misael Adame Sandoval 18131209",
                "Acerca de",
                JOptionPane.INFORMATION_MESSAGE,
                tec
        );
    }//GEN-LAST:event_jBtnAcercaDeActionPerformed

    //------------------------------------------------------------------------------
    
    private void jbtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSalirActionPerformed
        dispose();
        SplashPrincipalFrame.ejecutar();
    }//GEN-LAST:event_jbtnSalirActionPerformed

    //------------------------------------------------------------------------------
    
    public boolean validarDatos () {
        try {  
            switch ( jCboBoxConversion.getSelectedIndex () ) {
                case 2:
                case 3:
                case 4:
                case 5:
                    return validarDistanciasPesos ();
                case 6:
                case 7:
                    return validarSistemasNumericos ();
                default:
                    float num = Float.parseFloat ( jtxfDato.getText () );
                    return true;
            }
        } catch ( NumberFormatException ex ) {
             switch ( jCboBoxConversion.getSelectedIndex () ) {
                case 2:
                case 3:
                case 4:
                case 5:
                    JOptionPane.showMessageDialog (
                    this, 
                        "Debe proporcionar un valor numérico positivo", 
                        "Error", 
                        JOptionPane.ERROR_MESSAGE
                    );
                    return false;
                case 6:
                case 7:
                    JOptionPane.showMessageDialog (
                    this, 
                        "Debe proporcionar un valor numérico entero positivo", 
                        "Error", 
                        JOptionPane.ERROR_MESSAGE
                    );
                    return false;
                default:
                    JOptionPane.showMessageDialog (
                    this, 
                        "Debe proporcionar un valor numérico", 
                        "Error", 
                        JOptionPane.ERROR_MESSAGE
                    );
                    return false;
            }           
        }
    }

    //---------------------------------------------------------------------------------------------
    
    public boolean validarDistanciasPesos () {
        float num = Float.parseFloat ( jtxfDato.getText () );
        if ( num < 0 ) {
            JOptionPane.showMessageDialog (
                this, 
                "Debe proporcionar un valor numérico positivo", 
                "Error", 
                JOptionPane.ERROR_MESSAGE
            );        
            return false;
        }
        else
            return true;
    }
    
    //--------------------------------------------------------------------------------
    
    public boolean validarSistemasNumericos () {
        int num = Integer.parseInt ( jtxfDato.getText () );
        if ( num < 0 ) {
            JOptionPane.showMessageDialog (
                this, 
                "Debe proporcionar un valor numérico entero positivo", 
                "Error", 
                JOptionPane.ERROR_MESSAGE
            );        
            return false;
        } else {
            if ( jCboBoxConversion.getSelectedIndex () == 7 ) {
                String num_bin =  jtxfDato.getText () ;
                for ( int i = 0; i < num_bin.length (); i++ ) {
                    char num_pos = num_bin.charAt ( i );                    
                    if ( num_pos !=  '1' && num_pos != '0') {
                        JOptionPane.showMessageDialog (
                            this, 
                            "Debe proporcionar un valor numérico binario", 
                            "Error", 
                            JOptionPane.ERROR_MESSAGE
                        );
                        return false;
                    } 
                }
                return true;
            } else
                return true;
        }
    }

    //--------------------------------------------------------------------------------
    
    public static void ejecutar() {
        java.awt.EventQueue.invokeLater (new Runnable () {
            public void run () {
                new ConversionesFrame ().setVisible ( true );
            }
        });        
    }
    
    //----------------------------------------------------------------------------
    
    public static void main ( String args [] ) {
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
            java.util.logging.Logger.getLogger(ConversionesFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConversionesFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConversionesFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConversionesFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        ejecutar ();
    }
    
    //---------------------------------------------------------------------------
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnAcercaDe;
    private javax.swing.JComboBox<String> jCboBoxConversion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton jbtnCalcular;
    private javax.swing.JButton jbtnSalir;
    private javax.swing.JLabel jlblResult;
    private javax.swing.JTextField jtxfDato;
    // End of variables declaration//GEN-END:variables
}
