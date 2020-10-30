package dominio;

import java.time.LocalDate;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class ComidaPorDiaTest {
    
    public ComidaPorDiaTest() {
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
    public void testToString(){
        System.out.println("toString");
        ComidaPorDia instance = new ComidaPorDia();
        instance.setFecha("unaFecha");
        String expResult = "Comidas ingeridas el: unaFecha";
        assertEquals(instance.toString(), expResult);
    }
     
    @Test
    public void testGetComidasIngeridas() {
        System.out.println("getComidasIngeridas");
        ComidaPorDia instance = new ComidaPorDia();
        ArrayList<Alimento> expResult = new ArrayList<Alimento>();
        ArrayList<Alimento> result = instance.getComidasIngeridas();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testSetComidasIngeridas() {
        System.out.println("setComidasIngeridas");
        ComidaPorDia instance = new ComidaPorDia();
        ArrayList<Alimento> comidasIngeridas = new ArrayList();
        Alimento a = new Alimento();
        a.setNombre("Platano");
        comidasIngeridas.add(a);
        instance.setFecha("unaFecha");
        instance.setComidasIngeridas(comidasIngeridas);
        
        ArrayList<Alimento> expListaAlimentos = new ArrayList<Alimento>();
        Alimento expAlimento = new Alimento();
        expAlimento.setNombre("Platano");
        expListaAlimentos.add(expAlimento);
        
        ArrayList<Alimento> result = instance.getComidasIngeridas();
        
        assertEquals(result, expListaAlimentos);
    }
    
    @Test
    public void testConstructorComidasIngeridas() {
        System.out.println("ConstructorComidasIngeridas");
        ArrayList<Alimento> comidasIngeridas = new ArrayList();
        Alimento a = new Alimento();
        a.setNombre("Banana");
        ComidaPorDia instance = new ComidaPorDia(comidasIngeridas, "unaFecha");
    } 
    
    @Test
    public void testEqualsIncorrectoNULL() {
        ComidaPorDia instance = null;
        ComidaPorDia instance2 = new ComidaPorDia();
        ArrayList<Alimento> alimentos = new ArrayList<Alimento>();
        Alimento a = new Alimento();
        a.setNombre("Aguacate");
        alimentos.add(a);
        instance2.setComidasIngeridas(alimentos);
        
        boolean expValue = false;
        
        boolean result = instance2.equals(instance);
        
        assertEquals(result, expValue);
    }
    
    @Test
    public void testEqualsClaseIncorrecta() {
        ComidaPorDia instance = new ComidaPorDia();
        ArrayList<Alimento> alimentos = new ArrayList<Alimento>();
        Alimento a = new Alimento();
        a.setNombre("Aguacate");
        alimentos.add(a);
        instance.setComidasIngeridas(alimentos);
        
        Usuario user = new Usuario();
        
        boolean expValue = false;
        
        boolean result = instance.equals(user);
        
        assertEquals(result, expValue);
    }
    
    @Test
    public void testEqualsCorrecto() {
        ComidaPorDia instance = new ComidaPorDia();
        ArrayList<Alimento> alimentos = new ArrayList<Alimento>();
        Alimento a = new Alimento();
        a.setNombre("Aguacate");
        alimentos.add(a);
        instance.setComidasIngeridas(alimentos);
        instance.setFecha("unaFecha");
        
        ComidaPorDia instance2 = new ComidaPorDia();
        ArrayList<Alimento> alimentos2 = new ArrayList<Alimento>();
        Alimento a2 = new Alimento();
        a2.setNombre("Aguacate");
        alimentos2.add(a2);
        instance2.setComidasIngeridas(alimentos2);
        instance2.setFecha("unaFecha");
        
        boolean expValue = true;
        
        boolean result = instance.equals(instance);
        
        assertEquals(result, expValue);
    }
    
    @Test
    public void testEqualsFechaIncorrecta() {
        ComidaPorDia instance = new ComidaPorDia();
        ArrayList<Alimento> alimentos = new ArrayList<Alimento>();
        Alimento a = new Alimento();
        a.setNombre("Aguacate");
        alimentos.add(a);
        instance.setComidasIngeridas(alimentos);
        instance.setFecha("unaFecha");
        
        ComidaPorDia instance2 = new ComidaPorDia();
        ArrayList<Alimento> alimentos2 = new ArrayList<Alimento>();
        Alimento a2 = new Alimento();
        a2.setNombre("Aguacate");
        alimentos2.add(a2);
        instance2.setComidasIngeridas(alimentos2);
        instance2.setFecha("otraFecha");
        
        boolean expValue = false;
        
        boolean result = instance.equals(instance2);
        
        assertEquals(result, expValue);
    }
    
    @Test
    public void testEqualsFechayListaIncorrecta() {
        ComidaPorDia instance = new ComidaPorDia();
        ArrayList<Alimento> alimentos = new ArrayList<Alimento>();
        Alimento a = new Alimento();
        a.setNombre("Platano");
        alimentos.add(a);
        instance.setComidasIngeridas(alimentos);
        instance.setFecha("unaFecha");
        
        ComidaPorDia instance2 = new ComidaPorDia();
        ArrayList<Alimento> alimentos2 = new ArrayList<Alimento>();
        Alimento a2 = new Alimento();
        a2.setNombre("Aguacate");
        alimentos2.add(a2);
        instance2.setComidasIngeridas(alimentos2);
        instance2.setFecha("otraFecha");
        
        boolean expValue = false;
        
        boolean result = instance.equals(instance2);
        
        assertEquals(result, expValue);
    }
    
    @Test
    public void testEqualsListaIncorrecta() {
        ComidaPorDia instance = new ComidaPorDia();
        ArrayList<Alimento> alimentos = new ArrayList<Alimento>();
        Alimento a = new Alimento();
        a.setNombre("Platano");
        alimentos.add(a);
        instance.setComidasIngeridas(alimentos);
        instance.setFecha("unaFecha");
        
        ComidaPorDia instance2 = new ComidaPorDia();
        ArrayList<Alimento> alimentos2 = new ArrayList<Alimento>();
        Alimento a2 = new Alimento();
        a2.setNombre("Aguacate");
        alimentos2.add(a2);
        instance2.setComidasIngeridas(alimentos2);
        instance2.setFecha("unaFecha");
        
        boolean expValue = false;
        
        boolean result = instance.equals(instance2);
        
        assertEquals(result, expValue);
    }
}
