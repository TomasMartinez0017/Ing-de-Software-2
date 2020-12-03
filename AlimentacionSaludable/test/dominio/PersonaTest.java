package dominio;

import javax.swing.ImageIcon;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class PersonaTest {
    
    public PersonaTest() {
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
    public void testGetNombre() {
        System.out.println("getNombre");
        Persona instance = new Usuario();
        String expResult = "no ingreso nombre";
        String result = instance.getNombre();
        assertEquals(expResult, result);
    }

    
    @Test
    public void testEqualsFalse() {
        System.out.println("equalsFalse");
        Persona obj = new Usuario();
        obj.setNombreUsuario("pruebaFalse");
        Persona instance = new Usuario();
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
    }
    
    @Test(expected = AssertionError.class)//NA.class)
    public void testEqualsNull() {
        System.out.println("equalsNull");
        Persona obj = null;
        Persona instance = new Usuario();
        assert(instance.equals(obj));
    }
    
    @Test
    public void testEqualsDistintoTipo() {
        System.out.println("equalsNull");
        Persona instance = new Usuario();
        boolean test = instance.equals("soy string");
        assertFalse(test);
    }
    
    @Test
    public void testGetFechaNacimiento() {
        Persona instance = new Usuario();
        instance.setFechaNacimiento("unaFecha");
        
        assertEquals(instance.getFechaNacimiento(), "unaFecha");
    }
    
    @Test
    public void testGetApellido() {
        Persona instance = new Usuario();
        instance.setApellidos("Sacchi");
        
        assertEquals(instance.getApellidos(), "Sacchi");
    }
    
    @Test
    public void testSetContrasena() {
        Persona instance = new Usuario();
        instance.setContrasena("12345678");
        String contra = instance.getContrasena();
        
        assertEquals(contra, "12345678");
    }
    
    @Test
    public void testHashCode() {
        Persona instance = new Usuario();
        assertEquals(instance.hashCode(), 1);
    }
    
    @Test
    public void testGetFotoPerfil() {
        Persona instance = new Usuario();
        ImageIcon a = new ImageIcon();
        instance.setFotoPerfil(a);
        
        assertEquals(instance.getFotoPerfil(), a);
    }

    public class PersonaImpl extends Persona {

        public PersonaImpl() {
            super("", "", "", "", null, "");
        }
    }
    
}
