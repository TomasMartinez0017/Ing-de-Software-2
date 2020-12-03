package interfaz;

import dominio.Alimento;
import dominio.ComidaPorDia;
import dominio.Sistema;
import java.awt.Color;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JFrame;


public class PanelAgregarComidasADietaDiariaUsuario extends javax.swing.JPanel {

    private Sistema sistema;
    private JFrame ventana;
    private InterfazBotonesUsuario interfaz;

    public PanelAgregarComidasADietaDiariaUsuario(Sistema unSistema,
            JFrame unaVentana, InterfazBotonesUsuario unaInterfaz) {
        initComponents();
        sistema = unSistema;
        ventana = unaVentana;
        interfaz = unaInterfaz;
        listaComidasDiarias.setListData(sistema.getListaAlimentos().toArray());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        listaComidasDiarias = new javax.swing.JList();
        etiquetaTitulo = new javax.swing.JLabel();
        btnAgregarComida = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        jLabelError = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1147, 784));
        setLayout(null);

        listaComidasDiarias.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jScrollPane1.setViewportView(listaComidasDiarias);

        add(jScrollPane1);
        jScrollPane1.setBounds(280, 120, 370, 410);

        etiquetaTitulo.setBackground(new java.awt.Color(255, 0, 102));
        etiquetaTitulo.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        etiquetaTitulo.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiquetaTitulo.setText("Agregar Comida");
        etiquetaTitulo.setOpaque(true);
        add(etiquetaTitulo);
        etiquetaTitulo.setBounds(0, 0, 1140, 60);

        btnAgregarComida.setBackground(new java.awt.Color(255, 0, 102));
        btnAgregarComida.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnAgregarComida.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarComida.setText("Agregar Comida");
        btnAgregarComida.setContentAreaFilled(false);
        btnAgregarComida.setOpaque(true);
        btnAgregarComida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarComidaActionPerformed(evt);
            }
        });
        add(btnAgregarComida);
        btnAgregarComida.setBounds(670, 120, 210, 45);

        btnVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/volver.png"))); // NOI18N
        btnVolver.setBorderPainted(false);
        btnVolver.setContentAreaFilled(false);
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        add(btnVolver);
        btnVolver.setBounds(1010, 690, 110, 70);

        jLabelError.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        add(jLabelError);
        jLabelError.setBounds(670, 200, 470, 50);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarComidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarComidaActionPerformed
        Alimento comidaSeleccionada = (Alimento) listaComidasDiarias.getSelectedValue();
        if(comidaSeleccionada != null){
            interfaz.getUsuarioActual().getHistorialDelDia().getComidasIngeridas().add(comidaSeleccionada);
            LocalDate diaActual = LocalDate.now();
            interfaz.getUsuarioActual().setFechaUltimaAdicion(diaActual.toString());
        }else{
            jLabelError.setText("Error: Debe seleccionar un alimento");
            jLabelError.setForeground(Color.red);
        }
        
    }//GEN-LAST:event_btnAgregarComidaActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        LocalDate diaActual = LocalDate.now();
        ComidaPorDia comida = new ComidaPorDia(interfaz.getUsuarioActual().getHistorialDelDia().getComidasIngeridas(), diaActual.toString());
        if(interfaz.getUsuarioActual().getHistorialComidas().isEmpty()){
            interfaz.getUsuarioActual().getHistorialComidas().add(comida);
        }
        else{
            for(int i = 0; i < interfaz.getUsuarioActual().getHistorialComidas().size(); i++){
                ComidaPorDia aux = interfaz.getUsuarioActual().getHistorialComidas().get(i);
                if (!aux.getFecha().equals(diaActual.toString())){
                    interfaz.getUsuarioActual().getHistorialComidas().add(comida);
                }
            }
        }
        
        ventana.remove(this);
        PanelDietaDiariaUsuario nuevo = new PanelDietaDiariaUsuario(sistema, ventana, interfaz);
        interfaz.setActual(nuevo);
        ventana.add(nuevo);
        ventana.pack();
    }//GEN-LAST:event_btnVolverActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarComida;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel etiquetaTitulo;
    private javax.swing.JLabel jLabelError;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList listaComidasDiarias;
    // End of variables declaration//GEN-END:variables
}
