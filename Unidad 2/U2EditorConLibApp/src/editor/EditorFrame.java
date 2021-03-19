/*------------------------------------------------------------------------------------------
:*                       INSTITUTO TECNOLOGICO DE LA LAGUNA
:*                     INGENIERIA EN SISTEMAS COMPUTACIONALES
:*                       TOPICOS AVANZADOS DE PROGRAMACION "B"
:*
:*                   SEMESTRE: ENE-JUN/2020    HORA: 17-18 HRS
:*
:*               Aplicación GUI para el entorno del Editor de Texto
:*        
:*  Archivo     : EditorFrame.java
:*  Autor       : José Misael Adame Sandoval     18131209
:*  Fecha       : 04/Mar/2020
:*  Compilador  : JAVA J2SE v1.8.0
:*  Descripción : Aplicación que realiza las funciones básicas de un editor
:*                de texto básico como crear un archivo, abrirlo, guardarlo, 
:*                imprimirlo, copiar, cortar y pegar el texto.
:*              
:*                
:*  Ultima modif:
:*  Fecha       Modificó             Motivo
:*========================================================================================== 
:*  6/mar/2020 Misael Adame         Agregar prólogo.
:*------------------------------------------------------------------------------------------*/

package editor;

import java.awt.Desktop;
import java.awt.print.PrinterException;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import mx.edu.itl.acercade.v2.AcercaDeDialog;

public class EditorFrame extends javax.swing.JFrame {

    //---------------------------------------------------------------------------------------- 
    
    private OpcionesDialog opcionesDialog;
    private AcercaDeDialog acercaDeDialog;
    private JFileChooser jfc;
       
    //----------------------------------------------------------------------------------------
    
    public EditorFrame () {
        initComponents ();
        
        opcionesDialog = new OpcionesDialog ( this, true );
        jfc = new JFileChooser ();
        
        // Maximizar el frame
        this.setExtendedState ( MAXIMIZED_BOTH );
    }

    //----------------------------------------------------------------------------------------
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jToolBar1 = new javax.swing.JToolBar();
        jbtnArchivoNuevo = new javax.swing.JButton();
        jbtnArchivoAbrir = new javax.swing.JButton();
        jbtnArchivoGuardar = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        jbtnEditarCopiar = new javax.swing.JButton();
        jbtnEditarCortar = new javax.swing.JButton();
        jbtnEditarPegar = new javax.swing.JButton();
        jbtnArchivoImprimir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtxaTexto = new javax.swing.JTextArea();
        jMenuBar2 = new javax.swing.JMenuBar();
        jmArchivo = new javax.swing.JMenu();
        jmniArchivoNuevo = new javax.swing.JMenuItem();
        jmniArchivoAbrir = new javax.swing.JMenuItem();
        jmniArchivoGuardar = new javax.swing.JMenuItem();
        jmniArchivoGuardarComo = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jmniArchivoImprimir = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        jmniArchivoSalir = new javax.swing.JMenuItem();
        jmEditar = new javax.swing.JMenu();
        jmniEditarCopiar = new javax.swing.JMenuItem();
        jmniEditarCortar = new javax.swing.JMenuItem();
        jmniEditarPegar = new javax.swing.JMenuItem();
        jmHerramientas = new javax.swing.JMenu();
        jmniHerramientasOpciones = new javax.swing.JMenuItem();
        jmAyuda = new javax.swing.JMenu();
        jmniAyudaContenido = new javax.swing.JMenuItem();
        jmniAyudaAcercaDe = new javax.swing.JMenuItem();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("EditorApp");

        jToolBar1.setRollover(true);

        jbtnArchivoNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/editor/iconos/icon_Nuevo.png"))); // NOI18N
        jbtnArchivoNuevo.setFocusable(false);
        jbtnArchivoNuevo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtnArchivoNuevo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbtnArchivoNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnArchivoNuevoActionPerformed(evt);
            }
        });
        jToolBar1.add(jbtnArchivoNuevo);

        jbtnArchivoAbrir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/editor/iconos/icon_Abrir.png"))); // NOI18N
        jbtnArchivoAbrir.setFocusable(false);
        jbtnArchivoAbrir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtnArchivoAbrir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbtnArchivoAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnArchivoAbrirActionPerformed(evt);
            }
        });
        jToolBar1.add(jbtnArchivoAbrir);

        jbtnArchivoGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/editor/iconos/icon_Guardar.png"))); // NOI18N
        jbtnArchivoGuardar.setFocusable(false);
        jbtnArchivoGuardar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtnArchivoGuardar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbtnArchivoGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnArchivoGuardarActionPerformed(evt);
            }
        });
        jToolBar1.add(jbtnArchivoGuardar);
        jToolBar1.add(jSeparator2);

        jbtnEditarCopiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/editor/iconos/icon_Copiar.png"))); // NOI18N
        jbtnEditarCopiar.setFocusable(false);
        jbtnEditarCopiar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtnEditarCopiar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbtnEditarCopiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnEditarCopiarActionPerformed(evt);
            }
        });
        jToolBar1.add(jbtnEditarCopiar);

        jbtnEditarCortar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/editor/iconos/icon_Cortar.png"))); // NOI18N
        jbtnEditarCortar.setFocusable(false);
        jbtnEditarCortar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtnEditarCortar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbtnEditarCortar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnEditarCortarActionPerformed(evt);
            }
        });
        jToolBar1.add(jbtnEditarCortar);

        jbtnEditarPegar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/editor/iconos/icon_Pegar.png"))); // NOI18N
        jbtnEditarPegar.setFocusable(false);
        jbtnEditarPegar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtnEditarPegar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbtnEditarPegar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnEditarPegarActionPerformed(evt);
            }
        });
        jToolBar1.add(jbtnEditarPegar);

        jbtnArchivoImprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/editor/iconos/icon_Imprimir.png"))); // NOI18N
        jbtnArchivoImprimir.setFocusable(false);
        jbtnArchivoImprimir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtnArchivoImprimir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jbtnArchivoImprimir);

        jtxaTexto.setColumns(20);
        jtxaTexto.setRows(5);
        jScrollPane1.setViewportView(jtxaTexto);

        jMenuBar2.setBorder(null);

        jmArchivo.setText("Archivo");

        jmniArchivoNuevo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        jmniArchivoNuevo.setText("Nuevo");
        jmniArchivoNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniArchivoNuevoActionPerformed(evt);
            }
        });
        jmArchivo.add(jmniArchivoNuevo);

        jmniArchivoAbrir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        jmniArchivoAbrir.setText("Abrir...");
        jmniArchivoAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniArchivoAbrirActionPerformed(evt);
            }
        });
        jmArchivo.add(jmniArchivoAbrir);

        jmniArchivoGuardar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_MASK));
        jmniArchivoGuardar.setText("Guardar");
        jmniArchivoGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniArchivoGuardarActionPerformed(evt);
            }
        });
        jmArchivo.add(jmniArchivoGuardar);

        jmniArchivoGuardarComo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jmniArchivoGuardarComo.setText("Guardar como...");
        jmniArchivoGuardarComo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniArchivoGuardarComoActionPerformed(evt);
            }
        });
        jmArchivo.add(jmniArchivoGuardarComo);
        jmArchivo.add(jSeparator1);

        jmniArchivoImprimir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.CTRL_MASK));
        jmniArchivoImprimir.setText("Imprimir");
        jmniArchivoImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniArchivoImprimirActionPerformed(evt);
            }
        });
        jmArchivo.add(jmniArchivoImprimir);
        jmArchivo.add(jSeparator3);

        jmniArchivoSalir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        jmniArchivoSalir.setText("Salir");
        jmniArchivoSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniArchivoSalirActionPerformed(evt);
            }
        });
        jmArchivo.add(jmniArchivoSalir);

        jMenuBar2.add(jmArchivo);

        jmEditar.setText("Editar");

        jmniEditarCopiar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        jmniEditarCopiar.setText("Copiar");
        jmniEditarCopiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniEditarCopiarActionPerformed(evt);
            }
        });
        jmEditar.add(jmniEditarCopiar);

        jmniEditarCortar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        jmniEditarCortar.setText("Cortar");
        jmniEditarCortar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniEditarCortarActionPerformed(evt);
            }
        });
        jmEditar.add(jmniEditarCortar);

        jmniEditarPegar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_MASK));
        jmniEditarPegar.setText("Pegar");
        jmniEditarPegar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniEditarPegarActionPerformed(evt);
            }
        });
        jmEditar.add(jmniEditarPegar);

        jMenuBar2.add(jmEditar);

        jmHerramientas.setText("Herramientas");

        jmniHerramientasOpciones.setText("Opciones...");
        jmniHerramientasOpciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniHerramientasOpcionesActionPerformed(evt);
            }
        });
        jmHerramientas.add(jmniHerramientasOpciones);

        jMenuBar2.add(jmHerramientas);

        jmAyuda.setText("Ayuda");

        jmniAyudaContenido.setText("Contenido");
        jmniAyudaContenido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniAyudaContenidoActionPerformed(evt);
            }
        });
        jmAyuda.add(jmniAyudaContenido);

        jmniAyudaAcercaDe.setText("Acerca de...");
        jmniAyudaAcercaDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniAyudaAcercaDeActionPerformed(evt);
            }
        });
        jmAyuda.add(jmniAyudaAcercaDe);

        jMenuBar2.add(jmAyuda);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 620, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 373, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //----------------------------------------------------------------------------------------
    
    private void jmniArchivoNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmniArchivoNuevoActionPerformed
        if ( JOptionPane.showConfirmDialog ( 
                this, 
                "¿Desea crear un archivo nuevo?",
                "Editor",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE ) == JOptionPane.YES_OPTION ) {
            jtxaTexto.setText ( "" );
            jtxaTexto.requestFocus ();    
        }            
    }//GEN-LAST:event_jmniArchivoNuevoActionPerformed

    //----------------------------------------------------------------------------------------
    
    private void jmniArchivoAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmniArchivoAbrirActionPerformed
        if ( jfc.showOpenDialog ( this ) == JFileChooser.APPROVE_OPTION ) {
            File file = jfc.getSelectedFile ();
            try {
                FileReader fr = new FileReader ( file );
                BufferedReader br = new BufferedReader ( fr ) ;
                String texto = "";
                String linea = br.readLine ();
                while ( linea != null ) {
                    texto += linea +"\n";
                    linea = br.readLine ();                   
                }
                br.close ();
                fr.close ();                
                jtxaTexto.setText ( texto );
                jtxaTexto.setCaretPosition ( 0 );
                this.setTitle ("EditorApp - " + jfc.getName ( jfc.getSelectedFile() ) );
            } catch ( FileNotFoundException ex ) {
                JOptionPane.showMessageDialog ( this, ex, "Error", JOptionPane.ERROR_MESSAGE );             
            } catch ( IOException ex ) {
                JOptionPane.showMessageDialog ( this, ex, "Error", JOptionPane.ERROR_MESSAGE );
            }
        }
    }//GEN-LAST:event_jmniArchivoAbrirActionPerformed

    //----------------------------------------------------------------------------------------
    
    private void jmniArchivoGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmniArchivoGuardarActionPerformed
        try {
            FileWriter fw = new FileWriter ( jfc.getSelectedFile () );
            String texto = jtxaTexto.getText ();
            fw.write ( texto );
            fw.close ();
        } catch ( IOException ex ) {
            JOptionPane.showMessageDialog ( this, ex, "Error", JOptionPane.ERROR_MESSAGE );
        } catch ( NullPointerException e ) {
            if ( jfc.showSaveDialog ( this ) == JFileChooser.APPROVE_OPTION ) {
                try {
                    FileWriter fw = new FileWriter ( jfc.getSelectedFile () );
                    String texto = jtxaTexto.getText ();
                    fw.write ( texto );
                    fw.close ();
                    this.setTitle ("EditorApp - " + jfc.getName( jfc.getSelectedFile() ) );
                } catch ( IOException ex ) {
                    JOptionPane.showMessageDialog ( this, ex, "Error", JOptionPane.ERROR_MESSAGE );
                }
            }
        } 
    }//GEN-LAST:event_jmniArchivoGuardarActionPerformed

    //----------------------------------------------------------------------------------------
    
    private void jmniArchivoSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmniArchivoSalirActionPerformed
        dispose ();
    }//GEN-LAST:event_jmniArchivoSalirActionPerformed

    //----------------------------------------------------------------------------------------
    
    private void jbtnArchivoNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnArchivoNuevoActionPerformed
        jmniArchivoNuevoActionPerformed ( evt );
        // jmniArchivoNuevo.doClick ();
    }//GEN-LAST:event_jbtnArchivoNuevoActionPerformed

    //----------------------------------------------------------------------------------------
    
    private void jmniArchivoImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmniArchivoImprimirActionPerformed
        try {
            jtxaTexto.print ();
        } catch ( PrinterException ex ) {
            JOptionPane.showMessageDialog(
                this, 
                ex,
                "Error",
                JOptionPane.ERROR_MESSAGE
            );
        }
    }//GEN-LAST:event_jmniArchivoImprimirActionPerformed

    //----------------------------------------------------------------------------------------
    
    private void jmniEditarCortarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmniEditarCortarActionPerformed
        jtxaTexto.cut ();
    }//GEN-LAST:event_jmniEditarCortarActionPerformed

    //----------------------------------------------------------------------------------------
    
    private void jmniEditarCopiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmniEditarCopiarActionPerformed
        jtxaTexto.copy ();
    }//GEN-LAST:event_jmniEditarCopiarActionPerformed

    //----------------------------------------------------------------------------------------
    
    private void jmniHerramientasOpcionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmniHerramientasOpcionesActionPerformed
        opcionesDialog.setVisible ( true );        
    }//GEN-LAST:event_jmniHerramientasOpcionesActionPerformed

    private void jmniAyudaAcercaDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmniAyudaAcercaDeActionPerformed
        acercaDeDialog = new AcercaDeDialog ( this, true );
        acercaDeDialog.setVisible ( true );        
    }//GEN-LAST:event_jmniAyudaAcercaDeActionPerformed

    //----------------------------------------------------------------------------------------
    
    private void jmniArchivoGuardarComoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmniArchivoGuardarComoActionPerformed
        jfc.setDialogTitle ( "Guardar como..." );
        if ( jfc.showSaveDialog ( this ) == JFileChooser.APPROVE_OPTION ) {
            try {
                FileWriter fw = new FileWriter ( jfc.getSelectedFile() );
                String texto = jtxaTexto.getText ();
                fw.write ( texto );
                fw.close ();
                this.setTitle ("EditorApp - " + jfc.getName( jfc.getSelectedFile() ) );
            } catch ( IOException ex ) {
                JOptionPane.showMessageDialog ( this, ex, "Error", JOptionPane.ERROR_MESSAGE );
            }           
        }       
    }//GEN-LAST:event_jmniArchivoGuardarComoActionPerformed

    //----------------------------------------------------------------------------------------
    
    private void jbtnEditarPegarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnEditarPegarActionPerformed
        jmniEditarPegarActionPerformed ( evt );
    }//GEN-LAST:event_jbtnEditarPegarActionPerformed

    //----------------------------------------------------------------------------------------
    
    private void jbtnArchivoAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnArchivoAbrirActionPerformed
        jmniArchivoAbrirActionPerformed ( evt );
    }//GEN-LAST:event_jbtnArchivoAbrirActionPerformed

    //----------------------------------------------------------------------------------------
    
    private void jbtnArchivoGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnArchivoGuardarActionPerformed
        jmniArchivoGuardarActionPerformed ( evt );
    }//GEN-LAST:event_jbtnArchivoGuardarActionPerformed

    //----------------------------------------------------------------------------------------
    
    private void jbtnEditarCopiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnEditarCopiarActionPerformed
       
        jmniEditarCopiarActionPerformed ( evt );
    }//GEN-LAST:event_jbtnEditarCopiarActionPerformed

    //----------------------------------------------------------------------------------------
    
    private void jbtnEditarCortarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnEditarCortarActionPerformed
        jmniEditarCortarActionPerformed ( evt );
    }//GEN-LAST:event_jbtnEditarCortarActionPerformed

    //----------------------------------------------------------------------------------------
    
    private void jmniEditarPegarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmniEditarPegarActionPerformed
        jtxaTexto.paste ();
    }//GEN-LAST:event_jmniEditarPegarActionPerformed

    //----------------------------------------------------------------------------------------
    
    private void jmniAyudaContenidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmniAyudaContenidoActionPerformed
        try {
            Desktop.getDesktop ().open ( new java.io.File ( "TAP-U1P04-Editor de texto basico con "
                                                            + "Java Swing.pdf" ) );
        } catch ( IOException ex ) {
            JOptionPane.showMessageDialog (
                    this, 
                    "Archivo no encontrado", 
                    "Error", 
                    JOptionPane.ERROR_MESSAGE
            );
        }                
    }//GEN-LAST:event_jmniAyudaContenidoActionPerformed

    //----------------------------------------------------------------------------------------
    
    public static void ejecutar () {
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
            java.util.logging.Logger.getLogger(EditorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater ( new Runnable () {
            public void run () {
                new EditorFrame ().setVisible ( true );
            }
        }); 
    }
    
    //----------------------------------------------------------------------------------------
    
    public static void main ( String args[] ) {
        ejecutar ();
    }

    //----------------------------------------------------------------------------------------
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JButton jbtnArchivoAbrir;
    private javax.swing.JButton jbtnArchivoGuardar;
    private javax.swing.JButton jbtnArchivoImprimir;
    private javax.swing.JButton jbtnArchivoNuevo;
    private javax.swing.JButton jbtnEditarCopiar;
    private javax.swing.JButton jbtnEditarCortar;
    private javax.swing.JButton jbtnEditarPegar;
    private javax.swing.JMenu jmArchivo;
    private javax.swing.JMenu jmAyuda;
    private javax.swing.JMenu jmEditar;
    private javax.swing.JMenu jmHerramientas;
    private javax.swing.JMenuItem jmniArchivoAbrir;
    private javax.swing.JMenuItem jmniArchivoGuardar;
    private javax.swing.JMenuItem jmniArchivoGuardarComo;
    private javax.swing.JMenuItem jmniArchivoImprimir;
    private javax.swing.JMenuItem jmniArchivoNuevo;
    private javax.swing.JMenuItem jmniArchivoSalir;
    private javax.swing.JMenuItem jmniAyudaAcercaDe;
    private javax.swing.JMenuItem jmniAyudaContenido;
    private javax.swing.JMenuItem jmniEditarCopiar;
    private javax.swing.JMenuItem jmniEditarCortar;
    private javax.swing.JMenuItem jmniEditarPegar;
    private javax.swing.JMenuItem jmniHerramientasOpciones;
    protected javax.swing.JTextArea jtxaTexto;
    // End of variables declaration//GEN-END:variables
}
