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
        JContra = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1147, 784));
        setLayout(new java.awt.BorderLayout());

        panelRegUsuario.setBackground(new java.awt.Color(255, 255, 255));
        panelRegUsuario.setPreferredSize(new java.awt.Dimension(1147, 784));
        panelRegUsuario.setLayout(null);

        etiquetaNombre.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        etiquetaNombre.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        etiquetaNombre.setText("Nombre: ");
        panelRegUsuario.add(etiquetaNombre);
        etiquetaNombre.setBounds(242, 80, 240, 40);

        etiquetaApellidos.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        etiquetaApellidos.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        etiquetaApellidos.setText("Apellidos: ");
        panelRegUsuario.add(etiquetaApellidos);
        etiquetaApellidos.setBounds(240, 130, 240, 40);

        etiquetaNombUsuario.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        etiquetaNombUsuario.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        etiquetaNombUsuario.setText("Nombre de Usuario: ");
        panelRegUsuario.add(etiquetaNombUsuario);
        etiquetaNombUsuario.setBounds(240, 180, 240, 40);

        etiquetaFDNaciomiento.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        etiquetaFDNaciomiento.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        etiquetaFDNaciomiento.setText("Fecha de Nacimiento: ");
        panelRegUsuario.add(etiquetaFDNaciomiento);
        etiquetaFDNaciomiento.setBounds(240, 280, 240, 40);

        etiquetaFotoPerfil.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        etiquetaFotoPerfil.setText("Foto de Perfil:");
        panelRegUsuario.add(etiquetaFotoPerfil);
        etiquetaFotoPerfil.setBounds(60, 80, 160, 29);

        cajaNombre.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        cajaNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaNombreActionPerformed(evt);
            }
        });
        panelRegUsuario.add(cajaNombre);
        cajaNombre.setBounds(480, 80, 270, 37);

        cajaApellidos.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        panelRegUsuario.add(cajaApellidos);
        cajaApellidos.setBounds(480, 130, 270, 37);

        cajaNombUsuario.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        cajaNombUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaNombUsuarioActionPerformed(evt);
            }
        });
        panelRegUsuario.add(cajaNombUsuario);
        cajaNombUsuario.setBounds(480, 180, 270, 37);

        etiquetaPeso.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        etiquetaPeso.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        etiquetaPeso.setText("Peso: ");
        panelRegUsuario.add(etiquetaPeso);
        etiquetaPeso.setBounds(240, 380, 240, 40);

        etiquetaAltura.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        etiquetaAltura.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        etiquetaAltura.setText("Altura: ");
        panelRegUsuario.add(etiquetaAltura);
        etiquetaAltura.setBounds(240, 330, 240, 40);

        cajaAltura.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        cajaAltura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaAlturaActionPerformed(evt);
            }
        });
        panelRegUsuario.add(cajaAltura);
        cajaAltura.setBounds(480, 330, 270, 37);

        cajaPeso.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        panelRegUsuario.add(cajaPeso);
        cajaPeso.setBounds(480, 380, 270, 37);

        etiquetaMedidaPeso.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiquetaMedidaPeso.setText("Kg");
        panelRegUsuario.add(etiquetaMedidaPeso);
        etiquetaMedidaPeso.setBounds(750, 380, 30, 40);

        etiquetaMedidaAltura.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiquetaMedidaAltura.setText("Cm");
        panelRegUsuario.add(etiquetaMedidaAltura);
        etiquetaMedidaAltura.setBounds(749, 330, 30, 40);

        btnAceptarUsuario.setBackground(new java.awt.Color(255, 0, 102));
        btnAceptarUsuario.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnAceptarUsuario.setForeground(new java.awt.Color(255, 255, 255));
        btnAceptarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/baseline_done_outline_white_18dp.png"))); // NOI18N
        btnAceptarUsuario.setActionCommand("");
        btnAceptarUsuario.setContentAreaFilled(false);
        btnAceptarUsuario.setLabel("");
        btnAceptarUsuario.setMaximumSize(new java.awt.Dimension(60, 60));
        btnAceptarUsuario.setMinimumSize(new java.awt.Dimension(60, 60));
        btnAceptarUsuario.setOpaque(true);
        btnAceptarUsuario.setPreferredSize(new java.awt.Dimension(60, 60));
        btnAceptarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarUsuarioActionPerformed(evt);
            }
        });
        panelRegUsuario.add(btnAceptarUsuario);
        btnAceptarUsuario.setBounds(1070, 710, 60, 60);

        etiquetaTitulo.setBackground(new java.awt.Color(255, 0, 102));
        etiquetaTitulo.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        etiquetaTitulo.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiquetaTitulo.setText("Registrar Usuario");
        etiquetaTitulo.setMaximumSize(new java.awt.Dimension(212, 44));
        etiquetaTitulo.setOpaque(true);
        panelRegUsuario.add(etiquetaTitulo);
        etiquetaTitulo.setBounds(0, 0, 1160, 60);

        etiquetaNacionalidadUsuario.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        etiquetaNacionalidadUsuario.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        etiquetaNacionalidadUsuario.setText("Nacionalidad: ");
        panelRegUsuario.add(etiquetaNacionalidadUsuario);
        etiquetaNacionalidadUsuario.setBounds(240, 229, 240, 40);

        listaNacionalidadesUsuario.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        listaNacionalidadesUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaNacionalidadesUsuarioActionPerformed(evt);
            }
        });
        panelRegUsuario.add(listaNacionalidadesUsuario);
        listaNacionalidadesUsuario.setBounds(480, 230, 270, 39);

        etiquetaSexo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        etiquetaSexo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        etiquetaSexo.setText("Sexo: ");
        panelRegUsuario.add(etiquetaSexo);
        etiquetaSexo.setBounds(240, 480, 240, 40);

        rBtnMasculinoUsuario.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        rBtnMasculinoUsuario.setText("Masculino");
        rBtnMasculinoUsuario.setContentAreaFilled(false);
        rBtnMasculinoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rBtnMasculinoUsuarioActionPerformed(evt);
            }
        });
        panelRegUsuario.add(rBtnMasculinoUsuario);
        rBtnMasculinoUsuario.setBounds(480, 480, 150, 40);

        rBtnFemeninoUsuario.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        rBtnFemeninoUsuario.setText("Femenino");
        rBtnFemeninoUsuario.setContentAreaFilled(false);
        rBtnFemeninoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rBtnFemeninoUsuarioActionPerformed(evt);
            }
        });
        panelRegUsuario.add(rBtnFemeninoUsuario);
        rBtnFemeninoUsuario.setBounds(630, 480, 160, 40);

        etiquetaRestricciones.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        etiquetaRestricciones.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        etiquetaRestricciones.setText("Restricciones: ");
        panelRegUsuario.add(etiquetaRestricciones);
        etiquetaRestricciones.setBounds(240, 530, 240, 40);

        checkBoxCeliaco.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        checkBoxCeliaco.setText("Celíaco");
        checkBoxCeliaco.setContentAreaFilled(false);
        checkBoxCeliaco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxCeliacoActionPerformed(evt);
            }
        });
        panelRegUsuario.add(checkBoxCeliaco);
        checkBoxCeliaco.setBounds(480, 530, 120, 40);

        checkBoxIntoleranteLactosa.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        checkBoxIntoleranteLactosa.setText("Intolerante a la lactosa");
        checkBoxIntoleranteLactosa.setContentAreaFilled(false);
        checkBoxIntoleranteLactosa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxIntoleranteLactosaActionPerformed(evt);
            }
        });
        panelRegUsuario.add(checkBoxIntoleranteLactosa);
        checkBoxIntoleranteLactosa.setBounds(630, 530, 274, 40);

        checkBoxDiabetico.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        checkBoxDiabetico.setText("Diabético");
        checkBoxDiabetico.setContentAreaFilled(false);
        checkBoxDiabetico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxDiabeticoActionPerformed(evt);
            }
        });
        panelRegUsuario.add(checkBoxDiabetico);
        checkBoxDiabetico.setBounds(480, 580, 140, 40);

        checkBoxHipertension.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        checkBoxHipertension.setText("Hipertensión");
        checkBoxHipertension.setContentAreaFilled(false);
        checkBoxHipertension.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxHipertensionActionPerformed(evt);
            }
        });
        panelRegUsuario.add(checkBoxHipertension);
        checkBoxHipertension.setBounds(630, 580, 170, 40);

        etiquetaErrorAltura.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        etiquetaErrorAltura.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        panelRegUsuario.add(etiquetaErrorAltura);
        etiquetaErrorAltura.setBounds(790, 330, 280, 40);

        etiquetaErrorPeso.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        etiquetaErrorPeso.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        panelRegUsuario.add(etiquetaErrorPeso);
        etiquetaErrorPeso.setBounds(790, 380, 270, 30);

        etiquetaMensajeAlAceptar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        etiquetaMensajeAlAceptar.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        panelRegUsuario.add(etiquetaMensajeAlAceptar);
        etiquetaMensajeAlAceptar.setBounds(260, 720, 800, 40);

        fotoPerfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/predeterminadaUsuario.jpg"))); // NOI18N
        fotoPerfil.setMaximumSize(new java.awt.Dimension(210, 240));
        fotoPerfil.setMinimumSize(new java.awt.Dimension(210, 240));
        fotoPerfil.setPreferredSize(new java.awt.Dimension(210, 240));
        panelRegUsuario.add(fotoPerfil);
        fotoPerfil.setBounds(30, 120, 210, 220);
        panelRegUsuario.add(fechaNacimiento);
        fechaNacimiento.setBounds(480, 280, 270, 40);

        etiquetaErrorFechaNacimiento.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        panelRegUsuario.add(etiquetaErrorFechaNacimiento);
        etiquetaErrorFechaNacimiento.setBounds(660, 280, 310, 0);

        etiquetaPreferencias.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        etiquetaPreferencias.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        etiquetaPreferencias.setText("Preferencias: ");
        panelRegUsuario.add(etiquetaPreferencias);
        etiquetaPreferencias.setBounds(240, 640, 240, 40);

        rBVegano.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        rBVegano.setText("Vegano");
        rBVegano.setContentAreaFilled(false);
        rBVegano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rBVeganoActionPerformed(evt);
            }
        });
        panelRegUsuario.add(rBVegano);
        rBVegano.setBounds(480, 640, 120, 37);

        rBVegetariano.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        rBVegetariano.setText("Vegetariano");
        rBVegetariano.setContentAreaFilled(false);
        rBVegetariano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rBVegetarianoActionPerformed(evt);
            }
        });
        panelRegUsuario.add(rBVegetariano);
        rBVegetariano.setBounds(660, 640, 170, 37);

        rBMacrobiotico.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        rBMacrobiotico.setText("Macrobiótico");
        rBMacrobiotico.setContentAreaFilled(false);
        rBMacrobiotico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rBMacrobioticoActionPerformed(evt);
            }
        });
        panelRegUsuario.add(rBMacrobiotico);
        rBMacrobiotico.setBounds(480, 690, 180, 37);

        rBOrganico.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        rBOrganico.setText("Orgánico");
        rBOrganico.setContentAreaFilled(false);
        rBOrganico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rBOrganicoActionPerformed(evt);
            }
        });
        panelRegUsuario.add(rBOrganico);
        rBOrganico.setBounds(660, 690, 140, 37);

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
        btnCambiarFoto.setBounds(30, 360, 210, 45);
        panelRegUsuario.add(JContra);
        JContra.setBounds(480, 430, 270, 40);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Contraseña: ");
        panelRegUsuario.add(jLabel1);
        jLabel1.setBounds(240, 430, 240, 40);

        add(panelRegUsuario, java.awt.BorderLayout.CENTER);
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
        String contra = new String(JContra.getPassword());
        char[] contraChar = JContra.getPassword();
        boolean contraValida;
        if(contra.length()>=8){
            int cont = 0;
            for(int i = 0; i<contraChar.length; i++){
                if(!Character.isAlphabetic(contraChar[i]) && !Character.isDigit(contraChar[i])){
                    cont++;
                }
            }
            if(cont>0){
                contraValida = false;
            }
            else{
                contraValida = true;
            }
        }
        else{
            contraValida = false;
        }
        if (apellidoValido && nombreUsuarioValido && altura && peso && fNacimientoValido && contraValida) {
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
            usuario.setContrasena(contra);
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
        else if(!contraValida){
            etiquetaMensajeAlAceptar.setText("Error al ingresar el usuario: ingrese una contraseña válida (alfanumérica)");
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
    private javax.swing.JPasswordField JContra;
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
    private javax.swing.JLabel jLabel1;
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
