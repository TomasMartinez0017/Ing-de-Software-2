/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alimentacionsaludable;
import dominio.Sistema;
import interfaz.PanelCambioDeUsuario;
import interfaz.PanelPrincipal;
import interfaz.PanelIdentificacion;
/**
 *
 * @author ale
 */
public class AlimentacionSaludable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Sistema s = new Sistema();
        s.cargarSistema();
        PanelPrincipal p = new PanelPrincipal(s);
        PanelIdentificacion comienzo = new PanelIdentificacion(p.getSistema(),p);
        p.add(comienzo);
        p.pack();
        p.setLocationRelativeTo(null);
        p.setVisible(true);
    }
}
