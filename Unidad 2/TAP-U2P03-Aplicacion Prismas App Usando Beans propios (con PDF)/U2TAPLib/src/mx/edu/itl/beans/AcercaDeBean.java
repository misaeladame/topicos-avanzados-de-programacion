/*------------------------------------------------------------------------------------------
:*                       INSTITUTO TECNOLOGICO DE LA LAGUNA
:*                     INGENIERIA EN SISTEMAS COMPUTACIONALES
:*                       TOPICOS AVANZADOS DE PROGRAMACION "B"
:*
:*                   SEMESTRE: ENE-JUN/2020    HORA: 17-18 HRS
:*
:*                           Bean GUI de un Acerca de..
:*        
:*  Archivo     : AcercaDeBean.java
:*  Autor       : José Misael Adame Sandoval     18131209
:*  Fecha       : 01/Abr/2020
:*  Compilador  : JAVA J2SE v1.8.0
:*  Descripción : Bean que muestra información sobre el autor de la
:*                aplicación que está realizando
:*                     
:*                
:*  Ultima modif:
:*  Fecha       Modificó             Motivo
:*========================================================================================== 
:*  06/Abr/2020 Misael Adame         Agregar prólogo.
:*------------------------------------------------------------------------------------------*/

package mx.edu.itl.beans;

import javax.swing.Icon;
import javax.swing.JOptionPane;
import mx.edu.itl.util.Imagenes;

public class AcercaDeBean extends javax.swing.JPanel {

  
    private boolean bolLogo1Ajustado = false;
    private boolean bolLogo2Ajustado = false;
    
    //----------------------------------------------------------------------------------------
    
    public AcercaDeBean () {
        initComponents ();    
    }

    //----------------------------------------------------------------------------------------
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jmniAcercaDe = new javax.swing.JMenuItem();
        jlblDerechosReservados = new javax.swing.JLabel();
        jlblLogo1 = new javax.swing.JLabel();
        jlblLogo2 = new javax.swing.JLabel();
        jlblInstitucion = new javax.swing.JLabel();
        jlblCampus = new javax.swing.JLabel();
        jlblCarrera = new javax.swing.JLabel();
        jlblMateria = new javax.swing.JLabel();
        jlblNombreApp = new javax.swing.JLabel();
        jlblDesarrolladoPor = new javax.swing.JLabel();
        jlblAutor1 = new javax.swing.JLabel();
        jlblAutor2 = new javax.swing.JLabel();
        jlblAutor3 = new javax.swing.JLabel();
        jlblControl2 = new javax.swing.JLabel();
        jlblControl1 = new javax.swing.JLabel();
        jlblControl3 = new javax.swing.JLabel();
        jlblVersionApp = new javax.swing.JLabel();

