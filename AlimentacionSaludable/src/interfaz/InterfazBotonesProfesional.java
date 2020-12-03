package interfaz;

import dominio.Profesional;
import dominio.Sistema;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class InterfazBotonesProfesional extends javax.swing.JPanel {

    //Atrbutos
    private Sistema sistema;
    private JFrame ventana;
    private JPanel actual;
    private Profesional usuarioActivo;

    //Cosntructor
    public InterfazBotonesProfesional(Sistema unSistema, JFrame unaVentana,
            Profesional unProfesional) {
        initComponents();
        sistema = unSistema;
        ventana = unaVentana;
        usuarioActivo = unProfesional;
        actual = new PanelHomeProfesional(unSistema, this, unaVentana);
        ventana.add(this);
        ventana.add(actual);
        jLabelProf.setText(usuarioActivo.getNombre());
    }

    public JPanel getActual() {
        return actual;
    }

    public void setActual(JPanel actual) {
        this.actual = actual;
    }

    public Profesional getUsuarioActivo() {
        return usuarioActivo;
    }

    public void setUsuarioActivo(Profesional usuarioActivo) {
        this.usuarioActivo = usuarioActivo;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnHome = new javax.swing.JButton();
        btnRealizarPlan = new javax.swing.JButton();
        btnConsultaDirecta = new javax.swing.JButton();
        btnCambiarUsuario = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();
        jLabelIcon = new javax.swing.JLabel();
        jLabelProf = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 0, 102));
        setPreferredSize(new java.awt.Dimension(250, 784));
        setLayout(null);

        btnHome.setBackground(new java.awt.Color(255, 0, 102));
        btnHome.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnHome.setForeground(new java.awt.Color(255, 255, 255));
        btnHome.setText("Home");
        btnHome.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnHome.setContentAreaFilled(false);
        btnHome.setOpaque(true);
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });
        add(btnHome);
        btnHome.setBounds(0, 100, 258, 41);

        btnRealizarPlan.setBackground(new java.awt.Color(255, 0, 102));
        btnRealizarPlan.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnRealizarPlan.setForeground(new java.awt.Color(255, 255, 255));
        btnRealizarPlan.setText("Realizar Plan");
        btnRealizarPlan.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnRealizarPlan.setContentAreaFilled(false);
        btnRealizarPlan.setOpaque(true);
        btnRealizarPlan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRealizarPlanActionPerformed(evt);
            }
        });
        add(btnRealizarPlan);
        btnRealizarPlan.setBounds(0, 160, 258, 44);

        btnConsultaDirecta.setBackground(new java.awt.Color(255, 0, 102));
        btnConsultaDirecta.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnConsultaDirecta.setForeground(new java.awt.Color(255, 255, 255));
        btnConsultaDirecta.setText("Consulta Directa");
        btnConsultaDirecta.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnConsultaDirecta.setContentAreaFilled(false);
        btnConsultaDirecta.setOpaque(true);
        btnConsultaDirecta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultaDirectaActionPerformed(evt);
            }
        });
        add(btnConsultaDirecta);
        btnConsultaDirecta.setBounds(0, 220, 258, 43);

        btnCambiarUsuario.setBackground(new java.awt.Color(255, 0, 102));
        btnCambiarUsuario.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnCambiarUsuario.setForeground(new java.awt.Color(255, 255, 255));
        btnCambiarUsuario.setText("Salir");
        btnCambiarUsuario.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCambiarUsuario.setContentAreaFilled(false);
        btnCambiarUsuario.setOpaque(true);
        btnCambiarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCambiarUsuarioActionPerformed(evt);
            }
        });
        add(btnCambiarUsuario);
        btnCambiarUsuario.setBounds(0, 280, 258, 44);

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo2.png"))); // NOI18N
        add(fondo);
        fondo.setBounds(0, 74, 260, 710);

        jLabelIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/baseline_account_box_white_48dp.png"))); // NOI18N
        add(jLabelIcon);
        jLabelIcon.setBounds(0, 0, 60, 70);

        jLabelProf.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelProf.setForeground(new java.awt.Color(255, 255, 255));
        jLabelProf.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelProf.setText("Prueba 2");
        add(jLabelProf);
        jLabelProf.setBounds(70, 4, 160, 70);
    }// </editor-fold>//GEN-END:initComponents

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        ventana.remove(actual);
        actual = new PanelHomeProfesional(sistema, this, ventana);
        ventana.add(actual);
        ventana.pack();
    }//GEN-LAST:event_btnHomeActionPerformed

    private void btnConsultaDirectaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultaDirectaActionPerformed
        ventana.remove(actual);
        actual = new PanelConsultaProfesionalDesdeProfesional(sistema, this, ventana);
        ventana.add(actual);
        ventana.pack();
    }//GEN-LAST:event_btnConsultaDirectaActionPerformed

    private void btnRealizarPlanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRealizarPlanActionPerformed
        ventana.remove(actual);
        actual = new PanelSeleccionarPlanARealizar(sistema, this, ventana);
        ventana.add(actual);
        ventana.pack();
    }//GEN-LAST:event_btnRealizarPlanActionPerformed

    private void btnCambiarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCambiarUsuarioActionPerformed
        int result = JOptionPane.showConfirmDialog(ventana, "¿Desea cerrar sesión?", "Salir", JOptionPane.YES_OPTION, JOptionPane.NO_OPTION);
        if(result == 0){
            ventana.remove(actual);
            ventana.remove(this);
            actual = new PanelIdentificacion(sistema, ventana);
            ventana.add(actual);
            ventana.pack();
        } 
    }//GEN-LAST:event_btnCambiarUsuarioActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCambiarUsuario;
    private javax.swing.JButton btnConsultaDirecta;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnRealizarPlan;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabelIcon;
    private javax.swing.JLabel jLabelProf;
    // End of variables declaration//GEN-END:variables
}
