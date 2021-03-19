/*------------------------------------------------------------------------------------------
:*                       INSTITUTO TECNOLOGICO DE LA LAGUNA
:*                     INGENIERIA EN SISTEMAS COMPUTACIONALES
:*                       TOPICOS AVANZADOS DE PROGRAMACION "B"
:*
:*                   SEMESTRE: ENE-JUN/2020    HORA: 17-18 HRS
:*
:*           Aplicación GUI para el entorno de un Sistema de Negocios
:*        
:*  Archivo     : PrincipalFrame.java
:*  Autor       : José Misael Adame Sandoval     18131209
:*                Ricardo Raúl Castro Luna       18131227
:*                Jorge Arturo Galindo Uribe     18131238
:*  Fecha       : 24/May/2020
:*  Compilador  : JAVA J2SE v1.8.0
:*  Descripción : Aplicación que realiza funciones para modificar la base de datos de un  
:*                Sistema de Negocios como Agregar, Editar, Eliminar un registro de 
:*                las tablas, como también consultar información específica de las tablas
:*                mediante un filtrado, además despliega reportes de una tabla ya sea Fabricantes, 
                  Distribuidores o Productos y estos pueden ser exportados a Word o PDF.
:*                
:*                     
:*                
:*  Ultima modif:
:*  Fecha       Modificó             Motivo
:*========================================================================================== 
:*  24/May/2020 Misael Adame         Agregar prólogo.
:*------------------------------------------------------------------------------------------*/
package app;

import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.text.DecimalFormat;
import java.util.Properties;
import java.util.Vector;
import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Modelo1;
import modelo.Modelo2;
import modelo.Modelo3;
import mx.edu.itl.jdbc.*;
import mx.edu.itl.util.Imagenes;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

public class PrincipalFrame extends javax.swing.JFrame {

    //----------------------------------------------------------------------------------------
    
    public static final String NUEVO = "Nuevo";
    public static final String EDITAR = "Editar";

    public static final String TIT_FRAME = "Sistema de Negocios";
    public static final String TIT_INICIO = "TecLag Software";
    public static final String TIT_MODULO1 = "Fabricante";
    public static final String TIT_MODULO2 = "Distribuidor";
    public static final String TIT_MODULO3 = "Producto";

    //----------------------------------------------------------------------------------------
    
    public static final String FABRICA_TODOS_POR_NOMBRE = "fabricante_todos_por_nombre";
    public static final String FABRICA_TODOS_SIN_ORDEN = "fabricante_todos_sin_orden";
    public static final String FABRICA_ELIMINAR_X_IDFABRICANTE = "fabricante_eliminar_x_idfabricante";
    public static final String FABRICA_ACTUALIZA_DATOS = "fabricante_actualiza_datos";
    public static final String FABRICA_INSERTA_NUEVO = "fabricante_inserta_nuevo";


    //----------------------------------------------------------------------------------------
    
    public static final String DISTRIBUIDOR_TODOS_POR_NOMBRE = "distribuidor_todos_por_nombre";
    public static final String DISTRIBUIDOR_TODOS_SIN_ORDEN = "distribuidor_todos_sin_orden";
    public static final String DISTRIBUIDOR_ELIMINAR_X_IDDISTRIBUIDOR = "distribuidor_eliminar_x_iddistribuidor";
    public static final String DISTRIBUIDOR_ACTUALIZA_DATOS = "distribuidor_actualiza_datos";
    public static final String DISTRIBUIDOR_INSERTA_NUEVO = "distribuidor_inserta_nuevo";


    //----------------------------------------------------------------------------------------
    
    public static final String PRODUCTO_TODOS_POR_IDFABRICANTE = "producto_todos_por_idfabricante";
    public static final String PRODUCTO_TODOS_SIN_ORDEN = "producto_todos_sin_orden";
    public static final String PRODUCTO_ELIMINAR_X_IDPRODUCTO = "producto_eliminar_x_idproducto";
    public static final String PRODUCTO_ACTUALIZA_DATOS = "producto_actualiza_datos";
    public static final String PRODUCTO_INSERTA_NUEVO = "producto_inserta_nuevo";

    //----------------------------------------------------------------------------------------
    
    private AcercaDeDialog acercaDeDialog;

    private String moduloActual;
    private Vector<String> vecNombresColumnas;
    private Vector<String> vecNombresColumnasBD;
    private Vector<String> vecTiposColumnas;
    private DefaultTableModel dtmPrincipal;
    private Properties propConsultasSQL;
    private int totRegistros;

    //----------------------------------------------------------------------------------------
    // Constructor
    public PrincipalFrame () {
        initComponents ();

        this.setTitle ( TIT_FRAME );
        jlblMensajeDelSistema.setText ( "" );
        jtoolbPrincipal.setVisible ( false );
        jpnlTabla.setVisible ( false );
        jpnlLogoPrincipal.setVisible ( true );
        jlblLeyendaPrincipal.setText ( TIT_INICIO );
        jlblModulo1.setText ( TIT_MODULO1 );
        jlblModulo2.setText ( TIT_MODULO2 );
        jlblModulo3.setText ( TIT_MODULO3 );
        jmniReportesModulo1.setText ( TIT_MODULO1 );
        jmniReportesModulo2.setText ( TIT_MODULO2 );
        jmniReportesModulo3.setText ( TIT_MODULO3 );

        //Ajustar el tamaño de las imagenes
        Icon fabrica = Imagenes.escalarImagen ( jbtnModulo1.getIcon (),
                jbtnModulo1.getWidth (),
                jbtnModulo1.getHeight () );

        jbtnModulo1.setIcon ( fabrica );

        Icon distri = Imagenes.escalarImagen ( jbtnModulo2.getIcon (),
                jbtnModulo2.getWidth (),
                jbtnModulo2.getHeight () );

        jbtnModulo2.setIcon ( distri );

        Icon prod = Imagenes.escalarImagen ( jbtnModulo3.getIcon (),
                jbtnModulo3.getWidth (),
                jbtnModulo3.getHeight () );

        jbtnModulo3.setIcon ( prod );

        prepararSentenciasSQL ();

        new ConexionDBFrame ( this ).setVisible ( true );
    }

