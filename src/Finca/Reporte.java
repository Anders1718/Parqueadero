    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Finca;
import InicioPrincipal.ColorFondo;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
/**
 *
 * @author User
 */
public class Reporte extends javax.swing.JFrame {
    String user = Conexion.user;
    String clave = Conexion.clave;
    String url = Conexion.url;
    Connection con ;
    Statement stmt;
    ResultSet rs;
    
    DecimalFormat formatea = new DecimalFormat("###,###.##");
    
    /**
     * Creates new form Inicio
     */
    public Reporte() {
        initComponents();
        this.setTitle("Reportes - "+ Conexion.nombreNegocio);
        this.setLocationRelativeTo(null);
        
        try {
                Class.forName("com.mysql.cj.jdbc.Driver");
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Reporte.class.getName()).log(Level.SEVERE, null, ex);
            }
        jTextFieldFecha1.setText(fecha());
        jTextFieldFecha2.setText(fecha());
        seleccionarPredio();
        buscarProducto();
        buscarEgreso();
        sumarDatosNeto();
        

    }
    public Image getIconImage(){
       Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes1/icono.png"));
       return retValue;
    }

    
    void buscarProducto(){
        
        
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("ID");
        modelo.addColumn("PREDIO");
        modelo.addColumn("FECHA");
        modelo.addColumn("PRECIO");
        modelo.addColumn("CANTIDAD");
        modelo.addColumn("TOTAL");
        

        TablaDatos.setModel(modelo);

        String datos[] = new String [6];
         
        try {
            con = DriverManager.getConnection(url, user, clave);
            stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM cheque WHERE "
                    + " predio LIKE '"+jComboBoxPredio.getSelectedItem().toString()+"' AND "
                        + "fecha BETWEEN '"+jTextFieldFecha1.getText()+"' AND '"+jTextFieldFecha2.getText()+"' ");
            while(rs.next()){
                
                datos[0]= rs.getString(1);
                datos[1]= rs.getString(2);
                datos[2]= rs.getString(3);
                datos[3]= rs.getString(4);
                datos[4]= rs.getString(5);
                datos[5]= rs.getString(6);
                
                
                
                modelo.addRow(datos);
                
            }
            TablaDatos.setModel(modelo);
            TableColumn columna = TablaDatos.getColumn("ID");
            
            
            
            
            
            
            columna.setMinWidth(48);
            columna.setMaxWidth(48);
            
            
                     
        } catch (SQLException ex) {
            Logger.getLogger(Reporte.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
    void buscarEgreso(){
        
        
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("ID");
        modelo.addColumn("DESCRIPCIÓN");
        modelo.addColumn("TIPO");
        modelo.addColumn("MONTO");
        modelo.addColumn("FECHA");
        modelo.addColumn("PREDIO");
        modelo.addColumn("CATEGORÍA");
        modelo.addColumn("PROVEEDOR");

        TablaDatosGastos.setModel(modelo);

        String datos[] = new String [8];
         
        try {
            con = DriverManager.getConnection(url, user, clave);
            stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM gastos WHERE "
                + " predio LIKE '"+jComboBoxPredio.getSelectedItem().toString()+"' AND "
                    + " fecha BETWEEN '"+jTextFieldFecha1.getText()+"' AND '"+jTextFieldFecha2.getText()+"'");
            while(rs.next()){
                
                datos[0]= rs.getString(1);
                datos[1]= rs.getString(2);
                datos[2]= rs.getString(3);
                datos[3]= rs.getString(4);
                datos[4]= rs.getString(5);
                datos[5]= rs.getString(6);
                datos[6]= rs.getString(7);
                datos[7]= rs.getString(8);
                modelo.addRow(datos);
                
            }
            TablaDatosGastos.setModel(modelo);
            TableColumn columna = TablaDatosGastos.getColumn("ID");
            
           
            
            
            columna.setMinWidth(48);
            columna.setMaxWidth(48);
            
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Reporte.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
    
    



    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jTextFieldFecha2 = new javax.swing.JTextField();
        jComboBoxPredio = new javax.swing.JComboBox<>();
        jLabelNombres1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jScrollPaneProducto1 = new javax.swing.JScrollPane();
        TablaDatosGastos = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        jScrollPaneProducto = new javax.swing.JScrollPane();
        TablaDatos = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jLabelGastos = new javax.swing.JLabel();
        jButtonAtras = new javax.swing.JButton();
        jTextFieldFecha1 = new javax.swing.JTextField();
        jLabelTotal = new javax.swing.JLabel();
        jButtonInicio = new javax.swing.JButton();
        jLabelBruto = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setBackground(new java.awt.Color(204, 0, 51));
        jLabel7.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("INGRESE LA FECHA FINAL:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 300, -1, -1));

        jTextFieldFecha2.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jTextFieldFecha2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 0)));
        jTextFieldFecha2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldFecha2ActionPerformed(evt);
            }
        });
        jTextFieldFecha2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldFecha2KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldFecha2KeyTyped(evt);
            }
        });
        getContentPane().add(jTextFieldFecha2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 300, 260, -1));

        jComboBoxPredio.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jComboBoxPredio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxPredioActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBoxPredio, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 190, 250, 40));

        jLabelNombres1.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jLabelNombres1.setForeground(new java.awt.Color(51, 51, 51));
        jLabelNombres1.setText("PREDIO:");
        getContentPane().add(jLabelNombres1, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 190, 110, -1));

        jButton3.setText("BUSCAR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 340, -1, -1));

        TablaDatos = new javax.swing.JTable(){
            public boolean isCellEditable(int riwIndex, int colIndex){
                return false;
            }
        };
        TablaDatosGastos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        TablaDatosGastos.getTableHeader().setReorderingAllowed(false);
        jScrollPaneProducto1.setViewportView(TablaDatosGastos);

        getContentPane().add(jScrollPaneProducto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 610, 280));

        jLabel11.setBackground(new java.awt.Color(204, 0, 51));
        jLabel11.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 51, 51));
        jLabel11.setText("TOTAL VENTAS:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 410, -1, -1));

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
        jScrollPaneProducto.setViewportView(TablaDatos);

        getContentPane().add(jScrollPaneProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 610, 280));

        jLabel8.setBackground(new java.awt.Color(204, 0, 51));
        jLabel8.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("TOTAL GASTOS:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 370, -1, -1));

        jLabelGastos.setBackground(new java.awt.Color(255, 255, 255));
        jLabelGastos.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jLabelGastos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 0)));
        jLabelGastos.setOpaque(true);
        getContentPane().add(jLabelGastos, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 370, 170, 30));

        jButtonAtras.setBackground(new java.awt.Color(204, 0, 51));
        jButtonAtras.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jButtonAtras.setForeground(new java.awt.Color(255, 255, 255));
        jButtonAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes1/atrasBlanco.png"))); // NOI18N
        jButtonAtras.setBorderPainted(false);
        jButtonAtras.setContentAreaFilled(false);
        jButtonAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtrasActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 590, 70, 40));

        jTextFieldFecha1.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jTextFieldFecha1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 0)));
        jTextFieldFecha1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldFecha1ActionPerformed(evt);
            }
        });
        jTextFieldFecha1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldFecha1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldFecha1KeyTyped(evt);
            }
        });
        getContentPane().add(jTextFieldFecha1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 240, 260, -1));

        jLabelTotal.setBackground(new java.awt.Color(255, 255, 255));
        jLabelTotal.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jLabelTotal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 0)));
        jLabelTotal.setOpaque(true);
        getContentPane().add(jLabelTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 450, 170, 30));

        jButtonInicio.setBackground(new java.awt.Color(204, 0, 51));
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
        getContentPane().add(jButtonInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 10, -1, -1));

        jLabelBruto.setBackground(new java.awt.Color(255, 255, 255));
        jLabelBruto.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jLabelBruto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 0)));
        jLabelBruto.setOpaque(true);
        getContentPane().add(jLabelBruto, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 410, 170, 30));

        jLabel6.setBackground(new java.awt.Color(0, 153, 102));
        jLabel6.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("GANANCIA:");
        jLabel6.setOpaque(true);
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 450, -1, -1));

        jLabel5.setBackground(new java.awt.Color(204, 0, 51));
        jLabel5.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("INGRESE LA FECHA DE INICIO:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 240, -1, -1));

        jLabelFondo.setBackground(new java.awt.Color(ColorFondo.getColor1(), ColorFondo.getColor2(), ColorFondo.getColor3()));
        jLabelFondo.setOpaque(true);
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1310, 650));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public static String fecha(){
       Date fecha = new Date();
       SimpleDateFormat formatofecha = new SimpleDateFormat("YYYY/MM/dd");
       return formatofecha.format(fecha);
    }  
    
    
    void sumarDatosNeto(){
        
        float cont=0;
        float contEgreso=0;
        float contNeto=0;
        int filas = TablaDatos.getRowCount();
        int filasGasto = TablaDatosGastos.getRowCount();
        
        
        
        
        for(int i=0; i<filas; i++){
            contNeto += Float.parseFloat((String) TablaDatos.getValueAt(i, 5));
        }
        
        
        
        for(int i=0; i<filasGasto; i++){
            contEgreso += Float.parseFloat((String) TablaDatosGastos.getValueAt(i, 3));
        }
        
        jLabelBruto.setText(String.valueOf(formatea.format(contNeto)));
        
        jLabelGastos.setText(String.valueOf(formatea.format(contEgreso)));
        cont= contNeto - contEgreso;
        
        jLabelTotal.setText(String.valueOf(formatea.format(cont)));
        
        
        
        
      }
    
    void seleccionarPredio(){
        try {
             
            con = DriverManager.getConnection(url, user, clave);
            stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM nombre_finca");

                while(rs.next()){
                    jComboBoxPredio.addItem(rs.getString(2));
                }
        
            
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }
      
      
    private void jButtonAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtrasActionPerformed
        FincaMod I = new FincaMod();
        I.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonAtrasActionPerformed

    private void jTextFieldFecha1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldFecha1KeyTyped
        char c= evt.getKeyChar();
        if(Character.isLowerCase(c)){
            String cad=(""+c).toUpperCase();
            c= cad.charAt(0);
            evt.setKeyChar(c);
        }
    }//GEN-LAST:event_jTextFieldFecha1KeyTyped

    private void jTextFieldFecha1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldFecha1ActionPerformed
        buscarProducto();
        buscarEgreso();
        sumarDatosNeto();
    }//GEN-LAST:event_jTextFieldFecha1ActionPerformed

    private void jTextFieldFecha1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldFecha1KeyReleased
        
    }//GEN-LAST:event_jTextFieldFecha1KeyReleased

    private void jButtonInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInicioActionPerformed
        InicioFinca I = new InicioFinca();
        I.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonInicioActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        buscarProducto();
        buscarEgreso();
        sumarDatosNeto();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jComboBoxPredioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxPredioActionPerformed
        buscarProducto();
        buscarEgreso();
    }//GEN-LAST:event_jComboBoxPredioActionPerformed

    private void jTextFieldFecha2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldFecha2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldFecha2ActionPerformed

    private void jTextFieldFecha2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldFecha2KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldFecha2KeyReleased

    private void jTextFieldFecha2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldFecha2KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldFecha2KeyTyped
    
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
            java.util.logging.Logger.getLogger(Reporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Reporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Reporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Reporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Reporte().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTable TablaDatos;
    public javax.swing.JTable TablaDatosGastos;
    private javax.swing.JButton jButton3;
    public javax.swing.JButton jButtonAtras;
    private javax.swing.JButton jButtonInicio;
    public static javax.swing.JComboBox<String> jComboBoxPredio;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelBruto;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jLabelGastos;
    private javax.swing.JLabel jLabelNombres1;
    private javax.swing.JLabel jLabelTotal;
    private javax.swing.JScrollPane jScrollPaneProducto;
    private javax.swing.JScrollPane jScrollPaneProducto1;
    public javax.swing.JTextField jTextFieldFecha1;
    public javax.swing.JTextField jTextFieldFecha2;
    // End of variables declaration//GEN-END:variables
}
