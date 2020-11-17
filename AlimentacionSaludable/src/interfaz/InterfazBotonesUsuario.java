package interfaz;

import dominio.Sistema;
import dominio.Usuario;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class InterfazBotonesUsuario extends javax.swing.JPanel {

    private Sistema sistema;
    private JPanel actual;
    private JFrame ventana;
    private Usuario usuarioActual;

    public InterfazBotonesUsuario(Sistema unSistema, JFrame unaVentana, Usuario unUsuario) {
        initComponents();
        sistema = unSistema;
        ventana = unaVentana;
        usuarioActual = unUsuario;
        actual = new PanelHomeUsuario(sistema, this, ventana);
        ventana.add(this);
        ventana.add(actual);
        etiquetaUsuarioActual.setText(this.usuarioActual.getNombre());
        jLabelNombreUser.setText(usuarioActual.getNombre());
    }

    public JPanel getActual() {
        return actual;
    }

    public void setActual(JPanel actual) {
        this.actual = actual;
    }

    public Usuario getUsuarioActual() {
        return usuarioActual;
    }

    public void setUsuarioActual(Usuario usuarioActual) {
        this.usuarioActual = usuarioActual;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBotonesUsuario = new javax.swing.JPanel();
        btnHome = new javax.swing.JButton();
        btnPedirPlan = new javax.swing.JButton();
        btnConsultaDirecta = new javax.swing.JButton();
        btnPerfil = new javax.swing.JButton();
        btnCambiarUsuario = new javax.swing.JButton();
        btnAgregarComida = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();
        etiquetaUsuarioActual = new javax.swing.JLabel();
        jLabelIcon = new javax.swing.JLabel();
        jLabelNombreUser = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(250, 784));
        setLayout(null);

        panelBotonesUsuario.setBackground(new java.awt.Color(255, 0, 102));
        panelBotonesUsuario.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelBotonesUsuario.setMinimumSize(new java.awt.Dimension(250, 784));
        panelBotonesUsuario.setPreferredSize(new java.awt.Dimension(250, 784));
        panelBotonesUsuario.setLayout(null);

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
        panelBotonesUsuario.add(btnHome);
        btnHome.setBounds(0, 110, 270, 46);

        btnPedirPlan.setBackground(new java.awt.Color(255, 0, 102));
        btnPedirPlan.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnPedirPlan.setForeground(new java.awt.Color(255, 255, 255));
        btnPedirPlan.setText("Pedir Plan");
        btnPedirPlan.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnPedirPlan.setContentAreaFilled(false);
        btnPedirPlan.setOpaque(true);
        btnPedirPlan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPedirPlanActionPerformed(evt);
            }
        });
        panelBotonesUsuario.add(btnPedirPlan);
        btnPedirPlan.setBounds(0, 310, 270, 43);

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
        panelBotonesUsuario.add(btnConsultaDirecta);
        btnConsultaDirecta.setBounds(0, 240, 270, 43);

        btnPerfil.setBackground(new java.awt.Color(255, 0, 102));
        btnPerfil.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnPerfil.setForeground(new java.awt.Color(255, 255, 255));
        btnPerfil.setText("Perfil");
        btnPerfil.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnPerfil.setContentAreaFilled(false);
        btnPerfil.setOpaque(true);
        btnPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPerfilActionPerformed(evt);
            }
        });
        panelBotonesUsuario.add(btnPerfil);
        btnPerfil.setBounds(0, 180, 270, 43);

        btnCambiarUsuario.setBackground(new java.awt.Color(255, 0, 102));
        btnCambiarUsuario.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnCambiarUsuario.setForeground(new java.awt.Color(255, 255, 255));
        btnCambiarUsuario.setText("Inicio");
        btnCambiarUsuario.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCambiarUsuario.setContentAreaFilled(false);
        btnCambiarUsuario.setOpaque(true);
        btnCambiarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCambiarUsuarioActionPerformed(evt);
            }
        });
        panelBotonesUsuario.add(btnCambiarUsuario);
        btnCambiarUsuario.setBounds(0, 440, 270, 45);

        btnAgregarComida.setBackground(new java.awt.Color(255, 0, 102));
        btnAgregarComida.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        btnAgregarComida.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarComida.setText("Agregar Comida a Dieta");
        btnAgregarComida.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAgregarComida.setContentAreaFilled(false);
        btnAgregarComida.setOpaque(true);
        btnAgregarComida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarComidaActionPerformed(evt);
            }
        });
        panelBotonesUsuario.add(btnAgregarComida);
        btnAgregarComida.setBounds(0, 370, 270, 45);

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo2.png"))); // NOI18N
        panelBotonesUsuario.add(fondo);
        fondo.setBounds(0, 70, 270, 720);
        panelBotonesUsuario.add(etiquetaUsuarioActual);
        etiquetaUsuarioActual.setBounds(23, 604, 282, 42);

        jLabelIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/baseline_account_box_white_48dp.png"))); // NOI18N
        panelBotonesUsuario.add(jLabelIcon);
        jLabelIcon.setBounds(0, 0, 60, 70);

        jLabelNombreUser.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelNombreUser.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNombreUser.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelNombreUser.setText("Prueba lindo");
        panelBotonesUsuario.add(jLabelNombreUser);
        jLabelNombreUser.setBounds(60, 0, 210, 70);

        add(panelBotonesUsuario);
        panelBotonesUsuario.setBounds(-1, 0, 270, 810);
    }// </editor-fold>//GEN-END:initComponents

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        ventana.remove(actual);
        actual = new PanelHomeUsuario(sistema, this, ventana);
        ventana.add(actual);
        ventana.pack();
    }//GEN-LAST:event_btnHomeActionPerformed

    private void btnPedirPlanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPedirPlanActionPerformed
        ventana.remove(actual);
        actual = new PanelPlanAlimentacionUsuario(sistema, ventana, this);
        ventana.add(actual);
        ventana.pack();
    }//GEN-LAST:event_btnPedirPlanActionPerformed

    private void btnConsultaDirectaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultaDirectaActionPerformed
        ventana.remove(actual);
        actual = new PanelConsultaProfesional(sistema, this, ventana);
        ventana.add(actual);
        ventana.pack();
    }//GEN-LAST:event_btnConsultaDirectaActionPerformed

    private void btnPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPerfilActionPerformed
        ventana.remove(actual);
        actual = new PanelPerfilUsuario(sistema, ventana, this);
        ventana.add(actual);
        ventana.pack();
    }//GEN-LAST:event_btnPerfilActionPerformed

    private void btnCambiarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCambiarUsuarioActionPerformed
        ventana.remove(actual);
        ventana.remove(this);
        actual = new PanelIdentificacion(sistema, ventana);
        ventana.add(actual);
        ventana.pack();
    }//GEN-LAST:event_btnCambiarUsuarioActionPerformed

    private void btnAgregarComidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarComidaActionPerformed
        ventana.remove(actual);
        actual = new PanelDietaDiariaUsuario(sistema, ventana, this);
        ventana.add(actual);
        ventana.pack();
    }//GEN-LAST:event_btnAgregarComidaActionPerformed

   


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarComida;
    private javax.swing.JButton btnCambiarUsuario;
    private javax.swing.JButton btnConsultaDirecta;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnPedirPlan;
    private javax.swing.JButton btnPerfil;
    private javax.swing.JLabel etiquetaUsuarioActual;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabelIcon;
    private javax.swing.JLabel jLabelNombreUser;
    private javax.swing.JPanel panelBotonesUsuario;
    // End of variables declaration//GEN-END:variables
}
