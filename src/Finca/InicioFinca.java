/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Finca;
import InicioPrincipal.Inicio;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
/**
 *
 * @author User
 */
public class InicioFinca extends javax.swing.JFrame {

    /**
     * Creates new form Inicio
     */
    public InicioFinca() {
        initComponents();
        this.setTitle(Conexion.nombreNegocio+": inicio");
        this.setLocationRelativeTo(null);
        transpareciaBoton();
        //setIconImage(new ImageIcon(getClass().getResource("imagenes1/LogoFamil.png")).getImage());
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

        jButtonInicio = new javax.swing.JButton();
        jButtonInventario = new javax.swing.JButton();
        jButtonFac = new javax.swing.JButton();
        jButtonModificar = new javax.swing.JButton();
        jButtonClientes = new javax.swing.JButton();
        jLabelLogo = new javax.swing.JLabel();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        getContentPane().add(jButtonInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 30, -1, -1));

        jButtonInventario.setBackground(new java.awt.Color(0, 0, 0));
        jButtonInventario.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jButtonInventario.setForeground(new java.awt.Color(51, 51, 51));
        jButtonInventario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes1/inventario bien.png"))); // NOI18N
        jButtonInventario.setText("GASTOS");
        jButtonInventario.setAutoscrolls(true);
        jButtonInventario.setBorderPainted(false);
        jButtonInventario.setContentAreaFilled(false);
        jButtonInventario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonInventario.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInventarioActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonInventario, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 390, 210, 210));

        jButtonFac.setBackground(new java.awt.Color(0, 0, 0));
        jButtonFac.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jButtonFac.setForeground(new java.awt.Color(51, 51, 51));
        jButtonFac.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes1/icono.png"))); // NOI18N
        jButtonFac.setText("BOVINOS");
        jButtonFac.setBorderPainted(false);
        jButtonFac.setContentAreaFilled(false);
        jButtonFac.setFocusPainted(false);
        jButtonFac.setFocusable(false);
        jButtonFac.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonFac.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonFac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFacActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonFac, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 180, 220));

        jButtonModificar.setBackground(new java.awt.Color(0, 0, 0));
        jButtonModificar.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jButtonModificar.setForeground(new java.awt.Color(51, 51, 51));
        jButtonModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes1/productos bien.png"))); // NOI18N
        jButtonModificar.setText("FINCA");
        jButtonModificar.setBorder(null);
        jButtonModificar.setBorderPainted(false);
        jButtonModificar.setContentAreaFilled(false);
        jButtonModificar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonModificar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonModificar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModificarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 390, 200, 210));

        jButtonClientes.setBackground(new java.awt.Color(0, 0, 0));
        jButtonClientes.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jButtonClientes.setForeground(new java.awt.Color(51, 51, 51));
        jButtonClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes1/clientes bien.png"))); // NOI18N
        jButtonClientes.setText("LECHE");
        jButtonClientes.setAutoscrolls(true);
        jButtonClientes.setBorderPainted(false);
        jButtonClientes.setContentAreaFilled(false);
        jButtonClientes.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonClientes.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonClientesActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 70, 210, 210));

        jLabelLogo.setBackground(new java.awt.Color(255, 255, 255));
        jLabelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Logos/vaca.png"))); // NOI18N
        getContentPane().add(jLabelLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 240, -1, -1));

        jLabelFondo.setBackground(new java.awt.Color(102, 204, 0));
        jLabelFondo.setOpaque(true);
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1290, 690));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void transpareciaBoton(){
        jButtonFac.setOpaque(false);
        jButtonFac.setContentAreaFilled(false);
        jButtonFac.setBorderPainted(false);
        jButtonModificar.setOpaque(false);
        jButtonModificar.setContentAreaFilled(false);
        jButtonModificar.setBorderPainted(false);
       jButtonInventario.setOpaque(false);
        jButtonInventario.setContentAreaFilled(false);
        jButtonInventario.setBorderPainted(false);
        jButtonClientes.setOpaque(false);
        jButtonClientes.setContentAreaFilled(false);
       jButtonClientes.setBorderPainted(false);
    }
    private void jButtonFacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFacActionPerformed
        Vacas V = new Vacas();
        V.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_jButtonFacActionPerformed

    private void jButtonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModificarActionPerformed
        FincaMod M = new FincaMod();
        M.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonModificarActionPerformed

    private void jButtonClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClientesActionPerformed
        Leche R = new Leche();
        R.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonClientesActionPerformed

    private void jButtonInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInventarioActionPerformed
        GastosMenu M = new GastosMenu();
        M.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonInventarioActionPerformed

    private void jButtonInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInicioActionPerformed
        Inicio I = new Inicio();
        I.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonInicioActionPerformed

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
            java.util.logging.Logger.getLogger(InicioFinca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InicioFinca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InicioFinca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InicioFinca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InicioFinca().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonClientes;
    private javax.swing.JButton jButtonFac;
    private javax.swing.JButton jButtonInicio;
    private javax.swing.JButton jButtonInventario;
    private javax.swing.JButton jButtonModificar;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jLabelLogo;
    // End of variables declaration//GEN-END:variables
}