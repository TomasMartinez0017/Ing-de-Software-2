/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;
import dominio.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
/**
 *
 * @author Usuario
 */
public class PanelIdentificacion extends javax.swing.JPanel {
    private Sistema sistema;
    private JFrame ventana;

    /**
     * Creates new form PanelIdentificacion
     */
    public PanelIdentificacion(Sistema unSistema, JFrame unaVentana) {
        initComponents();
        sistema=unSistema;
        ventana=unaVentana;
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1147, 784));
        setLayout(null);

        jButton1.setBackground(new java.awt.Color(255, 0, 102));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Administrador");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1);
        jButton1.setBounds(210, 300, 259, 86);

        jButton2.setBackground(new java.awt.Color(255, 0, 102));
        jButton2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Usuario/Profesional");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2);
        jButton2.setBounds(670, 300, 259, 86);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Seleccione una opción");
        add(jLabel1);
        jLabel1.setBounds(0, 30, 1150, 170);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/freshvegetablesAlexRaths-4c1ea186a88e4fd7b95283eee614600c.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        add(jLabel2);
        jLabel2.setBounds(0, 0, 1150, 780);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String contrasena = JOptionPane.showInputDialog(null,"Ingrese contraseña","Contraseña", JOptionPane.WARNING_MESSAGE);
        if(contrasena != null && contrasena.equals("admin")){
            ventana.remove(this);
            InterfazBotonesAdministrador vent= new InterfazBotonesAdministrador(sistema,ventana);
            ventana.pack();
        }
        else if (contrasena!=null && !contrasena.equals("admin")){
            JOptionPane.showMessageDialog(null, "Contraseña incorrecta", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        ventana.remove(this);
        PanelCambioDeUsuario vent= new PanelCambioDeUsuario(ventana, sistema);
        ventana.add(vent);
        ventana.pack();
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
