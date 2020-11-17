package interfaz;

import dominio.Persona;
import dominio.Profesional;
import dominio.Usuario;
import dominio.Sistema;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class PanelCambioDeUsuario extends javax.swing.JPanel {

    private JFrame ventana;
    private Sistema sistema;
    private InterfazBotonesProfesional interfazProf = null;
    private InterfazBotonesUsuario interfazUsr = null;
    private InterfazBotonesAdministrador interfazAdm = null;

    //constructor desde Profesional
    public PanelCambioDeUsuario(JFrame unaVentana,
            Sistema unSistema,
            InterfazBotonesProfesional unaInterfaz) {
        initComponents();
        ventana = unaVentana;
        sistema = unSistema;
        interfazProf = unaInterfaz;
        listaTiposDeUsuarios.setModel(new DefaultComboBoxModel(sistema.getListaTiposDeUsuario()));
        actualizarLista();
    }

    //constructor desde Usuario
    public PanelCambioDeUsuario(JFrame unaVentana,
            Sistema unSistema,
            InterfazBotonesUsuario unaInterfaz) {
        initComponents();
        ventana = unaVentana;
        sistema = unSistema;
        interfazUsr = unaInterfaz;
        listaTiposDeUsuarios.setModel(new DefaultComboBoxModel(sistema.getListaTiposDeUsuario()));
        actualizarLista();
    }

    //constructor desde Administrador
    public PanelCambioDeUsuario(JFrame unaVentana,
            Sistema unSistema,
            InterfazBotonesAdministrador unaInterfaz) {
        initComponents();
        ventana = unaVentana;
        sistema = unSistema;
        interfazAdm = unaInterfaz;
        listaTiposDeUsuarios.setModel(new DefaultComboBoxModel(sistema.getListaTiposDeUsuario()));
        actualizarLista();
    }

    //constructor para comenzar la aplicacion
    public PanelCambioDeUsuario(JFrame unaVentana,
            Sistema unSistema) {
        initComponents();
        ventana = unaVentana;
        sistema = unSistema;
        listaTiposDeUsuarios.setModel(new DefaultComboBoxModel(sistema.getListaTiposDeUsuario()));
        listaTiposDeUsuarios.setSelectedIndex(0);
        actualizarLista();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCambiarUsuario = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaUsuarios = new javax.swing.JList();
        listaTiposDeUsuarios = new javax.swing.JComboBox();
        etiquetaTiposDeUsuarios = new javax.swing.JLabel();
        etiquetaTitulo = new javax.swing.JLabel();
        btnPruebaAdministrador = new javax.swing.JButton();
        JContra = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1147, 784));
        setLayout(null);

        btnCambiarUsuario.setBackground(new java.awt.Color(255, 0, 102));
        btnCambiarUsuario.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnCambiarUsuario.setForeground(new java.awt.Color(255, 255, 255));
        btnCambiarUsuario.setText("Ingresar");
        btnCambiarUsuario.setContentAreaFilled(false);
        btnCambiarUsuario.setOpaque(true);
        btnCambiarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCambiarUsuarioActionPerformed(evt);
            }
        });
        add(btnCambiarUsuario);
        btnCambiarUsuario.setBounds(470, 570, 210, 45);

        listaUsuarios.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jScrollPane1.setViewportView(listaUsuarios);

        add(jScrollPane1);
        jScrollPane1.setBounds(430, 150, 290, 340);

        listaTiposDeUsuarios.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        listaTiposDeUsuarios.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                listaTiposDeUsuariosFocusLost(evt);
            }
        });
        listaTiposDeUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaTiposDeUsuariosActionPerformed(evt);
            }
        });
        add(listaTiposDeUsuarios);
        listaTiposDeUsuarios.setBounds(90, 160, 180, 39);

        etiquetaTiposDeUsuarios.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        etiquetaTiposDeUsuarios.setText("Tipo de Usuario");
        add(etiquetaTiposDeUsuarios);
        etiquetaTiposDeUsuarios.setBounds(90, 120, 180, 29);

        etiquetaTitulo.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        etiquetaTitulo.setForeground(new java.awt.Color(255, 0, 102));
        etiquetaTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiquetaTitulo.setText("Iniciar Sesión");
        add(etiquetaTitulo);
        etiquetaTitulo.setBounds(0, 21, 1150, 44);

        btnPruebaAdministrador.setBackground(new java.awt.Color(255, 0, 102));
        btnPruebaAdministrador.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnPruebaAdministrador.setForeground(new java.awt.Color(255, 255, 255));
        btnPruebaAdministrador.setText("Inicio");
        btnPruebaAdministrador.setContentAreaFilled(false);
        btnPruebaAdministrador.setOpaque(true);
        btnPruebaAdministrador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPruebaAdministradorActionPerformed(evt);
            }
        });
        add(btnPruebaAdministrador);
        btnPruebaAdministrador.setBounds(870, 710, 260, 45);

        JContra.setToolTipText("");
        JContra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JContraActionPerformed(evt);
            }
        });
        add(JContra);
        JContra.setBounds(430, 530, 290, 22);

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Contraseña:");
        add(jLabel1);
        jLabel1.setBounds(430, 500, 290, 24);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCambiarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCambiarUsuarioActionPerformed
        if (listaUsuarios.getSelectedValue() != null) {
            this.limpioInterfaces();
            if (listaTiposDeUsuarios.getSelectedItem() == Sistema.tipoUsuario.PROFESIONAL) {
                Profesional profSeleccionado = (Profesional) listaUsuarios.getSelectedValue();
                String contra = new String(JContra.getPassword());
                if(profSeleccionado.getContrasena().equals(contra)){
                    ventana.remove(this);
                    InterfazBotonesProfesional nuevaBotonera = new InterfazBotonesProfesional(sistema, ventana, profSeleccionado);
                    ventana.pack();
                }
                else{
                    JOptionPane.showMessageDialog(null, "Contraseña Incorrecta", "ERROR", JOptionPane.ERROR_MESSAGE);

                }
                
            }
            if (listaTiposDeUsuarios.getSelectedItem() == Sistema.tipoUsuario.USUARIO) {
                Usuario usuarioSeleccionado = (Usuario) listaUsuarios.getSelectedValue();
                String contra = new String(JContra.getPassword());
                if(usuarioSeleccionado.getContrasena().equals(contra)){
                    ventana.remove(this);
                    InterfazBotonesUsuario nuevaBotonera = new InterfazBotonesUsuario(sistema, ventana, usuarioSeleccionado);
                    ventana.pack();
                }
                else{
                    JOptionPane.showMessageDialog(null, "Contraseña Incorrecta", "ERROR", JOptionPane.ERROR_MESSAGE);
                }
                
            }
        }
    }//GEN-LAST:event_btnCambiarUsuarioActionPerformed

    private void btnPruebaAdministradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPruebaAdministradorActionPerformed
        if (interfazProf != null) {
            ventana.remove(interfazProf.getActual());
            ventana.remove(interfazProf);
        }
        if (interfazAdm != null) {
            ventana.remove(interfazAdm.getActual());
            ventana.remove(interfazAdm);
        }
        if (interfazUsr != null) {
            ventana.remove(interfazUsr.getActual());
            ventana.remove(interfazUsr);
        }
        ventana.remove(this);
        //InterfazBotonesAdministrador nuevaBotonera = new InterfazBotonesAdministrador(sistema, ventana);
        PanelIdentificacion vent=new PanelIdentificacion(sistema, ventana);
        ventana.add(vent);
        ventana.pack();
    }//GEN-LAST:event_btnPruebaAdministradorActionPerformed

    private void listaTiposDeUsuariosFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_listaTiposDeUsuariosFocusLost
        actualizarLista();
    }//GEN-LAST:event_listaTiposDeUsuariosFocusLost

    private void listaTiposDeUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaTiposDeUsuariosActionPerformed
        actualizarLista();
    }//GEN-LAST:event_listaTiposDeUsuariosActionPerformed

    private void JContraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JContraActionPerformed
        // TODO add your handling code here
    }//GEN-LAST:event_JContraActionPerformed
    void actualizarLista() {
        if (sistema.getListaUsuarios().size() < 1 && listaTiposDeUsuarios.getSelectedItem() == Sistema.tipoUsuario.USUARIO) {
            btnCambiarUsuario.setEnabled(false);
        } else {
            if (sistema.getListaProfesionales().size() < 1 && listaTiposDeUsuarios.getSelectedItem() == Sistema.tipoUsuario.PROFESIONAL) {
                btnCambiarUsuario.setEnabled(false);
            } else {
                btnCambiarUsuario.setEnabled(true);
            }
        }
        if (listaTiposDeUsuarios.getSelectedItem() == Sistema.tipoUsuario.PROFESIONAL) {
            listaUsuarios.setListData(sistema.getListaProfesionales().toArray());
        }
        if (listaTiposDeUsuarios.getSelectedItem() == Sistema.tipoUsuario.USUARIO) {
            listaUsuarios.setListData(sistema.getListaUsuarios().toArray());
        }
    }

    void limpioInterfaces() {
        if (interfazProf != null) {
            ventana.remove(interfazProf.getActual());
            ventana.remove(interfazProf);
        }
        if (interfazAdm != null) {
            ventana.remove(interfazAdm.getActual());
            ventana.remove(interfazAdm);
        }
        if (interfazUsr != null) {
            ventana.remove(interfazUsr.getActual());
            ventana.remove(interfazUsr);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField JContra;
    private javax.swing.JButton btnCambiarUsuario;
    private javax.swing.JButton btnPruebaAdministrador;
    private javax.swing.JLabel etiquetaTiposDeUsuarios;
    private javax.swing.JLabel etiquetaTitulo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox listaTiposDeUsuarios;
    private javax.swing.JList listaUsuarios;
    // End of variables declaration//GEN-END:variables
}
