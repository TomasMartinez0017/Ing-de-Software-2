package interfaz;

import dominio.Profesional;
import dominio.Sistema;
import dominio.Usuario;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.filechooser.FileNameExtensionFilter;

public class PanelRegistroUsuario extends javax.swing.JPanel {

    //Atributos
    private Sistema sistema;
    private Usuario usuario;
    private JFrame ventana;

    //Constructor
    public PanelRegistroUsuario(Sistema unSistema, JFrame unaVentana) {
        initComponents();
        sistema = unSistema;
        ventana = unaVentana;
        usuario = new Usuario();
        grupoBotonesSexo.add(rBtnFemeninoUsuario);
        grupoBotonesSexo.add(rBtnMasculinoUsuario);
        rBtnMasculinoUsuario.setSelected(true);
        grupoBotonesPreferencias.add(rBVegano);
        grupoBotonesPreferencias.add(rBVegetariano);
        grupoBotonesPreferencias.add(rBMacrobiotico);
        grupoBotonesPreferencias.add(rBOrganico);
        Usuario.Nacionalidades[] listaNac = usuario.getListaEnumNac();
        listaNacionalidadesUsuario.setModel(new DefaultComboBoxModel(listaNac));
        listaNacionalidadesUsuario.setSelectedIndex(Usuario.Nacionalidades.URUGUAYA.ordinal());
        fotoPerfil.setSize(210, 240);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoBotonesSexo = new javax.swing.ButtonGroup();
        grupoBotonesPreferencias = new javax.swing.ButtonGroup();
        panelRegUsuario = new javax.swing.JPanel();
        etiquetaNombre = new javax.swing.JLabel();
        etiquetaApellidos = new javax.swing.JLabel();
        etiquetaNombUsuario = new javax.swing.JLabel();
        etiquetaFDNaciomiento = new javax.swing.JLabel();
        etiquetaFotoPerfil = new javax.swing.JLabel();
        cajaNombre = new javax.swing.JTextField();
        cajaApellidos = new javax.swing.JTextField();
        cajaNombUsuario = new javax.swing.JTextField();
        etiquetaPeso = new javax.swing.JLabel();
        etiquetaAltura = new javax.swing.JLabel();
        cajaAltura = new javax.swing.JTextField();
        cajaPeso = new javax.swing.JTextField();
        etiquetaMedidaPeso = new javax.swing.JLabel();
        etiquetaMedidaAltura = new javax.swing.JLabel();
        btnAceptarUsuario = new javax.swing.JButton();
        etiquetaTitulo = new javax.swing.JLabel();
        etiquetaNacionalidadUsuario = new javax.swing.JLabel();
        listaNacionalidadesUsuario = new javax.swing.JComboBox();
        etiquetaSexo = new javax.swing.JLabel();
        rBtnMasculinoUsuario = new javax.swing.JRadioButton();
        rBtnFemeninoUsuario = new javax.swing.JRadioButton();
        etiquetaRestricciones = new javax.swing.JLabel();
        checkBoxCeliaco = new javax.swing.JCheckBox();
        checkBoxIntoleranteLactosa = new javax.swing.JCheckBox();
        checkBoxDiabetico = new javax.swing.JCheckBox();
        checkBoxHipertension = new javax.swing.JCheckBox();
        etiquetaErrorAltura = new javax.swing.JLabel();
        etiquetaErrorPeso = new javax.swing.JLabel();
        etiquetaMensajeAlAceptar = new javax.swing.JLabel();
        fotoPerfil = new javax.swing.JLabel();
        fechaNacimiento = new com.toedter.calendar.JDateChooser();
        etiquetaErrorFechaNacimiento = new javax.swing.JLabel();
        etiquetaPreferencias = new javax.swing.JLabel();
        rBVegano = new javax.swing.JRadioButton();
        rBVegetariano = new javax.swing.JRadioButton();
        rBMacrobiotico = new javax.swing.JRadioButton();
        rBOrganico = new javax.swing.JRadioButton();
        btnCambiarFoto = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(1147, 784));

        panelRegUsuario.setBackground(new java.awt.Color(255, 255, 255));
        panelRegUsuario.setPreferredSize(new java.awt.Dimension(1147, 784));
        panelRegUsuario.setLayout(null);

        etiquetaNombre.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        etiquetaNombre.setText("Nombre:");
        panelRegUsuario.add(etiquetaNombre);
        etiquetaNombre.setBounds(370, 80, 92, 29);

