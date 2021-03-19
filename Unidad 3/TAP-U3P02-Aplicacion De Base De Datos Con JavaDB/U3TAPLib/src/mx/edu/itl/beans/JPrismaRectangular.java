/*------------------------------------------------------------------------------------------
:*                       INSTITUTO TECNOLOGICO DE LA LAGUNA
:*                     INGENIERIA EN SISTEMAS COMPUTACIONALES
:*                       TOPICOS AVANZADOS DE PROGRAMACION "B"
:*
:*                   SEMESTRE: ENE-JUN/2020    HORA: 17-18 HRS
:*
:*                           Bean GUI de un JPrismaRectangular
:*        
:*  Archivo     : JPrismaTriangular.java
:*  Autor       : José Misael Adame Sandoval     18131209
:*  Fecha       : 01/Abr/2020
:*  Compilador  : JAVA J2SE v1.8.0
:*  Descripción : Bean que muestra información sobre el largo, ancho y altura
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
import mx.edu.itl.eventos.JPrismaRectangularEvent;
import mx.edu.itl.prismas.PrismaRectangular;
import mx.edu.itl.eventos.JValoresPrismasListener;
import mx.edu.itl.util.Imagenes;

public class JPrismaRectangular extends javax.swing.JPanel implements IPrisma {

    //----------------------------------------------------------------------------------------
    
    private PrismaRectangular prismaRectangular = new PrismaRectangular ();
    private boolean bolImagenPrismaRectangularAjustado = false;
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

    //----------------------------------------------------------------------------------------
    
    public String getLeyendaLargo () {
        return jlblLeyendaLargo.getText();
    }
    
    //----------------------------------------------------------------------------------------
    
    public void setLeyendaLargo ( String leyenda_largo ) {
        jlblLeyendaLargo.setText ( leyenda_largo );
    }
    
    //----------------------------------------------------------------------------------------
    
    public float getLargo() {
        return prismaRectangular.getLargo();
    }

    //----------------------------------------------------------------------------------------
    
    public void setLargo ( float largo ) {
        prismaRectangular.setLargo ( largo );
        jlblValorLargo.setText ( Float.toString ( largo ) );
    }

    //----------------------------------------------------------------------------------------
    
    public String getLeyendaAncho () {
        return jlblLeyendaAncho.getText();
    }
    
    //----------------------------------------------------------------------------------------
    
    public void setLeyendaAncho ( String leyenda_ancho ) {
        jlblLeyendaAncho.setText ( leyenda_ancho );
    }
    
    //----------------------------------------------------------------------------------------
   
    public float getAncho () {
        return prismaRectangular.getAncho ();
    }
    
    //----------------------------------------------------------------------------------------
    
    public void setAncho ( float ancho ) {
        prismaRectangular.setAncho ( ancho );
        jlblValorAncho.setText ( Float.toString ( ancho ) );
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
        return prismaRectangular.getAltura ();
    }

    //----------------------------------------------------------------------------------------
    
    public void setAltura ( float altura ) {
        prismaRectangular.setAltura ( altura );
        jlblValorAltura.setText ( Float.toString ( altura ) );
    }
    
    //----------------------------------------------------------------------------------------
    
    public Icon getPrismaRectangular () {
        return jlblImagenPrismaRectangular.getIcon ();
    }
    
    //----------------------------------------------------------------------------------------
    
    public void setPrismaRectangular ( Icon prismaRectangular ) {
        jlblImagenPrismaRectangular.setIcon ( prismaRectangular );
    }
    
    //----------------------------------------------------------------------------------------
    
    public boolean isImagenPrismaRectangularAjustado () {
        return bolImagenPrismaRectangularAjustado;
    }
    
    //----------------------------------------------------------------------------------------
    
    public void setImagenPrismaRectangularAjustado ( boolean valor ) {
        bolImagenPrismaRectangularAjustado = valor;
        

        if ( bolImagenPrismaRectangularAjustado == true ) {
            // No funciona correctamente lo que nos proporcionó para ajustar las imagenes
            jlblImagenPrismaRectangular.setIcon ( Imagenes.escalarImagen ( jlblImagenPrismaRectangular.getIcon (), 
                                                                  jlblImagenPrismaRectangular.getWidth (), 
                                                                  jlblImagenPrismaRectangular.getHeight () ) );
        }
    }
    
    //----------------------------------------------------------------------------------------
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jmniValoresPrismaRectangular = new javax.swing.JMenuItem();
        jmniAcercaDePrismaRectangular = new javax.swing.JMenuItem();
        jlblImagenPrismaRectangular = new javax.swing.JLabel();
        jlblLeyendaLargo = new javax.swing.JLabel();
        jlblValorLargo = new javax.swing.JLabel();
        jlblLeyendaAltura = new javax.swing.JLabel();
        jlblValorAltura = new javax.swing.JLabel();
        jlblLeyendaAncho = new javax.swing.JLabel();
        jlblValorAncho = new javax.swing.JLabel();

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

        jlblImagenPrismaRectangular.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/edu/itl/util/PrismaRectangular.jpg"))); // NOI18N

        jlblLeyendaLargo.setText("largo (l):");

        jlblValorLargo.setText("0");
        jlblValorLargo.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jlblLeyendaAltura.setText("altura (h):");

        jlblValorAltura.setText("0");
        jlblValorAltura.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jlblLeyendaAncho.setText("ancho (a):");

        jlblValorAncho.setText("0");
        jlblValorAncho.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlblImagenPrismaRectangular)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlblLeyendaAltura)
                            .addComponent(jlblValorAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlblLeyendaAncho)
                            .addComponent(jlblValorAncho, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlblLeyendaLargo)
                        .addGap(18, 18, 18)
                        .addComponent(jlblValorLargo, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblValorLargo)
                    .addComponent(jlblLeyendaLargo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jlblLeyendaAncho, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jlblValorAncho, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jlblLeyendaAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jlblValorAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jlblImagenPrismaRectangular)
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
    
    //----------------------------------------------------------------------------------------
    
    public void removeJPrismaRectangularListener ( JValoresPrismasListener listener ) {
        listeners.remove ( listener );
    }
    
    //----------------------------------------------------------------------------------------
    
    public void fireJPrismaRectangularEvent ( JPrismaRectangularEvent evento ) {
        for ( JValoresPrismasListener listener : listeners ) {
            listener.valoresPrismaRectangular ( evento );
        }
    }
    
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
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JLabel jlblImagenPrismaRectangular;
    private javax.swing.JLabel jlblLeyendaAltura;
    private javax.swing.JLabel jlblLeyendaAncho;
    private javax.swing.JLabel jlblLeyendaLargo;
    private javax.swing.JLabel jlblValorAltura;
    private javax.swing.JLabel jlblValorAncho;
    private javax.swing.JLabel jlblValorLargo;
    private javax.swing.JMenuItem jmniAcercaDePrismaRectangular;
    private javax.swing.JMenuItem jmniValoresPrismaRectangular;
    // End of variables declaration//GEN-END:variables

    
}
