/*------------------------------------------------------------------------------------------
:*                       INSTITUTO TECNOLOGICO DE LA LAGUNA
:*                     INGENIERIA EN SISTEMAS COMPUTACIONALES
:*                       TOPICOS AVANZADOS DE PROGRAMACION "B"
:*
:*                   SEMESTRE: ENE-JUN/2020    HORA: 17-18 HRS
:*
:*           Aplicación GUI para el entorno de un Sistema de Calificaciones
:*        
:*  Archivo     : PrincipalFrame.java
:*  Autor       : José Misael Adame Sandoval     18131209
:*                Ricardo Raúl Castro Luna       18131227
:*                Jorge Arturo Galindo Uribe     18131238
:*  Fecha       : 24/May/2020
:*  Compilador  : JAVA J2SE v1.8.0
:*  Descripción : Aplicación que realiza funciones para modificar la base de datos de un  
:*                Sistema de calificaciones como Agregar, Editar, Eliminar un registro de 
:*                las tablas, como también consultar información específica de las tablas
:*                mediante un filtrado, además recalcula los promedios de los alumnos y 
:*                despliega reportes de una tabla ya sea Alumnos, Materias o Kardex y estos 
:*                pueden ser exportados a Word o PDF.
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
    
    public static final String TIT_FRAME = "Sistema de Calificaciones";
    public static final String TIT_INICIO = "TecLag Software";
    public static final String TIT_MODULO1 = "Alumnos";
    public static final String TIT_MODULO2 = "Materias";
    public static final String TIT_MODULO3 = "Kardex";
    
    public static final String ALUMNOS_TODOS_POR_NOMBRE = "alumnos_todos_por_nombre";
    public static final String ALUMNOS_TODOS_SIN_ORDEN = "alumnos_todos_sin_orden";
    public static final String ALUMNOS_ELIMINAR_X_MATRICULA = "alumnos_eliminar_x_matricula";
    public static final String ALUMNOS_ACTUALIZA_DATOS = "alumnos_actualiza_datos";
    public static final String ALUMNOS_INSERTA_NUEVO = "alumnos_inserta_nuevo";  
    public static final String ALUMNOS_ACTUALIZA_PROMEDIOS = "alumnos_actualiza_promedios";
    public static final String MATERIAS_TODOS_POR_MATERIA = "materias_todos_por_materia";
    public static final String MATERIAS_TODOS_SIN_ORDEN = "materias_todos_sin_orden";
    public static final String MATERIAS_ELIMINAR_X_IDMATERIA = "materias_eliminar_x_idmateria";
    public static final String MATERIAS_ACTUALIZA_DATOS = "materias_actualiza_datos";
    public static final String MATERIAS_INSERTA_NUEVO = "materias_inserta_nuevo";
    public static final String KARDEX_TODOS_POR_MATRICULA = "kardex_todos_por_matricula";
    public static final String KARDEX_TODOS_SIN_ORDEN = "kardex_todos_sin_orden";
    public static final String KARDEX_ELIMINAR_X_IDCALIFIC = "kardex_eliminar_x_idcalific";
    public static final String KARDEX_ACTUALIZA_DATOS = "kardex_actualiza_datos";    
    public static final String KARDEX_INSERTA_NUEVO = "kardex_inserta_nuevo";
    public static final String KARDEX_OBT_MAX_ID = "kardex_obt_max_id";
    
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
        initComponents();
        
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
        
        // Ajustar el tamaño de las imagenes
        Icon alumno = Imagenes.escalarImagen ( jbtnModulo1.getIcon(), 
                                               jbtnModulo1.getWidth(),
                                               jbtnModulo1.getHeight() );
        
        jbtnModulo1.setIcon ( alumno );
        
        Icon materia = Imagenes.escalarImagen ( jbtnModulo2.getIcon(), 
                                                jbtnModulo2.getWidth(),
                                                jbtnModulo2.getHeight() );
        
        jbtnModulo2.setIcon ( materia );
        
        Icon kardex = Imagenes.escalarImagen ( jbtnModulo3.getIcon(), 
                                                jbtnModulo3.getWidth(),
                                                jbtnModulo3.getHeight() );
        
        jbtnModulo3.setIcon ( kardex );
        
        
        prepararSentenciasSQL ();
        
        new ConexionDBFrame ( this ).setVisible ( true );
    }   
    
    //----------------------------------------------------------------------------------------
    
    private void prepararSentenciasSQL () {
        propConsultasSQL = new Properties ();
        
        propConsultasSQL.put ( ALUMNOS_TODOS_POR_NOMBRE, 
                "SELECT * FROM alumnos ORDER BY nombre"
                );
        
        propConsultasSQL.put ( ALUMNOS_TODOS_SIN_ORDEN, 
                "SELECT * FROM alumnos"
                );  
        propConsultasSQL.put ( ALUMNOS_ELIMINAR_X_MATRICULA, 
                "DELETE FROM alumnos WHERE matricula = ?"
                ); 
        propConsultasSQL.put ( ALUMNOS_ACTUALIZA_DATOS, 
                "UPDATE alumnos SET nombre = ?, apellidos = ?, edad = ?, " +
                        "promedio = ? WHERE matricula = ?"
                );
        propConsultasSQL.put ( ALUMNOS_INSERTA_NUEVO, 
                "INSERT INTO alumnos VALUES ( ?, ?, ?, ?, ? )"
                );
        propConsultasSQL.put ( ALUMNOS_ACTUALIZA_PROMEDIOS, 
                "UPDATE alumnos A SET promedio = ( " +
                "SELECT AVG ( CAST ( calificacion AS FLOAT ) ) FROM kardex K " +
                "WHERE K.matricula = A.matricula )"
                );
        propConsultasSQL.put ( MATERIAS_TODOS_POR_MATERIA,
                "SELECT * FROM materias ORDER BY materia"
                );
        propConsultasSQL.put ( MATERIAS_TODOS_SIN_ORDEN, 
                "SELECT * FROM materias"
                );
        propConsultasSQL.put ( MATERIAS_ELIMINAR_X_IDMATERIA, 
                "DELETE FROM materias WHERE idmateria = ?"
                );
        propConsultasSQL.put ( MATERIAS_ACTUALIZA_DATOS, 
                "UPDATE materias SET materia = ?, creditos = ? " +
                        "WHERE idmateria = ?"
                );
        propConsultasSQL.put ( MATERIAS_INSERTA_NUEVO, 
                "INSERT INTO materias VALUES ( ?, ?, ? )"
                );
        propConsultasSQL.put ( KARDEX_TODOS_POR_MATRICULA, 
                "SELECT K.IDCALIFIC, K.MATRICULA, A.NOMBRE, A.APELLIDOS, "
                        + "K.PERIODO, M.IDMATERIA, M.MATERIA, K.CALIFICACION " +
                "FROM Kardex K, Alumnos A, Materias M " +
                "WHERE K.MATRICULA = A.MATRICULA AND K.IDMATERIA = M.IDMATERIA " +
                "ORDER BY K.MATRICULA"
                );
        propConsultasSQL.put ( KARDEX_TODOS_SIN_ORDEN, 
                "SELECT K.IDCALIFIC, K.MATRICULA, A.NOMBRE, A.APELLIDOS, "
                        + "K.PERIODO, M.IDMATERIA, M.MATERIA, K.CALIFICACION " +
                "FROM Kardex K JOIN Alumnos A ON K.MATRICULA = A.MATRICULA " +
                     "JOIN Materias M ON K.IDMATERIA = M.IDMATERIA"                
                );
        propConsultasSQL.put ( KARDEX_ELIMINAR_X_IDCALIFIC, 
                "DELETE FROM kardex WHERE idcalific = ?"
                );
        propConsultasSQL.put ( KARDEX_ACTUALIZA_DATOS, 
                "UPDATE kardex SET matricula = ?, idmateria = ?, periodo = ?, " +
                                "calificacion = ? WHERE idcalific = ?");
        propConsultasSQL.put ( KARDEX_INSERTA_NUEVO,
                "INSERT INTO kardex VALUES ( ?, ?, ?, ?, ? )" );
        propConsultasSQL.put ( KARDEX_OBT_MAX_ID, 
                "SELECT MAX ( idcalific ) AS maxid FROM kardex");
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
        jmniRecalcPromedios = new javax.swing.JMenuItem();
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

        jbtnModulo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/img_Alumno.jpg"))); // NOI18N
        jbtnModulo1.setToolTipText("");
        jbtnModulo1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jbtnModulo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnModulo1ActionPerformed(evt);
            }
        });

        jlblModulo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblModulo1.setText("Modulo 1");

        jlblModulo2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblModulo2.setText("Modulo 2");

        jbtnModulo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/img_Materia.png"))); // NOI18N
        jbtnModulo2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jbtnModulo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnModulo2ActionPerformed(evt);
            }
        });

        jlblModulo3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblModulo3.setText("Modulo 3");

        jbtnModulo3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/img_Kardex.jpg"))); // NOI18N
        jbtnModulo3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
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
                    .addComponent(jbtnModulo1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlblModulo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlblModulo2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlblModulo3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbtnModulo2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jbtnModulo3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jbtnModulo1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlblModulo1)
                .addGap(29, 29, 29)
                .addComponent(jbtnModulo2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlblModulo2)
                .addGap(36, 36, 36)
                .addComponent(jbtnModulo3, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlblModulo3)
                .addContainerGap(202, Short.MAX_VALUE))
        );

        jscrollBarraBotones.setViewportView(jPanel2);

        jpnlLeyendaPrincipal.setBackground(new java.awt.Color(0, 0, 153));

        jlblLeyendaPrincipal.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
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
                .addContainerGap(16, Short.MAX_VALUE))
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

        jlblLogoSistema.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblLogoSistema.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/img_Inicio.jpg"))); // NOI18N

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

        jmniRecalcPromedios.setText("Recalcular promedios");
        jmniRecalcPromedios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniRecalcPromediosActionPerformed(evt);
            }
        });
        jMenu2.add(jmniRecalcPromedios);

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
                .addComponent(jscrollBarraBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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
                    .addComponent(jscrollBarraBotones, javax.swing.GroupLayout.DEFAULT_SIZE, 481, Short.MAX_VALUE)
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
        
        String sql = propConsultasSQL.getProperty ( ALUMNOS_TODOS_POR_NOMBRE );
        desplegarRegistros ( sql, null );
    }//GEN-LAST:event_jbtnModulo1ActionPerformed

    //----------------------------------------------------------------------------------------
    
    private void jbtnModulo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnModulo2ActionPerformed
        prepararVistaModulo ( TIT_MODULO2 );
        
        String sql = propConsultasSQL.getProperty ( MATERIAS_TODOS_POR_MATERIA );
        desplegarRegistros ( sql, null );
       
    }//GEN-LAST:event_jbtnModulo2ActionPerformed

    //----------------------------------------------------------------------------------------
    
    private void jbtnModulo3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnModulo3ActionPerformed
        prepararVistaModulo ( TIT_MODULO3 );

        String sql = propConsultasSQL.getProperty ( KARDEX_TODOS_POR_MATRICULA );
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
        
        if ( confirma == JOptionPane.NO_OPTION )
            return;
        
        String valorLlavePrim = jtblPrincipal.getValueAt ( pos, 0 ).toString ();
        String tipoLlavePrim = vecTiposColumnas.elementAt ( 0 );
        String sql = "";
        JButton jbtnModulo = null;
        
        switch ( moduloActual ) {
            case TIT_MODULO1:
                sql = propConsultasSQL.getProperty ( ALUMNOS_ELIMINAR_X_MATRICULA );
                jbtnModulo = jbtnModulo1;
                break;
            case TIT_MODULO2:
                sql = propConsultasSQL.getProperty ( MATERIAS_ELIMINAR_X_IDMATERIA );
                jbtnModulo = jbtnModulo2;                
                break;
            case TIT_MODULO3:
                sql = propConsultasSQL.getProperty ( KARDEX_ELIMINAR_X_IDCALIFIC );
                jbtnModulo = jbtnModulo3;
                break;
        }
        
        Object [][] args = { { tipoLlavePrim, valorLlavePrim } };
        try {
            int regs = EjecutorSQL.sqlEjecutar ( sql, args );
            if ( regs == 1 ) {
                jbtnModulo.doClick ();
                JOptionPane.showMessageDialog (
                        this, "El registro ha sido eliminado", "Eliminar", 
                        JOptionPane.INFORMATION_MESSAGE );
            }
        } catch ( SQLIntegrityConstraintViolationException ex ) {
            JOptionPane.showMessageDialog (
                    this, 
                    "No se puede eliminar el registro actual porque tiene " +
                    "registros asociados en otras tablas",
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
                    this, "No hay un registro seleccionado", "Eliminar", JOptionPane.ERROR_MESSAGE );
            return;
        } 
        if ( moduloActual.equals ( TIT_MODULO1 ) ) {
            String matricula = jtblPrincipal.getValueAt ( pos, 0 ).toString ();
            String nombre = jtblPrincipal.getValueAt ( pos, 1 ).toString ();
            String apellidos = jtblPrincipal.getValueAt ( pos, 2 ).toString ();
            int edad = Integer.parseInt ( jtblPrincipal.getValueAt ( pos, 3 ).toString() );
            float promedio = Float.parseFloat ( jtblPrincipal.getValueAt ( pos, 4 ).toString() );
            
            Modelo1 modelo1 = new Modelo1 ( matricula, nombre, apellidos, edad, promedio );
            
            Modulo1EditarDialog dialog = new Modulo1EditarDialog ( this, modelo1 );
            dialog.setVisible ( true );
            
        } else if ( moduloActual.equals ( TIT_MODULO2 ) ) {
            String idmateria  = jtblPrincipal.getValueAt ( pos, 0 ).toString ();
            String materia = jtblPrincipal.getValueAt ( pos, 1 ).toString ();
            int creditos = Integer.parseInt ( jtblPrincipal.getValueAt ( pos, 2 ).toString () );
            
            Modelo2 modelo = new Modelo2 ( idmateria, materia, creditos );
            
            Modulo2EditarDialog dialog = new Modulo2EditarDialog ( this, modelo );
            dialog.setVisible ( true );
            
        } else if ( moduloActual.equals ( TIT_MODULO3 ) ) {
            int idcalific = Integer.parseInt ( jtblPrincipal.getValueAt ( pos, 0 ).toString() );
            String matricula = jtblPrincipal.getValueAt ( pos, 1 ).toString ();
            String idmateria = jtblPrincipal.getValueAt ( pos, 4 ).toString ();
            String periodo = jtblPrincipal.getValueAt ( pos, 6 ).toString ();
            String califica = jtblPrincipal.getValueAt( pos, 7 ).toString ();
            int calificacion = Integer.parseInt( califica );
            
            Modelo3 modelo = new Modelo3 ( idcalific, matricula, idmateria, 
                                           periodo, calificacion );
            
            Modulo3EditarDialog dialog = new Modulo3EditarDialog ( this, modelo );
            dialog.setVisible ( true );
        } 
        
    }//GEN-LAST:event_jbtnEditarActionPerformed

    //----------------------------------------------------------------------------------------
    
    private void jmniRecalcPromediosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmniRecalcPromediosActionPerformed
        String sql = propConsultasSQL.getProperty ( ALUMNOS_ACTUALIZA_PROMEDIOS );
        try {
            int regs = EjecutorSQL.sqlEjecutar ( sql );
            jbtnModulo1.doClick ();
            JOptionPane.showMessageDialog ( 
                    this,
                    "Proceso terminado. " + regs + " registros fueron actualizados",
                    "Promedio",
                    JOptionPane.INFORMATION_MESSAGE
            );
        } catch ( SQLException ex ) {
            JOptionPane.showMessageDialog ( 
                    this,
                    ex,
                    "Error",
                    JOptionPane.ERROR_MESSAGE
            );
        }
    }//GEN-LAST:event_jmniRecalcPromediosActionPerformed

    //----------------------------------------------------------------------------------------
    
    private void jmniAcercaDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmniAcercaDeActionPerformed
        acercaDeDialog = new AcercaDeDialog ( this, true );
        acercaDeDialog.setVisible( true );
    }//GEN-LAST:event_jmniAcercaDeActionPerformed

    //----------------------------------------------------------------------------------------
    
    private void jmniReportesModulo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmniReportesModulo1ActionPerformed
        String reporte = "src\\reportes\\AlumnosReport.jrxml";
        JasperReport jr;
        try {
            jr = JasperCompileManager.compileReport ( reporte );
            JasperPrint jp = JasperFillManager.fillReport ( jr, null, ConexionDB.getInstancia().getConexion() );
            JasperViewer jv = new JasperViewer ( jp, false );
            jv.setTitle ( "Reporte Alumnos" );
            jv.setVisible ( true );
        } catch ( JRException ex ) {
            JOptionPane.showMessageDialog ( this, 
                    ex, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jmniReportesModulo1ActionPerformed

    //----------------------------------------------------------------------------------------
    
    private void jmniReportesModulo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmniReportesModulo2ActionPerformed
        String reporte = "src\\reportes\\MateriasReport.jrxml";
        JasperReport jr;
        try {
            jr = JasperCompileManager.compileReport ( reporte );
            JasperPrint jp = JasperFillManager.fillReport ( jr, null, ConexionDB.getInstancia().getConexion() );
            JasperViewer jv = new JasperViewer ( jp, false );
            jv.setTitle ( "Reporte Materias" );
            jv.setVisible ( true );
        } catch ( JRException ex ) {
            JOptionPane.showMessageDialog ( this, 
                    ex, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jmniReportesModulo2ActionPerformed

    //----------------------------------------------------------------------------------------
    
    private void jmniReportesModulo3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmniReportesModulo3ActionPerformed
        String reporte = "src\\reportes\\KardexReport.jrxml";
        JasperReport jr;
        try {
            jr = JasperCompileManager.compileReport ( reporte );
            JasperPrint jp = JasperFillManager.fillReport ( jr, null, ConexionDB.getInstancia().getConexion() );
            JasperViewer jv = new JasperViewer ( jp, false );
            jv.setTitle ( "Reporte Kardex" );
            jv.setVisible ( true );
        } catch ( JRException ex ) {
            JOptionPane.showMessageDialog ( this, 
                    ex, "Error", JOptionPane.ERROR_MESSAGE);
        }
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
        vecNombresColumnas = new Vector<String> ();
        vecNombresColumnasBD = new Vector<String> ();
        vecTiposColumnas = new Vector<String> ();

        switch ( modulo ) {
            case TIT_MODULO1:
                vecNombresColumnas.add ( "Matricula" );
                vecNombresColumnas.add ( "Nombre" );
                vecNombresColumnas.add ( "Apellidos" );
                vecNombresColumnas.add ( "Edad" );
                vecNombresColumnas.add ( "Promedio" );
                
                vecNombresColumnasBD.add ( "matricula" );
                vecNombresColumnasBD.add ( "nombre" );
                vecNombresColumnasBD.add ( "apellidos" );
                vecNombresColumnasBD.add ( "edad" );
                vecNombresColumnasBD.add ( "promedio" );
                
                vecTiposColumnas.add ( EjecutorSQL.STRING );
                vecTiposColumnas.add ( EjecutorSQL.STRING );
                vecTiposColumnas.add ( EjecutorSQL.STRING );
                vecTiposColumnas.add ( EjecutorSQL.INT );
                vecTiposColumnas.add ( EjecutorSQL.FLOAT );
                
                break;
            case TIT_MODULO2:
                vecNombresColumnas.add ( "ID Materia" );
                vecNombresColumnas.add ( "Materia" );
                vecNombresColumnas.add ( "Creditos" );
                
                vecNombresColumnasBD.add ( "idmateria" );
                vecNombresColumnasBD.add ( "materia" );
                vecNombresColumnasBD.add ( "creditos" );
                
                vecTiposColumnas.add ( EjecutorSQL.STRING );
                vecTiposColumnas.add ( EjecutorSQL.STRING );
                vecTiposColumnas.add ( EjecutorSQL.INT );
                
                break;
            case TIT_MODULO3:
                vecNombresColumnas.add ( "ID Calific" );
                vecNombresColumnas.add ( "Matricula" );
                vecNombresColumnas.add ( "Nombre" );
                vecNombresColumnas.add ( "Apellidos" );
                vecNombresColumnas.add ( "ID Materia" );
                vecNombresColumnas.add ( "Materia" );
                vecNombresColumnas.add ( "Periodo" );
                vecNombresColumnas.add ( "Caliicacion" );
                
                vecNombresColumnasBD.add ( "K.idcalific" );
                vecNombresColumnasBD.add ( "K.matricula" );
                vecNombresColumnasBD.add ( "A.nombre" );
                vecNombresColumnasBD.add ( "A.apellidos" );
                vecNombresColumnasBD.add ( "M.idmateria" );
                vecNombresColumnasBD.add ( "M.materia" );
                vecNombresColumnasBD.add ( "K.periodo" );
                vecNombresColumnasBD.add ( "K.calificacion" );
                
                vecTiposColumnas.add ( EjecutorSQL.INT );
                vecTiposColumnas.add ( EjecutorSQL.STRING );
                vecTiposColumnas.add ( EjecutorSQL.STRING );
                vecTiposColumnas.add ( EjecutorSQL.STRING );
                vecTiposColumnas.add ( EjecutorSQL.STRING );
                vecTiposColumnas.add ( EjecutorSQL.STRING );
                vecTiposColumnas.add ( EjecutorSQL.STRING );
                vecTiposColumnas.add ( EjecutorSQL.INT );
                
                break;
        }
    }
    
    //----------------------------------------------------------------------------------------
    
    public void desplegarRegistros ( String sql, Object [][] args ) {
        ResultSet rs;
        try {
            
            rs = EjecutorSQL.sqlQuery( sql , args );
            
            dtmPrincipal = new DefaultTableModel ( vecNombresColumnas, 0 ) {        
                @Override
                public boolean isCellEditable ( int fila, int columna ) {
                    return false;
                } 
            };
            
            while ( rs.next() ) {
                Object [] fila = crearFila ( rs );
                dtmPrincipal.addRow ( fila );               
            }
            rs.close ();
            jtblPrincipal.setModel( dtmPrincipal );
            totRegistros = dtmPrincipal.getRowCount ();
            jlblMensajeDelSistema.setText ( totRegistros + " registros" );
        
        } catch ( SQLException ex ) {
            JOptionPane.showMessageDialog ( this, 
                    ex, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    //----------------------------------------------------------------------------------------
    
    private Object [] crearFila ( ResultSet rs) throws SQLException {
        switch ( moduloActual ) {
            case TIT_MODULO1:
            {
                DecimalFormat df = new DecimalFormat("0.00");
                
                String matricula = rs.getString ( "Matricula" );
                String nombre = rs.getString ( "Nombre" );
                String apellidos = rs.getString ( "Apellidos" );
                int edad = rs.getInt ( "Edad" );
                String promedio = df.format ( rs.getFloat ( "Promedio" ) );
                
                Object [] fila = { matricula, nombre, apellidos, edad, promedio };
                return fila;
            }
            case TIT_MODULO2:
            {
                String idmateria = rs.getString ( "IDmateria" );
                String materia = rs.getString ( "Materia" );
                int creditos = rs.getInt( "Creditos" );
                
                Object [] fila = { idmateria, materia, creditos };
                return fila;
            }
            case TIT_MODULO3:
            {
                
                int idcalific = rs.getInt ( "idcalific" );
                String matricula = rs.getString ( "Matricula" );
                String nombre = rs.getString ( "Nombre" );
                String apellidos = rs.getString ( "Apellidos" );
                String idmateria = rs.getString ( "idmateria" );
                String materia = rs.getString ( "materia" );
                String periodo = rs.getString ( "periodo" );
                int calificacion = rs.getInt ( "calificacion" );
                
                Object [] fila = { idcalific, matricula, nombre, apellidos, idmateria,
                                   materia, periodo, calificacion };
                return fila;
            }
            default:
                return null;
        }
    }
    
    //----------------------------------------------------------------------------------------
    
    public static void ejecutar() {
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
    
    public static void main(String args[]) {
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
    private javax.swing.JMenuItem jmniRecalcPromedios;
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

    
    public String getModuloActual() {
        return moduloActual;
    }

    public void setModuloActual(String moduloActual) {
        this.moduloActual = moduloActual;
    }

    public Vector<String> getVecNombresColumnas() {
        return vecNombresColumnas;
    }

    public void setVecNombresColumnas(Vector<String> vecNombresColumnas) {
        this.vecNombresColumnas = vecNombresColumnas;
    }

    public Vector<String> getVecNombresColumnasBD() {
        return vecNombresColumnasBD;
    }

    public void setVecNombresColumnasBD(Vector<String> vecNombresColumnasBD) {
        this.vecNombresColumnasBD = vecNombresColumnasBD;
    }

    public Vector<String> getVecTiposColumnas() {
        return vecTiposColumnas;
    }

    public void setVecTiposColumnas(Vector<String> vecTiposColumnas) {
        this.vecTiposColumnas = vecTiposColumnas;
    }

    public Properties getPropConsultasSQL() {
        return propConsultasSQL;
    }

    public void setPropConsultasSQL(Properties propConsultasSQL) {
        this.propConsultasSQL = propConsultasSQL;
    }

    public JButton getJbtnModulo1() {
        return jbtnModulo1;
    }

    public JButton getJbtnModulo2() {
        return jbtnModulo2;
    }

    public JButton getJbtnModulo3() {
        return jbtnModulo3;
    }

    
}
