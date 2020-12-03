package interfaz;

import dominio.Profesional;
import dominio.Sistema;
import java.awt.Color;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;

public class PanelPlanAlimentacionUsuario extends javax.swing.JPanel {

    //Atributos
    private Sistema sistema;
    private JFrame ventana;
    private InterfazBotonesUsuario interfaz;

    //Constructor
    public PanelPlanAlimentacionUsuario(Sistema unSistema,
            JFrame unaVentana,
            InterfazBotonesUsuario unaInterfaz) {
        initComponents();
        sistema = unSistema;
        ventana = unaVentana;
        interfaz = unaInterfaz;
        listaProfesionalesAlim.setModel(new DefaultComboBoxModel(sistema.getListaProfesionales().toArray()));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPlan = new javax.swing.JPanel();
        etiquetaProfesionalACargo = new javax.swing.JLabel();
        listaProfesionalesAlim = new javax.swing.JComboBox();
        btnAceptarPlan = new javax.swing.JButton();
        etiquetaPlanDeAlimentacion = new javax.swing.JLabel();
        mensajeAlAceptar = new javax.swing.JLabel();

        panelPlan.setBackground(new java.awt.Color(255, 255, 255));
        panelPlan.setPreferredSize(new java.awt.Dimension(1147, 784));
        panelPlan.setLayout(null);

        etiquetaProfesionalACargo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        etiquetaProfesionalACargo.setText("Profesional a cargo:");
        panelPlan.add(etiquetaProfesionalACargo);
        etiquetaProfesionalACargo.setBounds(130, 170, 220, 29);

        listaProfesionalesAlim.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        panelPlan.add(listaProfesionalesAlim);
        listaProfesionalesAlim.setBounds(360, 170, 360, 39);

        btnAceptarPlan.setBackground(new java.awt.Color(255, 0, 102));
        btnAceptarPlan.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnAceptarPlan.setForeground(new java.awt.Color(255, 255, 255));
        btnAceptarPlan.setText("Aceptar");
        btnAceptarPlan.setContentAreaFilled(false);
        btnAceptarPlan.setOpaque(true);
        btnAceptarPlan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarPlanActionPerformed(evt);
            }
        });
        panelPlan.add(btnAceptarPlan);
        btnAceptarPlan.setBounds(740, 170, 150, 45);

        etiquetaPlanDeAlimentacion.setBackground(new java.awt.Color(255, 0, 102));
        etiquetaPlanDeAlimentacion.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        etiquetaPlanDeAlimentacion.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaPlanDeAlimentacion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiquetaPlanDeAlimentacion.setText("Plan de Alimentación");
        etiquetaPlanDeAlimentacion.setOpaque(true);
        panelPlan.add(etiquetaPlanDeAlimentacion);
        etiquetaPlanDeAlimentacion.setBounds(0, 0, 1150, 70);

        mensajeAlAceptar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        mensajeAlAceptar.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        panelPlan.add(mensajeAlAceptar);
        mensajeAlAceptar.setBounds(360, 230, 530, 50);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPlan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPlan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptarPlanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarPlanActionPerformed
        Profesional profesionalActivo = (Profesional) listaProfesionalesAlim.getSelectedItem();
        interfaz.getUsuarioActual().setProfesionalAsignado(profesionalActivo);
        interfaz.getUsuarioActual().setNecesitoPlan(true);
        if(profesionalActivo == null){
            mensajeAlAceptar.setText("No se ha seleccionado ningun profesional");
            mensajeAlAceptar.setForeground(Color.red);
        }
        else{
           mensajeAlAceptar.setText("Se ha pedido el plan de alimentación"); 
        }
        
    }//GEN-LAST:event_btnAceptarPlanActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptarPlan;
    private javax.swing.JLabel etiquetaPlanDeAlimentacion;
    private javax.swing.JLabel etiquetaProfesionalACargo;
    private javax.swing.JComboBox listaProfesionalesAlim;
    private javax.swing.JLabel mensajeAlAceptar;
    private javax.swing.JPanel panelPlan;
    // End of variables declaration//GEN-END:variables
}
