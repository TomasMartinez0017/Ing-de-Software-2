package interfaz;

import dominio.Sistema;
import dominio.Profesional;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.filechooser.FileNameExtensionFilter;

public class PanelEditarPerfilProfesional extends javax.swing.JPanel {

    //Atributos
    private Sistema sistema;
    private Profesional profesional;
    private JFrame ventana;
    private InterfazBotonesProfesional interfaz;

    //Constructor
    public PanelEditarPerfilProfesional(Sistema unSistema, JFrame unaVentana,InterfazBotonesProfesional interfazActual) throws Exception{
        initComponents();
        sistema = unSistema;
        ventana = unaVentana;
        interfaz = interfazActual;
        profesional = interfaz.getUsuarioActivo();
        Profesional.Pais[] listaPaises = profesional.getListaEnumPais();
        listaPaisDeGraduacion.setModel(new DefaultComboBoxModel(listaPaises));
        listaPaisDeGraduacion.setSelectedIndex(Profesional.Pais.URUGUAY.ordinal());
        
        cajaNombreProf.setText(profesional.getNombre());
        cajaApellidosProf.setText(profesional.getApellidos());
        Date date1 = new SimpleDateFormat("dd/MM/yyyy").parse(profesional.getFechaNacimiento());
        fechaNacimiento.setDate(date1);
        cajaNombreTituloProf.setText(profesional.getNombreTituloProf());
        Date date2 = new SimpleDateFormat("dd/MM/yyyy").parse(profesional.getFechaGraduacion());
        fechaGraduacion.setDate(date2);
        fotoPerfil.setIcon(profesional.getFotoPerfil());
        JContra.setText(profesional.getContrasena());
        int pos = 0;
        for(int i = 0; i < listaPaises.length; i++){
            if(listaPaises[i].equals(profesional.getPaisObtuvoTitulo())){
                pos = i;
            }
        }
        listaPaisDeGraduacion.setSelectedIndex(pos);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelRegProf = new javax.swing.JPanel();
        etiquetaTituloProf = new javax.swing.JLabel();
        etiquetaNombreProf = new javax.swing.JLabel();
        etiquetaApellidosProf = new javax.swing.JLabel();
        etiquetaFechaNacProf = new javax.swing.JLabel();
        etiquetaNombTituloProf = new javax.swing.JLabel();
        etiquetaFechaGradProf = new javax.swing.JLabel();
        etiquetaFotoPerfilProf = new javax.swing.JLabel();
        cajaNombreProf = new javax.swing.JTextField();
        cajaNombreTituloProf = new javax.swing.JTextField();
        btnAceptarProf = new javax.swing.JButton();
        etiquetaPaisDeGraduacion = new javax.swing.JLabel();
        listaPaisDeGraduacion = new javax.swing.JComboBox<>();
        etiquetaMensajeAlAceptar = new javax.swing.JLabel();
        fechaNacimiento = new com.toedter.calendar.JDateChooser();
        fechaGraduacion = new com.toedter.calendar.JDateChooser();
        btnCambiarFoto = new javax.swing.JButton();
        fotoPerfil = new javax.swing.JLabel();
        btnVolver = new javax.swing.JButton();
        cajaApellidosProf = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        JContra = new javax.swing.JPasswordField();

        setPreferredSize(new java.awt.Dimension(1147, 784));

        panelRegProf.setBackground(new java.awt.Color(255, 255, 255));
        panelRegProf.setPreferredSize(new java.awt.Dimension(1147, 784));
        panelRegProf.setLayout(null);

        etiquetaTituloProf.setBackground(new java.awt.Color(255, 0, 102));
        etiquetaTituloProf.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        etiquetaTituloProf.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaTituloProf.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiquetaTituloProf.setText("Editar perfil del profesional");
        etiquetaTituloProf.setOpaque(true);
        panelRegProf.add(etiquetaTituloProf);
        etiquetaTituloProf.setBounds(0, 0, 1150, 70);

        etiquetaNombreProf.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        etiquetaNombreProf.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        etiquetaNombreProf.setText("Nombre: ");
        panelRegProf.add(etiquetaNombreProf);
        etiquetaNombreProf.setBounds(530, 160, 110, 40);

        etiquetaApellidosProf.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        etiquetaApellidosProf.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        etiquetaApellidosProf.setText("Apellidos: ");
        panelRegProf.add(etiquetaApellidosProf);
        etiquetaApellidosProf.setBounds(530, 210, 110, 40);

        etiquetaFechaNacProf.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        etiquetaFechaNacProf.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        etiquetaFechaNacProf.setText("Fecha de nacimiento: ");
        panelRegProf.add(etiquetaFechaNacProf);
        etiquetaFechaNacProf.setBounds(380, 260, 260, 40);

        etiquetaNombTituloProf.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        etiquetaNombTituloProf.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        etiquetaNombTituloProf.setText("Nombre de titulo profesional: ");
        panelRegProf.add(etiquetaNombTituloProf);
        etiquetaNombTituloProf.setBounds(300, 310, 340, 40);

        etiquetaFechaGradProf.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        etiquetaFechaGradProf.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        etiquetaFechaGradProf.setText("Fecha de graduación: ");
        panelRegProf.add(etiquetaFechaGradProf);
        etiquetaFechaGradProf.setBounds(370, 360, 270, 40);

        etiquetaFotoPerfilProf.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        etiquetaFotoPerfilProf.setText("Foto de perfil:");
        panelRegProf.add(etiquetaFotoPerfilProf);
        etiquetaFotoPerfilProf.setBounds(90, 160, 160, 40);

        cajaNombreProf.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        cajaNombreProf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaNombreProfActionPerformed(evt);
            }
        });
        panelRegProf.add(cajaNombreProf);
        cajaNombreProf.setBounds(640, 160, 270, 37);

        cajaNombreTituloProf.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        panelRegProf.add(cajaNombreTituloProf);
        cajaNombreTituloProf.setBounds(640, 310, 270, 37);

        btnAceptarProf.setBackground(new java.awt.Color(255, 0, 102));
        btnAceptarProf.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnAceptarProf.setForeground(new java.awt.Color(255, 255, 255));
        btnAceptarProf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/baseline_done_outline_white_18dp.png"))); // NOI18N
        btnAceptarProf.setContentAreaFilled(false);
        btnAceptarProf.setMaximumSize(new java.awt.Dimension(60, 60));
        btnAceptarProf.setMinimumSize(new java.awt.Dimension(60, 60));
        btnAceptarProf.setOpaque(true);
        btnAceptarProf.setPreferredSize(new java.awt.Dimension(60, 60));
        btnAceptarProf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarProfActionPerformed(evt);
            }
        });
        panelRegProf.add(btnAceptarProf);
        btnAceptarProf.setBounds(1060, 700, 70, 70);

        etiquetaPaisDeGraduacion.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        etiquetaPaisDeGraduacion.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        etiquetaPaisDeGraduacion.setText("País de graduación: ");
        panelRegProf.add(etiquetaPaisDeGraduacion);
        etiquetaPaisDeGraduacion.setBounds(390, 410, 250, 40);

        listaPaisDeGraduacion.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        listaPaisDeGraduacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        panelRegProf.add(listaPaisDeGraduacion);
        listaPaisDeGraduacion.setBounds(640, 410, 270, 39);

        etiquetaMensajeAlAceptar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        etiquetaMensajeAlAceptar.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        panelRegProf.add(etiquetaMensajeAlAceptar);
        etiquetaMensajeAlAceptar.setBounds(210, 720, 840, 40);
        panelRegProf.add(fechaNacimiento);
        fechaNacimiento.setBounds(640, 260, 270, 40);
        panelRegProf.add(fechaGraduacion);
        fechaGraduacion.setBounds(640, 360, 270, 40);

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
        panelRegProf.add(btnCambiarFoto);
        btnCambiarFoto.setBounds(80, 460, 190, 40);

        fotoPerfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/predeterminadaProfesional.png"))); // NOI18N
        fotoPerfil.setPreferredSize(new java.awt.Dimension(210, 270));
        panelRegProf.add(fotoPerfil);
        fotoPerfil.setBounds(70, 190, 210, 270);

        btnVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/volver.png"))); // NOI18N
        btnVolver.setBorderPainted(false);
        btnVolver.setContentAreaFilled(false);
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        panelRegProf.add(btnVolver);
        btnVolver.setBounds(10, 710, 110, 60);

        cajaApellidosProf.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        cajaApellidosProf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaApellidosProfActionPerformed(evt);
            }
        });
        panelRegProf.add(cajaApellidosProf);
        cajaApellidosProf.setBounds(640, 210, 270, 37);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Contraseña: ");
        panelRegProf.add(jLabel1);
        jLabel1.setBounds(500, 460, 140, 40);
        panelRegProf.add(JContra);
        JContra.setBounds(640, 460, 270, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1147, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panelRegProf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 784, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panelRegProf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptarProfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarProfActionPerformed
        boolean nombreValido = !cajaNombreProf.getText().trim().isEmpty();
        boolean apellidoValido = !cajaApellidosProf.getText().trim().isEmpty();
        boolean fNacimientoValido = fechaNacimiento.getCalendar() != null;
        boolean nombreTituloValido = !cajaNombreTituloProf.getText().trim().isEmpty();
        boolean fGraduacionValido = fechaGraduacion.getCalendar() != null;
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
        if (nombreValido && apellidoValido && fNacimientoValido && nombreTituloValido && fGraduacionValido && contraValida) {
            profesional.setNombre(cajaNombreProf.getText());
            profesional.setApellidos(cajaApellidosProf.getText());
            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
            String fNacimiento = formatter.format(fechaNacimiento.getCalendar().getTime());
            profesional.setFechaNacimiento(fNacimiento);
            profesional.setNombreTituloProf(cajaNombreTituloProf.getText());
            SimpleDateFormat formatter2 = new SimpleDateFormat("dd/MM/yyyy");
            String fGraduacion = formatter2.format(fechaGraduacion.getCalendar().getTime());
            profesional.setFechaGraduacion(fGraduacion);
            profesional.setPaisObtuvoTitulo(profesional.getListaEnumPais()[listaPaisDeGraduacion.getSelectedIndex()]);
            etiquetaMensajeAlAceptar.setText("Profesional editado correctamente");
        } else if (!nombreValido){
            etiquetaMensajeAlAceptar.setText("Error al editar el profesional: ingrese un nombre válido");
            etiquetaMensajeAlAceptar.setForeground(Color.red);
        } else if(!apellidoValido){
            etiquetaMensajeAlAceptar.setText("Error al editar el profesional: ingrese un apellido válido");
            etiquetaMensajeAlAceptar.setForeground(Color.red);
        } else if(!fNacimientoValido){
            etiquetaMensajeAlAceptar.setText("Error al editar el profesional: ingrese una fecha de nacimiento válida");
            etiquetaMensajeAlAceptar.setForeground(Color.red);
        } else if(!nombreTituloValido){
            etiquetaMensajeAlAceptar.setText("Error al editar el profesional: ingrese un título válido");
            etiquetaMensajeAlAceptar.setForeground(Color.red);
        } else if(!fGraduacionValido){
            etiquetaMensajeAlAceptar.setText("Error al editar el profesional: ingrese un a fecha de graduación válida");
            etiquetaMensajeAlAceptar.setForeground(Color.red);
        } else if(!contraValida){
            etiquetaMensajeAlAceptar.setText("Error al editar el profesional: ingrese una contraseña alfanumérica");
            etiquetaMensajeAlAceptar.setForeground(Color.red);
        }
        
    }//GEN-LAST:event_btnAceptarProfActionPerformed

    private void btnCambiarFotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCambiarFotoActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        FileNameExtensionFilter file = new FileNameExtensionFilter("Archivo imagen", "jpg");
        fileChooser.setFileFilter(file);
        int imagen = fileChooser.showOpenDialog(this);
        if (imagen == JFileChooser.APPROVE_OPTION) {
            ImageIcon fotoPerfil = new ImageIcon(fileChooser.getSelectedFile().getAbsolutePath());
            ImageIcon fotoArreglada = resizeImageIcon(fotoPerfil, 210, 240);
            profesional.setFotoPerfil(fotoArreglada);
        }
        actualizar();
    }//GEN-LAST:event_btnCambiarFotoActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        ventana.remove(this);
        PanelHomeProfesional nuevo = new PanelHomeProfesional(sistema, interfaz, ventana);
        interfaz.setActual(nuevo);
        ventana.add(nuevo);
        ventana.pack();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void cajaNombreProfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaNombreProfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajaNombreProfActionPerformed

    private void cajaApellidosProfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaApellidosProfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajaApellidosProfActionPerformed

    void actualizar() {
        fotoPerfil.setIcon(profesional.getFotoPerfil());
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
    private javax.swing.JButton btnAceptarProf;
    private javax.swing.JButton btnCambiarFoto;
    private javax.swing.JButton btnVolver;
    private javax.swing.JTextField cajaApellidosProf;
    private javax.swing.JTextField cajaNombreProf;
    private javax.swing.JTextField cajaNombreTituloProf;
    private javax.swing.JLabel etiquetaApellidosProf;
    private javax.swing.JLabel etiquetaFechaGradProf;
    private javax.swing.JLabel etiquetaFechaNacProf;
    private javax.swing.JLabel etiquetaFotoPerfilProf;
    private javax.swing.JLabel etiquetaMensajeAlAceptar;
    private javax.swing.JLabel etiquetaNombTituloProf;
    private javax.swing.JLabel etiquetaNombreProf;
    private javax.swing.JLabel etiquetaPaisDeGraduacion;
    private javax.swing.JLabel etiquetaTituloProf;
    private com.toedter.calendar.JDateChooser fechaGraduacion;
    private com.toedter.calendar.JDateChooser fechaNacimiento;
    private javax.swing.JLabel fotoPerfil;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JComboBox<String> listaPaisDeGraduacion;
    private javax.swing.JPanel panelRegProf;
    // End of variables declaration//GEN-END:variables
}
