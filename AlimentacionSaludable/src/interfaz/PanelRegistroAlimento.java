package interfaz;

import dominio.Sistema;
import dominio.Alimento;
import java.awt.Color;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class PanelRegistroAlimento extends javax.swing.JPanel {

    //Atributos
    private Sistema sistema;
    private Alimento alimento;
    private JFrame ventana;

    //Cosntructor
    public PanelRegistroAlimento(Sistema unSistema, JFrame unaVentana) {
        initComponents();
        sistema = unSistema;
        ventana = unaVentana;
        alimento = new Alimento();
        Alimento.TipoAlimento[] listaTipoAlimento = alimento.getListaEnumTipoAlimento();
        listaTiposAlimentos.setModel(new DefaultComboBoxModel(listaTipoAlimento));
        listaTiposAlimentos.setSelectedIndex(Alimento.TipoAlimento.FRUTA.ordinal());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelRegAlimento = new javax.swing.JPanel();
        etiquetaRegistroAlim = new javax.swing.JLabel();
        etiquetaNombAlim = new javax.swing.JLabel();
        cajaNombreAlim = new javax.swing.JTextField();
        etiquetaTipoAlim = new javax.swing.JLabel();
        listaTiposAlimentos = new javax.swing.JComboBox<>();
        btnAceptarRegAlim = new javax.swing.JButton();
        checkBoxProteinas = new javax.swing.JCheckBox();
        checkBoxLipidos = new javax.swing.JCheckBox();
        checkBoxHidratosDeCarbono = new javax.swing.JCheckBox();
        checkBoxVitaminas = new javax.swing.JCheckBox();
        checkBoxMinerales = new javax.swing.JCheckBox();
        checkBoxAgua = new javax.swing.JCheckBox();
        checkBoxFibra = new javax.swing.JCheckBox();
        etiquetaErrorNombreAlimento = new javax.swing.JLabel();
        etiquetaMensajeAlAceptar = new javax.swing.JLabel();
        etiquetaTituloPpalesNutrientes = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1147, 784));

        panelRegAlimento.setBackground(new java.awt.Color(255, 255, 255));
        panelRegAlimento.setPreferredSize(new java.awt.Dimension(1147, 784));
        panelRegAlimento.setLayout(null);

        etiquetaRegistroAlim.setBackground(new java.awt.Color(255, 0, 102));
        etiquetaRegistroAlim.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        etiquetaRegistroAlim.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaRegistroAlim.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiquetaRegistroAlim.setText("Registrar Alimento");
        etiquetaRegistroAlim.setOpaque(true);
        panelRegAlimento.add(etiquetaRegistroAlim);
        etiquetaRegistroAlim.setBounds(0, 0, 1150, 60);

        etiquetaNombAlim.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        etiquetaNombAlim.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        etiquetaNombAlim.setText("Nombre: ");
        panelRegAlimento.add(etiquetaNombAlim);
        etiquetaNombAlim.setBounds(210, 130, 210, 29);

        cajaNombreAlim.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        cajaNombreAlim.setPreferredSize(new java.awt.Dimension(8, 32));
        panelRegAlimento.add(cajaNombreAlim);
        cajaNombreAlim.setBounds(420, 130, 320, 32);

        etiquetaTipoAlim.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        etiquetaTipoAlim.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        etiquetaTipoAlim.setText("Tipo de alimento: ");
        panelRegAlimento.add(etiquetaTipoAlim);
        etiquetaTipoAlim.setBounds(210, 180, 210, 30);

        listaTiposAlimentos.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        listaTiposAlimentos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        listaTiposAlimentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaTiposAlimentosActionPerformed(evt);
            }
        });
        panelRegAlimento.add(listaTiposAlimentos);
        listaTiposAlimentos.setBounds(420, 180, 320, 39);

        btnAceptarRegAlim.setBackground(new java.awt.Color(255, 0, 102));
        btnAceptarRegAlim.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnAceptarRegAlim.setForeground(new java.awt.Color(255, 255, 255));
        btnAceptarRegAlim.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/baseline_done_outline_white_18dp.png"))); // NOI18N
        btnAceptarRegAlim.setContentAreaFilled(false);
        btnAceptarRegAlim.setMaximumSize(new java.awt.Dimension(60, 60));
        btnAceptarRegAlim.setMinimumSize(new java.awt.Dimension(60, 60));
        btnAceptarRegAlim.setOpaque(true);
        btnAceptarRegAlim.setPreferredSize(new java.awt.Dimension(60, 60));
        btnAceptarRegAlim.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                btnAceptarRegAlimFocusLost(evt);
            }
        });
        btnAceptarRegAlim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarRegAlimActionPerformed(evt);
            }
        });
        panelRegAlimento.add(btnAceptarRegAlim);
        btnAceptarRegAlim.setBounds(1060, 700, 60, 60);

        checkBoxProteinas.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        checkBoxProteinas.setText("Proteínas");
        checkBoxProteinas.setContentAreaFilled(false);
        checkBoxProteinas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxProteinasActionPerformed(evt);
            }
        });
        panelRegAlimento.add(checkBoxProteinas);
        checkBoxProteinas.setBounds(420, 230, 140, 35);

        checkBoxLipidos.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        checkBoxLipidos.setText("Lípidos");
        checkBoxLipidos.setContentAreaFilled(false);
        checkBoxLipidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxLipidosActionPerformed(evt);
            }
        });
        panelRegAlimento.add(checkBoxLipidos);
        checkBoxLipidos.setBounds(560, 230, 120, 35);

        checkBoxHidratosDeCarbono.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        checkBoxHidratosDeCarbono.setText("Hidratos de Carbono");
        checkBoxHidratosDeCarbono.setContentAreaFilled(false);
        checkBoxHidratosDeCarbono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxHidratosDeCarbonoActionPerformed(evt);
            }
        });
        panelRegAlimento.add(checkBoxHidratosDeCarbono);
        checkBoxHidratosDeCarbono.setBounds(560, 270, 246, 33);

        checkBoxVitaminas.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        checkBoxVitaminas.setText("Vitaminas");
        checkBoxVitaminas.setContentAreaFilled(false);
        checkBoxVitaminas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxVitaminasActionPerformed(evt);
            }
        });
        panelRegAlimento.add(checkBoxVitaminas);
        checkBoxVitaminas.setBounds(420, 270, 150, 33);

        checkBoxMinerales.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        checkBoxMinerales.setText("Minerales");
        checkBoxMinerales.setContentAreaFilled(false);
        checkBoxMinerales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxMineralesActionPerformed(evt);
            }
        });
        panelRegAlimento.add(checkBoxMinerales);
        checkBoxMinerales.setBounds(420, 310, 140, 35);

        checkBoxAgua.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        checkBoxAgua.setText("Agua");
        checkBoxAgua.setContentAreaFilled(false);
        checkBoxAgua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxAguaActionPerformed(evt);
            }
        });
        panelRegAlimento.add(checkBoxAgua);
        checkBoxAgua.setBounds(560, 310, 100, 35);

        checkBoxFibra.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        checkBoxFibra.setText("Fibra");
        checkBoxFibra.setContentAreaFilled(false);
        checkBoxFibra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxFibraActionPerformed(evt);
            }
        });
        panelRegAlimento.add(checkBoxFibra);
        checkBoxFibra.setBounds(420, 350, 120, 33);

        etiquetaErrorNombreAlimento.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        panelRegAlimento.add(etiquetaErrorNombreAlimento);
        etiquetaErrorNombreAlimento.setBounds(760, 130, 370, 40);

        etiquetaMensajeAlAceptar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        etiquetaMensajeAlAceptar.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        panelRegAlimento.add(etiquetaMensajeAlAceptar);
        etiquetaMensajeAlAceptar.setBounds(10, 670, 820, 29);

        etiquetaTituloPpalesNutrientes.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        etiquetaTituloPpalesNutrientes.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        etiquetaTituloPpalesNutrientes.setText("Principales Nutrientes: ");
        panelRegAlimento.add(etiquetaTituloPpalesNutrientes);
        etiquetaTituloPpalesNutrientes.setBounds(140, 230, 280, 29);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRegAlimento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelRegAlimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void checkBoxHidratosDeCarbonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxHidratosDeCarbonoActionPerformed
        boolean estadoActual = alimento.getListaNutrientesSeleccionados()[Alimento.Nutrientes.HIDRATOS_DE_CARBONO.ordinal()];
        estadoActual = !estadoActual;
    }//GEN-LAST:event_checkBoxHidratosDeCarbonoActionPerformed

    private void checkBoxFibraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxFibraActionPerformed
        boolean estadoActual = alimento.getListaNutrientesSeleccionados()[Alimento.Nutrientes.FIBRA.ordinal()];
        estadoActual = !estadoActual;
    }//GEN-LAST:event_checkBoxFibraActionPerformed

    private void btnAceptarRegAlimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarRegAlimActionPerformed
        Alimento comparo = new Alimento();
        comparo.setNombre(cajaNombreAlim.getText());
        boolean nombre = !cajaNombreAlim.getText().trim().isEmpty() && !sistema.getListaAlimentos().contains(comparo);
        boolean principalesNutrientes = (checkBoxFibra.isSelected() || checkBoxAgua.isSelected() 
                                        || checkBoxHidratosDeCarbono.isSelected() || checkBoxLipidos.isSelected()
                                        || checkBoxMinerales.isSelected() || checkBoxProteinas.isSelected()
                                        || checkBoxVitaminas.isSelected());
        if (nombre && principalesNutrientes) {
            alimento.setNombre(cajaNombreAlim.getText());
            alimento.setTipo(alimento.getListaEnumTipoAlimento()[listaTiposAlimentos.getSelectedIndex()]);
            etiquetaMensajeAlAceptar.setText("Alimento registrado correctamente");
            sistema.getListaAlimentos().add(alimento);
        } else if(!nombre){
            if(sistema.getListaAlimentos().contains(comparo)){
                etiquetaMensajeAlAceptar.setText("Error al ingresar el alimento: alimneto ya registrado");
                etiquetaMensajeAlAceptar.setForeground(Color.red);
            }
            else{
                etiquetaMensajeAlAceptar.setText("Error al ingresar el alimento: ingrese un nombre válido");
                etiquetaMensajeAlAceptar.setForeground(Color.red);
            }
        } else if(!principalesNutrientes) {
            etiquetaMensajeAlAceptar.setText("Error al ingresar el alimento: seleccione algun nutriente");
            etiquetaMensajeAlAceptar.setForeground(Color.red);
        }
        alimento = new Alimento();
    }//GEN-LAST:event_btnAceptarRegAlimActionPerformed

    private void checkBoxProteinasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxProteinasActionPerformed
        boolean estadoActual = alimento.getListaNutrientesSeleccionados()[Alimento.Nutrientes.PROTEINAS.ordinal()];
        estadoActual = !estadoActual;
    }//GEN-LAST:event_checkBoxProteinasActionPerformed

    private void checkBoxLipidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxLipidosActionPerformed
        boolean estadoActual = alimento.getListaNutrientesSeleccionados()[Alimento.Nutrientes.LIPIDOS.ordinal()];
        estadoActual = !estadoActual;
    }//GEN-LAST:event_checkBoxLipidosActionPerformed

    private void checkBoxVitaminasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxVitaminasActionPerformed
        boolean estadoActual = alimento.getListaNutrientesSeleccionados()[Alimento.Nutrientes.VITAMINAS.ordinal()];
        estadoActual = !estadoActual;
    }//GEN-LAST:event_checkBoxVitaminasActionPerformed

    private void checkBoxMineralesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxMineralesActionPerformed
        boolean estadoActual = alimento.getListaNutrientesSeleccionados()[Alimento.Nutrientes.MINERALES.ordinal()];
        estadoActual = !estadoActual;
    }//GEN-LAST:event_checkBoxMineralesActionPerformed

    private void checkBoxAguaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxAguaActionPerformed
        boolean estadoActual = alimento.getListaNutrientesSeleccionados()[Alimento.Nutrientes.AGUA.ordinal()];
        estadoActual = !estadoActual;
    }//GEN-LAST:event_checkBoxAguaActionPerformed

    private void listaTiposAlimentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaTiposAlimentosActionPerformed

    }//GEN-LAST:event_listaTiposAlimentosActionPerformed

    private void btnAceptarRegAlimFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btnAceptarRegAlimFocusLost
        // TODO add your handling code here:
        etiquetaMensajeAlAceptar.setText("");
    }//GEN-LAST:event_btnAceptarRegAlimFocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptarRegAlim;
    private javax.swing.JTextField cajaNombreAlim;
    private javax.swing.JCheckBox checkBoxAgua;
    private javax.swing.JCheckBox checkBoxFibra;
    private javax.swing.JCheckBox checkBoxHidratosDeCarbono;
    private javax.swing.JCheckBox checkBoxLipidos;
    private javax.swing.JCheckBox checkBoxMinerales;
    private javax.swing.JCheckBox checkBoxProteinas;
    private javax.swing.JCheckBox checkBoxVitaminas;
    private javax.swing.JLabel etiquetaErrorNombreAlimento;
    private javax.swing.JLabel etiquetaMensajeAlAceptar;
    private javax.swing.JLabel etiquetaNombAlim;
    private javax.swing.JLabel etiquetaRegistroAlim;
    private javax.swing.JLabel etiquetaTipoAlim;
    private javax.swing.JLabel etiquetaTituloPpalesNutrientes;
    private javax.swing.JComboBox<String> listaTiposAlimentos;
    private javax.swing.JPanel panelRegAlimento;
    // End of variables declaration//GEN-END:variables

}
