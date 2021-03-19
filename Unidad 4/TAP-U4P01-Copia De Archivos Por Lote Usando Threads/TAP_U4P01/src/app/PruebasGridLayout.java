/*------------------------------------------------------------------------------------------
:*                       INSTITUTO TECNOLOGICO DE LA LAGUNA
:*                     INGENIERIA EN SISTEMAS COMPUTACIONALES
:*                       TOPICOS AVANZADOS DE PROGRAMACION "B"
:*
:*                   SEMESTRE: ENE-JUN/2020    HORA: 17-18 HRS
:*
:*                       Frame principal de copia de archivos
:*        
:*  Archivo     : PruebasGridLayout.java
:*  Autor       :  Jorge Arturo Galindo Uribe        18131238
:*                  José Misael Adame Sandoval     18131209 
                    Ricardo Raúl Castro Luna        18131227
:*                  
:*  Fecha       : 8 de junio de 2020
:*  Compilador  : JAVA J2SE v1.8.0
:*  Descripci�n : Frame que permite al usuario cargar hasta
                        10 archivos distintos a copiar, elegir la carpeta
                        en donde serán copiados y limpiar los archivos ya copiados.
                        A su vez, permite ver el progreso del proceso y los datos de 
                        los autores. 
:*  Ultima modif:
:*  Fecha       Modific�             Motivo
:*========================================================================================== 
:*  08/junio/2020      Arturo Galindo       Agregar Prólogo
:*------------------------------------------------------------------------------------------*/
package app;


import hilo.thread.MiHilo;
import java.awt.GridLayout;
import java.io.File;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JProgressBar;

/*----------------------------------------------------------------------------*/

public class PruebasGridLayout extends javax.swing.JFrame {

    private static int cuenta = 0;
    ArrayList<MiHilo> Lote = new ArrayList();
    public String destino = "";
    
    /*----------------------------------------------------------------------------*/
    
    public PruebasGridLayout() {
        initComponents();
        jplArchivos.setLayout ( new GridLayout ( 0, 2 ) );
    }
    
    /*----------------------------------------------------------------------------*/

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jplArchivos = new javax.swing.JPanel();
        jbtnAgregar = new javax.swing.JButton();
        jbtnDestino = new javax.swing.JButton();
        jbtnLimpiar = new javax.swing.JButton();
        jbtnAcercaDe = new javax.swing.JButton();
        jbtnCopiar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jToolBar1 = new javax.swing.JToolBar();
        jlblCuenta = new javax.swing.JLabel();
        jToolBar2 = new javax.swing.JToolBar();
        jlblDestino = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Copia de archivos en lote usando threads");

        jPanel1.setBackground(new java.awt.Color(255, 255, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));

        jplArchivos.setBackground(new java.awt.Color(255, 204, 0));
        jplArchivos.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jplArchivos.setFont(new java.awt.Font("Gill Sans MT", 0, 11)); // NOI18N

        javax.swing.GroupLayout jplArchivosLayout = new javax.swing.GroupLayout(jplArchivos);
        jplArchivos.setLayout(jplArchivosLayout);
        jplArchivosLayout.setHorizontalGroup(
            jplArchivosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jplArchivosLayout.setVerticalGroup(
            jplArchivosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 15, Short.MAX_VALUE)
        );

