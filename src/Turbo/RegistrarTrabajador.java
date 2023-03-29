/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Turbo;

import Finca.*;
import InicioPrincipal.ColorFondo;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
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
public class RegistrarTrabajador extends javax.swing.JFrame {
    String user = Conexion.user;
    String clave = Conexion.clave;
    String url = Conexion.urlTurbo;
    Connection con;
    Statement stmt;
    ResultSet rs;
    String datos[] = new String [2]; 
    DefaultTableModel modelo = new DefaultTableModel();
    
    /**
     * Creates new form Inicio
     */
    public RegistrarTrabajador() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle(Conexion.nombreNegocio+": registrar trabajador");
        try {
                Class.forName("com.mysql.cj.jdbc.Driver");
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(RegistrarTrabajador.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        modelo.addColumn("ID");
        modelo.addColumn("NOMBRE");

        
        cargarDatos();
            
       
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

        jLabelId = new javax.swing.JLabel();
        MostrarCodigo1 = new javax.swing.JLabel();
        jButtonListo1 = new javax.swing.JButton();
        jScrollPaneProducto = new javax.swing.JScrollPane();
        TablaDatos = new javax.swing.JTable();
        jTextFieldNombre = new javax.swing.JTextField();
        jButtonListo = new javax.swing.JButton();
        jButtonCancelar1 = new javax.swing.JButton();
        jLabelPrecio2 = new javax.swing.JLabel();
        jButtonAtras1 = new javax.swing.JButton();
        jButtonInicio = new javax.swing.JButton();
        jLabelLogo = new javax.swing.JLabel();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelId.setBackground(new java.awt.Color(102, 255, 102));
        jLabelId.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jLabelId.setOpaque(true);
        getContentPane().add(jLabelId, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 150, 100, 30));

        MostrarCodigo1.setBackground(new java.awt.Color(0, 0, 0));
        MostrarCodigo1.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        MostrarCodigo1.setForeground(new java.awt.Color(51, 51, 51));
        MostrarCodigo1.setText("ID:");
        getContentPane().add(MostrarCodigo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 150, 40, 30));

        jButtonListo1.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jButtonListo1.setForeground(new java.awt.Color(51, 51, 51));
        jButtonListo1.setText("ELIMINAR");
        jButtonListo1.setBorderPainted(false);
        jButtonListo1.setContentAreaFilled(false);
        jButtonListo1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonListo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonListo1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonListo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 210, 160, 40));

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

        getContentPane().add(jScrollPaneProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 650, 350));

        jTextFieldNombre.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jTextFieldNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNombreActionPerformed(evt);
            }
        });
        jTextFieldNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldNombreKeyTyped(evt);
            }
        });
        getContentPane().add(jTextFieldNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 150, 240, -1));

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
        getContentPane().add(jButtonListo, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 310, 170, 40));

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
        getContentPane().add(jButtonCancelar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 250, 160, 60));

        jLabelPrecio2.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jLabelPrecio2.setForeground(new java.awt.Color(51, 51, 51));
        jLabelPrecio2.setText("NOMBRE Y APELLIDO:");
        getContentPane().add(jLabelPrecio2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 260, -1));

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
        getContentPane().add(jButtonAtras1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 580, 100, 40));

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
        getContentPane().add(jButtonInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 20, -1, -1));

        jLabelLogo.setBackground(new java.awt.Color(255, 255, 255));
        jLabelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Logos/jack.png"))); // NOI18N
        getContentPane().add(jLabelLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 370, 140, 140));

        jLabelFondo.setBackground(new java.awt.Color(0, 204, 204));
        jLabelFondo.setOpaque(true);
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 650));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    void cargarDatos(){
        try {
            con = DriverManager.getConnection(url, user, clave);
            stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM trabajadores");
            while(rs.next()){
                datos[0]= rs.getString(1);
                datos[1]= rs.getString(2);




                modelo.addRow(datos);
            }
            TablaDatos.setModel(modelo);
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
    
    private void jTextFieldNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNombreKeyTyped
        char c= evt.getKeyChar();
        if(Character.isLowerCase(c)){
            String cad=(""+c).toUpperCase();
            c= cad.charAt(0);
            evt.setKeyChar(c);
        }
    }//GEN-LAST:event_jTextFieldNombreKeyTyped

    private void jTextFieldNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNombreActionPerformed

    private void jButtonListoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonListoActionPerformed
        
            
        if(jTextFieldNombre.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "No ingresó el nombre del trabajador");
            
        }
       
        
        else{
            
            
                try {
                con = DriverManager.getConnection(url, user, clave);
                stmt = con.createStatement();
                stmt.executeUpdate("INSERT INTO trabajadores VALUES('0' , '"+jTextFieldNombre.getText()+"')");
                } catch (SQLException ex) {
                    Logger.getLogger(RegistrarTrabajador.class.getName()).log(Level.SEVERE, null, ex);
                }
            
            modelo.setRowCount(0);
            cargarDatos();
            
            JOptionPane.showMessageDialog(null, "Registro exitoso");
            


        }
    }//GEN-LAST:event_jButtonListoActionPerformed

    private void jButtonCancelar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelar1ActionPerformed
                 
            jTextFieldNombre.setText("");
    }//GEN-LAST:event_jButtonCancelar1ActionPerformed

    private void jButtonAtras1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtras1ActionPerformed
        OpcionesMenu I = new OpcionesMenu();
        I.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonAtras1ActionPerformed

    private void jButtonInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInicioActionPerformed
        InicioParqueadero I = new InicioParqueadero();
        I.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonInicioActionPerformed

    private void jButtonListo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonListo1ActionPerformed
        if(jLabelId.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "No seleccionó el trabajador a eliminar");
        }

        else{

            int resp = JOptionPane.showConfirmDialog(null, "¿Está seguro que desea eliminar el trabajador?", "Alerta!", JOptionPane.YES_NO_OPTION);
            if(resp==0){
                try {
                    con = DriverManager.getConnection(url, user, clave);
                    stmt = con.createStatement();
                    stmt.executeUpdate("DELETE FROM trabajadores WHERE id ='"+jLabelId.getText()+"'");
                } catch (SQLException ex) {
                    Logger.getLogger(InicioParqueadero.class.getName()).log(Level.SEVERE, null, ex);
                }

                modelo.setRowCount(0);
                cargarDatos();
                jLabelId.setText("");
               
                JOptionPane.showMessageDialog(null, "Se ha eliminado el trabajador");
            }

        }
    }//GEN-LAST:event_jButtonListo1ActionPerformed

    private void TablaDatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaDatosMouseClicked
        int seleccionar = TablaDatos.rowAtPoint(evt.getPoint());
        jLabelId.setText(String.valueOf(TablaDatos.getValueAt(seleccionar, 0)));
    }//GEN-LAST:event_TablaDatosMouseClicked

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
            java.util.logging.Logger.getLogger(RegistrarTrabajador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrarTrabajador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrarTrabajador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrarTrabajador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrarTrabajador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel MostrarCodigo1;
    public javax.swing.JTable TablaDatos;
    public javax.swing.JButton jButtonAtras1;
    public javax.swing.JButton jButtonCancelar1;
    private javax.swing.JButton jButtonInicio;
    private javax.swing.JButton jButtonListo;
    private javax.swing.JButton jButtonListo1;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jLabelId;
    private javax.swing.JLabel jLabelLogo;
    private javax.swing.JLabel jLabelPrecio2;
    private javax.swing.JScrollPane jScrollPaneProducto;
    public javax.swing.JTextField jTextFieldNombre;
    // End of variables declaration//GEN-END:variables
}
