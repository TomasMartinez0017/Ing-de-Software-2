package dominio;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class AlimentoTest {
    
    public AlimentoTest() {
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
    public void testGetTipoBebidas() {
        System.out.println("getTipo");
        Alimento instance = new Alimento();
        instance.setTipo(Alimento.TipoAlimento.BEBIDAS);
        Alimento.TipoAlimento expResult = Alimento.TipoAlimento.BEBIDAS;
        Alimento.TipoAlimento result = instance.getTipo();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testGetTipoCarnesBlancas() {
        System.out.println("getTipo");
        Alimento instance = new Alimento();
        instance.setTipo(Alimento.TipoAlimento.CARNES_BLANCAS);
        Alimento.TipoAlimento expResult = Alimento.TipoAlimento.CARNES_BLANCAS;
        Alimento.TipoAlimento result = instance.getTipo();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testGetTipoCarnesRojas() {
        System.out.println("getTipo");
        Alimento instance = new Alimento();
        instance.setTipo(Alimento.TipoAlimento.CARNES_ROJAS);
        Alimento.TipoAlimento expResult = Alimento.TipoAlimento.CARNES_ROJAS;
        Alimento.TipoAlimento result = instance.getTipo();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testGetTipoCereal() {
        System.out.println("getTipo");
        Alimento instance = new Alimento();
        instance.setTipo(Alimento.TipoAlimento.CEREAL);
        Alimento.TipoAlimento expResult = Alimento.TipoAlimento.CEREAL;
        Alimento.TipoAlimento result = instance.getTipo();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testToString(){
        Alimento a = new Alimento();
        a.setNombre("Aguacate");
        
        String expValue = "Aguacate";
        
        assertEquals(a.toString(), expValue);
    }
    
    @Test
    public void testGetNombre(){
        Alimento a = new Alimento();
        a.setNombre("Aguacate");
        
        String expValue = "Aguacate";
        
        assertEquals(a.getNombre(), expValue);
    }
    
    @Test
    public void testHashCode(){
        Alimento a = new Alimento();
        int result = a.hashCode();
        int expValue = 1;
        
        assertEquals(result, expValue);
    }
    
    @Test
    public void testEquals(){
        Alimento a = new Alimento();
        boolean result = a.equals(null);
        
        assertEquals(result, false);
    }
    
    @Test
    public void testEquals2(){
        Alimento a = new Alimento();
        Usuario u = new Usuario();
        boolean result = a.equals(u);
        
        assertEquals(result, false);
    }
    
    
}