    //----------------------------------------------------------------------------------------
    
    private void prepararSentenciasSQL () {
        propConsultasSQL = new Properties ();

        propConsultasSQL.put ( FABRICA_TODOS_POR_NOMBRE,
                "SELECT * FROM Fabricante ORDER BY Nombre_Fabricante"
        );

        propConsultasSQL.put ( FABRICA_TODOS_SIN_ORDEN,
                "SELECT * FROM Fabricante"
        );
        propConsultasSQL.put ( FABRICA_ELIMINAR_X_IDFABRICANTE,
                "DELETE FROM Fabricante WHERE Id_Fabricante = ?"
        );
        propConsultasSQL.put ( FABRICA_ACTUALIZA_DATOS,
                "UPDATE Fabricante SET Nombre_Fabricante = ?, Direccion_Fabricante=?, Presidente_Fabricante=? WHERE Id_Fabricante = ?"
        );
        propConsultasSQL.put ( FABRICA_INSERTA_NUEVO,
                "INSERT INTO Fabricante (Nombre_Fabricante, Direccion_Fabricante, Presidente_Fabricante) " +
                " VALUES (?, ?, ?)"
        );
        
        //----------------------------------------------------------------------------------------
      
        propConsultasSQL.put ( DISTRIBUIDOR_TODOS_POR_NOMBRE,
                "SELECT * FROM Distribuidor ORDER BY Nombre_Distribuidor"
        ); 
        propConsultasSQL.put ( DISTRIBUIDOR_TODOS_SIN_ORDEN,
                "SELECT * FROM Distribuidor"
        );
        propConsultasSQL.put ( DISTRIBUIDOR_ELIMINAR_X_IDDISTRIBUIDOR,
                "DELETE FROM Distribuidor WHERE Id_Distribuidor = ?"
        );
        propConsultasSQL.put ( DISTRIBUIDOR_ACTUALIZA_DATOS,
               " UPDATE Distribuidor SET Nombre_Distribuidor = ?, Direccion_Distribuidor=?, Tipo_Transporte=? WHERE Id_Distribuidor = ?"
        );
        propConsultasSQL.put ( DISTRIBUIDOR_INSERTA_NUEVO,
                "INSERT INTO Distribuidor (Nombre_Distribuidor, Direccion_Distribuidor, Tipo_Transporte) VALUES (?, ?, ?)"
        );
        
        //----------------------------------------------------------------------------------------
        
        propConsultasSQL.put ( PRODUCTO_TODOS_POR_IDFABRICANTE,
                "SELECT P.Id_Producto, P.Id_Fabricante, F.Nombre_Fabricante,  "
                        
                + "P.Id_Distribuidor, D.Nombre_Distribuidor, P.Modelo_Producto, P.Precio_Producto "
                        
                + "FROM Producto P, Fabricante  F, Distribuidor D "
                        
                + "WHERE P.Id_Fabricante = F.Id_Fabricante AND P.Id_Distribuidor = D.Id_Distribuidor "
                        
                + "ORDER BY P.Id_Fabricante"
        );
        propConsultasSQL.put ( PRODUCTO_TODOS_SIN_ORDEN,
                "SELECT P.Id_Producto, P.Id_Fabricante, F.Nombre_Fabricante,  "
                        
                + "P.Id_Distribuidor, D.Nombre_Distribuidor, P.Modelo_Producto, P.Precio_Producto "
                        
                + "FROM Producto P JOIN Fabricante F ON P.Id_Fabricante = F.Id_Fabricante "
                        
                + "JOIN Distribuidor D ON P.Id_Distribuidor = D.Id_Distribuidor "
        );
        propConsultasSQL.put ( PRODUCTO_ELIMINAR_X_IDPRODUCTO,
                "DELETE FROM Producto WHERE Id_Producto = ?"
        );
        propConsultasSQL.put ( PRODUCTO_ACTUALIZA_DATOS,
                "UPDATE Producto SET Id_Fabricante = ?, Id_Distribuidor= ?, Modelo_Producto= ?, Precio_Producto= ?  WHERE Id_Producto = ?"
        );
        
        propConsultasSQL.put ( PRODUCTO_INSERTA_NUEVO,
                "INSERT INTO Producto (Id_Fabricante, Id_Distribuidor, Modelo_Producto, Precio_Producto) VALUES (?, ?, ?, ?)"
        );   
    }

