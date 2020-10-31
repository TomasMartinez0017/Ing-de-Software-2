package dominio;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Optional;

public class Profesional extends Persona implements Serializable {

    //Atributos
    private static final long serialVersionUID = 6106269076155338045L;
    private String nombreTituloProf;
    private String fechaGraduacion;
    private Pais paisObtuvoTitulo;
    private Pais[] listaEnumPais = {
            Pais.ALEMANIA, Pais.ARGENTINA, Pais.AUSTRALIA,
            Pais.AUSTRIA, Pais.BRASIL, Pais.CANADA,
            Pais.CHILE, Pais.CHINA, Pais.COLOMBIA,
            Pais.COREA_DEL_SUR, Pais.CUBA, Pais.ECUADOR,
            Pais.EGIPTO, Pais.ESPANA, Pais.ESTADOS_UNIDOS,
            Pais.FRANCIA, Pais.GRECIA, Pais.HOLANDA,
            Pais.INDIA, Pais.INGLATERRA, Pais.ISRAEL,
            Pais.ITALIA, Pais.JAPON, Pais.MEXICO, Pais.PARAGUAY,
            Pais.PERU, Pais.PORTUGAL, Pais.RUSIA, Pais.SUDAFRICA,
            Pais.URUGUAY, Pais.VENEZUELA
            };
    private ArrayList<Mensaje> casillaDeEntrada;

    //Constructor

    public Profesional() {
        super("no ingreso nombre", "no ingreso apellido", "no ingreso usuario",
              "no ingreso fecha nacimiento", null);
        this.setFotoPerfil(new javax.swing
                           .ImageIcon(getClass()
                           .getResource
                           ("/imagenes/predeterminadaProfesional.png")));
        this.nombreTituloProf = "no ingreso titulo prof";
        this.fechaGraduacion = "no ingreso fecha graduacion";
        this.paisObtuvoTitulo = Pais.URUGUAY;
        this.casillaDeEntrada = new ArrayList<>();
    }

    // Metodos de la clase profesional
    public ArrayList<Mensaje> getCasillaDeEntrada() {
        return casillaDeEntrada;
    }

    public void setCasillaDeEntrada(ArrayList<Mensaje> casillaDeEntrada) {
        this.casillaDeEntrada = casillaDeEntrada;
    }

    public String getNombreTituloProf() {
        return nombreTituloProf;
    }

    public void setNombreTituloProf(String nombreTituloProf) {
        if(!nombreTituloProf.trim().isEmpty()){
            this.nombreTituloProf = nombreTituloProf;
        }
    }

    public String getFechaGraduacion() {
        return fechaGraduacion;
    }

    public void setFechaGraduacion(String fechaGraduacion) {
        if(!fechaGraduacion.trim().isEmpty()){
            this.fechaGraduacion = fechaGraduacion;
        }
    }

    public Pais getPaisObtuvoTitulo() {
        return paisObtuvoTitulo;
    }

    public void setPaisObtuvoTitulo(Pais paisObtuvoTitulo) {
        this.paisObtuvoTitulo = paisObtuvoTitulo;
    }

    public Pais[] getListaEnumPais() {
        return listaEnumPais;
    }

    public void setListaEnumPais(Pais[] listaEnumPais) {
        this.listaEnumPais = Optional
                .ofNullable(listaEnumPais)
                .orElse(null);

    }

    public enum Pais {
        ALEMANIA, ARGENTINA, AUSTRALIA, AUSTRIA, BRASIL, CANADA, CHILE, CHINA,
        COLOMBIA, COREA_DEL_SUR, CUBA, ECUADOR, EGIPTO, ESPANA, ESTADOS_UNIDOS,
        FRANCIA, GRECIA, HOLANDA, INDIA, INGLATERRA, ISRAEL, ITALIA, JAPON,
        MEXICO, PARAGUAY, PERU, PORTUGAL, RUSIA, SUDAFRICA, URUGUAY, VENEZUELA
    }

    //redefino toString
    @Override
    public String toString() {
        return "Usuario: " + this.getNombreUsuario();
    }
}
