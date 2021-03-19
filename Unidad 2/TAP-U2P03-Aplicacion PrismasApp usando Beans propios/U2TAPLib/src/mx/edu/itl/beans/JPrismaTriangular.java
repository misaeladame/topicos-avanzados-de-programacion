package mx.edu.itl.beans;

import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.JOptionPane;
import mx.edu.itl.eventos.JPrismaRectangularEvent;
import mx.edu.itl.eventos.JPrismaTriangularEvent;
import mx.edu.itl.eventos.JValoresPrismasListener;
import mx.edu.itl.prismas.PrismaTriangular;

public class JPrismaTriangular extends javax.swing.JPanel implements IPrisma {

    //----------------------------------------------------------------------------------------
    
    private PrismaTriangular prismaTriangular = new PrismaTriangular ();
    public JDialogPrismaTriangular JPrismaTriangularValores;
    private ArrayList<JValoresPrismasListener> listeners = new ArrayList ();
    
    //----------------------------------------------------------------------------------------
    
    public JPrismaTriangular() {
        initComponents();
        
        prismaTriangular = new PrismaTriangular();        
    }
    
    //----------------------------------------------------------------------------------------
    
    public JPrismaTriangular ( float cateto_a, float cateto_b , float altura ) {
        prismaTriangular = new PrismaTriangular ( cateto_a, cateto_b, altura );
    }

    public float getCateto_a() {
        return prismaTriangular.getCateto_a();
    }

    //----------------------------------------------------------------------------------------
    
    public void setCateto_a ( float cateto_a ) {
        prismaTriangular.setCateto_a ( cateto_a );
        jlblCatetoA.setText ( Float.toString ( cateto_a ) );
    }

    //----------------------------------------------------------------------------------------
    
    public float getCateto_b () {
        return prismaTriangular.getCateto_b ();
    }
    
    public void setCateto_b ( float cateto_b ) {
        prismaTriangular.setCateto_b ( cateto_b );
        jlblCatetoB.setText ( Float.toString ( cateto_b ) );
    }
    
    public float getAltura () {
        return prismaTriangular.getAltura ();
    }

    //----------------------------------------------------------------------------------------
    
    public void setAltura ( float altura ) {
        prismaTriangular.setAltura ( altura );
        jlblAltura.setText ( Float.toString ( altura ) );
    }
    
    //----------------------------------------------------------------------------------------
    
    public Icon getPrismaTriangular () {
        return jlblPrismaTriangular.getIcon ();
    }
    
    //----------------------------------------------------------------------------------------
    
    public void setPrismaTriangular ( Icon prismaTriangular ) {
        jlblPrismaTriangular.setIcon ( prismaTriangular );
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jmniValoresPrismaTriangular = new javax.swing.JMenuItem();
        jmniAcercaDePrismaTriangular = new javax.swing.JMenuItem();
        jlblPrismaTriangular = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jlblCatetoA = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jlblAltura = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jlblCatetoB = new javax.swing.JLabel();

        jmniValoresPrismaTriangular.setText("Valores del prisma..,");
        jmniValoresPrismaTriangular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniValoresPrismaTriangularActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jmniValoresPrismaTriangular);

        jmniAcercaDePrismaTriangular.setText("Acerca de...");
        jmniAcercaDePrismaTriangular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniAcercaDePrismaTriangularActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jmniAcercaDePrismaTriangular);

        setComponentPopupMenu(jPopupMenu1);
        setPreferredSize(new java.awt.Dimension(200, 210));

        jlblPrismaTriangular.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/edu/itl/util/PrismaTriangular.png"))); // NOI18N

        jLabel2.setText("cateto (a):");

        jlblCatetoA.setText("0");
        jlblCatetoA.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel4.setText("altura (h):");

        jlblAltura.setText("0");
        jlblAltura.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel5.setText("cateto (b):");

        jlblCatetoB.setText("0");
        jlblCatetoB.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlblPrismaTriangular)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jlblAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(jlblCatetoB, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jlblCatetoA, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblCatetoA)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jlblCatetoB, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jlblAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jlblPrismaTriangular)
                        .addContainerGap(14, Short.MAX_VALUE))))
        );
    }// </editor-fold>//GEN-END:initComponents

    //----------------------------------------------------------------------------------------
    
    private void jmniAcercaDePrismaTriangularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmniAcercaDePrismaTriangularActionPerformed
        JOptionPane.showMessageDialog (
            this,
            "JPrismaRectangular v1.0 \n\n" +
            "Por: \n" +
            "Jose Misael Adame Sandoval (18131209) \n\n" +
            "Semestre: Ene - Jun/2020",
            "Acerca de...",
            JOptionPane.INFORMATION_MESSAGE
        );
    }//GEN-LAST:event_jmniAcercaDePrismaTriangularActionPerformed

    //----------------------------------------------------------------------------------------
    
    private void jmniValoresPrismaTriangularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmniValoresPrismaTriangularActionPerformed

       // JDialogCilindro.ejecutar();
        
        JPrismaTriangularValores = new JDialogPrismaTriangular ( this, true );
        JPrismaTriangularValores.setVisible ( true );
    }//GEN-LAST:event_jmniValoresPrismaTriangularActionPerformed

    //----------------------------------------------------------------------------------------
    
    public void update () {
        
        JPrismaTriangularEvent evento = new JPrismaTriangularEvent ( prismaTriangular.getCateto_a (),
                                                                     prismaTriangular.getCateto_b(),
                                                                     prismaTriangular.getAltura (),
                                                                     JPrismaTriangularValores.anteriorCatetoA,
                                                                     JPrismaTriangularValores.anteriorCatetoB,
                                                                     JPrismaTriangularValores.anteriorAltura );
        
        fireJPrismaTriangularEvent ( evento );
        
    }
    
    //----------------------------------------------------------------------------------------
    
    public void addJPrismaTriangularListener ( JValoresPrismasListener listener ) {
        listeners.add ( listener );
    }
    
    public void removeJPrismaTriangularListener ( JValoresPrismasListener listener ) {
        listeners.remove ( listener );
    }
    
    //----------------------------------------------------------------------------------------
    
    public void fireJPrismaTriangularEvent ( JPrismaTriangularEvent evento ) {
        for ( JValoresPrismasListener listener : listeners ) {
            listener.valoresPrismaTriangular ( evento );
        }
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JLabel jlblAltura;
    private javax.swing.JLabel jlblCatetoA;
    private javax.swing.JLabel jlblCatetoB;
    private javax.swing.JLabel jlblPrismaTriangular;
    private javax.swing.JMenuItem jmniAcercaDePrismaTriangular;
    private javax.swing.JMenuItem jmniValoresPrismaTriangular;
    // End of variables declaration//GEN-END:variables

    @Override
    public float areaBase() {
        return prismaTriangular.areaBase ();
    }

    @Override
    public float areaLateral() {
        return prismaTriangular.areaLateral ();
    }

    @Override
    public float areaTotal() {
        return prismaTriangular.areaTotal ();
    }

    @Override
    public float volumen() {
        return prismaTriangular.volumen ();
    }
}
