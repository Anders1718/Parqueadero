/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Finca;
import InicioPrincipal.ColorFondo;
import java.awt.Image;
import javax.swing.JOptionPane;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author User
 */
public class ModificarVaca extends javax.swing.JFrame {
    String user = Conexion.user;
    String clave = Conexion.clave;
    String url = Conexion.url;
    Connection con ;
    Statement stmt;
    ResultSet rs;
    
    /**
     * Creates new form Inicio
     */
    public ModificarVaca() {
        initComponents();
        this.setTitle(Conexion.nombreNegocio+": modificar vaca");
        this.setLocationRelativeTo(null);
        
        try {
                Class.forName("com.mysql.cj.jdbc.Driver");
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ModificarVaca.class.getName()).log(Level.SEVERE, null, ex);
            }
        buscarProducto(jTextFieldBuscar.getText());
        

    }
    public Image getIconImage(){
       Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes1/icono.png"));
       return retValue;
    }

     
    void buscarProducto(String buscar){
        
        
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("ID");
        modelo.addColumn("CHAPETA");
        modelo.addColumn("NOMBRE");
        modelo.addColumn("FECHA NAC");
        modelo.addColumn("ULT PARTO");
        modelo.addColumn("CANT PARTO");
        modelo.addColumn("ULT SECADO");
        modelo.addColumn("FECHA ENT");
        modelo.addColumn("FECHA SALIDA");
        modelo.addColumn("ULT SERVC");
        modelo.addColumn("POSIBLE PAR");
        modelo.addColumn("RAZA");  
        modelo.addColumn("PADRE");
        modelo.addColumn("MADRE");
        modelo.addColumn("PREDIO");
        
        
        TablaDatos.setModel(modelo);

        
        
        String datos[] = new String [15];
         
        try {
            con = DriverManager.getConnection(url, user, clave);
            stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM vacas WHERE chapeta "
                    + "LIKE '%"+buscar+"%'"  );
            while(rs.next()){
                
                datos[0]= rs.getString(1);
                datos[1]= rs.getString(2);
                datos[2]= rs.getString(12);
                datos[3]= rs.getString(3);
                datos[4]= rs.getString(4);
                datos[5]= rs.getString(5);
                datos[6]= rs.getString(6);
                datos[7]= rs.getString(7);
                datos[8]= rs.getString(8);
                datos[9]= rs.getString(9);
                datos[10]= rs.getString(10);
                datos[11]= rs.getString(11);
                datos[12]= rs.getString(13);
                datos[13]= rs.getString(14);
                datos[14]= rs.getString(15);
                
                
                
                
                modelo.addRow(datos);
            }
            TablaDatos.setModel(modelo);
        } catch (SQLException ex) {
            Logger.getLogger(ModificarVaca.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
    
    
    


    

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonListo1 = new javax.swing.JButton();
        jLabelNombres2 = new javax.swing.JLabel();
        jTextNombre = new javax.swing.JTextField();
        jLabelNombres3 = new javax.swing.JLabel();
        jTextMadre = new javax.swing.JTextField();
        jLabelNombres4 = new javax.swing.JLabel();
        jTextPadre = new javax.swing.JTextField();
        jLabelPrecio6 = new javax.swing.JLabel();
        jComboBoxRaza = new javax.swing.JComboBox<>();
        jScrollPaneProducto = new javax.swing.JScrollPane();
        TablaDatos = new javax.swing.JTable();
        jTextFieldBuscar = new javax.swing.JTextField();
        jLabelPrecio4 = new javax.swing.JLabel();
        jTextFieldEntrada = new javax.swing.JTextField();
        jLabelTelefono = new javax.swing.JLabel();
        jTextFieldParto = new javax.swing.JTextField();
        jLabelPrecio1 = new javax.swing.JLabel();
        jTextFieldCantidadPartos = new javax.swing.JTextField();
        jLabelPrecio3 = new javax.swing.JLabel();
        jTextFieldSecado = new javax.swing.JTextField();
        jLabelPrecio5 = new javax.swing.JLabel();
        jTextFieldServicio = new javax.swing.JTextField();
        jLabelCantidad = new javax.swing.JLabel();
        jLabelId = new javax.swing.JLabel();
        jLabelBuscarNombre2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        MostrarCodigo = new javax.swing.JLabel();
        jButtonListo = new javax.swing.JButton();
        jLabelMostrarChapeta = new javax.swing.JLabel();
        jLabelMostrarNombre3 = new javax.swing.JLabel();
        jTextFieldNacimiento = new javax.swing.JTextField();
        jTextFieldChapeta = new javax.swing.JTextField();
        jLabelCantidad1 = new javax.swing.JLabel();
        jButtonAtras1 = new javax.swing.JButton();
        jButtonInicio = new javax.swing.JButton();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonListo1.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jButtonListo1.setForeground(new java.awt.Color(255, 255, 255));
        jButtonListo1.setText("ELIMINAR");
        jButtonListo1.setContentAreaFilled(false);
        jButtonListo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonListo1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonListo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 560, 210, 60));

        jLabelNombres2.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jLabelNombres2.setForeground(new java.awt.Color(51, 51, 51));
        jLabelNombres2.setText("NOMBRE:");
        getContentPane().add(jLabelNombres2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 530, 120, -1));

        jTextNombre.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jTextNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextNombreActionPerformed(evt);
            }
        });
        jTextNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextNombreKeyTyped(evt);
            }
        });
        getContentPane().add(jTextNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 530, 300, -1));

        jLabelNombres3.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jLabelNombres3.setForeground(new java.awt.Color(51, 51, 51));
        jLabelNombres3.setText("MADRE:");
        getContentPane().add(jLabelNombres3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 530, 100, -1));

        jTextMadre.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jTextMadre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextMadreActionPerformed(evt);
            }
        });
        jTextMadre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextMadreKeyTyped(evt);
            }
        });
        getContentPane().add(jTextMadre, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 530, 300, -1));

        jLabelNombres4.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jLabelNombres4.setForeground(new java.awt.Color(51, 51, 51));
        jLabelNombres4.setText("PADRE:");
        getContentPane().add(jLabelNombres4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 470, 100, -1));

        jTextPadre.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jTextPadre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextPadreActionPerformed(evt);
            }
        });
        jTextPadre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextPadreKeyTyped(evt);
            }
        });
        getContentPane().add(jTextPadre, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 470, 300, -1));

        jLabelPrecio6.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jLabelPrecio6.setForeground(new java.awt.Color(51, 51, 51));
        jLabelPrecio6.setText("RAZA:");
        getContentPane().add(jLabelPrecio6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 80, -1));

        jComboBoxRaza.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jComboBoxRaza.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "HOLSTEIN", "JERSEY", "HOLSTEIN ROJO", "JERHOL", "NORMANDO", "GYR", "GYROLANDA", "BRAHMAN", "CEBÚ", "AYRSHIRE", "BON", "PARDO SUIZO", "ANGUS", "SIMMENTAL", "BRANGUS", "BRAHMAN" }));
        getContentPane().add(jComboBoxRaza, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 470, 280, 40));

        TablaDatos = new javax.swing.JTable(){
            public boolean isCellEditable(int riwIndex, int colIndex){
                return false;
            }
        };
        TablaDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        TablaDatos.getTableHeader().setReorderingAllowed(false);
        TablaDatos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaDatosMouseClicked(evt);
            }
        });
        jScrollPaneProducto.setViewportView(TablaDatos);

        getContentPane().add(jScrollPaneProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 670, 240));

        jTextFieldBuscar.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jTextFieldBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldBuscarActionPerformed(evt);
            }
        });
        jTextFieldBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldBuscarKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldBuscarKeyTyped(evt);
            }
        });
        getContentPane().add(jTextFieldBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, 260, -1));

        jLabelPrecio4.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jLabelPrecio4.setForeground(new java.awt.Color(51, 51, 51));
        jLabelPrecio4.setText("FECHA DE ENTRADA:");
        getContentPane().add(jLabelPrecio4, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 260, 250, -1));

        jTextFieldEntrada.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jTextFieldEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEntradaActionPerformed(evt);
            }
        });
        jTextFieldEntrada.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldEntradaKeyTyped(evt);
            }
        });
        getContentPane().add(jTextFieldEntrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 250, 240, -1));

        jLabelTelefono.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jLabelTelefono.setForeground(new java.awt.Color(51, 51, 51));
        jLabelTelefono.setText("FECHA ÚLTIMO PARTO:");
        getContentPane().add(jLabelTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 310, -1, -1));

        jTextFieldParto.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jTextFieldParto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPartoActionPerformed(evt);
            }
        });
        jTextFieldParto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldPartoKeyTyped(evt);
            }
        });
        getContentPane().add(jTextFieldParto, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 310, 240, -1));

        jLabelPrecio1.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jLabelPrecio1.setForeground(new java.awt.Color(51, 51, 51));
        jLabelPrecio1.setText("PARTOS:");
        getContentPane().add(jLabelPrecio1, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 370, 110, -1));

        jTextFieldCantidadPartos.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jTextFieldCantidadPartos.setText("0");
        jTextFieldCantidadPartos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCantidadPartosActionPerformed(evt);
            }
        });
        jTextFieldCantidadPartos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldCantidadPartosKeyTyped(evt);
            }
        });
        getContentPane().add(jTextFieldCantidadPartos, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 370, 280, -1));

        jLabelPrecio3.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jLabelPrecio3.setForeground(new java.awt.Color(51, 51, 51));
        jLabelPrecio3.setText("FECHA ÚLTIMO SECADO:");
        getContentPane().add(jLabelPrecio3, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 420, 300, -1));

        jTextFieldSecado.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jTextFieldSecado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldSecadoActionPerformed(evt);
            }
        });
        jTextFieldSecado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldSecadoKeyTyped(evt);
            }
        });
        getContentPane().add(jTextFieldSecado, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 420, 280, -1));

        jLabelPrecio5.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jLabelPrecio5.setForeground(new java.awt.Color(51, 51, 51));
        jLabelPrecio5.setText("FECHA ÚLTIMO SERVICIO:");
        getContentPane().add(jLabelPrecio5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, 310, -1));

        jTextFieldServicio.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jTextFieldServicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldServicioActionPerformed(evt);
            }
        });
        jTextFieldServicio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldServicioKeyTyped(evt);
            }
        });
        getContentPane().add(jTextFieldServicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 420, 280, -1));

        jLabelCantidad.setBackground(new java.awt.Color(0, 0, 0));
        jLabelCantidad.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jLabelCantidad.setForeground(new java.awt.Color(51, 51, 51));
        jLabelCantidad.setText("CHAPETA:");
        getContentPane().add(jLabelCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 140, 120, 30));

        jLabelId.setBackground(new java.awt.Color(102, 255, 102));
        jLabelId.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jLabelId.setOpaque(true);
        getContentPane().add(jLabelId, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 90, 100, 30));

        jLabelBuscarNombre2.setBackground(new java.awt.Color(0, 0, 0));
        jLabelBuscarNombre2.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jLabelBuscarNombre2.setForeground(new java.awt.Color(51, 51, 51));
        jLabelBuscarNombre2.setText("INGRESE EL NÚMERO DE CHAPETA");
        getContentPane().add(jLabelBuscarNombre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 430, -1));

        jButton3.setText("BUSCAR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 80, -1, -1));

        MostrarCodigo.setBackground(new java.awt.Color(0, 0, 0));
        MostrarCodigo.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        MostrarCodigo.setForeground(new java.awt.Color(51, 51, 51));
        MostrarCodigo.setText("ID:");
        getContentPane().add(MostrarCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 90, 40, 30));

        jButtonListo.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jButtonListo.setForeground(new java.awt.Color(255, 255, 255));
        jButtonListo.setText("MODIFICAR");
        jButtonListo.setContentAreaFilled(false);
        jButtonListo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonListoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonListo, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 480, 210, 60));

        jLabelMostrarChapeta.setBackground(new java.awt.Color(102, 255, 102));
        jLabelMostrarChapeta.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jLabelMostrarChapeta.setOpaque(true);
        getContentPane().add(jLabelMostrarChapeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 90, 150, 30));

        jLabelMostrarNombre3.setBackground(new java.awt.Color(0, 0, 0));
        jLabelMostrarNombre3.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jLabelMostrarNombre3.setForeground(new java.awt.Color(51, 51, 51));
        jLabelMostrarNombre3.setText("CHAPETA:");
        getContentPane().add(jLabelMostrarNombre3, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 90, 120, 30));

        jTextFieldNacimiento.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jTextFieldNacimiento.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jTextFieldNacimientoMouseMoved(evt);
            }
        });
        jTextFieldNacimiento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextFieldNacimientoMouseClicked(evt);
            }
        });
        jTextFieldNacimiento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldNacimientoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldNacimientoKeyTyped(evt);
            }
        });
        getContentPane().add(jTextFieldNacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 190, 280, -1));

        jTextFieldChapeta.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jTextFieldChapeta.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jTextFieldChapetaMouseMoved(evt);
            }
        });
        jTextFieldChapeta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextFieldChapetaMouseClicked(evt);
            }
        });
        jTextFieldChapeta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldChapetaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldChapetaKeyTyped(evt);
            }
        });
        getContentPane().add(jTextFieldChapeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 130, 160, -1));

        jLabelCantidad1.setBackground(new java.awt.Color(0, 0, 0));
        jLabelCantidad1.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jLabelCantidad1.setForeground(new java.awt.Color(51, 51, 51));
        jLabelCantidad1.setText("FECHA NAC:");
        getContentPane().add(jLabelCantidad1, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 190, -1, 30));

        jButtonAtras1.setBackground(new java.awt.Color(153, 153, 0));
        jButtonAtras1.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jButtonAtras1.setForeground(new java.awt.Color(255, 255, 255));
        jButtonAtras1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes1/atrasBlanco.png"))); // NOI18N
        jButtonAtras1.setBorderPainted(false);
        jButtonAtras1.setContentAreaFilled(false);
        jButtonAtras1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtras1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAtras1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 570, 100, 40));

        jButtonInicio.setBackground(new java.awt.Color(153, 0, 153));
        jButtonInicio.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jButtonInicio.setForeground(new java.awt.Color(255, 255, 255));
        jButtonInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes1/inicio.png"))); // NOI18N
        jButtonInicio.setBorderPainted(false);
        jButtonInicio.setContentAreaFilled(false);
        jButtonInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInicioActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 30, -1, -1));

        jLabelFondo.setBackground(new java.awt.Color(ColorFondo.getColor1(), ColorFondo.getColor2(), ColorFondo.getColor3()));
        jLabelFondo.setOpaque(true);
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1310, 650));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    void addItemsJcombo(String raza){
        jComboBoxRaza.removeAllItems();
        jComboBoxRaza.addItem(raza);
        jComboBoxRaza.addItem("HOLSTEIN");
        jComboBoxRaza.addItem("JERSEY");
        jComboBoxRaza.addItem("HOLSTEIN ROJO");
        jComboBoxRaza.addItem("JERHOL");
        jComboBoxRaza.addItem("NORMANDO");
        jComboBoxRaza.addItem("GYR");
        jComboBoxRaza.addItem("GYROLANDA");
        jComboBoxRaza.addItem("BRAHMAN");
        jComboBoxRaza.addItem("CEBÚ");
        jComboBoxRaza.addItem("AYRSHIRE");
        jComboBoxRaza.addItem("BON");
        jComboBoxRaza.addItem("PARDO SUIZO");
        jComboBoxRaza.addItem("ANGUS");
        jComboBoxRaza.addItem("SIMMENTAL");
        jComboBoxRaza.addItem("BRANGUS");
        jComboBoxRaza.addItem("BRAHMAN");


    }
    
    private void jTextFieldBuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldBuscarKeyTyped
        char c= evt.getKeyChar();
        if(Character.isLowerCase(c)){
            String cad=(""+c).toUpperCase();
            c= cad.charAt(0);
            evt.setKeyChar(c);
        }
    }//GEN-LAST:event_jTextFieldBuscarKeyTyped

    private void jTextFieldBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldBuscarActionPerformed
        buscarProducto(jTextFieldBuscar.getText());
        jTextFieldBuscar.setText("");
    }//GEN-LAST:event_jTextFieldBuscarActionPerformed

    private void jTextFieldBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldBuscarKeyReleased
        
    }//GEN-LAST:event_jTextFieldBuscarKeyReleased

    private void TablaDatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaDatosMouseClicked

            int seleccionar = TablaDatos.rowAtPoint(evt.getPoint());
            
            jLabelMostrarChapeta.setText(String.valueOf(TablaDatos.getValueAt(seleccionar, 1)));
            jLabelId.setText(String.valueOf(TablaDatos.getValueAt(seleccionar, 0)));
            
            jTextFieldChapeta.setText(String.valueOf(TablaDatos.getValueAt(seleccionar, 1)));
            jTextNombre.setText(String.valueOf(TablaDatos.getValueAt(seleccionar, 2)));
            jTextFieldNacimiento.setText(String.valueOf(TablaDatos.getValueAt(seleccionar, 3)));
            jTextFieldEntrada.setText(String.valueOf(TablaDatos.getValueAt(seleccionar, 7)));
            jTextFieldParto.setText(String.valueOf(TablaDatos.getValueAt(seleccionar, 4)));
            jTextFieldCantidadPartos.setText(String.valueOf(TablaDatos.getValueAt(seleccionar, 5)));
            jTextFieldSecado.setText(String.valueOf(TablaDatos.getValueAt(seleccionar, 6)));
            jTextFieldServicio.setText(String.valueOf(TablaDatos.getValueAt(seleccionar, 9)));
            jTextPadre.setText(String.valueOf(TablaDatos.getValueAt(seleccionar, 12)));
            jTextMadre.setText(String.valueOf(TablaDatos.getValueAt(seleccionar, 13)));
            addItemsJcombo(String.valueOf(TablaDatos.getValueAt(seleccionar, 11)));
            
    }//GEN-LAST:event_TablaDatosMouseClicked
    
    private void jButtonListoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonListoActionPerformed
        
        if(jLabelMostrarChapeta.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Seleccione un animal de la lista");
        }
        else{
            
            

            try {
                con = DriverManager.getConnection(url, user, clave);
                stmt = con.createStatement();
                stmt.executeUpdate("UPDATE vacas SET chapeta = '"+jTextFieldChapeta.getText()+"' , "
                        + "fecha_nac = '"+jTextFieldNacimiento.getText()+"' , "
                        + "fecha_ult_parto = '"+jTextFieldParto.getText()+"' ,"
                        + "partos = '"+jTextFieldCantidadPartos.getText()+"' ,"
                        + "secado = '"+jTextFieldSecado.getText()+"' ,"
                        + "entrada = '"+jTextFieldEntrada.getText()+"' ,"
                        + "raza = '"+jComboBoxRaza.getSelectedItem().toString()+"' ,"
                        + "nombre = '"+jTextNombre.getText()+"' ,"
                        + "padre = '"+jTextPadre.getText()+"' ,"
                        + "madre = '"+jTextMadre.getText()+"' ,"
                        + "ultimo_servicio = '"+jTextFieldServicio.getText()+"' , "
                        + "posible_parto = DATE_ADD('"+jTextFieldServicio.getText()+"', INTERVAL 285 DAY) "
                                + "WHERE id = '"+jLabelId.getText()+"'");
                
            } catch (SQLException ex) {
                Logger.getLogger(Registrar.class.getName()).log(Level.SEVERE, null, ex);
            } 

            JOptionPane.showMessageDialog(null, "INGRESO EXITOSO");
            jTextFieldChapeta.setText("");
            jTextFieldNacimiento.setText("");
            jLabelId.setText("");
            jTextFieldBuscar.setText("");
            jLabelMostrarChapeta.setText("");
            
            buscarProducto(jTextFieldBuscar.getText());

        }
    }//GEN-LAST:event_jButtonListoActionPerformed

    private void jTextFieldNacimientoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNacimientoKeyReleased
    
    }//GEN-LAST:event_jTextFieldNacimientoKeyReleased

    private void jTextFieldNacimientoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldNacimientoMouseClicked
        
    }//GEN-LAST:event_jTextFieldNacimientoMouseClicked

    private void jTextFieldNacimientoMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldNacimientoMouseMoved
        
    }//GEN-LAST:event_jTextFieldNacimientoMouseMoved

    private void jTextFieldNacimientoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNacimientoKeyTyped
        
    }//GEN-LAST:event_jTextFieldNacimientoKeyTyped

    private void jTextFieldChapetaMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldChapetaMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldChapetaMouseMoved

    private void jTextFieldChapetaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldChapetaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldChapetaMouseClicked

    private void jTextFieldChapetaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldChapetaKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldChapetaKeyReleased

    private void jTextFieldChapetaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldChapetaKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldChapetaKeyTyped

    private void jButtonAtras1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtras1ActionPerformed
        Vacas I = new Vacas();
        I.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonAtras1ActionPerformed

    private void jButtonInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInicioActionPerformed
        InicioFinca I = new InicioFinca();
        I.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonInicioActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        buscarProducto(jTextFieldBuscar.getText());
        jTextFieldBuscar.setText("");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextFieldEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEntradaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldEntradaActionPerformed

    private void jTextFieldEntradaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldEntradaKeyTyped
        char c= evt.getKeyChar();
        if(Character.isLowerCase(c)){
            String cad=(""+c).toUpperCase();
            c= cad.charAt(0);
            evt.setKeyChar(c);
        }
    }//GEN-LAST:event_jTextFieldEntradaKeyTyped

    private void jTextFieldPartoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPartoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPartoActionPerformed

    private void jTextFieldPartoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldPartoKeyTyped
        char c= evt.getKeyChar();
        if(Character.isLowerCase(c)){
            String cad=(""+c).toUpperCase();
            c= cad.charAt(0);
            evt.setKeyChar(c);
        }
    }//GEN-LAST:event_jTextFieldPartoKeyTyped

    private void jTextFieldCantidadPartosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCantidadPartosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCantidadPartosActionPerformed

    private void jTextFieldCantidadPartosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldCantidadPartosKeyTyped
        char n = evt.getKeyChar();
        if(n < '0' || n> '9') evt.consume();
        if(jTextFieldCantidadPartos.getText().length()>= 10){
            evt.consume();
        }
    }//GEN-LAST:event_jTextFieldCantidadPartosKeyTyped

    private void jTextFieldSecadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldSecadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldSecadoActionPerformed

    private void jTextFieldSecadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldSecadoKeyTyped
        char c= evt.getKeyChar();
        if(Character.isLowerCase(c)){
            String cad=(""+c).toUpperCase();
            c= cad.charAt(0);
            evt.setKeyChar(c);
        }
    }//GEN-LAST:event_jTextFieldSecadoKeyTyped

    private void jTextFieldServicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldServicioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldServicioActionPerformed

    private void jTextFieldServicioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldServicioKeyTyped
        char c= evt.getKeyChar();
        if(Character.isLowerCase(c)){
            String cad=(""+c).toUpperCase();
            c= cad.charAt(0);
            evt.setKeyChar(c);
        }
    }//GEN-LAST:event_jTextFieldServicioKeyTyped

    private void jTextNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextNombreActionPerformed

    private void jTextNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextNombreKeyTyped
        char c= evt.getKeyChar();
        if(Character.isLowerCase(c)){
            String cad=(""+c).toUpperCase();
            c= cad.charAt(0);
            evt.setKeyChar(c);
        }
    }//GEN-LAST:event_jTextNombreKeyTyped

    private void jTextMadreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextMadreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextMadreActionPerformed

    private void jTextMadreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextMadreKeyTyped
        char c= evt.getKeyChar();
        if(Character.isLowerCase(c)){
            String cad=(""+c).toUpperCase();
            c= cad.charAt(0);
            evt.setKeyChar(c);
        }
    }//GEN-LAST:event_jTextMadreKeyTyped

    private void jTextPadreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextPadreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextPadreActionPerformed

    private void jTextPadreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextPadreKeyTyped
        char c= evt.getKeyChar();
        if(Character.isLowerCase(c)){
            String cad=(""+c).toUpperCase();
            c= cad.charAt(0);
            evt.setKeyChar(c);
        }
    }//GEN-LAST:event_jTextPadreKeyTyped

    private void jButtonListo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonListo1ActionPerformed
        if(jLabelMostrarChapeta.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Seleccione un animal de la lista");
        }
        else{
            
            

            try {
                con = DriverManager.getConnection(url, user, clave);
                stmt = con.createStatement();
                stmt.executeUpdate("DELETE FROM vacas WHERE id = '"+jLabelId.getText()+"' ");
                
            } catch (SQLException ex) {
                Logger.getLogger(Registrar.class.getName()).log(Level.SEVERE, null, ex);
            } 

            JOptionPane.showMessageDialog(null, "Animal eliminado");
            jTextFieldChapeta.setText("");
            jTextFieldNacimiento.setText("");
            jLabelId.setText("");
            jTextFieldBuscar.setText("");
            jLabelMostrarChapeta.setText("");
            
            buscarProducto(jTextFieldBuscar.getText());

        }
    }//GEN-LAST:event_jButtonListo1ActionPerformed
    
    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(ModificarVaca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModificarVaca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModificarVaca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModificarVaca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new ModificarVaca().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel MostrarCodigo;
    public javax.swing.JTable TablaDatos;
    private javax.swing.JButton jButton3;
    public javax.swing.JButton jButtonAtras1;
    private javax.swing.JButton jButtonInicio;
    public javax.swing.JButton jButtonListo;
    public javax.swing.JButton jButtonListo1;
    public static javax.swing.JComboBox<String> jComboBoxRaza;
    private javax.swing.JLabel jLabelBuscarNombre2;
    private javax.swing.JLabel jLabelCantidad;
    private javax.swing.JLabel jLabelCantidad1;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jLabelId;
    private javax.swing.JLabel jLabelMostrarChapeta;
    private javax.swing.JLabel jLabelMostrarNombre3;
    private javax.swing.JLabel jLabelNombres2;
    private javax.swing.JLabel jLabelNombres3;
    private javax.swing.JLabel jLabelNombres4;
    private javax.swing.JLabel jLabelPrecio1;
    private javax.swing.JLabel jLabelPrecio3;
    private javax.swing.JLabel jLabelPrecio4;
    private javax.swing.JLabel jLabelPrecio5;
    private javax.swing.JLabel jLabelPrecio6;
    private javax.swing.JLabel jLabelTelefono;
    private javax.swing.JScrollPane jScrollPaneProducto;
    public javax.swing.JTextField jTextFieldBuscar;
    private javax.swing.JTextField jTextFieldCantidadPartos;
    private javax.swing.JTextField jTextFieldChapeta;
    public javax.swing.JTextField jTextFieldEntrada;
    private javax.swing.JTextField jTextFieldNacimiento;
    private javax.swing.JTextField jTextFieldParto;
    private javax.swing.JTextField jTextFieldSecado;
    private javax.swing.JTextField jTextFieldServicio;
    public javax.swing.JTextField jTextMadre;
    public javax.swing.JTextField jTextNombre;
    public javax.swing.JTextField jTextPadre;
    // End of variables declaration//GEN-END:variables

    private class SumaCantidad {

        public SumaCantidad() {
        
        
        
        }
    }
}