    //----------------------------------------------------------------------------------------
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jtoolbPrincipal = new javax.swing.JToolBar();
        jbtnNuevo = new javax.swing.JButton();
        jbtnEditar = new javax.swing.JButton();
        jbtnEliminar = new javax.swing.JButton();
        jbtnInicio = new javax.swing.JButton();
        jbtnFiltrar = new javax.swing.JButton();
        jpnlBarraDeEstado = new javax.swing.JPanel();
        jtoolbEstatus = new javax.swing.JToolBar();
        jLabel1 = new javax.swing.JLabel();
        jlblEstatusConexion = new javax.swing.JLabel();
        jtoolbMensajes = new javax.swing.JToolBar();
        jlblMensajeDelSistema = new javax.swing.JLabel();
        jscrollBarraBotones = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jbtnModulo1 = new javax.swing.JButton();
        jlblModulo1 = new javax.swing.JLabel();
        jlblModulo2 = new javax.swing.JLabel();
        jbtnModulo2 = new javax.swing.JButton();
        jlblModulo3 = new javax.swing.JLabel();
        jbtnModulo3 = new javax.swing.JButton();
        jpnlLeyendaPrincipal = new javax.swing.JPanel();
        jlblLeyendaPrincipal = new javax.swing.JLabel();
        jpnlTabla = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtblPrincipal = new javax.swing.JTable();
        jpnlLogoPrincipal = new javax.swing.JPanel();
        jlblLogoSistema = new javax.swing.JLabel();
        jmbPrincipal = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jmniSalir = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jmniReportesModulo1 = new javax.swing.JMenuItem();
        jmniReportesModulo2 = new javax.swing.JMenuItem();
        jmniReportesModulo3 = new javax.swing.JMenuItem();
        jmAyuda = new javax.swing.JMenu();
        jmniAcercaDe = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setExtendedState(6);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jtoolbPrincipal.setFloatable(false);
        jtoolbPrincipal.setRollover(true);

