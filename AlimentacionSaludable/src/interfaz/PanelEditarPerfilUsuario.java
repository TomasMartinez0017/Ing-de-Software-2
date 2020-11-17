package interfaz;

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
import java.text.SimpleDateFormat;
import java.util.Date;

public class PanelEditarPerfilUsuario extends javax.swing.JPanel {

    //Atributos
    private Sistema sistema;
    private Usuario usuario;
    private JFrame ventana;
    private InterfazBotonesUsuario interfaz;

    //Constructor
    public PanelEditarPerfilUsuario(Sistema unSistema, JFrame unaVentana, InterfazBotonesUsuario interfazActual) throws Exception {
        initComponents();
        sistema = unSistema;
        ventana = unaVentana;
        interfaz = interfazActual;
        usuario = interfaz.getUsuarioActual();
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
        usuario.setListaRestricciones(new boolean[usuario.getListaRestricciones().length]);
        usuario.setPreferenciasAlimentarias(Usuario.Preferencias.Ninguna);
        fotoPerfil.setSize(210, 240);
        cajaNombre.setText(usuario.getNombre());
        cajaApellidos.setText(usuario.getApellidos());
        JContra.setText(usuario.getContrasena());
        int pos = 0;
        for (int i = 0; i < listaNac.length; i++) {
            if (listaNac[i].equals(usuario.getNacionalidad())) {
                pos = i;
            }
        }
        listaNacionalidadesUsuario.setSelectedIndex(pos);
        Date date = new SimpleDateFormat("dd/MM/yyyy").parse(usuario.getFechaNacimiento());
        fechaNacimiento.setDate(date);
        int pesoInt = (int)usuario.getPesoKg();
        String peso = Integer.toString(pesoInt);
        cajaPeso.setText(peso);
        int alturaInt = (int)usuario.getAlturaCm();
        String altura = Integer.toString(alturaInt);
        cajaAltura.setText(altura);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoBotonesSexo = new javax.swing.ButtonGroup();
        grupoBotonesPreferencias = new javax.swing.ButtonGroup();
        panelEditarPerfilUsuario = new javax.swing.JPanel();
        etiquetaNombre = new javax.swing.JLabel();
        etiquetaApellidos = new javax.swing.JLabel();
        etiquetaFDNaciomiento = new javax.swing.JLabel();
        etiquetaFotoPerfil = new javax.swing.JLabel();
        cajaNombre = new javax.swing.JTextField();
        cajaApellidos = new javax.swing.JTextField();
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
        btnVolver = new javax.swing.JButton();
        JContra = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1147, 784));

        panelEditarPerfilUsuario.setBackground(new java.awt.Color(255, 255, 255));
        panelEditarPerfilUsuario.setPreferredSize(new java.awt.Dimension(1147, 784));
        panelEditarPerfilUsuario.setLayout(null);

        etiquetaNombre.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        etiquetaNombre.setText("Nombre:");
        panelEditarPerfilUsuario.add(etiquetaNombre);
        etiquetaNombre.setBounds(370, 80, 92, 29);

        etiquetaApellidos.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        etiquetaApellidos.setText("Apellidos:");
        panelEditarPerfilUsuario.add(etiquetaApellidos);
        etiquetaApellidos.setBounds(360, 130, 110, 26);

        etiquetaFDNaciomiento.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        etiquetaFDNaciomiento.setText("Fecha de Nacimiento:");
        panelEditarPerfilUsuario.add(etiquetaFDNaciomiento);
        etiquetaFDNaciomiento.setBounds(240, 230, 230, 26);

        etiquetaFotoPerfil.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        etiquetaFotoPerfil.setText("Foto de Perfil:");
        panelEditarPerfilUsuario.add(etiquetaFotoPerfil);
        etiquetaFotoPerfil.setBounds(60, 110, 160, 29);

        cajaNombre.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        cajaNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaNombreActionPerformed(evt);
            }
        });
        panelEditarPerfilUsuario.add(cajaNombre);
        cajaNombre.setBounds(480, 80, 160, 37);

        cajaApellidos.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        panelEditarPerfilUsuario.add(cajaApellidos);
        cajaApellidos.setBounds(480, 130, 160, 37);

        etiquetaPeso.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        etiquetaPeso.setText("Peso:");
        panelEditarPerfilUsuario.add(etiquetaPeso);
        etiquetaPeso.setBounds(330, 330, 60, 26);

        etiquetaAltura.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        etiquetaAltura.setText("Altura:");
        panelEditarPerfilUsuario.add(etiquetaAltura);
        etiquetaAltura.setBounds(330, 280, 70, 26);

        cajaAltura.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        cajaAltura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaAlturaActionPerformed(evt);
            }
        });
        panelEditarPerfilUsuario.add(cajaAltura);
        cajaAltura.setBounds(480, 280, 160, 37);

        cajaPeso.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        panelEditarPerfilUsuario.add(cajaPeso);
        cajaPeso.setBounds(480, 330, 160, 37);

        etiquetaMedidaPeso.setText("Kg");
        panelEditarPerfilUsuario.add(etiquetaMedidaPeso);
        etiquetaMedidaPeso.setBounds(650, 340, 15, 16);

        etiquetaMedidaAltura.setText("Cm");
        panelEditarPerfilUsuario.add(etiquetaMedidaAltura);
        etiquetaMedidaAltura.setBounds(650, 290, 19, 16);

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
        panelEditarPerfilUsuario.add(btnAceptarUsuario);
        btnAceptarUsuario.setBounds(850, 640, 200, 40);

        etiquetaTitulo.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        etiquetaTitulo.setForeground(new java.awt.Color(255, 0, 102));
        etiquetaTitulo.setText("Editar perfil del usuario");
        panelEditarPerfilUsuario.add(etiquetaTitulo);
        etiquetaTitulo.setBounds(390, 0, 380, 44);

        etiquetaNacionalidadUsuario.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        etiquetaNacionalidadUsuario.setText("Nacionalidad:");
        panelEditarPerfilUsuario.add(etiquetaNacionalidadUsuario);
        etiquetaNacionalidadUsuario.setBounds(330, 180, 160, 29);

        listaNacionalidadesUsuario.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        listaNacionalidadesUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaNacionalidadesUsuarioActionPerformed(evt);
            }
        });
        panelEditarPerfilUsuario.add(listaNacionalidadesUsuario);
        listaNacionalidadesUsuario.setBounds(480, 180, 160, 39);

        etiquetaSexo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        etiquetaSexo.setText("Sexo:");
        panelEditarPerfilUsuario.add(etiquetaSexo);
        etiquetaSexo.setBounds(400, 430, 70, 29);

        rBtnMasculinoUsuario.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        rBtnMasculinoUsuario.setText("Masculino");
        rBtnMasculinoUsuario.setContentAreaFilled(false);
        rBtnMasculinoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rBtnMasculinoUsuarioActionPerformed(evt);
            }
        });
        panelEditarPerfilUsuario.add(rBtnMasculinoUsuario);
        rBtnMasculinoUsuario.setBounds(470, 430, 150, 35);

        rBtnFemeninoUsuario.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        rBtnFemeninoUsuario.setText("Femenino");
        rBtnFemeninoUsuario.setContentAreaFilled(false);
        rBtnFemeninoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rBtnFemeninoUsuarioActionPerformed(evt);
            }
        });
        panelEditarPerfilUsuario.add(rBtnFemeninoUsuario);
        rBtnFemeninoUsuario.setBounds(620, 430, 160, 35);

        etiquetaRestricciones.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        etiquetaRestricciones.setText("Restricciones:");
        panelEditarPerfilUsuario.add(etiquetaRestricciones);
        etiquetaRestricciones.setBounds(310, 470, 150, 26);

        checkBoxCeliaco.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        checkBoxCeliaco.setText("Celíaco");
        checkBoxCeliaco.setContentAreaFilled(false);
        checkBoxCeliaco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxCeliacoActionPerformed(evt);
            }
        });
        panelEditarPerfilUsuario.add(checkBoxCeliaco);
        checkBoxCeliaco.setBounds(470, 470, 120, 35);

        checkBoxIntoleranteLactosa.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        checkBoxIntoleranteLactosa.setText("Intolerante a la lactosa");
        checkBoxIntoleranteLactosa.setContentAreaFilled(false);
        checkBoxIntoleranteLactosa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxIntoleranteLactosaActionPerformed(evt);
            }
        });
        panelEditarPerfilUsuario.add(checkBoxIntoleranteLactosa);
        checkBoxIntoleranteLactosa.setBounds(580, 470, 274, 33);

        checkBoxDiabetico.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        checkBoxDiabetico.setText("Diabético");
        checkBoxDiabetico.setContentAreaFilled(false);
        checkBoxDiabetico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxDiabeticoActionPerformed(evt);
            }
        });
        panelEditarPerfilUsuario.add(checkBoxDiabetico);
        checkBoxDiabetico.setBounds(870, 470, 140, 35);

        checkBoxHipertension.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        checkBoxHipertension.setText("Hipertensión");
        checkBoxHipertension.setContentAreaFilled(false);
        checkBoxHipertension.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxHipertensionActionPerformed(evt);
            }
        });
        panelEditarPerfilUsuario.add(checkBoxHipertension);
        checkBoxHipertension.setBounds(470, 510, 170, 35);

        etiquetaErrorAltura.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        panelEditarPerfilUsuario.add(etiquetaErrorAltura);
        etiquetaErrorAltura.setBounds(790, 330, 230, 0);

        etiquetaErrorPeso.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        panelEditarPerfilUsuario.add(etiquetaErrorPeso);
        etiquetaErrorPeso.setBounds(790, 380, 310, 0);

        etiquetaMensajeAlAceptar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        etiquetaMensajeAlAceptar.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        panelEditarPerfilUsuario.add(etiquetaMensajeAlAceptar);
        etiquetaMensajeAlAceptar.setBounds(10, 646, 830, 30);

        fotoPerfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/predeterminadaUsuario.jpg"))); // NOI18N
        fotoPerfil.setMaximumSize(new java.awt.Dimension(210, 240));
        fotoPerfil.setMinimumSize(new java.awt.Dimension(210, 240));
        fotoPerfil.setPreferredSize(new java.awt.Dimension(210, 240));
        panelEditarPerfilUsuario.add(fotoPerfil);
        fotoPerfil.setBounds(30, 150, 210, 220);
        panelEditarPerfilUsuario.add(fechaNacimiento);
        fechaNacimiento.setBounds(480, 230, 160, 29);

        etiquetaErrorFechaNacimiento.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        panelEditarPerfilUsuario.add(etiquetaErrorFechaNacimiento);
        etiquetaErrorFechaNacimiento.setBounds(660, 280, 310, 0);

        etiquetaPreferencias.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        etiquetaPreferencias.setText("Preferencias:");
        panelEditarPerfilUsuario.add(etiquetaPreferencias);
        etiquetaPreferencias.setBounds(310, 550, 150, 26);

        rBVegano.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        rBVegano.setText("Vegano");
        rBVegano.setContentAreaFilled(false);
        rBVegano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rBVeganoActionPerformed(evt);
            }
        });
        panelEditarPerfilUsuario.add(rBVegano);
        rBVegano.setBounds(460, 550, 120, 37);

        rBVegetariano.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        rBVegetariano.setText("Vegetariano");
        rBVegetariano.setContentAreaFilled(false);
        rBVegetariano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rBVegetarianoActionPerformed(evt);
            }
        });
        panelEditarPerfilUsuario.add(rBVegetariano);
        rBVegetariano.setBounds(580, 550, 170, 37);

        rBMacrobiotico.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        rBMacrobiotico.setText("Macrobiótico");
        rBMacrobiotico.setContentAreaFilled(false);
        rBMacrobiotico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rBMacrobioticoActionPerformed(evt);
            }
        });
        panelEditarPerfilUsuario.add(rBMacrobiotico);
        rBMacrobiotico.setBounds(750, 550, 180, 37);

        rBOrganico.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        rBOrganico.setText("Orgánico");
        rBOrganico.setContentAreaFilled(false);
        rBOrganico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rBOrganicoActionPerformed(evt);
            }
        });
        panelEditarPerfilUsuario.add(rBOrganico);
        rBOrganico.setBounds(930, 550, 140, 37);

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
        panelEditarPerfilUsuario.add(btnCambiarFoto);
        btnCambiarFoto.setBounds(30, 390, 210, 45);

        btnVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/volver.png"))); // NOI18N
        btnVolver.setBorderPainted(false);
        btnVolver.setContentAreaFilled(false);
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        panelEditarPerfilUsuario.add(btnVolver);
        btnVolver.setBounds(30, 10, 100, 80);
        panelEditarPerfilUsuario.add(JContra);
        JContra.setBounds(480, 380, 160, 40);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Contraseña:");
        panelEditarPerfilUsuario.add(jLabel1);
        jLabel1.setBounds(330, 380, 140, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1147, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panelEditarPerfilUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 784, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panelEditarPerfilUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarUsuarioActionPerformed
        boolean nombreValido = !cajaNombre.getText().trim().isEmpty();
        boolean apellidoValido = !cajaApellidos.getText().trim().isEmpty();
        boolean fNacimientoValido = fechaNacimiento.getCalendar() != null;
        boolean altura = pidoDatoNumerico(cajaAltura.getText(), 0, 265, etiquetaErrorAltura);
        boolean peso = pidoDatoNumerico(cajaPeso.getText(), 0, 265, etiquetaErrorPeso);
        boolean sexoPred = sexoPredeterminado();
        String contra = new String(JContra.getPassword());
        char[] contraChar = JContra.getPassword();
        boolean contraValida;
        if (contra.length() >= 8) {
            int cont = 0;
            for (int i = 0; i < contraChar.length; i++) {
                if (!Character.isAlphabetic(contraChar[i]) && !Character.isDigit(contraChar[i])) {
                    cont++;
                }
            }
            if (cont > 0) {
                contraValida = false;
            } else {
                contraValida = true;
            }
        } else {
            contraValida = false;
        }
        if (nombreValido && apellidoValido
                && altura && peso && fNacimientoValido && contraValida) {
            usuario.setNombre(cajaNombre.getText());
            usuario.setApellidos(cajaApellidos.getText());
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
            etiquetaMensajeAlAceptar.setText("Usuario editado correctamente");

        }else if (!nombreValido){
            etiquetaMensajeAlAceptar.setText("Error al editar el usuario: ingrese un nombre válido");
            etiquetaMensajeAlAceptar.setForeground(Color.red);
        }
        else if(!apellidoValido){
            etiquetaMensajeAlAceptar.setText("Error al editar el usuario: ingrese un apellido válido");
            etiquetaMensajeAlAceptar.setForeground(Color.red);
        }
        else if(!fNacimientoValido){
            etiquetaMensajeAlAceptar.setText("Error al editar el usuario: ingrese una fecha de nacimiento válida");
            etiquetaMensajeAlAceptar.setForeground(Color.red);
        }
        else if(!altura){
            etiquetaMensajeAlAceptar.setText("Error al editar el usuario: ingrese una altura válida");
            etiquetaMensajeAlAceptar.setForeground(Color.red);
        }
        else if(!peso){
            etiquetaMensajeAlAceptar.setText("Error al editar el usuario: ingrese un peso válido");
            etiquetaMensajeAlAceptar.setForeground(Color.red);
        }
        else if(!contraValida){
            etiquetaMensajeAlAceptar.setText("Error al editar el usuario: ingrese una contraseña alfanumérica");
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

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        ventana.remove(this);
        PanelPerfilUsuario nuevo = new PanelPerfilUsuario(sistema, ventana, interfaz);
        interfaz.setActual(nuevo);
        ventana.add(nuevo);
        ventana.pack();
    }//GEN-LAST:event_btnVolverActionPerformed

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
    private javax.swing.JPasswordField JContra;
    private javax.swing.JButton btnAceptarUsuario;
    private javax.swing.JButton btnCambiarFoto;
    private javax.swing.JButton btnVolver;
    private javax.swing.JTextField cajaAltura;
    private javax.swing.JTextField cajaApellidos;
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JComboBox listaNacionalidadesUsuario;
    private javax.swing.JPanel panelEditarPerfilUsuario;
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
                etiqueta.setText("El dato no es válido, debe estar entre:"
                        + min + "y" + max);
            }
        } catch (NumberFormatException ex) {
            etiqueta.setText("Debe ingresar un valor numérico");
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
