/*------------------------------------------------------------------------------------------
:*                       INSTITUTO TECNOLOGICO DE LA LAGUNA
:*                     INGENIERIA EN SISTEMAS COMPUTACIONALES
:*                       TOPICOS AVANZADOS DE PROGRAMACION "B"
:*
:*                   SEMESTRE: ENE-JUN/2020    HORA: 17-18 HRS
:*
:*                           Bean GUI de un JCilindro
:*        
:*  Archivo     : JCilindro.java
:*  Autor       : José Misael Adame Sandoval     18131209
:*  Fecha       : 01/Abr/2020
:*  Compilador  : JAVA J2SE v1.8.0
:*  Descripción : Bean que muestra información sobre el radio y altura
:*                de un cilindro, junto con su imagen.
:*                     
:*                
:*  Ultima modif:
:*  Fecha       Modificó             Motivo
:*========================================================================================== 
:*  06/Abr/2020 Misael Adame         Agregar prólogo.
:*------------------------------------------------------------------------------------------*/

package mx.edu.itl.beans;

import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.JOptionPane;
import mx.edu.itl.eventos.JCilindroEvent;
import mx.edu.itl.prismas.Cilindro;
import mx.edu.itl.eventos.JValoresPrismasListener;
import mx.edu.itl.util.Imagenes;

public class JCilindro extends javax.swing.JPanel implements IPrisma {
    

    //----------------------------------------------------------------------------------------
    
    private Cilindro cilindro = new Cilindro ();
    private boolean bolImagenCilindroAjustado = false;
    public JDialogCilindro JCilindroValores;
    private ArrayList<JValoresPrismasListener> listeners = new ArrayList<> ();
    
    //----------------------------------------------------------------------------------------
    
    public JCilindro() {
        initComponents ();
        
        cilindro = new Cilindro ();        
    }
    
    //----------------------------------------------------------------------------------------
    
    public JCilindro ( float radio, float altura ) {
        cilindro = new Cilindro ( radio, altura );
    }

    //----------------------------------------------------------------------------------------
    
    public String getLeyendaRadio () {
        return jlblLeyendaRadio.getText();
    }
    
    //----------------------------------------------------------------------------------------
    
    public void setLeyendaRadio ( String leyenda_radio ) {
        jlblLeyendaRadio.setText ( leyenda_radio );
    }
    
    //----------------------------------------------------------------------------------------
    
    public float getRadio () {
        return cilindro.getRadio ();
    }

    //----------------------------------------------------------------------------------------
    
    public void setRadio ( float radio ) {
        cilindro.setRadio ( radio );
        jlblValorRadio.setText ( Float.toString ( radio ) );
    }

    //----------------------------------------------------------------------------------------
    
    public String getLeyendaAltura () {
        return jlblLeyendaAltura.getText();
    }
    
    //----------------------------------------------------------------------------------------
    
    public void setLeyendaAltura ( String leyenda_altura ) {
        jlblLeyendaAltura.setText ( leyenda_altura );
    }
    
    //----------------------------------------------------------------------------------------
    
    public float getAltura () {
        return cilindro.getAltura ();
    }

    //----------------------------------------------------------------------------------------
    
    public void setAltura ( float altura ) {
        cilindro.setAltura ( altura );
        jlblValorAltura.setText ( Float.toString ( altura ) );
    }
    
    //----------------------------------------------------------------------------------------
    
    public Icon getCilindro () {
        return jlblImagenCilindro.getIcon ();
    }
    
    //----------------------------------------------------------------------------------------
    
    public void setCilindro ( Icon cilindro ) {
        jlblImagenCilindro.setIcon ( cilindro );
    }
    
   
    public boolean isImagenCilindroAjustado () {
        return bolImagenCilindroAjustado;
    }
    
    //----------------------------------------------------------------------------------------
    
