package interfaz;

import dominio.Mensaje;
import dominio.Profesional;
import dominio.Sistema;
import dominio.Usuario;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;

public class PanelRedactarConsultaDesdeProfesional extends javax.swing.JPanel {

    //Atributos
    private Sistema sistema;
    private InterfazBotonesProfesional interfazProf;
    private JFrame ventana;

    //Constructor para profesional
    public PanelRedactarConsultaDesdeProfesional(Sistema unSistema,
            InterfazBotonesProfesional interfazActual, JFrame unaVentana) {
        initComponents();
        sistema = unSistema;
        interfazProf = interfazActual;
        ventana = unaVentana;
        listaUsrConsultas.setModel(new DefaultComboBoxModel(sistema.getListaUsuarios().toArray()));
        jLabelMensajeEnviado.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelRedactarConsulta = new javax.swing.JPanel();
        btnVolverConsultas = new javax.swing.JButton();
        listaUsrConsultas = new javax.swing.JComboBox<>();
        etiquetaDestinatarioConsulta = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        textoConsultaAEnviar = new javax.swing.JTextArea();
        btnEnviarConsulta = new javax.swing.JButton();
        etiquetaMensaje = new javax.swing.JLabel();
        etiquetaAsunto = new javax.swing.JLabel();
        cajaAsunto = new javax.swing.JTextField();
        etiquetaTitulo = new javax.swing.JLabel();
        jLabelMensajeEnviado = new javax.swing.JLabel();

        setLayout(new java.awt.BorderLayout());

        panelRedactarConsulta.setBackground(new java.awt.Color(255, 255, 255));
        panelRedactarConsulta.setPreferredSize(new java.awt.Dimension(1147, 784));
        panelRedactarConsulta.setLayout(null);

        btnVolverConsultas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/volver.png"))); // NOI18N
        btnVolverConsultas.setBorderPainted(false);
        btnVolverConsultas.setContentAreaFilled(false);
        btnVolverConsultas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverConsultasActionPerformed(evt);
            }
        });
        panelRedactarConsulta.add(btnVolverConsultas);
        btnVolverConsultas.setBounds(1030, 720, 110, 50);

        listaUsrConsultas.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        listaUsrConsultas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        panelRedactarConsulta.add(listaUsrConsultas);
        listaUsrConsultas.setBounds(330, 90, 590, 39);

        etiquetaDestinatarioConsulta.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        etiquetaDestinatarioConsulta.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        etiquetaDestinatarioConsulta.setText("Destinatario: ");
        panelRedactarConsulta.add(etiquetaDestinatarioConsulta);
        etiquetaDestinatarioConsulta.setBounds(180, 90, 150, 30);

        textoConsultaAEnviar.setColumns(20);
        textoConsultaAEnviar.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        textoConsultaAEnviar.setRows(5);
        jScrollPane3.setViewportView(textoConsultaAEnviar);

        panelRedactarConsulta.add(jScrollPane3);
        jScrollPane3.setBounds(330, 190, 590, 393);

        btnEnviarConsulta.setBackground(new java.awt.Color(255, 0, 102));
        btnEnviarConsulta.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnEnviarConsulta.setForeground(new java.awt.Color(255, 255, 255));
        btnEnviarConsulta.setText("Enviar");
        btnEnviarConsulta.setContentAreaFilled(false);
        btnEnviarConsulta.setOpaque(true);
        btnEnviarConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarConsultaActionPerformed(evt);
            }
        });
        panelRedactarConsulta.add(btnEnviarConsulta);
        btnEnviarConsulta.setBounds(820, 600, 100, 35);

        etiquetaMensaje.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        etiquetaMensaje.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        etiquetaMensaje.setText("Mensaje: ");
        panelRedactarConsulta.add(etiquetaMensaje);
        etiquetaMensaje.setBounds(220, 190, 110, 26);

        etiquetaAsunto.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        etiquetaAsunto.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        etiquetaAsunto.setText("Asunto: ");
        panelRedactarConsulta.add(etiquetaAsunto);
        etiquetaAsunto.setBounds(230, 140, 100, 26);

        cajaAsunto.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        panelRedactarConsulta.add(cajaAsunto);
        cajaAsunto.setBounds(330, 140, 590, 32);

        etiquetaTitulo.setBackground(new java.awt.Color(255, 0, 102));
        etiquetaTitulo.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        etiquetaTitulo.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiquetaTitulo.setText("Redactar Consulta ");
        etiquetaTitulo.setOpaque(true);
        panelRedactarConsulta.add(etiquetaTitulo);
        etiquetaTitulo.setBounds(0, -6, 1160, 80);

        jLabelMensajeEnviado.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabelMensajeEnviado.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        panelRedactarConsulta.add(jLabelMensajeEnviado);
        jLabelMensajeEnviado.setBounds(370, 610, 430, 20);

        add(panelRedactarConsulta, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverConsultasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverConsultasActionPerformed
        ventana.remove(this);
        PanelConsultaProfesionalDesdeProfesional nuevo = new PanelConsultaProfesionalDesdeProfesional(sistema, interfazProf, ventana);
        interfazProf.setActual(nuevo);
        ventana.add(nuevo);
        ventana.pack();
    }//GEN-LAST:event_btnVolverConsultasActionPerformed

    private void btnEnviarConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarConsultaActionPerformed
        if(!textoConsultaAEnviar.getText().isEmpty()){
            Mensaje mensajeAEnviar = new Mensaje();
            Usuario destino = (Usuario) listaUsrConsultas.getSelectedItem();
            mensajeAEnviar.setOrigen(interfazProf.getUsuarioActivo());
            mensajeAEnviar.setDestino(destino);
            mensajeAEnviar.setAsunto(cajaAsunto.getText());
            mensajeAEnviar.setMensaje(textoConsultaAEnviar.getText());
            destino.getCasillaDeEntrada().add(mensajeAEnviar);
            jLabelMensajeEnviado.setText("Mensaje enviado correctamente");
            jLabelMensajeEnviado.setVisible(true);
        }
        else{
            jLabelMensajeEnviado.setText("Error: el mensaje no puede ser vacío");
            jLabelMensajeEnviado.setVisible(true);
        }
        
        
    }//GEN-LAST:event_btnEnviarConsultaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEnviarConsulta;
    private javax.swing.JButton btnVolverConsultas;
    private javax.swing.JTextField cajaAsunto;
    private javax.swing.JLabel etiquetaAsunto;
    private javax.swing.JLabel etiquetaDestinatarioConsulta;
    private javax.swing.JLabel etiquetaMensaje;
    private javax.swing.JLabel etiquetaTitulo;
    private javax.swing.JLabel jLabelMensajeEnviado;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JComboBox<String> listaUsrConsultas;
    private javax.swing.JPanel panelRedactarConsulta;
    private javax.swing.JTextArea textoConsultaAEnviar;
    // End of variables declaration//GEN-END:variables
}
