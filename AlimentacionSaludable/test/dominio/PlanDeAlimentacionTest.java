package dominio;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import java.util.ArrayList;
import static org.junit.Assert.*;

public class PlanDeAlimentacionTest {
    public PlanDeAlimentacionTest() {
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
    public void testConstructorUsuario(){
        Usuario u = new Usuario();
        u.setNombre("Alberto");
        u.setApellidos("Rodriguez");
        u.setAlturaCm(180);
        u.setFechaNacimiento("unaFechaDeNacimiento");
        PlanDeAlimentacion instance = new PlanDeAlimentacion(u);
        
        assertEquals(u.getNombre(), instance.getUsuario().getNombre());
        
    }
    
    @Test
    public void testSetUsuario(){
        Usuario u = new Usuario();
        u.setNombre("Alberto");
        u.setApellidos("Rodriguez");
        u.setAlturaCm(180);
        u.setFechaNacimiento("unaFechaDeNacimiento");
        PlanDeAlimentacion instance = new PlanDeAlimentacion(u);
        
        Usuario user = new Usuario();
        user.setNombre("Tomas");
        user.setApellidos("Martinez");
        user.setAlturaCm(175);
        user.setFechaNacimiento("unaFechaDeNacimiento");
        
        instance.setUsuario(u);
        
        
        assertEquals(user, instance.getUsuario());  
    }
    
    @Test
    public void testSetListaLunes(){
        Usuario u = new Usuario();
        u.setNombre("Alberto");
        u.setApellidos("Rodriguez");
        u.setAlturaCm(180);
        u.setFechaNacimiento("unaFechaDeNacimiento");
        
        PlanDeAlimentacion instance = new PlanDeAlimentacion(u);
        
        ArrayList<Alimento> alimentos = new ArrayList<Alimento>();
        Alimento a = new Alimento();
        a.setNombre("Naranja");
        alimentos.add(a);
        
        instance.setListaLunes(alimentos);
        
        ArrayList<Alimento> expLista = instance.getListaLunes();
        
        assertEquals(alimentos, expLista);   
    }
    
    @Test
    public void testSetListaMartes(){
        Usuario u = new Usuario();
        u.setNombre("Alberto");
        u.setApellidos("Rodriguez");
        u.setAlturaCm(180);
        u.setFechaNacimiento("unaFechaDeNacimiento");
        
        PlanDeAlimentacion instance = new PlanDeAlimentacion(u);
        
        ArrayList<Alimento> alimentos = new ArrayList<Alimento>();
        Alimento a = new Alimento();
        a.setNombre("Naranja");
        alimentos.add(a);
        
        instance.setListaMartes(alimentos);
        
        ArrayList<Alimento> expLista = instance.getListaMartes();
        
        assertEquals(alimentos, expLista);   
    }
    
    @Test
    public void testSetListaMiercoles(){
        Usuario u = new Usuario();
        u.setNombre("Alberto");
        u.setApellidos("Rodriguez");
        u.setAlturaCm(180);
        u.setFechaNacimiento("unaFechaDeNacimiento");
        
        PlanDeAlimentacion instance = new PlanDeAlimentacion(u);
        
        ArrayList<Alimento> alimentos = new ArrayList<Alimento>();
        Alimento a = new Alimento();
        a.setNombre("Naranja");
        alimentos.add(a);
        
        instance.setListaMiercoles(alimentos);
        
        ArrayList<Alimento> expLista = instance.getListaMiercoles();
        
        assertEquals(alimentos, expLista);   
    }
    
    @Test
    public void testSetListaJueves(){
        Usuario u = new Usuario();
        u.setNombre("Alberto");
        u.setApellidos("Rodriguez");
        u.setAlturaCm(180);
        u.setFechaNacimiento("unaFechaDeNacimiento");
        
        PlanDeAlimentacion instance = new PlanDeAlimentacion(u);
        
        ArrayList<Alimento> alimentos = new ArrayList<Alimento>();
        Alimento a = new Alimento();
        a.setNombre("Naranja");
        alimentos.add(a);
        
        instance.setListaJueves(alimentos);
        
        ArrayList<Alimento> expLista = instance.getListaJueves();
        
        assertEquals(alimentos, expLista);   
    }
     
    @Test
    public void testSetListaViernes(){
        Usuario u = new Usuario();
        u.setNombre("Alberto");
        u.setApellidos("Rodriguez");
        u.setAlturaCm(180);
        u.setFechaNacimiento("unaFechaDeNacimiento");
        
        PlanDeAlimentacion instance = new PlanDeAlimentacion(u);
        
        ArrayList<Alimento> alimentos = new ArrayList<Alimento>();
        Alimento a = new Alimento();
        a.setNombre("Naranja");
        alimentos.add(a);
        
        instance.setListaViernes(alimentos);
        
        ArrayList<Alimento> expLista = instance.getListaViernes();
        
        assertEquals(alimentos, expLista);   
    }
    
    @Test
    public void testSetListaSabado(){
        Usuario u = new Usuario();
        u.setNombre("Alberto");
        u.setApellidos("Rodriguez");
        u.setAlturaCm(180);
        u.setFechaNacimiento("unaFechaDeNacimiento");
        
        PlanDeAlimentacion instance = new PlanDeAlimentacion(u);
        
        ArrayList<Alimento> alimentos = new ArrayList<Alimento>();
        Alimento a = new Alimento();
        a.setNombre("Naranja");
        alimentos.add(a);
        
        instance.setListaSabado(alimentos);
        
        ArrayList<Alimento> expLista = instance.getListaSabado();
        
        assertEquals(alimentos, expLista);   
    }
    
    @Test
    public void testSetListaDomingo(){
        Usuario u = new Usuario();
        u.setNombre("Alberto");
        u.setApellidos("Rodriguez");
        u.setAlturaCm(180);
        u.setFechaNacimiento("unaFechaDeNacimiento");
        
        PlanDeAlimentacion instance = new PlanDeAlimentacion(u);
        
        ArrayList<Alimento> alimentos = new ArrayList<Alimento>();
        Alimento a = new Alimento();
        a.setNombre("Naranja");
        alimentos.add(a);
        
        instance.setListaDomingo(alimentos);
        
        ArrayList<Alimento> expLista = instance.getListaDomingo();
        
        assertEquals(alimentos, expLista);   
    }
}
