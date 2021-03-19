/*------------------------------------------------------------------------------------------
:*                       INSTITUTO TECNOLOGICO DE LA LAGUNA
:*                     INGENIERIA EN SISTEMAS COMPUTACIONALES
:*                       TOPICOS AVANZADOS DE PROGRAMACION "B"
:*
:*                   SEMESTRE: ENE-JUN/2020    HORA: 17-18 HRS
:*
:*                      Aplicación GUI para probar la clase Conversiones
:*        
:*  Archivo     : PrismasFrame.java
:*  Autor       : José Misael Adame Sandoval     18131209
:*  Fecha       : 20/Feb/2020
:*  Compilador  : JAVA J2SE v1.8.0
:*  Descripción : Aplicación que accede a las clases Cilindro, PrismaRectangular
:*                y PrismaTriangular e invoca a cada uno de sus métodos para 
:*                comprobar su funcionamiento
:*                
:*  Ultima modif:
:*  Fecha       Modificó             Motivo
:*========================================================================================== 
:*  24/feb/2020 Misael Adame         Agregar prólogo y realizar validaciones.
:*------------------------------------------------------------------------------------------*/

package prismas;

import mx.edu.itl.prismas.PrismaRectangular;
import mx.edu.itl.prismas.Cilindro;
import mx.edu.itl.prismas.PrismaTriangular;
import javax.swing.JOptionPane;
import mx.edu.itl.eventos.JCilindroEvent;
import mx.edu.itl.eventos.JPrismaRectangularEvent;
import mx.edu.itl.eventos.JPrismaTriangularEvent;
import mx.edu.itl.eventos.JValoresPrismasListener;


public class PrismasFrame extends javax.swing.JFrame implements JValoresPrismasListener{
    
    //--------------------------------------------------------------------------    

    private AcercaDeDialog acercaDeDialog;
    
    //--------------------------------------------------------------------------
    
    public PrismasFrame()  {
        initComponents();
        
        jCilindro1.addJCilindroListener(this);
        jPrismaRectangular1.addJPrismaRectangularListener(this);
        jPrismaTriangular1.addJPrismaTriangularListener(this);
        
        
    }

