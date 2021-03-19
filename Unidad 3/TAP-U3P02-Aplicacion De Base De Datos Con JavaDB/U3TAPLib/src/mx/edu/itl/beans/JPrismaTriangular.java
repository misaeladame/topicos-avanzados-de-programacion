/*------------------------------------------------------------------------------------------
:*                       INSTITUTO TECNOLOGICO DE LA LAGUNA
:*                     INGENIERIA EN SISTEMAS COMPUTACIONALES
:*                       TOPICOS AVANZADOS DE PROGRAMACION "B"
:*
:*                   SEMESTRE: ENE-JUN/2020    HORA: 17-18 HRS
:*
:*                           Bean GUI de un JPrismaTriangular
:*        
:*  Archivo     : JPrismaRectangular.java
:*  Autor       : José Misael Adame Sandoval     18131209
:*  Fecha       : 01/Abr/2020
:*  Compilador  : JAVA J2SE v1.8.0
:*  Descripción : Bean que muestra información sobre el cateto A, Cateto B y altura
:*                de un Prisma Triangular, junto con su imagen.
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
import mx.edu.itl.eventos.JPrismaTriangularEvent;
import mx.edu.itl.eventos.JValoresPrismasListener;
import mx.edu.itl.prismas.PrismaTriangular;
import mx.edu.itl.util.Imagenes;

public class JPrismaTriangular extends javax.swing.JPanel implements IPrisma {

    //----------------------------------------------------------------------------------------
    
    private PrismaTriangular prismaTriangular = new PrismaTriangular ();
    public JDialogPrismaTriangular JPrismaTriangularValores;
    private boolean bolImagenPrismaTriangularAjustado = false;
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
    
    //----------------------------------------------------------------------------------------
    
    public String getCatetoA () {
        return jlblLeyendaCatetoA.getText();
    }
    
    //----------------------------------------------------------------------------------------
    
    public void setCatetoA ( String leyenda_cateto_a ) {
        jlblLeyendaCatetoA.setText ( leyenda_cateto_a );
    }
    
    //----------------------------------------------------------------------------------------

    public float getCateto_a() {
        return prismaTriangular.getCateto_a();
    }

    //----------------------------------------------------------------------------------------
    
    public void setCateto_a ( float cateto_a ) {
        prismaTriangular.setCateto_a ( cateto_a );
        jlblValorCatetoA.setText ( Float.toString ( cateto_a ) );
    }

    //----------------------------------------------------------------------------------------
    
    public String getCatetoB () {
        return jlblLeyendaCatetoA.getText();
    }
    
    //----------------------------------------------------------------------------------------
    
    public void setCatetoB ( String leyenda_cateto_b ) {
        jlblLeyendaCatetoB.setText ( leyenda_cateto_b );
    }
    
    //----------------------------------------------------------------------------------------
    
    public float getCateto_b () {
        return prismaTriangular.getCateto_b ();
    }
    
    //----------------------------------------------------------------------------------------
    
    public void setCateto_b ( float cateto_b ) {
        prismaTriangular.setCateto_b ( cateto_b );
        jlblValorCatetoB.setText ( Float.toString ( cateto_b ) );
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
        return prismaTriangular.getAltura ();
    }

    //----------------------------------------------------------------------------------------
    
    public void setAltura ( float altura ) {
        prismaTriangular.setAltura ( altura );
        jlbValorAltura.setText ( Float.toString ( altura ) );
    }
    
    //----------------------------------------------------------------------------------------
    
    public Icon getPrismaTriangular () {
        return jlblImagenPrismaTriangular.getIcon ();
    }
    
    //----------------------------------------------------------------------------------------
    
    public void setPrismaTriangular ( Icon prismaTriangular ) {
        jlblImagenPrismaTriangular.setIcon ( prismaTriangular );
    }
    
    //----------------------------------------------------------------------------------------
    
    public boolean isImagenPrismaTriangularAjustado () {
        return bolImagenPrismaTriangularAjustado;
    }
    
    //----------------------------------------------------------------------------------------
    
    public void setImagenPrismaTriangularAjustado ( boolean valor ) {
        bolImagenPrismaTriangularAjustado = valor;
        

        if ( bolImagenPrismaTriangularAjustado == true ) {
            // No funciona correctamente lo que nos proporcionó para ajustar las imagenes
            jlblImagenPrismaTriangular.setIcon ( Imagenes.escalarImagen 
                                                ( jlblImagenPrismaTriangular.getIcon (), 
                                                  jlblImagenPrismaTriangular.getWidth (), 
                                                  jlblImagenPrismaTriangular.getHeight () ) );
        }
    }
    
    //----------------------------------------------------------------------------------------
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jmniValoresPrismaTriangular = new javax.swing.JMenuItem();
        jmniAcercaDePrismaTriangular = new javax.swing.JMenuItem();
        jlblImagenPrismaTriangular = new javax.swing.JLabel();
        jlblLeyendaCatetoA = new javax.swing.JLabel();
        jlblValorCatetoA = new javax.swing.JLabel();
        jlblLeyendaAltura = new javax.swing.JLabel();
        jlbValorAltura = new javax.swing.JLabel();
        jlblLeyendaCatetoB = new javax.swing.JLabel();
        jlblValorCatetoB = new javax.swing.JLabel();

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

        jlblImagenPrismaTriangular.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/edu/itl/util/PrismaTriangular.png"))); // NOI18N

        jlblLeyendaCatetoA.setText("cateto (a):");

        jlblValorCatetoA.setText("0");
        jlblValorCatetoA.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jlblLeyendaAltura.setText("altura (h):");

        jlbValorAltura.setText("0");
        jlbValorAltura.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jlblLeyendaCatetoB.setText("cateto (b):");

        jlblValorCatetoB.setText("0");
        jlblValorCatetoB.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlblImagenPrismaTriangular)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlblLeyendaAltura)
                            .addComponent(jlbValorAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlblLeyendaCatetoB)
                            .addComponent(jlblValorCatetoB, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlblLeyendaCatetoA)
                        .addGap(18, 18, 18)
                        .addComponent(jlblValorCatetoA, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblValorCatetoA)
                    .addComponent(jlblLeyendaCatetoA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jlblLeyendaCatetoB, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jlblValorCatetoB, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jlblLeyendaAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jlbValorAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jlblImagenPrismaTriangular)
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
    
    //----------------------------------------------------------------------------------------
    
    @Override
    public float areaBase() {
        return prismaTriangular.areaBase ();
    }

    //----------------------------------------------------------------------------------------
    
    @Override
    public float areaLateral() {
        return prismaTriangular.areaLateral ();
    }

    //----------------------------------------------------------------------------------------
    
    @Override
    public float areaTotal() {
        return prismaTriangular.areaTotal ();
    }

    //----------------------------------------------------------------------------------------
    
    @Override
    public float volumen() {
        return prismaTriangular.volumen ();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JLabel jlbValorAltura;
    private javax.swing.JLabel jlblImagenPrismaTriangular;
    private javax.swing.JLabel jlblLeyendaAltura;
    private javax.swing.JLabel jlblLeyendaCatetoA;
    private javax.swing.JLabel jlblLeyendaCatetoB;
    private javax.swing.JLabel jlblValorCatetoA;
    private javax.swing.JLabel jlblValorCatetoB;
    private javax.swing.JMenuItem jmniAcercaDePrismaTriangular;
    private javax.swing.JMenuItem jmniValoresPrismaTriangular;
    // End of variables declaration//GEN-END:variables

}