        jbtnNuevo.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        jbtnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icon_Nuevo.png"))); // NOI18N
        jbtnNuevo.setText("Nuevo");
        jbtnNuevo.setToolTipText("Nuevo");
        jbtnNuevo.setFocusable(false);
        jbtnNuevo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtnNuevo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbtnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnNuevoActionPerformed(evt);
            }
        });
        jtoolbPrincipal.add(jbtnNuevo);

        jbtnEditar.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        jbtnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icon_Editar.png"))); // NOI18N
        jbtnEditar.setText("Editar");
        jbtnEditar.setToolTipText("Editar");
        jbtnEditar.setFocusable(false);
        jbtnEditar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtnEditar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbtnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnEditarActionPerformed(evt);
            }
        });
        jtoolbPrincipal.add(jbtnEditar);

        jbtnEliminar.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        jbtnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icon_Eliminar.png"))); // NOI18N
        jbtnEliminar.setText("Eliminar");
        jbtnEliminar.setToolTipText("Eliminar");
        jbtnEliminar.setFocusable(false);
        jbtnEliminar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtnEliminar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbtnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnEliminarActionPerformed(evt);
            }
        });
        jtoolbPrincipal.add(jbtnEliminar);

        jbtnInicio.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        jbtnInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icon_Inicio.png"))); // NOI18N
        jbtnInicio.setText("Inicio");
        jbtnInicio.setToolTipText("Inicio");
        jbtnInicio.setFocusable(false);
        jbtnInicio.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtnInicio.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbtnInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnInicioActionPerformed(evt);
            }
        });
        jtoolbPrincipal.add(jbtnInicio);

        jbtnFiltrar.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        jbtnFiltrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icon_Filtrar.png"))); // NOI18N
        jbtnFiltrar.setText("Filtrar");
        jbtnFiltrar.setToolTipText("Filtrar");
        jbtnFiltrar.setFocusable(false);
        jbtnFiltrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtnFiltrar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbtnFiltrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnFiltrarActionPerformed(evt);
            }
        });
        jtoolbPrincipal.add(jbtnFiltrar);

        jtoolbEstatus.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jtoolbEstatus.setFloatable(false);
        jtoolbEstatus.setRollover(true);

        jLabel1.setText("Estatus de la conexión: ");
        jtoolbEstatus.add(jLabel1);

        jlblEstatusConexion.setText("<estatus>");
        jtoolbEstatus.add(jlblEstatusConexion);

        jtoolbMensajes.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jtoolbMensajes.setFloatable(false);
        jtoolbMensajes.setRollover(true);

        jlblMensajeDelSistema.setText("<mensajes>");
        jtoolbMensajes.add(jlblMensajeDelSistema);

        javax.swing.GroupLayout jpnlBarraDeEstadoLayout = new javax.swing.GroupLayout(jpnlBarraDeEstado);
        jpnlBarraDeEstado.setLayout(jpnlBarraDeEstadoLayout);
        jpnlBarraDeEstadoLayout.setHorizontalGroup(
            jpnlBarraDeEstadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnlBarraDeEstadoLayout.createSequentialGroup()
                .addComponent(jtoolbEstatus, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jtoolbMensajes, javax.swing.GroupLayout.DEFAULT_SIZE, 391, Short.MAX_VALUE))
        );
        jpnlBarraDeEstadoLayout.setVerticalGroup(
            jpnlBarraDeEstadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnlBarraDeEstadoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jpnlBarraDeEstadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtoolbEstatus, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtoolbMensajes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jbtnModulo1.setBackground(new java.awt.Color(255, 255, 255));
        jbtnModulo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/img-fabricante.png"))); // NOI18N
        jbtnModulo1.setToolTipText("");
        jbtnModulo1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jbtnModulo1.setOpaque(false);
        jbtnModulo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnModulo1ActionPerformed(evt);
            }
        });

        jlblModulo1.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        jlblModulo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblModulo1.setText("Modulo 1");

        jlblModulo2.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        jlblModulo2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblModulo2.setText("Modulo 2");

        jbtnModulo2.setBackground(new java.awt.Color(255, 255, 255));
        jbtnModulo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/img_distribuidor.jpg"))); // NOI18N
        jbtnModulo2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jbtnModulo2.setOpaque(false);
        jbtnModulo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnModulo2ActionPerformed(evt);
            }
        });

        jlblModulo3.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        jlblModulo3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblModulo3.setText("Modulo 3");

        jbtnModulo3.setBackground(new java.awt.Color(255, 255, 255));
        jbtnModulo3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/img_hardware.png"))); // NOI18N
        jbtnModulo3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jbtnModulo3.setOpaque(false);
        jbtnModulo3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnModulo3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jbtnModulo1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlblModulo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlblModulo2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlblModulo3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbtnModulo2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jbtnModulo3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jbtnModulo1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlblModulo1)
                .addGap(29, 29, 29)
                .addComponent(jbtnModulo2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlblModulo2)
                .addGap(36, 36, 36)
                .addComponent(jbtnModulo3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlblModulo3)
                .addContainerGap(302, Short.MAX_VALUE))
        );

        jscrollBarraBotones.setViewportView(jPanel2);

        jpnlLeyendaPrincipal.setBackground(new java.awt.Color(0, 0, 0));

        jlblLeyendaPrincipal.setFont(new java.awt.Font("Gill Sans MT", 0, 24)); // NOI18N
        jlblLeyendaPrincipal.setForeground(new java.awt.Color(255, 255, 255));
        jlblLeyendaPrincipal.setText("Modulo");

        javax.swing.GroupLayout jpnlLeyendaPrincipalLayout = new javax.swing.GroupLayout(jpnlLeyendaPrincipal);
        jpnlLeyendaPrincipal.setLayout(jpnlLeyendaPrincipalLayout);
        jpnlLeyendaPrincipalLayout.setHorizontalGroup(
            jpnlLeyendaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnlLeyendaPrincipalLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jlblLeyendaPrincipal)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpnlLeyendaPrincipalLayout.setVerticalGroup(
            jpnlLeyendaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnlLeyendaPrincipalLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jlblLeyendaPrincipal)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jpnlTabla.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jtblPrincipal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtblPrincipal);

        javax.swing.GroupLayout jpnlTablaLayout = new javax.swing.GroupLayout(jpnlTabla);
        jpnlTabla.setLayout(jpnlTablaLayout);
        jpnlTablaLayout.setHorizontalGroup(
            jpnlTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jpnlTablaLayout.setVerticalGroup(
            jpnlTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        jlblLogoSistema.setBackground(new java.awt.Color(255, 255, 255));
        jlblLogoSistema.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblLogoSistema.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/img_Inicio.png"))); // NOI18N
        jlblLogoSistema.setOpaque(true);

        javax.swing.GroupLayout jpnlLogoPrincipalLayout = new javax.swing.GroupLayout(jpnlLogoPrincipal);
        jpnlLogoPrincipal.setLayout(jpnlLogoPrincipalLayout);
        jpnlLogoPrincipalLayout.setHorizontalGroup(
            jpnlLogoPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlblLogoSistema, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jpnlLogoPrincipalLayout.setVerticalGroup(
            jpnlLogoPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlblLogoSistema, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jMenu1.setText("Archivo");

        jmniSalir.setText("Salir");
        jmniSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniSalirActionPerformed(evt);
            }
        });
        jMenu1.add(jmniSalir);

        jmbPrincipal.add(jMenu1);

        jMenu2.setText("Herramientas");

        jMenu3.setText("Reportes");

        jmniReportesModulo1.setText("Modulo1");
        jmniReportesModulo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniReportesModulo1ActionPerformed(evt);
            }
        });
        jMenu3.add(jmniReportesModulo1);

        jmniReportesModulo2.setText("Modulo2");
        jmniReportesModulo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniReportesModulo2ActionPerformed(evt);
            }
        });
        jMenu3.add(jmniReportesModulo2);

        jmniReportesModulo3.setText("Modulo3");
        jmniReportesModulo3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniReportesModulo3ActionPerformed(evt);
            }
        });
        jMenu3.add(jmniReportesModulo3);

        jMenu2.add(jMenu3);

        jmbPrincipal.add(jMenu2);

        jmAyuda.setText("Ayuda");

        jmniAcercaDe.setText("Acerca de..");
        jmniAcercaDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniAcercaDeActionPerformed(evt);
            }
        });
        jmAyuda.add(jmniAcercaDe);

        jmbPrincipal.add(jmAyuda);

        setJMenuBar(jmbPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jtoolbPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpnlBarraDeEstado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jscrollBarraBotones, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpnlLeyendaPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpnlTabla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpnlLogoPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jtoolbPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jscrollBarraBotones, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jpnlLeyendaPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jpnlTabla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jpnlLogoPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jpnlBarraDeEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //----------------------------------------------------------------------------------------

    private void jbtnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnNuevoActionPerformed
        if ( moduloActual.equals ( TIT_MODULO1 ) ) {
            Modulo1EditarDialog dialog = new Modulo1EditarDialog ( this, null );
            dialog.setVisible ( true );

        } else if ( moduloActual.equals ( TIT_MODULO2 ) ) {
            Modulo2EditarDialog dialog = new Modulo2EditarDialog ( this, null );
            dialog.setVisible ( true );
        } else if ( moduloActual.equals ( TIT_MODULO3 ) ) {
            Modulo3EditarDialog dialog = new Modulo3EditarDialog ( this, null );
            dialog.setVisible ( true );
        }
    }//GEN-LAST:event_jbtnNuevoActionPerformed

    //----------------------------------------------------------------------------------------

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        if ( ConexionDB.getInstancia ().conectado () ) {
            jlblEstatusConexion.setText ( "Conectado" );
            jlblEstatusConexion.setForeground ( Color.blue );
        } else {
            jlblEstatusConexion.setText ( "Desconectado" );
            jlblEstatusConexion.setForeground ( Color.red );
        }
    }//GEN-LAST:event_formWindowActivated

    //----------------------------------------------------------------------------------------

    private void jmniSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmniSalirActionPerformed
        ConexionDB.getInstancia ().desconectar ();
        dispose ();
    }//GEN-LAST:event_jmniSalirActionPerformed

    //----------------------------------------------------------------------------------------

    private void jbtnModulo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnModulo1ActionPerformed
        prepararVistaModulo ( TIT_MODULO1 );

        String sql = propConsultasSQL.getProperty ( FABRICA_TODOS_POR_NOMBRE );
        desplegarRegistros ( sql, null );
    }//GEN-LAST:event_jbtnModulo1ActionPerformed

    //----------------------------------------------------------------------------------------

    private void jbtnModulo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnModulo2ActionPerformed
        prepararVistaModulo ( TIT_MODULO2 );

        String sql = propConsultasSQL.getProperty ( DISTRIBUIDOR_TODOS_POR_NOMBRE );
        desplegarRegistros ( sql, null );

    }//GEN-LAST:event_jbtnModulo2ActionPerformed

    //----------------------------------------------------------------------------------------

    private void jbtnModulo3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnModulo3ActionPerformed
        prepararVistaModulo ( TIT_MODULO3 );

        String sql = propConsultasSQL.getProperty ( PRODUCTO_TODOS_POR_IDFABRICANTE );
        desplegarRegistros ( sql, null );
    }//GEN-LAST:event_jbtnModulo3ActionPerformed

    //----------------------------------------------------------------------------------------

    private void jbtnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnInicioActionPerformed
        jtoolbPrincipal.setVisible ( false );
        jpnlLogoPrincipal.setVisible ( true );
        jpnlTabla.setVisible ( false );

        jlblLeyendaPrincipal.setText ( TIT_INICIO );
        moduloActual = "";
    }//GEN-LAST:event_jbtnInicioActionPerformed

    //----------------------------------------------------------------------------------------

    private void jbtnFiltrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnFiltrarActionPerformed
        FiltrarDialog filtrarDialog = new FiltrarDialog ( this, true );
        filtrarDialog.setVisible ( true );
    }//GEN-LAST:event_jbtnFiltrarActionPerformed

    //----------------------------------------------------------------------------------------

    private void jbtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnEliminarActionPerformed
        int pos = jtblPrincipal.getSelectedRow ();
        if ( pos == -1 ) {
            JOptionPane.showMessageDialog (
                    this, "No hay un registro seleccionado", "Eliminar", JOptionPane.ERROR_MESSAGE );
            return;
        }
        int confirma = JOptionPane.showConfirmDialog (
                this,
                "¿Eliminar el registro seleccionado?",
                "Eliminar",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE );

        if ( confirma == JOptionPane.NO_OPTION ) {
            return;
        }

        String valorLlavePrim = jtblPrincipal.getValueAt ( pos, 0 ).toString ();
        String tipoLlavePrim = vecTiposColumnas.elementAt ( 0 );
        String sql = "";
        JButton jbtnModulo = null;

        switch ( moduloActual ) {
            case TIT_MODULO1:
                sql = propConsultasSQL.getProperty ( FABRICA_ELIMINAR_X_IDFABRICANTE );
                jbtnModulo = jbtnModulo1;
                break;
            case TIT_MODULO2:
                sql = propConsultasSQL.getProperty ( DISTRIBUIDOR_ELIMINAR_X_IDDISTRIBUIDOR );
                jbtnModulo = jbtnModulo2;
                break;
            case TIT_MODULO3:
                sql = propConsultasSQL.getProperty ( PRODUCTO_ELIMINAR_X_IDPRODUCTO );
                jbtnModulo = jbtnModulo3;
                break;
        }

        Object[][] args = { { tipoLlavePrim, valorLlavePrim } };
        try {
            int regs = EjecutorSQL.sqlEjecutar ( sql, args );
            if ( regs == 1 ) {
                jbtnModulo.doClick ();
                JOptionPane.showMessageDialog (
                        this, "El registro ha sido eliminado", "Eliminar",
                        JOptionPane.INFORMATION_MESSAGE );
            }
        } catch ( SQLIntegrityConstraintViolationException ex ) {
            JOptionPane.showMessageDialog(
                    this,
                    "No se puede eliminar el registro actual porque tiene "
                    + "registros asociados en otras tablas",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
        } catch ( SQLException ex ) {
            JOptionPane.showMessageDialog (
                    this, ex, "Error", JOptionPane.ERROR_MESSAGE );
        }
    }//GEN-LAST:event_jbtnEliminarActionPerformed

    //----------------------------------------------------------------------------------------

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        jmniSalir.doClick ();
    }//GEN-LAST:event_formWindowClosing

    //----------------------------------------------------------------------------------------

    private void jbtnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnEditarActionPerformed
        int pos = jtblPrincipal.getSelectedRow ();
        if ( pos == -1 ) {
            JOptionPane.showMessageDialog (
                    this, "No hay un registro seleccionado", "Eliminar", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if ( moduloActual.equals ( TIT_MODULO1 ) ) {

            int id_Fabricante = Integer.parseInt ( jtblPrincipal.getValueAt ( pos, 0 ).toString () );
            String nombre_Fabricante= jtblPrincipal.getValueAt ( pos, 1 ).toString ();
            String direccion_Fabricante = jtblPrincipal.getValueAt ( pos, 2 ).toString ();
            String presidente_Fabricante = jtblPrincipal.getValueAt ( pos, 3 ).toString ();
            
            Modelo1 modelo1 = new Modelo1 ( id_Fabricante, nombre_Fabricante, direccion_Fabricante, presidente_Fabricante );
            
            Modulo1EditarDialog dialog = new Modulo1EditarDialog ( this, modelo1 );
            dialog.setVisible ( true );

        } else if ( moduloActual.equals ( TIT_MODULO2 ) ) {
            
            int id_Distribuidor = Integer.parseInt ( jtblPrincipal.getValueAt ( pos, 0 ).toString () );
            String nombre_Distribuidor= jtblPrincipal.getValueAt( pos, 1 ).toString ();
            String direccion_Distribuidor = jtblPrincipal.getValueAt ( pos, 2 ).toString ();
            String tipo_Transporte = jtblPrincipal.getValueAt ( pos, 3 ).toString ();
            
            Modelo2 modelo2 = new Modelo2 ( id_Distribuidor, nombre_Distribuidor, direccion_Distribuidor, tipo_Transporte );
            
            Modulo2EditarDialog dialog = new Modulo2EditarDialog ( this, modelo2 );
           
            dialog.setVisible ( true );

        } else if ( moduloActual.equals ( TIT_MODULO3 ) ) {
            
            int id_Producto = Integer.parseInt ( jtblPrincipal.getValueAt ( pos, 0 ).toString () );
            int id_Fabricante = Integer.parseInt ( jtblPrincipal.getValueAt ( pos, 1).toString () );
            int id_Distribuidor = Integer.parseInt ( jtblPrincipal.getValueAt ( pos, 3 ).toString () );
            String Modelo_Producto = jtblPrincipal.getValueAt ( pos, 5 ).toString ();
            double precio_Producto = Double.parseDouble ( jtblPrincipal.getValueAt ( pos, 6 ).toString () );

            Modelo3 modelo = new Modelo3 ( id_Producto, id_Fabricante, id_Distribuidor, Modelo_Producto, precio_Producto );

            Modulo3EditarDialog dialog = new Modulo3EditarDialog ( this, modelo );
            dialog.setVisible ( true );
        }

    }//GEN-LAST:event_jbtnEditarActionPerformed

    //----------------------------------------------------------------------------------------

    private void jmniAcercaDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmniAcercaDeActionPerformed
        acercaDeDialog = new AcercaDeDialog ( this, true );
        acercaDeDialog.setVisible ( true );
    }//GEN-LAST:event_jmniAcercaDeActionPerformed

    //----------------------------------------------------------------------------------------

    private void jmniReportesModulo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmniReportesModulo1ActionPerformed
        String reporte = "src\\reportes\\FabricantesReport.jrxml";
        JasperReport jr;
        try {
            jr = JasperCompileManager.compileReport ( reporte );
            JasperPrint jp = JasperFillManager.fillReport ( jr, null, ConexionDB.getInstancia ().getConexion () );
            JasperViewer jv = new JasperViewer ( jp, false );
            jv.setTitle ( "Reporte Fabricantes" );
            jv.setVisible ( true );
        } catch ( JRException ex ) {
            JOptionPane.showMessageDialog ( this,
                    ex, "Error", JOptionPane.ERROR_MESSAGE );
        }
    }//GEN-LAST:event_jmniReportesModulo1ActionPerformed

    //----------------------------------------------------------------------------------------

    private void jmniReportesModulo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmniReportesModulo2ActionPerformed
        String reporte = "src\\reportes\\DistribuidoresReport.jrxml";
        JasperReport jr;
        try {
            jr = JasperCompileManager.compileReport ( reporte );
            JasperPrint jp = JasperFillManager.fillReport ( jr, null, ConexionDB.getInstancia ().getConexion () );
            JasperViewer jv = new JasperViewer ( jp, false );
            jv.setTitle ( "Reporte Distribuidor" );
            jv.setVisible ( true );
        } catch ( JRException ex ) {
            JOptionPane.showMessageDialog ( this,
                    ex, "Error", JOptionPane.ERROR_MESSAGE );
        }
    }//GEN-LAST:event_jmniReportesModulo2ActionPerformed

    //----------------------------------------------------------------------------------------

    private void jmniReportesModulo3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmniReportesModulo3ActionPerformed
       SeleccionFabricanteDialog sfd = new SeleccionFabricanteDialog ( this, true );
       sfd.setVisible ( true );
        /*String reporte = "src\\reportes\\ProductosReport.jrxml";
        JasperReport jr;
        try {
            jr = JasperCompileManager.compileReport ( reporte );
            JasperPrint jp = JasperFillManager.fillReport ( jr, null, ConexionDB.getInstancia ().getConexion () );
            JasperViewer jv = new JasperViewer ( jp, false );
            jv.setTitle ( "Reporte Producto" );
            jv.setVisible ( true );
        } catch ( JRException ex ) {
            JOptionPane.showMessageDialog ( this,
                    ex, "Error", JOptionPane.ERROR_MESSAGE );
        }*/
    }//GEN-LAST:event_jmniReportesModulo3ActionPerformed

    //----------------------------------------------------------------------------------------
    
    private void prepararVistaModulo ( String modulo ) {
        moduloActual = modulo;
        jtoolbPrincipal.setVisible ( true );
        jpnlLogoPrincipal.setVisible ( false );
        jpnlTabla.setVisible ( true );

        jlblLeyendaPrincipal.setText ( modulo );
        determinarNombresColumnas ( modulo );

        dtmPrincipal = new DefaultTableModel ( vecNombresColumnas, 0 );
        jtblPrincipal.setModel ( dtmPrincipal );
    }

    //----------------------------------------------------------------------------------------
    
    private void determinarNombresColumnas ( String modulo ) {
        vecNombresColumnas = new Vector<String>();
        vecNombresColumnasBD = new Vector<String>();
        vecTiposColumnas = new Vector<String>();

        switch ( modulo ) {
            case TIT_MODULO1:
                vecNombresColumnas.add ( "ID" );
                vecNombresColumnas.add ( "Nombre" );
                vecNombresColumnas.add ( "Direccion" );
                vecNombresColumnas.add ( "Presidente" );

                vecNombresColumnasBD.add( "Id_Fabricante" );
                vecNombresColumnasBD.add( "Nombre_Fabricante" );
                vecNombresColumnasBD.add( "Direccion_Fabricante" );
                vecNombresColumnasBD.add( "Presidente_Fabricante" );
           

                vecTiposColumnas.add ( EjecutorSQL.INT );
                vecTiposColumnas.add ( EjecutorSQL.STRING );
                vecTiposColumnas.add ( EjecutorSQL.STRING );
                vecTiposColumnas.add ( EjecutorSQL.STRING );
               

                break;
            case TIT_MODULO2:
                vecNombresColumnas.add ( "ID" );
                vecNombresColumnas.add ( "Nombre" );
                vecNombresColumnas.add ( "Direccion" );
                vecNombresColumnas.add ( "Tipo de transporte" );

                vecNombresColumnasBD.add ( "Id_Distribuidor" );
                vecNombresColumnasBD.add ( "Nombre_Distribuidor" );
                vecNombresColumnasBD.add ( "Direccion_Distribuidor" );
                vecNombresColumnasBD.add ( "Tipo_Transporte" );
           

                vecTiposColumnas.add ( EjecutorSQL.INT );
                vecTiposColumnas.add ( EjecutorSQL.STRING );
                vecTiposColumnas.add ( EjecutorSQL.STRING );
                vecTiposColumnas.add ( EjecutorSQL.STRING );

                break;
            case TIT_MODULO3:
                vecNombresColumnas.add ( "ID Producto" );
                vecNombresColumnas.add ( "ID Fabricante" );
                vecNombresColumnas.add ( "Fabricante" );
                vecNombresColumnas.add ( "ID Distribuidor" );
                vecNombresColumnas.add ( "Distribuidor" );
                vecNombresColumnas.add ( "Modelo" );
                vecNombresColumnas.add ( "Precio" );

                vecNombresColumnasBD.add ( "Id_Producto" );//0
                vecNombresColumnasBD.add ( "Id_Fabricante" );//1
                vecNombresColumnasBD.add ( "Nombre_Fabricante" );//2
                vecNombresColumnasBD.add ( "Id_Distribuidor" );//3
                vecNombresColumnasBD.add ( "Nombre_Distribuidor" );//4
                vecNombresColumnasBD.add ( "Modelo_Producto" );//5
                vecNombresColumnasBD.add ( "Precio_Producto" );//6
           

                vecTiposColumnas.add ( EjecutorSQL.INT );
                vecTiposColumnas.add ( EjecutorSQL.INT );
                vecTiposColumnas.add ( EjecutorSQL.STRING );
                vecTiposColumnas.add ( EjecutorSQL.INT );
                vecTiposColumnas.add ( EjecutorSQL.STRING );
                vecTiposColumnas.add ( EjecutorSQL.STRING );
                vecTiposColumnas.add ( EjecutorSQL.FLOAT ); 
                
                break;
        }
    }

    //----------------------------------------------------------------------------------------
    
    public void desplegarRegistros ( String sql, Object[][] args ) {
        ResultSet rs;
        try {

            rs = EjecutorSQL.sqlQuery ( sql, args );

            dtmPrincipal = new DefaultTableModel ( vecNombresColumnas, 0 ) {
                @Override
                public boolean isCellEditable ( int fila, int columna ) {
                    return false;
                }
            };

            while ( rs.next () ) {
                Object[] fila = crearFila ( rs );
                dtmPrincipal.addRow ( fila );
            }
            rs.close ();
            jtblPrincipal.setModel ( dtmPrincipal );
            totRegistros = dtmPrincipal.getRowCount ();
            jlblMensajeDelSistema.setText ( totRegistros + " registros" );

        } catch ( SQLException ex ) {
            JOptionPane.showMessageDialog ( this,
                    ex, "Error", JOptionPane.ERROR_MESSAGE );
        }
    }

    //----------------------------------------------------------------------------------------
    
    private Object[] crearFila ( ResultSet rs ) throws SQLException {
        switch ( moduloActual ) {
            case TIT_MODULO1: {
                DecimalFormat df = new DecimalFormat ( "0.00" );

                int id_Fab = rs.getInt ( "Id_Fabricante" );
                String nombre_Fab = rs.getString ( "Nombre_Fabricante" );
                String direccion_Fab = rs.getString ( "Direccion_Fabricante" );
                String presidente = rs.getString ( "Presidente_Fabricante" );

                Object[] fila = { id_Fab, nombre_Fab, direccion_Fab, presidente };
                return fila;
            }
            case TIT_MODULO2: {
                int id_Dist = rs.getInt ( "Id_Distribuidor" );
                String nombre_Dist = rs.getString ( "Nombre_Distribuidor" );
                String direccion_Dist= rs.getString ( "Direccion_Distribuidor" );
                String transporte = rs.getString ( "Tipo_Transporte" );

                Object[] fila = { id_Dist ,nombre_Dist, direccion_Dist, transporte };
                return fila;
            }
            case TIT_MODULO3: {

                int id_Prod = rs.getInt ( "Id_Producto" );
                int id_Fabr = rs.getInt ( "Id_Fabricante" );
                String nombre_Fab = rs.getString ( "Nombre_Fabricante" );
                int id_Dist = rs.getInt ( "Id_Distribuidor" );
                String nombre_Dist = rs.getString ( "Nombre_Distribuidor" );
                String modelo_Prod = rs.getString ( "Modelo_Producto" );
                double precio_Prod = Double.parseDouble ( rs.getString ( "Precio_Producto" ) );
               

                Object[] fila = { id_Prod, id_Fabr, nombre_Fab, id_Dist, nombre_Dist,
                     modelo_Prod, precio_Prod };
                return fila;
            }
            default:
                return null;
        }
    }

    //----------------------------------------------------------------------------------------
    
    public static void ejecutar () {
        /* Set the Nimbus look and feel */
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
            java.util.logging.Logger.getLogger(PrincipalFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrincipalFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrincipalFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrincipalFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrincipalFrame().setVisible(false);
            }
        });
    }

    //----------------------------------------------------------------------------------------
    
    public static void main ( String args[] ) {
        ejecutar ();
    }

    //----------------------------------------------------------------------------------------

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtnEditar;
    private javax.swing.JButton jbtnEliminar;
    private javax.swing.JButton jbtnFiltrar;
    private javax.swing.JButton jbtnInicio;
    private javax.swing.JButton jbtnModulo1;
    private javax.swing.JButton jbtnModulo2;
    private javax.swing.JButton jbtnModulo3;
    private javax.swing.JButton jbtnNuevo;
    private javax.swing.JLabel jlblEstatusConexion;
    private javax.swing.JLabel jlblLeyendaPrincipal;
    private javax.swing.JLabel jlblLogoSistema;
    private javax.swing.JLabel jlblMensajeDelSistema;
    private javax.swing.JLabel jlblModulo1;
    private javax.swing.JLabel jlblModulo2;
    private javax.swing.JLabel jlblModulo3;
    private javax.swing.JMenu jmAyuda;
    private javax.swing.JMenuBar jmbPrincipal;
    private javax.swing.JMenuItem jmniAcercaDe;
    private javax.swing.JMenuItem jmniReportesModulo1;
    private javax.swing.JMenuItem jmniReportesModulo2;
    private javax.swing.JMenuItem jmniReportesModulo3;
    private javax.swing.JMenuItem jmniSalir;
    private javax.swing.JPanel jpnlBarraDeEstado;
    private javax.swing.JPanel jpnlLeyendaPrincipal;
    private javax.swing.JPanel jpnlLogoPrincipal;
    private javax.swing.JPanel jpnlTabla;
    private javax.swing.JScrollPane jscrollBarraBotones;
    private javax.swing.JTable jtblPrincipal;
    private javax.swing.JToolBar jtoolbEstatus;
    private javax.swing.JToolBar jtoolbMensajes;
    private javax.swing.JToolBar jtoolbPrincipal;
    // End of variables declaration//GEN-END:variables

    //----------------------------------------------------------------------------------------
    
    public String getModuloActual() {
        return moduloActual;
    }

    //----------------------------------------------------------------------------------------
    
    public void setModuloActual(String moduloActual) {
        this.moduloActual = moduloActual;
    }

    //----------------------------------------------------------------------------------------
    
    public Vector<String> getVecNombresColumnas() {
        return vecNombresColumnas;
    }

    //----------------------------------------------------------------------------------------
    
    public void setVecNombresColumnas(Vector<String> vecNombresColumnas) {
        this.vecNombresColumnas = vecNombresColumnas;
    }

    //----------------------------------------------------------------------------------------
    
    public Vector<String> getVecNombresColumnasBD() {
        return vecNombresColumnasBD;
    }

    //----------------------------------------------------------------------------------------
    
    public void setVecNombresColumnasBD(Vector<String> vecNombresColumnasBD) {
        this.vecNombresColumnasBD = vecNombresColumnasBD;
    }

    //----------------------------------------------------------------------------------------
    
    public Vector<String> getVecTiposColumnas() {
        return vecTiposColumnas;
    }

    //----------------------------------------------------------------------------------------
    
    public void setVecTiposColumnas(Vector<String> vecTiposColumnas) {
        this.vecTiposColumnas = vecTiposColumnas;
    }

    //----------------------------------------------------------------------------------------
    
    public Properties getPropConsultasSQL() {
        return propConsultasSQL;
    }

    //----------------------------------------------------------------------------------------
    
    public void setPropConsultasSQL(Properties propConsultasSQL) {
        this.propConsultasSQL = propConsultasSQL;
    }

    //----------------------------------------------------------------------------------------
    
    public JButton getJbtnModulo1() {
        return jbtnModulo1;
    }

    //----------------------------------------------------------------------------------------
    
    public JButton getJbtnModulo2() {
        return jbtnModulo2;
    }

    //----------------------------------------------------------------------------------------
    
    public JButton getJbtnModulo3() {
        return jbtnModulo3;
    }
}