    //--------------------------------------------------------------------------
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jtxfCilindroRadio = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jtxfCilindroAltura = new javax.swing.JTextField();
        jbtnCilindroCalcular = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jlblCilindroAreaBase = new javax.swing.JLabel();
        jlblClilindroAreaLateral = new javax.swing.JLabel();
        jlblCilindroAreaTotal = new javax.swing.JLabel();
        jlblCilindroVolumen = new javax.swing.JLabel();
        jCilindro1 = new mx.edu.itl.beans.JCilindro();
        jPanel2 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jtxfPrismRectLargo = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jtxfPrismRectAncho = new javax.swing.JTextField();
        jbtnPrisRectCalcular = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jtxfPrismRectAltura = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jlblPrismRectAreaBase = new javax.swing.JLabel();
        jlblPrismRectAreaLateral = new javax.swing.JLabel();
        jlblPrismRectAreaTotal = new javax.swing.JLabel();
        jlblPrismRectVolumen = new javax.swing.JLabel();
        jPrismaRectangular1 = new mx.edu.itl.beans.JPrismaRectangular();
        jPanel3 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jtxfPrismTriangCatetoB = new javax.swing.JTextField();
        jbtnPrismTriangCalcular = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jtxfPrismTriangAltura = new javax.swing.JTextField();
        jtxfPrismTriangCatetoA = new javax.swing.JTextField();
        jPanel9 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jlblPrismTriangAreaBase = new javax.swing.JLabel();
        jlblPrismTriangAreaLateral = new javax.swing.JLabel();
        jlblPrismTriangAreaTotal = new javax.swing.JLabel();
        jlblPrismTriangVolumen = new javax.swing.JLabel();
        jPrismaTriangular1 = new mx.edu.itl.beans.JPrismaTriangular();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jmniArchivoSalir = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jmniEdicionLimpiar = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jmniAyudaAcercaDe = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Prismas App");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos"));

        jLabel1.setText("Radio (r) : ");

        jtxfCilindroRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxfCilindroRadioActionPerformed(evt);
            }
        });
        jtxfCilindroRadio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtxfCilindroRadioKeyReleased(evt);
            }
        });

        jLabel2.setText("Altura (h) :");

        jtxfCilindroAltura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxfCilindroAlturaActionPerformed(evt);
            }
        });
        jtxfCilindroAltura.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtxfCilindroAlturaKeyReleased(evt);
            }
        });

        jbtnCilindroCalcular.setText("Calcular");
        jbtnCilindroCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCilindroCalcularActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtxfCilindroRadio, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                            .addComponent(jtxfCilindroAltura)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(jbtnCilindroCalcular)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtxfCilindroRadio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxfCilindroAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(jbtnCilindroCalcular)
                .addGap(20, 20, 20))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Resultados"));

        jLabel3.setText("Área de la base:");

        jLabel4.setText("Área lateral:");

        jLabel5.setText("Área Total:");

        jLabel6.setText("Volumen:");

        jlblCilindroAreaBase.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jlblClilindroAreaLateral.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jlblCilindroAreaTotal.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jlblCilindroVolumen.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jlblCilindroAreaBase, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                            .addComponent(jlblClilindroAreaLateral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(42, 42, 42)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlblCilindroAreaTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jlblCilindroVolumen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
                    .addComponent(jlblCilindroAreaBase, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(12, 12, 12)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jlblClilindroAreaLateral, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jlblCilindroAreaTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlblCilindroVolumen, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        jCilindro1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jCilindro1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(jCilindro1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Cilindro", jPanel1);

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos"));

        jLabel11.setText("Largo (l) :");

        jtxfPrismRectLargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxfPrismRectLargoActionPerformed(evt);
            }
        });
        jtxfPrismRectLargo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtxfPrismRectLargoKeyReleased(evt);
            }
        });

        jLabel12.setText("Ancho (a) :");

        jtxfPrismRectAncho.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtxfPrismRectAnchoKeyReleased(evt);
            }
        });

        jbtnPrisRectCalcular.setText("Calcular");
        jbtnPrisRectCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPrisRectCalcularActionPerformed(evt);
            }
        });

        jLabel7.setText("Altura (h) :");

        jtxfPrismRectAltura.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtxfPrismRectAlturaKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(jbtnPrisRectCalcular))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtxfPrismRectLargo, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                            .addComponent(jtxfPrismRectAncho)
                            .addComponent(jtxfPrismRectAltura))))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jtxfPrismRectLargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxfPrismRectAncho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jtxfPrismRectAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(jbtnPrisRectCalcular)
                .addContainerGap())
        );

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder("Resultados"));

        jLabel13.setText("Área de la base:");

        jLabel14.setText("Área lateral:");

        jLabel15.setText("Área Total:");

        jLabel16.setText("Volumen:");

        jlblPrismRectAreaBase.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jlblPrismRectAreaLateral.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jlblPrismRectAreaTotal.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jlblPrismRectVolumen.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jlblPrismRectAreaBase, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                            .addComponent(jlblPrismRectAreaLateral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addComponent(jLabel16))
                        .addGap(42, 42, 42)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlblPrismRectAreaTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jlblPrismRectVolumen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
                    .addComponent(jlblPrismRectAreaBase, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(12, 12, 12)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(jlblPrismRectAreaLateral, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addComponent(jlblPrismRectAreaTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlblPrismRectVolumen, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        jPrismaRectangular1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(jPrismaRectangular1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(36, 36, 36))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(jPrismaRectangular1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Prisma Rectangular", jPanel2);

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos"));

        jLabel21.setText("Cateto (a) :");

        jLabel22.setText("Cateto (b) :");

        jtxfPrismTriangCatetoB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxfPrismTriangCatetoBActionPerformed(evt);
            }
        });
        jtxfPrismTriangCatetoB.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtxfPrismTriangCatetoBKeyReleased(evt);
            }
        });

        jbtnPrismTriangCalcular.setText("Calcular");
        jbtnPrismTriangCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPrismTriangCalcularActionPerformed(evt);
            }
        });

        jLabel8.setText("Altura (h) :");

        jtxfPrismTriangAltura.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtxfPrismTriangAlturaKeyReleased(evt);
            }
        });

        jtxfPrismTriangCatetoA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxfPrismTriangCatetoAActionPerformed(evt);
            }
        });
        jtxfPrismTriangCatetoA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtxfPrismTriangCatetoAKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel22)
                            .addComponent(jLabel21)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtxfPrismTriangAltura)
                            .addComponent(jtxfPrismTriangCatetoB, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxfPrismTriangCatetoA)))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(jbtnPrismTriangCalcular)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(jtxfPrismTriangCatetoA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxfPrismTriangCatetoB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jtxfPrismTriangAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbtnPrismTriangCalcular)
                .addContainerGap())
        );

        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder("Resultados"));

        jLabel23.setText("Área de la base:");

        jLabel24.setText("Área lateral:");

        jLabel25.setText("Área Total:");

        jLabel26.setText("Volumen:");

        jlblPrismTriangAreaBase.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jlblPrismTriangAreaLateral.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jlblPrismTriangAreaTotal.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jlblPrismTriangVolumen.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel23)
                            .addComponent(jLabel24))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jlblPrismTriangAreaBase, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                            .addComponent(jlblPrismTriangAreaLateral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel25)
                            .addComponent(jLabel26))
                        .addGap(42, 42, 42)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlblPrismTriangAreaTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jlblPrismTriangVolumen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
                    .addComponent(jlblPrismTriangAreaBase, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(12, 12, 12)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel24)
                    .addComponent(jlblPrismTriangAreaLateral, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel25)
                    .addComponent(jlblPrismTriangAreaTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlblPrismTriangVolumen, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jPrismaTriangular1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(jPrismaTriangular1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Prisma Triangular", jPanel3);

        jMenu1.setText("Archivo");

        jmniArchivoSalir.setText("Salir");
        jmniArchivoSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniArchivoSalirActionPerformed(evt);
            }
        });
        jMenu1.add(jmniArchivoSalir);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edicion");

        jmniEdicionLimpiar.setText("Limpiar");
        jmniEdicionLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniEdicionLimpiarActionPerformed(evt);
            }
        });
        jMenu2.add(jmniEdicionLimpiar);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Ayuda");

        jmniAyudaAcercaDe.setText("Acerca de...");
        jmniAyudaAcercaDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniAyudaAcercaDeActionPerformed(evt);
            }
        });
        jMenu3.add(jmniAyudaAcercaDe);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 612, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //--------------------------------------------------------------------------
    
    private void jmniEdicionLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmniEdicionLimpiarActionPerformed
        
        jtxfCilindroRadio.setText ( null );
        jtxfCilindroAltura.setText ( null );
        
        jtxfPrismRectLargo.setText ( null );
        jtxfPrismRectAncho.setText ( null );
        jtxfPrismRectAltura.setText ( null );
        
        jtxfPrismTriangCatetoA.setText ( null );
        jtxfPrismTriangCatetoB.setText ( null );
        jtxfPrismTriangAltura.setText ( null );
        
        jlblCilindroAreaBase.setText ( null );
        jlblClilindroAreaLateral.setText ( null );
        jlblCilindroAreaTotal.setText ( null );
        jlblCilindroVolumen.setText( null );  
        
        jlblPrismRectAreaBase.setText ( null );
        jlblPrismRectAreaLateral.setText ( null );                                                   
        jlblPrismRectAreaTotal.setText ( null );
        jlblPrismRectVolumen.setText ( null );
        
        jlblPrismTriangAreaBase.setText ( null );
        jlblPrismTriangAreaLateral.setText ( null );                                                   
        jlblPrismTriangAreaTotal.setText ( null );
        jlblPrismTriangVolumen.setText ( null );
    }//GEN-LAST:event_jmniEdicionLimpiarActionPerformed

    //--------------------------------------------------------------------------
    
    private void jmniAyudaAcercaDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmniAyudaAcercaDeActionPerformed
        acercaDeDialog = new AcercaDeDialog( this, true );
        acercaDeDialog.setVisible( true );
        
    }//GEN-LAST:event_jmniAyudaAcercaDeActionPerformed

    //--------------------------------------------------------------------------
    
    private void jtxfCilindroRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxfCilindroRadioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxfCilindroRadioActionPerformed

    private void jtxfPrismRectLargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxfPrismRectLargoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxfPrismRectLargoActionPerformed

    //--------------------------------------------------------------------------
    
    private void jbtnPrisRectCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPrisRectCalcularActionPerformed
        try {
            float largo = Float.parseFloat (jtxfPrismRectLargo.getText() );
            float ancho = Float.parseFloat (jtxfPrismRectAncho.getText() );
            float altura = Float.parseFloat (jtxfPrismRectAltura.getText() );       
            PrismaRectangular pr = new PrismaRectangular ( largo, ancho, altura );
            if ( largo < 0 || ancho < 0 || altura < 0 ) 
                JOptionPane.showMessageDialog (
                    this, 
                    "Debe proporcionar un valor numérico positivo en todos los campos", 
                    "Error", 
                    JOptionPane.ERROR_MESSAGE
                );
            else {
                jlblPrismRectAreaBase.setText ( pr.areaBase() + "" );
                jlblPrismRectAreaLateral.setText ( pr.areaLateral()+ "" );                                                   
                jlblPrismRectAreaTotal.setText ( pr.areaTotal() + "" );
                jlblPrismRectVolumen.setText ( pr.volumen() + "" ); 
            }
            
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog (
                this, 
                "Debe proporcionar un valor numérico positivo en todos los campos", 
                "Error", 
                JOptionPane.ERROR_MESSAGE
            );
        }       
    }//GEN-LAST:event_jbtnPrisRectCalcularActionPerformed

    //--------------------------------------------------------------------------
    
    private void jbtnCilindroCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCilindroCalcularActionPerformed
        try {
            float radio = Float.parseFloat ( jtxfCilindroRadio.getText() );
            float altura = Float.parseFloat ( jtxfCilindroAltura.getText() );
            Cilindro cil = new Cilindro ( radio, altura );
            if ( radio < 0 || altura < 0 ) 
                JOptionPane.showMessageDialog (
                    this, 
                    "Debe proporcionar un valor numérico positivo en todos los campos", 
                    "Error", 
                    JOptionPane.ERROR_MESSAGE
                );           
            else {
                jlblCilindroAreaBase.setText ( cil.areaBase() + "" );
                jlblClilindroAreaLateral.setText ( cil.areaLateral() + "" );
                jlblCilindroAreaTotal.setText ( cil.areaTotal() + "" );
                jlblCilindroVolumen.setText( cil.volumen() + "" );   
            }
        } catch ( NumberFormatException exc ) {
            JOptionPane.showMessageDialog (
                this, 
                "Debe proporcionar un valor numérico positivo en todos los campos", 
                "Error", 
                JOptionPane.ERROR_MESSAGE
            );
        }
    }//GEN-LAST:event_jbtnCilindroCalcularActionPerformed

    //--------------------------------------------------------------------------
    
    private void jtxfCilindroAlturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxfCilindroAlturaActionPerformed
        
    }//GEN-LAST:event_jtxfCilindroAlturaActionPerformed

    //--------------------------------------------------------------------------
    
    private void jbtnPrismTriangCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPrismTriangCalcularActionPerformed
        try { 
            float cateto_a = Float.parseFloat ( jtxfPrismTriangCatetoA.getText() );
            float cateto_b = Float.parseFloat ( jtxfPrismTriangCatetoB.getText() );
            float altura = Float.parseFloat ( jtxfPrismTriangAltura.getText() );       
            PrismaTriangular pt = new PrismaTriangular ( cateto_a, cateto_b, altura );
            
            if ( cateto_a < 0 || cateto_b < 0 || altura < 0 ) 
                JOptionPane.showMessageDialog (
                    this, 
                    "Debe proporcionar un valor numérico positivo en todos los campos", 
                    "Error", 
                    JOptionPane.ERROR_MESSAGE
                );
            else {
                jlblPrismTriangAreaBase.setText ( pt.areaBase() + "" );
                jlblPrismTriangAreaLateral.setText ( pt.areaLateral() + "" );                                                   
                jlblPrismTriangAreaTotal.setText ( pt.areaTotal() + "" );
                jlblPrismTriangVolumen.setText ( pt.volumen() + "" );
            }
        } catch ( NumberFormatException exce ) {
            JOptionPane.showMessageDialog (
                this, 
                "Debe proporcionar un valor numérico positivo en todos los campos", 
                "Error", 
                JOptionPane.ERROR_MESSAGE
            );
        }
    }//GEN-LAST:event_jbtnPrismTriangCalcularActionPerformed

    
    
    
    private void jmniArchivoSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmniArchivoSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jmniArchivoSalirActionPerformed

    private void jtxfCilindroRadioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxfCilindroRadioKeyReleased
        try {
           float radio = Float.parseFloat ( jtxfCilindroRadio.getText() );
           jCilindro1.setRadio ( radio );
        } catch (NumberFormatException ex ) {
           jCilindro1.setRadio ( 0 );
        } 
        
    }//GEN-LAST:event_jtxfCilindroRadioKeyReleased

    private void jtxfCilindroAlturaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxfCilindroAlturaKeyReleased
        try {
            float altura = Float.parseFloat ( jtxfCilindroAltura.getText() );
            jCilindro1.setAltura ( altura );
        } catch (NumberFormatException ex ) {
            jCilindro1.setAltura ( 0 );
        }
    }//GEN-LAST:event_jtxfCilindroAlturaKeyReleased

    private void jtxfPrismRectLargoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxfPrismRectLargoKeyReleased
        try {
            float largo = Float.parseFloat (jtxfPrismRectLargo.getText() );
            jPrismaRectangular1.setLargo( largo);
        } catch (NumberFormatException ex ) {
            jPrismaRectangular1.setLargo ( 0 );
        }
    }//GEN-LAST:event_jtxfPrismRectLargoKeyReleased

    private void jtxfPrismRectAnchoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxfPrismRectAnchoKeyReleased
        try {
            float ancho = Float.parseFloat (jtxfPrismRectAncho.getText() );   
            jPrismaRectangular1.setAncho ( ancho );
        }  catch (NumberFormatException ex ) {
            jPrismaRectangular1.setAncho ( 0 );
        }
            
    }//GEN-LAST:event_jtxfPrismRectAnchoKeyReleased

    private void jtxfPrismRectAlturaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxfPrismRectAlturaKeyReleased
        try {
            float altura = Float.parseFloat (jtxfPrismRectAltura.getText() ); 
            jPrismaRectangular1.setAltura ( altura );
        } catch (NumberFormatException ex ) {
            jPrismaRectangular1.setAltura ( 0 );
        }
    }//GEN-LAST:event_jtxfPrismRectAlturaKeyReleased

    private void jtxfPrismTriangCatetoBKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxfPrismTriangCatetoBKeyReleased
        try {
            float cateto_b = Float.parseFloat ( jtxfPrismTriangCatetoB.getText() );
            jPrismaTriangular1.setCateto_b ( cateto_b);
        } catch (NumberFormatException ex ) {
            jPrismaTriangular1.setCateto_b ( 0 );
        }
            
    }//GEN-LAST:event_jtxfPrismTriangCatetoBKeyReleased

    private void jtxfPrismTriangAlturaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxfPrismTriangAlturaKeyReleased
        try {
            float altura = Float.parseFloat ( jtxfPrismTriangAltura.getText() );
            jPrismaTriangular1.setAltura(altura);
        } catch (NumberFormatException ex ) {
            jPrismaTriangular1.setAltura ( 0 );
        }
    }//GEN-LAST:event_jtxfPrismTriangAlturaKeyReleased

    private void jtxfPrismTriangCatetoBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxfPrismTriangCatetoBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxfPrismTriangCatetoBActionPerformed

    private void jtxfPrismTriangCatetoAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxfPrismTriangCatetoAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxfPrismTriangCatetoAActionPerformed

    private void jtxfPrismTriangCatetoAKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxfPrismTriangCatetoAKeyReleased
        try {
            float cateto_a = Float.parseFloat ( jtxfPrismTriangCatetoA.getText() );
            jPrismaTriangular1.setCateto_a ( cateto_a );
        } catch (NumberFormatException ex ) {
            jPrismaTriangular1.setCateto_a ( 0 );
        }
        
    }//GEN-LAST:event_jtxfPrismTriangCatetoAKeyReleased

    //--------------------------------------------------------------------------
    
    public static void main(String args[]) {
        
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
            java.util.logging.Logger.getLogger(PrismasFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrismasFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrismasFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrismasFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        ejecutar();
    }
    
    //--------------------------------------------------------------------------
    
    public static void ejecutar() {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrismasFrame().setVisible(true);
            }
        });
    }

    @Override
    public void valoresCilindro(JCilindroEvent evento) {
       float radio = evento.getNuevoRadio ();
       float altura = evento.getNuevaAltura ();
       jtxfCilindroRadio.setText ( Float.toString (radio) );
       jtxfCilindroAltura.setText ( Float.toString (altura) );
    }

    @Override
    public void valoresPrismaRectangular(JPrismaRectangularEvent evento) {
       float largo = evento.getNuevoLargo ();
       float ancho = evento.getNuevoAncho ();
       float altura = evento.getNuevaAltura ();
       jtxfPrismRectLargo.setText ( Float.toString ( largo ) );
       jtxfPrismRectAncho.setText ( Float.toString ( ancho ) );
       jtxfPrismRectAltura.setText ( Float.toString ( altura ) );
    }

    @Override
    public void valoresPrismaTriangular(JPrismaTriangularEvent evento) {
       float cateto_a = evento.getNuevoCatetoA ();
       float cateto_b = evento.getNuevoCatetoB ();
       float altura = evento.getNuevaAltura ();
       jtxfPrismTriangCatetoA.setText ( Float.toString ( cateto_a ) );
       jtxfPrismTriangCatetoB.setText ( Float.toString ( cateto_b ) );
       jtxfPrismTriangAltura.setText ( Float.toString ( altura ) );
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private mx.edu.itl.beans.JCilindro jCilindro1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private mx.edu.itl.beans.JPrismaRectangular jPrismaRectangular1;
    private mx.edu.itl.beans.JPrismaTriangular jPrismaTriangular1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton jbtnCilindroCalcular;
    private javax.swing.JButton jbtnPrisRectCalcular;
    private javax.swing.JButton jbtnPrismTriangCalcular;
    private javax.swing.JLabel jlblCilindroAreaBase;
    private javax.swing.JLabel jlblCilindroAreaTotal;
    private javax.swing.JLabel jlblCilindroVolumen;
    private javax.swing.JLabel jlblClilindroAreaLateral;
    private javax.swing.JLabel jlblPrismRectAreaBase;
    private javax.swing.JLabel jlblPrismRectAreaLateral;
    private javax.swing.JLabel jlblPrismRectAreaTotal;
    private javax.swing.JLabel jlblPrismRectVolumen;
    private javax.swing.JLabel jlblPrismTriangAreaBase;
    private javax.swing.JLabel jlblPrismTriangAreaLateral;
    private javax.swing.JLabel jlblPrismTriangAreaTotal;
    private javax.swing.JLabel jlblPrismTriangVolumen;
    private javax.swing.JMenuItem jmniArchivoSalir;
    private javax.swing.JMenuItem jmniAyudaAcercaDe;
    private javax.swing.JMenuItem jmniEdicionLimpiar;
    private javax.swing.JTextField jtxfCilindroAltura;
    private javax.swing.JTextField jtxfCilindroRadio;
    private javax.swing.JTextField jtxfPrismRectAltura;
    private javax.swing.JTextField jtxfPrismRectAncho;
    private javax.swing.JTextField jtxfPrismRectLargo;
    private javax.swing.JTextField jtxfPrismTriangAltura;
    private javax.swing.JTextField jtxfPrismTriangCatetoA;
    private javax.swing.JTextField jtxfPrismTriangCatetoB;
    // End of variables declaration//GEN-END:variables

    
}