        etiquetaApellidos.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        etiquetaApellidos.setText("Apellidos:");
        panelRegUsuario.add(etiquetaApellidos);
        etiquetaApellidos.setBounds(360, 130, 110, 26);

        etiquetaNombUsuario.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        etiquetaNombUsuario.setText("Nombre de Usuario:");
        panelRegUsuario.add(etiquetaNombUsuario);
        etiquetaNombUsuario.setBounds(250, 180, 220, 26);

        etiquetaFDNaciomiento.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        etiquetaFDNaciomiento.setText("Fecha de Nacimiento:");
        panelRegUsuario.add(etiquetaFDNaciomiento);
        etiquetaFDNaciomiento.setBounds(240, 280, 230, 26);

        etiquetaFotoPerfil.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        etiquetaFotoPerfil.setText("Foto de Perfil:");
        panelRegUsuario.add(etiquetaFotoPerfil);
        etiquetaFotoPerfil.setBounds(60, 70, 160, 29);

        cajaNombre.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        cajaNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaNombreActionPerformed(evt);
            }
        });
        panelRegUsuario.add(cajaNombre);
        cajaNombre.setBounds(480, 80, 160, 37);

        cajaApellidos.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        panelRegUsuario.add(cajaApellidos);
        cajaApellidos.setBounds(480, 130, 160, 37);

        cajaNombUsuario.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        cajaNombUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaNombUsuarioActionPerformed(evt);
            }
        });
        panelRegUsuario.add(cajaNombUsuario);
        cajaNombUsuario.setBounds(480, 180, 160, 37);

        etiquetaPeso.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        etiquetaPeso.setText("Peso:");
        panelRegUsuario.add(etiquetaPeso);
        etiquetaPeso.setBounds(410, 380, 60, 26);

        etiquetaAltura.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        etiquetaAltura.setText("Altura:");
        panelRegUsuario.add(etiquetaAltura);
        etiquetaAltura.setBounds(400, 330, 70, 26);

        cajaAltura.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        cajaAltura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaAlturaActionPerformed(evt);
            }
        });
        panelRegUsuario.add(cajaAltura);
        cajaAltura.setBounds(480, 330, 160, 37);

        cajaPeso.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        panelRegUsuario.add(cajaPeso);
        cajaPeso.setBounds(480, 380, 160, 37);

        etiquetaMedidaPeso.setText("Kg");
        panelRegUsuario.add(etiquetaMedidaPeso);
        etiquetaMedidaPeso.setBounds(650, 380, 15, 16);

        etiquetaMedidaAltura.setText("Cm");
        panelRegUsuario.add(etiquetaMedidaAltura);
        etiquetaMedidaAltura.setBounds(650, 330, 19, 16);

        btnAceptarUsuario.setBackground(new java.awt.Color(255, 0, 102));
        btnAceptarUsuario.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnAceptarUsuario.setForeground(new java.awt.Color(255, 255, 255));
        btnAceptarUsuario.setText("Aceptar");
        btnAceptarUsuario.setContentAreaFilled(false);
        btnAceptarUsuario.setOpaque(true);
        btnAceptarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarUsuarioActionPerformed(evt);
            }
        });
        panelRegUsuario.add(btnAceptarUsuario);
        btnAceptarUsuario.setBounds(820, 630, 170, 40);

        etiquetaTitulo.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        etiquetaTitulo.setForeground(new java.awt.Color(255, 0, 102));
        etiquetaTitulo.setText("Registro Usuario");
        panelRegUsuario.add(etiquetaTitulo);
        etiquetaTitulo.setBounds(390, 0, 330, 44);

        etiquetaNacionalidadUsuario.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        etiquetaNacionalidadUsuario.setText("Nacionalidad:");
        panelRegUsuario.add(etiquetaNacionalidadUsuario);
        etiquetaNacionalidadUsuario.setBounds(330, 230, 160, 29);

        listaNacionalidadesUsuario.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        listaNacionalidadesUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaNacionalidadesUsuarioActionPerformed(evt);
            }
        });
        panelRegUsuario.add(listaNacionalidadesUsuario);
        listaNacionalidadesUsuario.setBounds(480, 230, 160, 39);

        etiquetaSexo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        etiquetaSexo.setText("Sexo:");
        panelRegUsuario.add(etiquetaSexo);
        etiquetaSexo.setBounds(410, 420, 70, 29);

        rBtnMasculinoUsuario.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        rBtnMasculinoUsuario.setText("Masculino");
        rBtnMasculinoUsuario.setContentAreaFilled(false);
        rBtnMasculinoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rBtnMasculinoUsuarioActionPerformed(evt);
            }
        });
        panelRegUsuario.add(rBtnMasculinoUsuario);
        rBtnMasculinoUsuario.setBounds(480, 420, 150, 35);

        rBtnFemeninoUsuario.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        rBtnFemeninoUsuario.setText("Femenino");
        rBtnFemeninoUsuario.setContentAreaFilled(false);
        rBtnFemeninoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rBtnFemeninoUsuarioActionPerformed(evt);
            }
        });
        panelRegUsuario.add(rBtnFemeninoUsuario);
        rBtnFemeninoUsuario.setBounds(630, 420, 160, 35);

        etiquetaRestricciones.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        etiquetaRestricciones.setText("Restricciones:");
        panelRegUsuario.add(etiquetaRestricciones);
        etiquetaRestricciones.setBounds(320, 460, 150, 26);

        checkBoxCeliaco.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        checkBoxCeliaco.setText("Celíaco");
        checkBoxCeliaco.setContentAreaFilled(false);
        checkBoxCeliaco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxCeliacoActionPerformed(evt);
            }
        });
        panelRegUsuario.add(checkBoxCeliaco);
        checkBoxCeliaco.setBounds(470, 460, 120, 35);

        checkBoxIntoleranteLactosa.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        checkBoxIntoleranteLactosa.setText("Intolerante a la lactosa");
        checkBoxIntoleranteLactosa.setContentAreaFilled(false);
        checkBoxIntoleranteLactosa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxIntoleranteLactosaActionPerformed(evt);
            }
        });
        panelRegUsuario.add(checkBoxIntoleranteLactosa);
        checkBoxIntoleranteLactosa.setBounds(590, 460, 274, 33);

        checkBoxDiabetico.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        checkBoxDiabetico.setText("Diabético");
        checkBoxDiabetico.setContentAreaFilled(false);
        checkBoxDiabetico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxDiabeticoActionPerformed(evt);
            }
        });
        panelRegUsuario.add(checkBoxDiabetico);
        checkBoxDiabetico.setBounds(880, 460, 140, 35);

        checkBoxHipertension.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        checkBoxHipertension.setText("Hipertensión");
        checkBoxHipertension.setContentAreaFilled(false);
        checkBoxHipertension.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxHipertensionActionPerformed(evt);
            }
        });
        panelRegUsuario.add(checkBoxHipertension);
        checkBoxHipertension.setBounds(470, 500, 170, 35);

        etiquetaErrorAltura.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        etiquetaErrorAltura.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        panelRegUsuario.add(etiquetaErrorAltura);
        etiquetaErrorAltura.setBounds(680, 330, 380, 30);

        etiquetaErrorPeso.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        etiquetaErrorPeso.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        panelRegUsuario.add(etiquetaErrorPeso);
        etiquetaErrorPeso.setBounds(680, 380, 440, 30);

        etiquetaMensajeAlAceptar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        etiquetaMensajeAlAceptar.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        panelRegUsuario.add(etiquetaMensajeAlAceptar);
        etiquetaMensajeAlAceptar.setBounds(10, 630, 800, 40);

        fotoPerfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/predeterminadaUsuario.jpg"))); // NOI18N
        fotoPerfil.setMaximumSize(new java.awt.Dimension(210, 240));
        fotoPerfil.setMinimumSize(new java.awt.Dimension(210, 240));
        fotoPerfil.setPreferredSize(new java.awt.Dimension(210, 240));
        panelRegUsuario.add(fotoPerfil);
        fotoPerfil.setBounds(30, 100, 210, 220);
        panelRegUsuario.add(fechaNacimiento);
        fechaNacimiento.setBounds(480, 280, 160, 29);

        etiquetaErrorFechaNacimiento.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        panelRegUsuario.add(etiquetaErrorFechaNacimiento);
        etiquetaErrorFechaNacimiento.setBounds(660, 280, 310, 0);

        etiquetaPreferencias.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        etiquetaPreferencias.setText("Preferencias:");
        panelRegUsuario.add(etiquetaPreferencias);
        etiquetaPreferencias.setBounds(320, 540, 150, 26);

        rBVegano.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        rBVegano.setText("Vegano");
        rBVegano.setContentAreaFilled(false);
        rBVegano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rBVeganoActionPerformed(evt);
            }
        });
        panelRegUsuario.add(rBVegano);
        rBVegano.setBounds(470, 540, 120, 37);

        rBVegetariano.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        rBVegetariano.setText("Vegetariano");
        rBVegetariano.setContentAreaFilled(false);
        rBVegetariano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rBVegetarianoActionPerformed(evt);
            }
        });
        panelRegUsuario.add(rBVegetariano);
        rBVegetariano.setBounds(590, 540, 170, 37);

        rBMacrobiotico.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        rBMacrobiotico.setText("Macrobiótico");
        rBMacrobiotico.setContentAreaFilled(false);
        rBMacrobiotico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rBMacrobioticoActionPerformed(evt);
            }
        });
        panelRegUsuario.add(rBMacrobiotico);
        rBMacrobiotico.setBounds(760, 540, 180, 37);

        rBOrganico.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        rBOrganico.setText("Orgánico");
        rBOrganico.setContentAreaFilled(false);
        rBOrganico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rBOrganicoActionPerformed(evt);
            }
        });
        panelRegUsuario.add(rBOrganico);
        rBOrganico.setBounds(940, 540, 140, 37);

        btnCambiarFoto.setBackground(new java.awt.Color(255, 0, 102));
        btnCambiarFoto.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnCambiarFoto.setForeground(new java.awt.Color(255, 255, 255));
        btnCambiarFoto.setText("Cambiar Foto");
        btnCambiarFoto.setContentAreaFilled(false);
        btnCambiarFoto.setOpaque(true);
        btnCambiarFoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCambiarFotoActionPerformed(evt);
            }
        });
        panelRegUsuario.add(btnCambiarFoto);
        btnCambiarFoto.setBounds(30, 330, 210, 45);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelRegUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelRegUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarUsuarioActionPerformed
        Profesional comparoProf = new Profesional();
        comparoProf.setNombreUsuario(cajaNombUsuario.getText());
        Usuario comparoUsr = new Usuario();
        comparoUsr.setNombreUsuario(cajaNombUsuario.getText());
        boolean nombreValido = !cajaNombre.getText().trim().isEmpty();
        boolean apellidoValido = !cajaApellidos.getText().trim().isEmpty();
        boolean nombreUsuarioValido = !cajaNombUsuario.getText().trim().isEmpty()
                && !sistema.getListaUsuarios().contains(comparoUsr)
                && !sistema.getListaProfesionales().contains(comparoProf);
        boolean fNacimientoValido = fechaNacimiento.getCalendar() != null;
        boolean altura = pidoDatoNumerico(cajaAltura.getText(), 0, 265, etiquetaErrorAltura);
        boolean peso = pidoDatoNumerico(cajaPeso.getText(), 0, 600, etiquetaErrorPeso);
        boolean sexoPred = sexoPredeterminado();
        if (apellidoValido && nombreUsuarioValido && altura && peso && fNacimientoValido) {
            usuario.setNombre(cajaNombre.getText());
            usuario.setApellidos(cajaApellidos.getText());
            usuario.setNombreUsuario(cajaNombUsuario.getText());
            usuario.setNacionalidad(usuario.getListaEnumNac()[listaNacionalidadesUsuario.getSelectedIndex()]);
            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
            String fNacimiento = formatter.format(fechaNacimiento.getCalendar().getTime());
            usuario.setFechaNacimiento(fNacimiento);
            if (sexoPred == true) {
                usuario.setSexo("Masculino");
            } else {
                usuario.setSexo("Femenino");
            }
            usuario.setAlturaCm(Integer.parseInt(cajaAltura.getText()));
            usuario.setPesoKg(Integer.parseInt(cajaPeso.getText()));
            usuario.setFotoPerfil((ImageIcon) fotoPerfil.getIcon());
            sistema.getListaUsuarios().add(usuario);
            etiquetaMensajeAlAceptar.setText("Usuario registrado correctamente");   
        }
        else if(!nombreValido){
            etiquetaMensajeAlAceptar.setText("Error al ingresar el usuario: ingrese un nombre válido");
            etiquetaMensajeAlAceptar.setForeground(Color.red);
        }
        else if(!apellidoValido){
            etiquetaMensajeAlAceptar.setText("Error al ingresar el usuario: ingrese un apellido válido");
            etiquetaMensajeAlAceptar.setForeground(Color.red);
        }
        else if(!nombreUsuarioValido){
            etiquetaMensajeAlAceptar.setText("Error al ingresar el usuario: ingrese un nombre de usuario válido");
            etiquetaMensajeAlAceptar.setForeground(Color.red);
        }
        else if(!fNacimientoValido){
            etiquetaMensajeAlAceptar.setText("Error al ingresar el usuario: ingrese una fecha de nacimiento válida");
            etiquetaMensajeAlAceptar.setForeground(Color.red);
        }
        else if(!altura){
            etiquetaMensajeAlAceptar.setText("Error al ingresar el usuario: ingrese una altura válida");
            etiquetaMensajeAlAceptar.setForeground(Color.red);
        }
        else if(!peso){
            etiquetaMensajeAlAceptar.setText("Error al ingresar el usuario: ingrese un peso válido");
            etiquetaMensajeAlAceptar.setForeground(Color.red);
        }    
    }//GEN-LAST:event_btnAceptarUsuarioActionPerformed

    private void rBtnMasculinoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rBtnMasculinoUsuarioActionPerformed
        usuario.setSexo("Masculino");
    }//GEN-LAST:event_rBtnMasculinoUsuarioActionPerformed

    private void rBtnFemeninoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rBtnFemeninoUsuarioActionPerformed
        usuario.setSexo("Femenino");
    }//GEN-LAST:event_rBtnFemeninoUsuarioActionPerformed

    private void checkBoxIntoleranteLactosaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxIntoleranteLactosaActionPerformed
        int posicionEnum = Usuario.Restricciones.IntoleranteALaLactosa.ordinal();
        boolean valorEnPos = usuario.getListaRestricciones()[posicionEnum];
        usuario.getListaRestricciones()[posicionEnum] = !valorEnPos;
    }//GEN-LAST:event_checkBoxIntoleranteLactosaActionPerformed

    private void checkBoxHipertensionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxHipertensionActionPerformed
        int posicionEnum = Usuario.Restricciones.Hipertension.ordinal();
        boolean valorEnPos = usuario.getListaRestricciones()[posicionEnum];
        usuario.getListaRestricciones()[posicionEnum] = !valorEnPos;
    }//GEN-LAST:event_checkBoxHipertensionActionPerformed

    private void rBMacrobioticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rBMacrobioticoActionPerformed
        usuario.setPreferenciasAlimentarias(Usuario.Preferencias.Macrobiotico);
    }//GEN-LAST:event_rBMacrobioticoActionPerformed

    private void listaNacionalidadesUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaNacionalidadesUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_listaNacionalidadesUsuarioActionPerformed

    private void rBVeganoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rBVeganoActionPerformed
        usuario.setPreferenciasAlimentarias(Usuario.Preferencias.Vegano);
    }//GEN-LAST:event_rBVeganoActionPerformed

    private void rBVegetarianoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rBVegetarianoActionPerformed
        usuario.setPreferenciasAlimentarias(Usuario.Preferencias.Vegetariano);
    }//GEN-LAST:event_rBVegetarianoActionPerformed

    private void rBOrganicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rBOrganicoActionPerformed
        usuario.setPreferenciasAlimentarias(Usuario.Preferencias.Organico);
    }//GEN-LAST:event_rBOrganicoActionPerformed

    private void checkBoxCeliacoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxCeliacoActionPerformed
        int posicionEnum = Usuario.Restricciones.Celiaco.ordinal();
        boolean valorEnPos = usuario.getListaRestricciones()[posicionEnum];
        usuario.getListaRestricciones()[posicionEnum] = !valorEnPos;
    }//GEN-LAST:event_checkBoxCeliacoActionPerformed

    private void checkBoxDiabeticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxDiabeticoActionPerformed
        int posicionEnum = Usuario.Restricciones.Diabetico.ordinal();
        boolean valorEnPos = usuario.getListaRestricciones()[posicionEnum];
        usuario.getListaRestricciones()[posicionEnum] = !valorEnPos;
    }//GEN-LAST:event_checkBoxDiabeticoActionPerformed

    private void cajaNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajaNombreActionPerformed

    private void cajaNombUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaNombUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajaNombUsuarioActionPerformed

    private void cajaAlturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaAlturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajaAlturaActionPerformed

    private void btnCambiarFotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCambiarFotoActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        FileNameExtensionFilter file = new FileNameExtensionFilter("Archivo imagen", "jpg");
        fileChooser.setFileFilter(file);
        int imagen = fileChooser.showOpenDialog(this);
        if (imagen == JFileChooser.APPROVE_OPTION) {
            ImageIcon fotoPerfil = new ImageIcon(fileChooser.getSelectedFile().getAbsolutePath());
            ImageIcon fotoArreglada = resizeImageIcon(fotoPerfil, 210, 240);
            usuario.setFotoPerfil(fotoArreglada);
        }
        actualizar();
    }//GEN-LAST:event_btnCambiarFotoActionPerformed
    
    void actualizar() {
        fotoPerfil.setIcon(usuario.getFotoPerfil());
    }
    
    ImageIcon resizeImageIcon(ImageIcon imageIcon, Integer width, Integer height) {
        BufferedImage bufferedImage = new BufferedImage(width, height, BufferedImage.TRANSLUCENT);
        
        Graphics2D graphics2D = bufferedImage.createGraphics();
        graphics2D.drawImage(imageIcon.getImage(), 0, 0, width, height, null);
        graphics2D.dispose();
        
        return new ImageIcon(bufferedImage, imageIcon.getDescription());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptarUsuario;
    private javax.swing.JButton btnCambiarFoto;
    private javax.swing.JTextField cajaAltura;
    private javax.swing.JTextField cajaApellidos;
    private javax.swing.JTextField cajaNombUsuario;
    private javax.swing.JTextField cajaNombre;
    private javax.swing.JTextField cajaPeso;
    private javax.swing.JCheckBox checkBoxCeliaco;
    private javax.swing.JCheckBox checkBoxDiabetico;
    private javax.swing.JCheckBox checkBoxHipertension;
    private javax.swing.JCheckBox checkBoxIntoleranteLactosa;
    private javax.swing.JLabel etiquetaAltura;
    private javax.swing.JLabel etiquetaApellidos;
    private javax.swing.JLabel etiquetaErrorAltura;
    private javax.swing.JLabel etiquetaErrorFechaNacimiento;
    private javax.swing.JLabel etiquetaErrorPeso;
    private javax.swing.JLabel etiquetaFDNaciomiento;
    private javax.swing.JLabel etiquetaFotoPerfil;
    private javax.swing.JLabel etiquetaMedidaAltura;
    private javax.swing.JLabel etiquetaMedidaPeso;
    private javax.swing.JLabel etiquetaMensajeAlAceptar;
    private javax.swing.JLabel etiquetaNacionalidadUsuario;
    private javax.swing.JLabel etiquetaNombUsuario;
    private javax.swing.JLabel etiquetaNombre;
    private javax.swing.JLabel etiquetaPeso;
    private javax.swing.JLabel etiquetaPreferencias;
    private javax.swing.JLabel etiquetaRestricciones;
    private javax.swing.JLabel etiquetaSexo;
    private javax.swing.JLabel etiquetaTitulo;
    private com.toedter.calendar.JDateChooser fechaNacimiento;
    private javax.swing.JLabel fotoPerfil;
    private javax.swing.ButtonGroup grupoBotonesPreferencias;
    private javax.swing.ButtonGroup grupoBotonesSexo;
    private javax.swing.JComboBox listaNacionalidadesUsuario;
    private javax.swing.JPanel panelRegUsuario;
    private javax.swing.JRadioButton rBMacrobiotico;
    private javax.swing.JRadioButton rBOrganico;
    private javax.swing.JRadioButton rBVegano;
    private javax.swing.JRadioButton rBVegetariano;
    private javax.swing.JRadioButton rBtnFemeninoUsuario;
    private javax.swing.JRadioButton rBtnMasculinoUsuario;
    // End of variables declaration//GEN-END:variables

    private boolean pidoDatoNumerico(String dato, int min, int max, JLabel etiqueta) {
        int datoAVerificar = 0;
        boolean pidiendo = false;
        try {
            datoAVerificar = Integer.parseInt(dato);
            if ((datoAVerificar >= min) && (datoAVerificar <= max)) {
                pidiendo = true;
            } else {
                etiqueta.setText("(El dato debe estar entre: "
                        + min + " y " + max +")");
            }
        } catch (NumberFormatException ex) {
            etiqueta.setText("(Debe ingresar un valor numérico)");
        }
        return pidiendo;
    }
    
    private boolean sexoPredeterminado() {
        boolean predeterminado = true;
        if (rBtnMasculinoUsuario.isSelected() == false) {
            predeterminado = false;
        }
        return predeterminado;
    }
}
