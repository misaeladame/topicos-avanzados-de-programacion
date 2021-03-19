package mx.edu.itl.beans;

import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.JOptionPane;
import mx.edu.itl.eventos.JCilindroEvent;
import mx.edu.itl.prismas.Cilindro;
import mx.edu.itl.eventos.JValoresPrismasListener;

public class JCilindro extends javax.swing.JPanel implements IPrisma {

    //----------------------------------------------------------------------------------------
    
    private Cilindro cilindro = new Cilindro ();
    public JDialogCilindro JCilindroValores;
    private ArrayList<JValoresPrismasListener> listeners = new ArrayList ();
    
    //----------------------------------------------------------------------------------------
    
    public JCilindro() {
        initComponents();
        
        cilindro = new Cilindro();        
    }
    
    //----------------------------------------------------------------------------------------
    
    public JCilindro ( float radio, float altura ) {
        cilindro = new Cilindro ( radio, altura );
    }

    public float getRadio() {
        return cilindro.getRadio();
    }

    //----------------------------------------------------------------------------------------
    
    public void setRadio ( float radio ) {
        cilindro.setRadio ( radio );
        jlblRadio.setText ( Float.toString ( radio ) );
    }

    //----------------------------------------------------------------------------------------
    
    public float getAltura () {
        return cilindro.getAltura ();
    }

    //----------------------------------------------------------------------------------------
    
    public void setAltura ( float altura ) {
        cilindro.setAltura ( altura );
        jlblAltura.setText ( Float.toString ( altura ) );
    }
    
    //----------------------------------------------------------------------------------------
    
    public Icon getCilindro () {
        return jlblCilindro.getIcon ();
    }
    
    //----------------------------------------------------------------------------------------
    
    public void setCilindro ( Icon cilindro ) {
        jlblCilindro.setIcon ( cilindro );
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jmniValoresCilindro = new javax.swing.JMenuItem();
        jmniAcercaDeCilindro = new javax.swing.JMenuItem();
        jlblCilindro = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jlblRadio = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jlblAltura = new javax.swing.JLabel();

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

        jlblCilindro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/edu/itl/util/Cilindro.png"))); // NOI18N

        jLabel2.setText("radio (r):");

        jlblRadio.setText("0");
        jlblRadio.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel4.setText("altura (h):");

        jlblAltura.setText("0");
        jlblAltura.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jlblRadio, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlblCilindro)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jlblAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlblRadio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jlblAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jlblCilindro)))
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
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JLabel jlblAltura;
    private javax.swing.JLabel jlblCilindro;
    private javax.swing.JLabel jlblRadio;
    private javax.swing.JMenuItem jmniAcercaDeCilindro;
    private javax.swing.JMenuItem jmniValoresCilindro;
    // End of variables declaration//GEN-END:variables

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
}