        jmniAcercaDe.setText("Acerca de...");
        jmniAcercaDe.setComponentPopupMenu(jPopupMenu1);
        jmniAcercaDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniAcercaDeActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jmniAcercaDe);

        setComponentPopupMenu(jPopupMenu1);

        jlblDerechosReservados.setText("c) Derechos reservados 2020");

        jlblLogo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/edu/itl/util/TECNM.png"))); // NOI18N

        jlblLogo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/edu/itl/util/ITL.png"))); // NOI18N

        jlblInstitucion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblInstitucion.setText("TECNOLOGICO NACIONAL DE MEXICO");

        jlblCampus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblCampus.setText("Instituto Tecnológico de La Laguna");

        jlblCarrera.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblCarrera.setText("Ingeniería en Sistemas Computacionales");

        jlblMateria.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jlblMateria.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblMateria.setText("TOPICOS AVANZADOS DE PROGRAMACION");

        jlblNombreApp.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jlblNombreApp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblNombreApp.setText("[Nombre de la aplicación]");

        jlblDesarrolladoPor.setText("Desarrollado por:");

        jlblAutor1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jlblAutor1.setText("José Misael Adame Sandoval ");

        jlblAutor2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        jlblAutor3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        jlblControl2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        jlblControl1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jlblControl1.setText("18131209");

        jlblControl3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        jlblVersionApp.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jlblVersionApp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblVersionApp.setText("v1.0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jlblLogo2, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlblLogo1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlblInstitucion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlblCampus, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlblCarrera, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlblVersionApp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlblNombreApp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlblMateria, javax.swing.GroupLayout.DEFAULT_SIZE, 475, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jlblAutor2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jlblDerechosReservados))
                                    .addComponent(jlblAutor3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(jlblAutor1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jlblControl1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jlblControl2, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jlblControl3, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jlblDesarrolladoPor, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jlblInstitucion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jlblCampus)
                        .addGap(18, 18, 18)
                        .addComponent(jlblCarrera)
                        .addGap(32, 32, 32)
                        .addComponent(jlblMateria)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jlblLogo1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlblNombreApp)
                        .addGap(18, 18, 18)
                        .addComponent(jlblVersionApp)
                        .addGap(18, 18, 18)
                        .addComponent(jlblDesarrolladoPor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlblAutor1)
                            .addComponent(jlblControl1))
                        .addGap(12, 12, 12)
                        .addComponent(jlblControl2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jlblLogo2, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlblAutor2, javax.swing.GroupLayout.DEFAULT_SIZE, 10, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlblAutor3, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlblControl3, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(21, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlblDerechosReservados)
                        .addGap(14, 14, 14))))
        );
    }// </editor-fold>//GEN-END:initComponents

    //----------------------------------------------------------------------------------------
    
    private void jmniAcercaDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmniAcercaDeActionPerformed
        JOptionPane.showMessageDialog (
            this,
            "AcercaDeBean v1.0 \n\n" +
            "Por: \n" +
            "Jose Misael Adame Sandoval (18131209) \n\n" +
            "Semestre: Ene - Jun/2020",
            "Acerca de...",
            JOptionPane.INFORMATION_MESSAGE
         );
    }//GEN-LAST:event_jmniAcercaDeActionPerformed

    //----------------------------------------------------------------------------------------
    
    public String getInstitucion () {
        return jlblInstitucion.getText();
    }
    
    //----------------------------------------------------------------------------------------
    
    public void setInstitucion ( String institucion ) {
        jlblInstitucion.setText ( institucion );
    }
    
    //----------------------------------------------------------------------------------------
    
    public String getCampus () {
        return jlblCampus.getText();
    }
    
    //----------------------------------------------------------------------------------------
    
    public void setCampus ( String campus ) {
        jlblCampus.setText ( campus );
    }
    
    //----------------------------------------------------------------------------------------
    
    public String getCarrera () {
        return jlblCarrera.getText();
    }
    
    //----------------------------------------------------------------------------------------
    
    public void setCarrera ( String carrera ) {
        jlblCarrera.setText ( carrera );
    }
    
    //----------------------------------------------------------------------------------------
    
    public String getMateria () {
        return jlblMateria.getText ();
    }
    
    //----------------------------------------------------------------------------------------
    
    public void setMateria ( String materia ) {
        jlblMateria.setText ( materia );
    }
    
    //----------------------------------------------------------------------------------------
    
    public String getNombreApp () {
        return jlblNombreApp.getText ();
    }
    
    //----------------------------------------------------------------------------------------
    
    public void setNombreApp ( String nombre_app ) {
        jlblNombreApp.setText ( nombre_app );
    }
    
    //----------------------------------------------------------------------------------------
    
    public String getVersionApp () {
        return jlblVersionApp.getText ();
    }
    
    //----------------------------------------------------------------------------------------
    
    public void setVersionApp ( String version_app ) {
        jlblVersionApp.setText ( version_app );
    }
    
    //----------------------------------------------------------------------------------------
    
    public String getDesarrolladoPor () {
        return jlblDesarrolladoPor.getText ();
    }
    
    //----------------------------------------------------------------------------------------
    
    public void setDesarrolladoPor ( String desarrollado_por ) {
        jlblDesarrolladoPor.setText ( desarrollado_por );
    }
    
    //----------------------------------------------------------------------------------------
    
    public String getAutor1 () {
        return jlblAutor1.getText ();
    }
    
    //----------------------------------------------------------------------------------------
    
    public void setAutor1 ( String autor_1 ) {
        jlblAutor1.setText ( autor_1 );
    }
    
    //----------------------------------------------------------------------------------------
    
    public String getAutor2 () {
        return jlblAutor2.getText ();
    }
    
    //----------------------------------------------------------------------------------------
    
    public void setAutor2 ( String autor_2 ) {
        jlblAutor2.setText ( autor_2 );
    }
    
    //----------------------------------------------------------------------------------------
    
    public String getAutor3 () {
        return jlblAutor3.getText ();
    }
    
    //----------------------------------------------------------------------------------------
    
    public void setAutor3 ( String autor_3 ) {
        jlblAutor3.setText ( autor_3 );
    }
    
    //----------------------------------------------------------------------------------------
    
    public String getControl1 () {
        return jlblControl1.getText ();
    }
    
    //----------------------------------------------------------------------------------------
    
    public void setControl1 ( String control_1 ) {
        jlblControl1.setText ( control_1 );
    }
    
    //----------------------------------------------------------------------------------------
    
    public String getControl2 () {
        return jlblControl2.getText ();
    }
    
    //----------------------------------------------------------------------------------------
    
    public void setControl2 ( String control_2 ) {
        jlblControl2.setText ( control_2 );
    }
    
    //----------------------------------------------------------------------------------------
    
    public String getControl3 () {
        return jlblControl2.getText ();
    }
    
    //----------------------------------------------------------------------------------------
    
    public void setControl3 ( String control_3 ) {
        jlblControl3.setText ( control_3 );
    }
    
    //----------------------------------------------------------------------------------------
    
    public Icon getLogo1 () {
        return jlblLogo1.getIcon ();
    }
    
    //----------------------------------------------------------------------------------------
    
    public void setLogo1 ( Icon logo_1 ) {
        jlblLogo1.setIcon ( logo_1 );
    }
    
    //----------------------------------------------------------------------------------------
    
    public Icon getLogo2 () {
        return jlblLogo2.getIcon ();
    }
    
    //----------------------------------------------------------------------------------------
    
    public void setLogo2 ( Icon logo_2 ) {
        jlblLogo2.setIcon ( logo_2 );
    }
    
    //----------------------------------------------------------------------------------------
    
    public String getDerechosReservados () {
        return jlblDerechosReservados.getText ();
    }
    
    //----------------------------------------------------------------------------------------
    
    public void setDerechosReservados ( String derechos_reservados ) {
        jlblDerechosReservados.setText ( derechos_reservados );
    }
    
    //----------------------------------------------------------------------------------------
    
    public boolean isLogo1Ajustado () {
        return bolLogo1Ajustado;
    }
    
    //----------------------------------------------------------------------------------------
    
    public void setLogo1Ajustado ( boolean valor ) {
        bolLogo1Ajustado = valor;
        

        if ( bolLogo1Ajustado == true ) {
            // No funciona correctamente lo que nos proporcionó para ajustar las imagenes
            jlblLogo1.setIcon ( Imagenes.escalarImagen ( jlblLogo1.getIcon (), 
                                                         jlblLogo1.getWidth (), 
                                                         jlblLogo1.getHeight () ) );
        }
    }
    
    //----------------------------------------------------------------------------------------
    
    public boolean isLogo2Ajustado () {
        return bolLogo2Ajustado;
    }
    
    //----------------------------------------------------------------------------------------
    
    public void setLogo2Ajustado ( boolean valor ) {
        bolLogo2Ajustado = valor;
        if ( bolLogo2Ajustado == true ) {
            
            // No funciona correctamente lo que nos proporcionó para ajustar las imagenes
            jlblLogo2.setIcon ( Imagenes.escalarImagen ( jlblLogo2.getIcon (), 
                                                         jlblLogo2.getWidth (), 
                                                         jlblLogo2.getHeight () ) );
        }
        
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JLabel jlblAutor1;
    private javax.swing.JLabel jlblAutor2;
    private javax.swing.JLabel jlblAutor3;
    private javax.swing.JLabel jlblCampus;
    private javax.swing.JLabel jlblCarrera;
    private javax.swing.JLabel jlblControl1;
    private javax.swing.JLabel jlblControl2;
    private javax.swing.JLabel jlblControl3;
    private javax.swing.JLabel jlblDerechosReservados;
    private javax.swing.JLabel jlblDesarrolladoPor;
    private javax.swing.JLabel jlblInstitucion;
    private javax.swing.JLabel jlblLogo1;
    private javax.swing.JLabel jlblLogo2;
    private javax.swing.JLabel jlblMateria;
    private javax.swing.JLabel jlblNombreApp;
    private javax.swing.JLabel jlblVersionApp;
    private javax.swing.JMenuItem jmniAcercaDe;
    // End of variables declaration//GEN-END:variables
}
