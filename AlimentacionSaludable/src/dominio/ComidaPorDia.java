package dominio;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;

public class ComidaPorDia implements Serializable{
    //Atributos
     private static final long serialVersionUID = 6106269076155338045L;
     private ArrayList<Alimento> comidasIngeridas;
     private String fecha;
     
     //Constructor
    public ComidaPorDia(ArrayList<Alimento> comidasIngeridas, String fecha) {
        this.comidasIngeridas = comidasIngeridas;
        this.fecha = fecha;
    }
    
    public ComidaPorDia() {
        this.comidasIngeridas = new ArrayList<>();
        LocalDate diaActual = LocalDate.now();
        this.fecha = diaActual.toString();
    }
    
    //Metodos de la clase comidaPorDia
    public ArrayList<Alimento> getComidasIngeridas() {
        return comidasIngeridas;
    }

    public void setComidasIngeridas(ArrayList<Alimento> comidasIngeridas) {
        this.comidasIngeridas = comidasIngeridas;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
      @Override
    public String toString() {
        return "Comidas ingeridas el: "+this.getFecha();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        ComidaPorDia other = (ComidaPorDia) obj;
        return other.getComidasIngeridas().equals(this.getComidasIngeridas()) && other.getFecha().equalsIgnoreCase(this.getFecha());
    }
    
    @Override
    public int hashCode(){
        return 1;
    }
}
   
