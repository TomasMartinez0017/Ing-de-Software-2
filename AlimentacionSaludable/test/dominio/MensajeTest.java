package dominio;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import java.util.ArrayList;
import static org.junit.Assert.*;

public class MensajeTest {
    public MensajeTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void testConstructorMensaje(){
        Mensaje instance = new Mensaje();
        assertEquals(instance.getAsunto(), "no tiene texto");
    }
    
    @Test
    public void testGetOrigen(){
        Mensaje instance = new Mensaje();
        Persona p = (Persona) new Usuario();
        p.setNombre("Carlos");
        instance.setOrigen(p);
        
        assertEquals(instance.getOrigen(), p);
    }
    
    @Test
    public void testSetOrigen(){
        Mensaje instance = new Mensaje();
        Persona p = (Persona) new Usuario();
        p.setNombre("Carlos");
        instance.setOrigen(p);
        
        Persona expResult = (Persona) new Usuario();
        expResult.setNombre("Carlos");
        
        assertEquals(instance.getOrigen(), expResult);
    }
    
    @Test
    public void testGetDestino(){
        Mensaje instance = new Mensaje();
        Persona p = (Persona) new Usuario();
        p.setNombre("Gerardo");
        p.setApellidos("Maturro");
        instance.setDestino(p);
        
        assertEquals(instance.getDestino(), p);
    }
    
    @Test
    public void testSetDestino(){
        Mensaje instance = new Mensaje();
        Persona p = (Persona) new Usuario();
        p.setNombre("Gerardo");
        p.setApellidos("Maturro");
        instance.setDestino(p);
        
        Persona expResult = (Persona) new Usuario();
        expResult.setNombre("Gerardo");
        expResult.setApellidos("Maturro");
        
        assertEquals(instance.getDestino(), expResult);
    }
    
    @Test
    public void testGetAsunto(){
        Mensaje instance = new Mensaje();
        instance.setAsunto("Un Asunto Muy Importante");
        String expResult = "Un Asunto Muy Importante";
        
        assertEquals(instance.getAsunto(), expResult);
    }
    
    @Test
    public void testSetAsunto(){
        Mensaje instance = new Mensaje();
        instance.setAsunto("Un Asunto Muy Importante");
        instance.setAsunto("Otro Asunto Muy Importante");
        String expResult = "Otro Asunto Muy Importante";
        
        assertEquals(instance.getAsunto(), expResult);
    }
    
    @Test
    public void testGetMensaje(){
        Mensaje instance = new Mensaje();
        instance.setMensaje("Este mensaje contiene informacion clasificada");
       
        String expResult = "Este mensaje contiene informacion clasificada";
        
        assertEquals(instance.getMensaje(), expResult);
    }
    
    @Test
    public void testSetMensaje(){
        Mensaje instance = new Mensaje();
        instance.setMensaje("Arriba Nacional");
        instance.setMensaje("Arriba Peñarol");
        String expResult = "Arriba Peñarol";
        
        assertEquals(instance.getMensaje(), expResult);
    }
    
    @Test
    public void testToString(){
        Mensaje instance = new Mensaje();
        Persona p = (Persona) new Usuario();
        p.setNombre("Camilito");
        p.setApellidos("Kawasaki");
        p.setNombreUsuario("K1000itoKawasaki");
        instance.setOrigen(p);
        instance.setAsunto("Invitacion a fiesta clandestina");
        
        String expResult = "Mensaje de: K1000itoKawasaki con Asunto: Invitacion a fiesta clandestina";
        
        assertEquals(instance.toString(), expResult);
    }
    
    
}    