    public void setImagenCilindroAjustado ( boolean valor ) {
        bolImagenCilindroAjustado = valor;
        

        if ( bolImagenCilindroAjustado == true ) {
            // No funciona correctamente lo que nos proporcionó para ajustar las imagenes
            jlblImagenCilindro.setIcon ( Imagenes.escalarImagen ( jlblImagenCilindro.getIcon (), 
                                                                  jlblImagenCilindro.getWidth (), 
                                                                  jlblImagenCilindro.getHeight () ) );
        }
    }
    //----------------------------------------------------------------------------------------
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jmniValoresCilindro = new javax.swing.JMenuItem();
        jmniAcercaDeCilindro = new javax.swing.JMenuItem();
        jlblImagenCilindro = new javax.swing.JLabel();
        jlblLeyendaRadio = new javax.swing.JLabel();
        jlblValorRadio = new javax.swing.JLabel();
        jlblLeyendaAltura = new javax.swing.JLabel();
        jlblValorAltura = new javax.swing.JLabel();

        jmniValoresCilindro.setText("Valores del prisma...");
        jmniValoresCilindro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniValoresCilindroActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jmniValoresCilindro);

        jmniAcercaDeCilindro.setText("Acerca de...");
        jmniAcercaDeCilindro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniAcercaDeCilindroActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jmniAcercaDeCilindro);

        setComponentPopupMenu(jPopupMenu1);
        setPreferredSize(new java.awt.Dimension(200, 210));

        jlblImagenCilindro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/edu/itl/util/Cilindro.png"))); // NOI18N

        jlblLeyendaRadio.setText("radio (r):");

        jlblValorRadio.setText("0");
        jlblValorRadio.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jlblLeyendaAltura.setText("altura (h):");

        jlblValorAltura.setText("0");
        jlblValorAltura.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlblLeyendaRadio)
                        .addGap(18, 18, 18)
                        .addComponent(jlblValorRadio, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlblImagenCilindro)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlblLeyendaAltura)
                            .addComponent(jlblValorAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jlblLeyendaRadio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlblValorRadio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jlblLeyendaAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jlblValorAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jlblImagenCilindro)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    //----------------------------------------------------------------------------------------
    
    private void jmniAcercaDeCilindroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmniAcercaDeCilindroActionPerformed
        JOptionPane.showMessageDialog (
            this,
            "JCilindro v1.0 \n\n" +
            "Por: \n" +
            "Jose Misael Adame Sandoval (18131209) \n\n" +
            "Semestre: Ene - Jun/2020",
            "Acerca de...",
            JOptionPane.INFORMATION_MESSAGE
        );
    }//GEN-LAST:event_jmniAcercaDeCilindroActionPerformed

    //----------------------------------------------------------------------------------------
    
    private void jmniValoresCilindroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmniValoresCilindroActionPerformed

       // JDialogCilindro.ejecutar();
        
        JCilindroValores = new JDialogCilindro ( this, true );
        JCilindroValores.setVisible ( true );
    }//GEN-LAST:event_jmniValoresCilindroActionPerformed

    //----------------------------------------------------------------------------------------
    
    public void update () {
        
        JCilindroEvent evento = new JCilindroEvent ( cilindro.getRadio (),
                                                     cilindro.getAltura (),
                                                     JCilindroValores.anteriorRadio,
                                                     JCilindroValores.anteriorAltura );
        
        fireJCilindroEvent ( evento );
        
    }
    
    //----------------------------------------------------------------------------------------
    
    public void addJCilindroListener ( JValoresPrismasListener listener ) {
        listeners.add ( listener );
    }
    
    public void removeJCilindroListener ( JValoresPrismasListener listener ) {
        listeners.remove ( listener );
    }
    
    //----------------------------------------------------------------------------------------
    
    public void fireJCilindroEvent ( JCilindroEvent evento ) {
        for ( JValoresPrismasListener listener : listeners ) {
            listener.valoresCilindro ( evento );
        }
    }
    
        @Override
    public float areaBase() {
        return cilindro.areaBase ();
    }

    @Override
    public float areaLateral() {
        return cilindro.areaLateral ();
    }

    @Override
    public float areaTotal() {
        return cilindro.areaTotal ();
    }

    @Override
    public float volumen() {
        return cilindro.volumen ();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JLabel jlblImagenCilindro;
    private javax.swing.JLabel jlblLeyendaAltura;
    private javax.swing.JLabel jlblLeyendaRadio;
    private javax.swing.JLabel jlblValorAltura;
    private javax.swing.JLabel jlblValorRadio;
    private javax.swing.JMenuItem jmniAcercaDeCilindro;
    private javax.swing.JMenuItem jmniValoresCilindro;
    // End of variables declaration//GEN-END:variables


}
