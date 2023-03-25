/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Finca;

import static Finca.BuscarVaca.jComboBoxPredio;
import InicioPrincipal.ColorFondo;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
/**
 *
 * @author User
 */
public class RegistrarLitros extends javax.swing.JFrame {
    String user = Conexion.user;
    String clave = Conexion.clave;
    String url = Conexion.url;
    Connection con;
    Statement stmt;
    ResultSet rs;
    DefaultTableModel modelo = new DefaultTableModel();
    /**
     * Creates new form Inicio
     */
    public RegistrarLitros() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle(Conexion.nombreNegocio+": registrar cliente");
        try {
                Class.forName("com.mysql.cj.jdbc.Driver");
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(RegistrarLitros.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        jTextFieldBuscar.setText(fecha());
        jTextFieldFecha.setText(fecha());
        
        //Crear tabla
        
        modelo.addColumn("ID");
        modelo.addColumn("CANTIDAD");
        modelo.addColumn("FECHA");
        modelo.addColumn("PREDIO");
        
        
        
        TablaDatos.setModel(modelo);
        
        
        seleccionarPredio();
        buscarProducto();
            
       
    }
    public Image getIconImage(){
       Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes1/icono.png"));
       return retValue;
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabelCantidadLitros = new javax.swing.JLabel();
        jTextFieldBuscar = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPaneProducto = new javax.swing.JScrollPane();
        TablaDatos = new javax.swing.JTable();
        jLabelNombres1 = new javax.swing.JLabel();
        jComboBoxPredio = new javax.swing.JComboBox<>();
        jLabelPrecio1 = new javax.swing.JLabel();
        jTextFieldFecha = new javax.swing.JTextField();
        jButtonListo = new javax.swing.JButton();
        jButtonCancelar1 = new javax.swing.JButton();
        jLabelPrecio2 = new javax.swing.JLabel();
        jTextFieldCantidadLitros = new javax.swing.JTextField();
        jButtonAtras1 = new javax.swing.JButton();
        jButtonInicio = new javax.swing.JButton();
        jLabelLogo = new javax.swing.JLabel();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("BUSCAR POR FECHA:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 20, -1, -1));

        jLabel3.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("CANTIDAD DE LITROS:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 480, -1, -1));

        jLabelCantidadLitros.setBackground(new java.awt.Color(102, 255, 102));
        jLabelCantidadLitros.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jLabelCantidadLitros.setOpaque(true);
        getContentPane().add(jLabelCantidadLitros, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 520, 110, 30));

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
        getContentPane().add(jTextFieldBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 60, 260, -1));

        jButton1.setText("BUSCAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 70, -1, -1));

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

        getContentPane().add(jScrollPaneProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 130, 780, 330));

        jLabelNombres1.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jLabelNombres1.setForeground(new java.awt.Color(51, 51, 51));
        jLabelNombres1.setText("PREDIO:");
        getContentPane().add(jLabelNombres1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 110, -1));

        jComboBoxPredio.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jComboBoxPredio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxPredioActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBoxPredio, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 310, 250, 40));

        jLabelPrecio1.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jLabelPrecio1.setForeground(new java.awt.Color(51, 51, 51));
        jLabelPrecio1.setText("LITROS:");
        getContentPane().add(jLabelPrecio1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, 100, -1));

        jTextFieldFecha.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jTextFieldFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldFechaActionPerformed(evt);
            }
        });
        jTextFieldFecha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldFechaKeyTyped(evt);
            }
        });
        getContentPane().add(jTextFieldFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 370, 240, -1));

        jButtonListo.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jButtonListo.setForeground(new java.awt.Color(51, 51, 51));
        jButtonListo.setText("REGISTRAR");
        jButtonListo.setBorderPainted(false);
        jButtonListo.setContentAreaFilled(false);
        jButtonListo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonListo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonListoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonListo, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 550, 230, 60));

        jButtonCancelar1.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jButtonCancelar1.setForeground(new java.awt.Color(51, 51, 51));
        jButtonCancelar1.setText("CANCELAR");
        jButtonCancelar1.setBorderPainted(false);
        jButtonCancelar1.setContentAreaFilled(false);
        jButtonCancelar1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonCancelar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelar1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCancelar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 550, 160, 60));

        jLabelPrecio2.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jLabelPrecio2.setForeground(new java.awt.Color(51, 51, 51));
        jLabelPrecio2.setText("FECHA:");
        getContentPane().add(jLabelPrecio2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, 100, -1));

        jTextFieldCantidadLitros.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jTextFieldCantidadLitros.setText("0");
        jTextFieldCantidadLitros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCantidadLitrosActionPerformed(evt);
            }
        });
        jTextFieldCantidadLitros.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldCantidadLitrosKeyTyped(evt);
            }
        });
        getContentPane().add(jTextFieldCantidadLitros, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 420, 280, -1));

        jButtonAtras1.setBackground(new java.awt.Color(153, 153, 0));
        jButtonAtras1.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jButtonAtras1.setForeground(new java.awt.Color(255, 255, 255));
        jButtonAtras1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes1/atrasBlanco.png"))); // NOI18N
        jButtonAtras1.setBorderPainted(false);
        jButtonAtras1.setContentAreaFilled(false);
        jButtonAtras1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
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
        jButtonInicio.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInicioActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 30, -1, -1));

        jLabelLogo.setBackground(new java.awt.Color(255, 255, 255));
        jLabelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes1/caneca.png"))); // NOI18N
        getContentPane().add(jLabelLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, -1, -1));

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
    
    
    void buscarProducto(){
        
        modelo.setRowCount(0);
        
        
        String datos[] = new String [4];
         
        try {
            con = DriverManager.getConnection(url, user, clave);
            stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM leche WHERE predio LIKE "
                            + "'%"+jComboBoxPredio.getSelectedItem().toString()+"%' ");
            while(rs.next()){
                datos[0]= rs.getString(1);
                datos[1]= rs.getString(2);
                datos[2]= rs.getString(3);
                datos[3]= rs.getString(4);
                
               
                
                
                modelo.addRow(datos);
            }
            TablaDatos.setModel(modelo);
            
            TableColumn columna = TablaDatos.getColumn("ID");
           
            
             columna.setMinWidth(48);
            columna.setMaxWidth(48);
            
            
        } catch (SQLException ex) {
            Logger.getLogger(BuscarVaca.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        sumarLitros();
    }
    
    void buscarFecha(String buscar){
        
        modelo.setRowCount(0);
        
        
        String datos[] = new String [4];
         
        try {
            con = DriverManager.getConnection(url, user, clave);
            stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM leche WHERE predio LIKE "
                            + "'%"+jComboBoxPredio.getSelectedItem().toString()+"%' "
                                    + "AND fecha LIKE '%"+jTextFieldBuscar.getText()+"%'");
            while(rs.next()){
                datos[0]= rs.getString(1);
                datos[1]= rs.getString(2);
                datos[2]= rs.getString(3);
                datos[3]= rs.getString(4);
                
               
                
                
                modelo.addRow(datos);
            }
            TablaDatos.setModel(modelo);
            
            TableColumn columna = TablaDatos.getColumn("ID");
           
            
             columna.setMinWidth(48);
            columna.setMaxWidth(48);
            
            
        } catch (SQLException ex) {
            Logger.getLogger(BuscarVaca.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        sumarLitros();
        
    }
    
    void sumarLitros(){
        int filas = TablaDatos.getRowCount();
        int cont=0;
        
        for(int i=0; i<filas; i++){
            cont += Integer.parseInt((String) TablaDatos.getValueAt(i, 1));
        }
        
        jLabelCantidadLitros.setText(String.valueOf(cont));
    }
    
    private void jTextFieldFechaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldFechaKeyTyped
        char c= evt.getKeyChar();
        if(Character.isLowerCase(c)){
            String cad=(""+c).toUpperCase();
            c= cad.charAt(0);
            evt.setKeyChar(c);
        }
    }//GEN-LAST:event_jTextFieldFechaKeyTyped

    private void jTextFieldFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldFechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldFechaActionPerformed

    private void jButtonListoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonListoActionPerformed
        if(jTextFieldFecha.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "No ingresó la fecha");
            
        }else if(jTextFieldCantidadLitros.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "No ingresó la cantidad de leche");
        }
        
        else{
            
            
        
            try {
                con = DriverManager.getConnection(url, user, clave);
                stmt = con.createStatement();
                stmt.executeUpdate("INSERT INTO leche VALUES('0', '"+jTextFieldCantidadLitros.getText()+"' , "
                        + "'"+jTextFieldFecha.getText()+"' , "
                            + "'"+jComboBoxPredio.getSelectedItem().toString()+"')");
            } catch (SQLException ex) {
                Logger.getLogger(RegistrarLitros.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            JOptionPane.showMessageDialog(null, "Registro exitoso");
            
            buscarProducto();
            jTextFieldCantidadLitros.setText("");

        }
    }//GEN-LAST:event_jButtonListoActionPerformed

    private void jButtonCancelar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelar1ActionPerformed
        jTextFieldFecha.setText("");
        jTextFieldCantidadLitros.setText("");
    }//GEN-LAST:event_jButtonCancelar1ActionPerformed

    private void jTextFieldCantidadLitrosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldCantidadLitrosKeyTyped
        char []p={'1','2','3','4','5','6','7','8','9','0','.'};
        int b=0;
        for(int i=0;i<=10;i++){
            if (p[i]==evt.getKeyChar()){b=1;}
 
        }
        if(b==0){evt.consume();  getToolkit().beep(); }
    }//GEN-LAST:event_jTextFieldCantidadLitrosKeyTyped

    private void jTextFieldCantidadLitrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCantidadLitrosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCantidadLitrosActionPerformed

    private void jButtonAtras1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtras1ActionPerformed
        Leche I = new Leche();
        I.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonAtras1ActionPerformed

    private void jButtonInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInicioActionPerformed
        InicioFinca I = new InicioFinca();
        I.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonInicioActionPerformed

    private void jComboBoxPredioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxPredioActionPerformed
        buscarProducto();
    }//GEN-LAST:event_jComboBoxPredioActionPerformed

    private void jTextFieldBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldBuscarActionPerformed
        buscarFecha(jTextFieldBuscar.getText());
        

    }//GEN-LAST:event_jTextFieldBuscarActionPerformed

    private void jTextFieldBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldBuscarKeyReleased

    }//GEN-LAST:event_jTextFieldBuscarKeyReleased

    private void jTextFieldBuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldBuscarKeyTyped
        char c= evt.getKeyChar();
        if(Character.isLowerCase(c)){
            String cad=(""+c).toUpperCase();
            c= cad.charAt(0);
            evt.setKeyChar(c);
        }
    }//GEN-LAST:event_jTextFieldBuscarKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        buscarFecha(jTextFieldBuscar.getText());
        
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(RegistrarLitros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrarLitros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrarLitros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrarLitros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrarLitros().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTable TablaDatos;
    private javax.swing.JButton jButton1;
    public javax.swing.JButton jButtonAtras1;
    public javax.swing.JButton jButtonCancelar1;
    private javax.swing.JButton jButtonInicio;
    private javax.swing.JButton jButtonListo;
    public static javax.swing.JComboBox<String> jComboBoxPredio;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelCantidadLitros;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jLabelLogo;
    private javax.swing.JLabel jLabelNombres1;
    private javax.swing.JLabel jLabelPrecio1;
    private javax.swing.JLabel jLabelPrecio2;
    private javax.swing.JScrollPane jScrollPaneProducto;
    public javax.swing.JTextField jTextFieldBuscar;
    private javax.swing.JTextField jTextFieldCantidadLitros;
    public javax.swing.JTextField jTextFieldFecha;
    // End of variables declaration//GEN-END:variables
}
