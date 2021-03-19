package mx.edu.itl.beans;

import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.JOptionPane;
import mx.edu.itl.eventos.JPrismaRectangularEvent;
import mx.edu.itl.prismas.PrismaRectangular;
import mx.edu.itl.eventos.JValoresPrismasListener;

public class JPrismaRectangular extends javax.swing.JPanel implements IPrisma {

    //----------------------------------------------------------------------------------------
    
    private PrismaRectangular prismaRectangular = new PrismaRectangular ();
    public JDialogPrismaRectangular JPrismaRectangularValores;
    private ArrayList<JValoresPrismasListener> listeners = new ArrayList ();
    
    //----------------------------------------------------------------------------------------
    
    public JPrismaRectangular() {
        initComponents();
        
        prismaRectangular = new PrismaRectangular();        
    }
    
    //----------------------------------------------------------------------------------------
    
    public JPrismaRectangular ( float largo, float ancho , float altura ) {
        prismaRectangular = new PrismaRectangular ( largo, ancho, altura );
    }

    public float getLargo() {
        return prismaRectangular.getLargo();
    }

    //----------------------------------------------------------------------------------------
    
    public void setLargo ( float largo ) {
        prismaRectangular.setLargo ( largo );
        jlblLargo.setText ( Float.toString ( largo ) );
    }

    //----------------------------------------------------------------------------------------
    
    public float getAncho () {
        return prismaRectangular.getAncho ();
    }
    
    public void setAncho ( float ancho ) {
        prismaRectangular.setAncho ( ancho );
        jlblAncho.setText ( Float.toString ( ancho ) );
    }
    
    public float getAltura () {
        return prismaRectangular.getAltura ();
    }

    //----------------------------------------------------------------------------------------
    
    public void setAltura ( float altura ) {
        prismaRectangular.setAltura ( altura );
        jlblAltura.setText ( Float.toString ( altura ) );
    }
    
    //----------------------------------------------------------------------------------------
    
    public Icon getPrismaRectangular () {
        return jlblPrismaRectangular.getIcon ();
    }
    
    //----------------------------------------------------------------------------------------
    
    public void setPrismaRectangular ( Icon prismaRectangular ) {
        jlblPrismaRectangular.setIcon ( prismaRectangular );
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jmniValoresPrismaRectangular = new javax.swing.JMenuItem();
        jmniAcercaDePrismaRectangular = new javax.swing.JMenuItem();
        jlblPrismaRectangular = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jlblLargo = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jlblAltura = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jlblAncho = new javax.swing.JLabel();

        jmniValoresPrismaRectangular.setText("Valores del prisma..,");
        jmniValoresPrismaRectangular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniValoresPrismaRectangularActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jmniValoresPrismaRectangular);

        jmniAcercaDePrismaRectangular.setText("Acerca de...");
        jmniAcercaDePrismaRectangular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniAcercaDePrismaRectangularActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jmniAcercaDePrismaRectangular);

        setComponentPopupMenu(jPopupMenu1);
        setPreferredSize(new java.awt.Dimension(200, 210));

        jlblPrismaRectangular.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/edu/itl/util/PrismaRectangular.jpg"))); // NOI18N

        jLabel2.setText("largo (l):");

        jlblLargo.setText("0");
        jlblLargo.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel4.setText("altura (h):");

        jlblAltura.setText("0");
        jlblAltura.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel5.setText("ancho (a):");

        jlblAncho.setText("0");
        jlblAncho.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlblPrismaRectangular)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jlblAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(jlblAncho, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jlblLargo, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblLargo)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jlblAncho, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jlblAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jlblPrismaRectangular)
                        .addContainerGap(14, Short.MAX_VALUE))))
        );
    }// </editor-fold>//GEN-END:initComponents

    //----------------------------------------------------------------------------------------
    
    private void jmniAcercaDePrismaRectangularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmniAcercaDePrismaRectangularActionPerformed
        JOptionPane.showMessageDialog (
            this,
            "JPrismaRectangular v1.0 \n\n" +
            "Por: \n" +
            "Jose Misael Adame Sandoval (18131209) \n\n" +
            "Semestre: Ene - Jun/2020",
            "Acerca de...",
            JOptionPane.INFORMATION_MESSAGE
        );
    }//GEN-LAST:event_jmniAcercaDePrismaRectangularActionPerformed

    //----------------------------------------------------------------------------------------
    
    private void jmniValoresPrismaRectangularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmniValoresPrismaRectangularActionPerformed

       // JDialogCilindro.ejecutar();
        
        JPrismaRectangularValores = new JDialogPrismaRectangular ( this, true );
        JPrismaRectangularValores.setVisible ( true );
    }//GEN-LAST:event_jmniValoresPrismaRectangularActionPerformed

    //----------------------------------------------------------------------------------------
    
    public void update () {
        
        JPrismaRectangularEvent evento = new JPrismaRectangularEvent ( prismaRectangular.getLargo (),
                                                                       prismaRectangular.getAncho(),
                                                                       prismaRectangular.getAltura (),
                                                                       JPrismaRectangularValores.anteriorLargo,
                                                                       JPrismaRectangularValores.anteriorAncho,
                                                                       JPrismaRectangularValores.anteriorAltura );
        
        fireJPrismaRectangularEvent ( evento );
        
    }
    
    //----------------------------------------------------------------------------------------
    
    public void addJPrismaRectangularListener ( JValoresPrismasListener listener ) {
        listeners.add ( listener );
    }
    
    public void removeJPrismaRectangularListener ( JValoresPrismasListener listener ) {
        listeners.remove ( listener );
    }
    
    //----------------------------------------------------------------------------------------
    
    public void fireJPrismaRectangularEvent ( JPrismaRectangularEvent evento ) {
        for ( JValoresPrismasListener listener : listeners ) {
            listener.valoresPrismaRectangular ( evento );
        }
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JLabel jlblAltura;
    private javax.swing.JLabel jlblAncho;
    private javax.swing.JLabel jlblLargo;
    private javax.swing.JLabel jlblPrismaRectangular;
    private javax.swing.JMenuItem jmniAcercaDePrismaRectangular;
    private javax.swing.JMenuItem jmniValoresPrismaRectangular;
    // End of variables declaration//GEN-END:variables

    @Override
    public float areaBase() {
        return prismaRectangular.areaBase ();
    }

    @Override
    public float areaLateral() {
        return prismaRectangular.areaLateral ();
    }

    @Override
    public float areaTotal() {
        return prismaRectangular.areaTotal ();
    }

    @Override
    public float volumen() {
        return prismaRectangular.volumen ();
    }
}