        jbtnAgregar.setBackground(new java.awt.Color(255, 204, 51));
        jbtnAgregar.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        jbtnAgregar.setText("Agregar");
        jbtnAgregar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jbtnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAgregarActionPerformed(evt);
            }
        });

        jbtnDestino.setBackground(new java.awt.Color(255, 204, 51));
        jbtnDestino.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        jbtnDestino.setText("Destino");
        jbtnDestino.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jbtnDestino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDestinoActionPerformed(evt);
            }
        });

        jbtnLimpiar.setBackground(new java.awt.Color(255, 204, 51));
        jbtnLimpiar.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        jbtnLimpiar.setText("Limpiar");
        jbtnLimpiar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jbtnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnLimpiarActionPerformed(evt);
            }
        });

        jbtnAcercaDe.setBackground(new java.awt.Color(255, 204, 51));
        jbtnAcercaDe.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        jbtnAcercaDe.setText("Acerca de");
        jbtnAcercaDe.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jbtnAcercaDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAcercaDeActionPerformed(evt);
            }
        });

        jbtnCopiar.setBackground(new java.awt.Color(255, 204, 51));
        jbtnCopiar.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        jbtnCopiar.setText("Copiar ahora");
        jbtnCopiar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jbtnCopiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCopiarActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jToolBar1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jToolBar1.setRollover(true);

        jlblCuenta.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        jlblCuenta.setText("XX archivos serán copiados");
        jToolBar1.add(jlblCuenta);

        jToolBar2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jToolBar2.setRollover(true);

        jlblDestino.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        jlblDestino.setText("Destino de la copia:  C:\\Usuarios\\Tec\\Mis documentos\\");
            jToolBar2.add(jlblDestino);

            javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
            jPanel2.setLayout(jPanel2Layout);
            jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(4, 4, 4)
                    .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jToolBar2, javax.swing.GroupLayout.DEFAULT_SIZE, 466, Short.MAX_VALUE)
                    .addContainerGap())
            );
            jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jToolBar2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
            );

            javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
            jPanel1.setLayout(jPanel1Layout);
            jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jplArchivos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addContainerGap())
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jbtnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jbtnDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jbtnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jbtnAcercaDe, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbtnCopiar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(53, 53, 53))))
                .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            );
            jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jbtnAgregar)
                        .addComponent(jbtnDestino)
                        .addComponent(jbtnCopiar)
                        .addComponent(jbtnLimpiar)
                        .addComponent(jbtnAcercaDe, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addComponent(jplArchivos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 216, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            );

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            );
            layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            );

            pack();
            setLocationRelativeTo(null);
        }// </editor-fold>//GEN-END:initComponents

    /*----------------------------------------------------------------------------*/
    
    private void jbtnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAgregarActionPerformed
        if(cuenta < 10){
            JFileChooser jfc = new JFileChooser();
            
            if(jfc.showOpenDialog(this) == JFileChooser.APPROVE_OPTION){
                File archivo = jfc.getSelectedFile();
                
                jplArchivos.add ( new JLabel ( "Archivo " + ++cuenta) );
                jlblCuenta.setText(cuenta +" Archivos seran copiados");
                JProgressBar progressBar = new JProgressBar ();
                progressBar.setStringPainted ( true );
                
                jplArchivos.add ( progressBar  );
                jplArchivos.setVisible ( false );
                jplArchivos.setVisible ( true  );
                
                Lote.add( new MiHilo ( archivo, destino, progressBar) );
            }
        }
    }//GEN-LAST:event_jbtnAgregarActionPerformed

    /*----------------------------------------------------------------------------*/
    
    private void jbtnDestinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDestinoActionPerformed
        JFileChooser jfc = new JFileChooser ();
        jfc.setFileSelectionMode ( JFileChooser.DIRECTORIES_ONLY );
        if (  jfc.showOpenDialog ( this ) == JFileChooser.APPROVE_OPTION ) {
            jlblDestino.setText ("Destino de la copia: " + jfc.getSelectedFile().getAbsolutePath() );
            destino = jfc.getSelectedFile().getPath();
        }
    }//GEN-LAST:event_jbtnDestinoActionPerformed

    /*----------------------------------------------------------------------------*/
    
    private void jbtnCopiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCopiarActionPerformed
        for (int i = 0; i < cuenta; i++) {
            Lote.get(i).setDestino(destino);
            Lote.get(i).start();
        }
    }//GEN-LAST:event_jbtnCopiarActionPerformed

    /*----------------------------------------------------------------------------*/
    
    private void jbtnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnLimpiarActionPerformed
        for (int i = 0; i < cuenta; i++) {
            Lote.remove(i);
            jplArchivos.removeAll();
        }
        jlblCuenta.setText(0 +" Archivos seran copiados");
        cuenta = 0;
        jplArchivos.validate();
        jplArchivos.repaint();
    }//GEN-LAST:event_jbtnLimpiarActionPerformed

    private void jbtnAcercaDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAcercaDeActionPerformed
        AcercaDeDialog acd=new AcercaDeDialog(this, true);
        acd.setVisible(true);
    }//GEN-LAST:event_jbtnAcercaDeActionPerformed

    /*----------------------------------------------------------------------------*/
    
    synchronized public void setProgreso(double progreso, JProgressBar progressBar){
        mostrarProgreso(progreso, progressBar);
    }

    /*----------------------------------------------------------------------------*/
    
    private void mostrarProgreso(double progreso, JProgressBar jpbrProgreso){
        jpbrProgreso.setValue((int) progreso);
    }
    
    /*----------------------------------------------------------------------------*/
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
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
            java.util.logging.Logger.getLogger(PruebasGridLayout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PruebasGridLayout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PruebasGridLayout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PruebasGridLayout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PruebasGridLayout().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JToolBar jToolBar2;
    private javax.swing.JButton jbtnAcercaDe;
    private javax.swing.JButton jbtnAgregar;
    private javax.swing.JButton jbtnCopiar;
    private javax.swing.JButton jbtnDestino;
    private javax.swing.JButton jbtnLimpiar;
    private javax.swing.JLabel jlblCuenta;
    private javax.swing.JLabel jlblDestino;
    private javax.swing.JPanel jplArchivos;
    // End of variables declaration//GEN-END:variables
}
