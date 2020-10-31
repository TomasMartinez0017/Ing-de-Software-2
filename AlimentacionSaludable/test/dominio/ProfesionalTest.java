package dominio;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class ProfesionalTest {
    
    public ProfesionalTest() {
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
    public void testGetCasillaDeEntrada() {
        System.out.println("getCasillaDeEntrada");
        Profesional instance = new Profesional();
        ArrayList<Mensaje> expResult = new ArrayList<Mensaje>();
        ArrayList<Mensaje> result = instance.getCasillaDeEntrada();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetCasillaDeEntrada() {
        System.out.println("setCasillaDeEntrada");
        ArrayList<Mensaje> casillaDeEntrada = new ArrayList<Mensaje>();
        Profesional instance = new Profesional();
        instance.setCasillaDeEntrada(casillaDeEntrada);
        assertEquals(instance.getCasillaDeEntrada(),casillaDeEntrada);
    }

    @Test
    public void testGetNombreTituloProf() {
        System.out.println("getNombreTituloProf");
        Profesional instance = new Profesional();
        String expResult = "no ingreso titulo prof";
        String result = instance.getNombreTituloProf();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetNombreTituloProf() {
        System.out.println("setNombreTituloProf");
        String nombreTituloProf = "no ingreso titulo prof";
        Profesional instance = new Profesional();
        instance.setNombreTituloProf(nombreTituloProf);
        assertEquals(nombreTituloProf,instance.getNombreTituloProf());
    }
    
    @Test
    public void testSetNombreTituloProf2() {
        System.out.println("setNombreTituloProf");
        String nombreTituloProf = "";
        Profesional instance = new Profesional();
        instance.setNombreTituloProf(nombreTituloProf);
    }
    
    
    @Test
    public void testGetPaisObtuvoTituloIndia() {
        System.out.println("getPaisObtuvoTitulo");
        Profesional instance = new Profesional();
        instance.setPaisObtuvoTitulo(Profesional.Pais.INDIA);
        Profesional.Pais expResult = Profesional.Pais.INDIA;
        Profesional.Pais result = instance.getPaisObtuvoTitulo();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testSetPaisObtuvoTituloInglaterra() {
        System.out.println("getPaisObtuvoTitulo");
        Profesional instance = new Profesional();
        instance.setPaisObtuvoTitulo(Profesional.Pais.INGLATERRA);
        Profesional.Pais expResult = Profesional.Pais.INGLATERRA;
        Profesional.Pais result = instance.getPaisObtuvoTitulo();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testGetPaisObtuvoTituloInglaterra() {
        System.out.println("getPaisObtuvoTitulo");
        Profesional instance = new Profesional();
        instance.setPaisObtuvoTitulo(Profesional.Pais.INGLATERRA);
        Profesional.Pais expResult = Profesional.Pais.INGLATERRA;
        Profesional.Pais result = instance.getPaisObtuvoTitulo();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testSetPaisObtuvoTituloIsrael() {
        System.out.println("getPaisObtuvoTitulo");
        Profesional instance = new Profesional();
        instance.setPaisObtuvoTitulo(Profesional.Pais.ISRAEL);
        Profesional.Pais expResult = Profesional.Pais.ISRAEL;
        Profesional.Pais result = instance.getPaisObtuvoTitulo();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testGetPaisObtuvoTituloIsrael() {
        System.out.println("getPaisObtuvoTitulo");
        Profesional instance = new Profesional();
        instance.setPaisObtuvoTitulo(Profesional.Pais.ISRAEL);
        Profesional.Pais expResult = Profesional.Pais.ISRAEL;
        Profesional.Pais result = instance.getPaisObtuvoTitulo();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testSetPaisObtuvoTituloItalia() {
        System.out.println("getPaisObtuvoTitulo");
        Profesional instance = new Profesional();
        instance.setPaisObtuvoTitulo(Profesional.Pais.ITALIA);
        Profesional.Pais expResult = Profesional.Pais.ITALIA;
        Profesional.Pais result = instance.getPaisObtuvoTitulo();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testGetPaisObtuvoTituloItalia() {
        System.out.println("getPaisObtuvoTitulo");
        Profesional instance = new Profesional();
        instance.setPaisObtuvoTitulo(Profesional.Pais.ITALIA);
        Profesional.Pais expResult = Profesional.Pais.ITALIA;
        Profesional.Pais result = instance.getPaisObtuvoTitulo();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testSetPaisObtuvoTituloJapon() {
        System.out.println("getPaisObtuvoTitulo");
        Profesional instance = new Profesional();
        instance.setPaisObtuvoTitulo(Profesional.Pais.JAPON);
        Profesional.Pais expResult = Profesional.Pais.JAPON;
        Profesional.Pais result = instance.getPaisObtuvoTitulo();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testGetPaisObtuvoTituloJapon() {
        System.out.println("getPaisObtuvoTitulo");
        Profesional instance = new Profesional();
        instance.setPaisObtuvoTitulo(Profesional.Pais.JAPON);
        Profesional.Pais expResult = Profesional.Pais.JAPON;
        Profesional.Pais result = instance.getPaisObtuvoTitulo();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testSetPaisObtuvoTituloMexico() {
        System.out.println("getPaisObtuvoTitulo");
        Profesional instance = new Profesional();
        instance.setPaisObtuvoTitulo(Profesional.Pais.MEXICO);
        Profesional.Pais expResult = Profesional.Pais.MEXICO;
        Profesional.Pais result = instance.getPaisObtuvoTitulo();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testGetPaisObtuvoTituloMexico() {
        System.out.println("getPaisObtuvoTitulo");
        Profesional instance = new Profesional();
        instance.setPaisObtuvoTitulo(Profesional.Pais.MEXICO);
        Profesional.Pais expResult = Profesional.Pais.MEXICO;
        Profesional.Pais result = instance.getPaisObtuvoTitulo();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testSetPaisObtuvoTituloParaguay() {
        System.out.println("getPaisObtuvoTitulo");
        Profesional instance = new Profesional();
        instance.setPaisObtuvoTitulo(Profesional.Pais.PARAGUAY);
        Profesional.Pais expResult = Profesional.Pais.PARAGUAY;
        Profesional.Pais result = instance.getPaisObtuvoTitulo();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testGetPaisObtuvoTituloParaguay() {
        System.out.println("getPaisObtuvoTitulo");
        Profesional instance = new Profesional();
        instance.setPaisObtuvoTitulo(Profesional.Pais.PARAGUAY);
        Profesional.Pais expResult = Profesional.Pais.PARAGUAY;
        Profesional.Pais result = instance.getPaisObtuvoTitulo();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testSetPaisObtuvoTituloPeru() {
        System.out.println("getPaisObtuvoTitulo");
        Profesional instance = new Profesional();
        instance.setPaisObtuvoTitulo(Profesional.Pais.PERU);
        Profesional.Pais expResult = Profesional.Pais.PERU;
        Profesional.Pais result = instance.getPaisObtuvoTitulo();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testGetPaisObtuvoTituloPeru() {
        System.out.println("getPaisObtuvoTitulo");
        Profesional instance = new Profesional();
        instance.setPaisObtuvoTitulo(Profesional.Pais.PERU);
        Profesional.Pais expResult = Profesional.Pais.PERU;
        Profesional.Pais result = instance.getPaisObtuvoTitulo();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testSetPaisObtuvoTituloPortugal() {
        System.out.println("getPaisObtuvoTitulo");
        Profesional instance = new Profesional();
        instance.setPaisObtuvoTitulo(Profesional.Pais.PORTUGAL);
        Profesional.Pais expResult = Profesional.Pais.PORTUGAL;
        Profesional.Pais result = instance.getPaisObtuvoTitulo();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testGetPaisObtuvoTituloPortugal() {
        System.out.println("getPaisObtuvoTitulo");
        Profesional instance = new Profesional();
        instance.setPaisObtuvoTitulo(Profesional.Pais.PORTUGAL);
        Profesional.Pais expResult = Profesional.Pais.PORTUGAL;
        Profesional.Pais result = instance.getPaisObtuvoTitulo();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testSetPaisObtuvoTituloRusia() {
        System.out.println("getPaisObtuvoTitulo");
        Profesional instance = new Profesional();
        instance.setPaisObtuvoTitulo(Profesional.Pais.RUSIA);
        Profesional.Pais expResult = Profesional.Pais.RUSIA;
        Profesional.Pais result = instance.getPaisObtuvoTitulo();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testGetPaisObtuvoTituloRusia() {
        System.out.println("getPaisObtuvoTitulo");
        Profesional instance = new Profesional();
        instance.setPaisObtuvoTitulo(Profesional.Pais.RUSIA);
        Profesional.Pais expResult = Profesional.Pais.RUSIA;
        Profesional.Pais result = instance.getPaisObtuvoTitulo();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testSetPaisObtuvoTituloSudafrica() {
        System.out.println("getPaisObtuvoTitulo");
        Profesional instance = new Profesional();
        instance.setPaisObtuvoTitulo(Profesional.Pais.SUDAFRICA);
        Profesional.Pais expResult = Profesional.Pais.SUDAFRICA;
        Profesional.Pais result = instance.getPaisObtuvoTitulo();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testGetPaisObtuvoTituloSudafrica() {
        System.out.println("getPaisObtuvoTitulo");
        Profesional instance = new Profesional();
        instance.setPaisObtuvoTitulo(Profesional.Pais.RUSIA);
        Profesional.Pais expResult = Profesional.Pais.RUSIA;
        Profesional.Pais result = instance.getPaisObtuvoTitulo();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testSetPaisObtuvoTituloVenezuela() {
        System.out.println("getPaisObtuvoTitulo");
        Profesional instance = new Profesional();
        instance.setPaisObtuvoTitulo(Profesional.Pais.VENEZUELA);
        Profesional.Pais expResult = Profesional.Pais.VENEZUELA;
        Profesional.Pais result = instance.getPaisObtuvoTitulo();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testGetPaisObtuvoTituloVenezuela() {
        System.out.println("getPaisObtuvoTitulo");
        Profesional instance = new Profesional();
        instance.setPaisObtuvoTitulo(Profesional.Pais.VENEZUELA);
        Profesional.Pais expResult = Profesional.Pais.VENEZUELA;
        Profesional.Pais result = instance.getPaisObtuvoTitulo();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testGetListaEnumPais() {
        System.out.println("getListaEnumPais");
        Profesional instance = new Profesional();
        Profesional.Pais[] expResult = {
            Profesional.Pais.ALEMANIA, Profesional.Pais.ARGENTINA, Profesional.Pais.AUSTRALIA,
            Profesional.Pais.AUSTRIA, Profesional.Pais.BRASIL, Profesional.Pais.CANADA,
            Profesional.Pais.CHILE, Profesional.Pais.CHINA, Profesional.Pais.COLOMBIA,
            Profesional.Pais.COREA_DEL_SUR, Profesional.Pais.CUBA, Profesional.Pais.ECUADOR,
            Profesional.Pais.EGIPTO, Profesional.Pais.ESPANA, Profesional.Pais.ESTADOS_UNIDOS,
            Profesional.Pais.FRANCIA, Profesional.Pais.GRECIA, Profesional.Pais.HOLANDA,
            Profesional.Pais.INDIA, Profesional.Pais.INGLATERRA, Profesional.Pais.ISRAEL,
            Profesional.Pais.ITALIA, Profesional.Pais.JAPON, Profesional.Pais.MEXICO, Profesional.Pais.PARAGUAY,
            Profesional.Pais.PERU, Profesional.Pais.PORTUGAL, Profesional.Pais.RUSIA, Profesional.Pais.SUDAFRICA,
            Profesional.Pais.URUGUAY, Profesional.Pais.VENEZUELA
            };;
        Profesional.Pais[] result = instance.getListaEnumPais();
        assertArrayEquals(expResult, result);
    }

    @Test
    public void testSetListaEnumPais() {
        System.out.println("setListaEnumPais");
        Profesional instance = new Profesional();
        Profesional.Pais[] listaEnumPais = {
            Profesional.Pais.ALEMANIA, Profesional.Pais.ARGENTINA, Profesional.Pais.AUSTRALIA,
            Profesional.Pais.AUSTRIA, Profesional.Pais.BRASIL, Profesional.Pais.CANADA,
            Profesional.Pais.CHILE, Profesional.Pais.CHINA, Profesional.Pais.COLOMBIA,
            Profesional.Pais.COREA_DEL_SUR, Profesional.Pais.CUBA, Profesional.Pais.ECUADOR,
            Profesional.Pais.EGIPTO, Profesional.Pais.ESPANA, Profesional.Pais.ESTADOS_UNIDOS,
            Profesional.Pais.FRANCIA, Profesional.Pais.GRECIA, Profesional.Pais.HOLANDA,
            Profesional.Pais.INDIA, Profesional.Pais.INGLATERRA, Profesional.Pais.ISRAEL,
            Profesional.Pais.ITALIA, Profesional.Pais.JAPON, Profesional.Pais.MEXICO, Profesional.Pais.PARAGUAY,
            Profesional.Pais.PERU, Profesional.Pais.PORTUGAL, Profesional.Pais.RUSIA, Profesional.Pais.SUDAFRICA,
            Profesional.Pais.URUGUAY, Profesional.Pais.VENEZUELA
            };;
        instance.setListaEnumPais(listaEnumPais);
        assertArrayEquals(instance.getListaEnumPais(),listaEnumPais);
    }

    @Test
    public void testInicializoListaEnumPaises() {
        System.out.println("inicializoListaEnumPaises");
        Profesional instance = new Profesional();
        Profesional.Pais[] expResult = {
            Profesional.Pais.ALEMANIA, Profesional.Pais.ARGENTINA, Profesional.Pais.AUSTRALIA,
            Profesional.Pais.AUSTRIA, Profesional.Pais.BRASIL, Profesional.Pais.CANADA,
            Profesional.Pais.CHILE, Profesional.Pais.CHINA, Profesional.Pais.COLOMBIA,
            Profesional.Pais.COREA_DEL_SUR, Profesional.Pais.CUBA, Profesional.Pais.ECUADOR,
            Profesional.Pais.EGIPTO, Profesional.Pais.ESPANA, Profesional.Pais.ESTADOS_UNIDOS,
            Profesional.Pais.FRANCIA, Profesional.Pais.GRECIA, Profesional.Pais.HOLANDA,
            Profesional.Pais.INDIA, Profesional.Pais.INGLATERRA, Profesional.Pais.ISRAEL,
            Profesional.Pais.ITALIA, Profesional.Pais.JAPON, Profesional.Pais.MEXICO, Profesional.Pais.PARAGUAY,
            Profesional.Pais.PERU, Profesional.Pais.PORTUGAL, Profesional.Pais.RUSIA, Profesional.Pais.SUDAFRICA,
            Profesional.Pais.URUGUAY, Profesional.Pais.VENEZUELA
            };;
        Profesional.Pais[] result = {
            Profesional.Pais.ALEMANIA, Profesional.Pais.ARGENTINA, Profesional.Pais.AUSTRALIA,
            Profesional.Pais.AUSTRIA, Profesional.Pais.BRASIL, Profesional.Pais.CANADA,
            Profesional.Pais.CHILE, Profesional.Pais.CHINA, Profesional.Pais.COLOMBIA,
            Profesional.Pais.COREA_DEL_SUR, Profesional.Pais.CUBA, Profesional.Pais.ECUADOR,
            Profesional.Pais.EGIPTO, Profesional.Pais.ESPANA, Profesional.Pais.ESTADOS_UNIDOS,
            Profesional.Pais.FRANCIA, Profesional.Pais.GRECIA, Profesional.Pais.HOLANDA,
            Profesional.Pais.INDIA, Profesional.Pais.INGLATERRA, Profesional.Pais.ISRAEL,
            Profesional.Pais.ITALIA, Profesional.Pais.JAPON, Profesional.Pais.MEXICO, Profesional.Pais.PARAGUAY,
            Profesional.Pais.PERU, Profesional.Pais.PORTUGAL, Profesional.Pais.RUSIA, Profesional.Pais.SUDAFRICA,
            Profesional.Pais.URUGUAY, Profesional.Pais.VENEZUELA
            };;
        assertArrayEquals(expResult, result);
    }

    @Test
    public void testToString() {
        System.out.println("toString");
        Profesional instance = new Profesional();
        String expResult = "Usuario: " + instance.getNombreUsuario();;
        String result = instance.toString();
        assertEquals(expResult, result);
    }

    @Test
    public void testEqualsFalse() {
        System.out.println("equals");
        Profesional obj = new Profesional();
        obj.setNombreUsuario("prueba");
        Profesional instance = new Profesional();
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertFalse(obj.equals(instance));
    }
    
    @Test
    public void testEqualsTrue() {
        System.out.println("equals");
        Profesional obj = new Profesional();
        Profesional instance = new Profesional();
        boolean expResult = true;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
    } 
    
    @Test(expected = NullPointerException.class)
    public void testEqualsNull() {
        System.out.println("equalsNull");
        Profesional obj = new Profesional();
        Profesional instance = null;
        assert(instance.equals(obj));
    }
    
    @Test
    public void testEqualsDistintoTipo() {
        System.out.println("equalsDistintoTipo");
        Profesional obj = new Profesional();
        obj.setNombreUsuario("nombre");
        boolean test = obj.equals("soy string");
        assertFalse(test);
    }
    
    @Test
    public void testSetFechaDeGraduacion() {
        System.out.println("equalsDistintoTipo");
        Profesional instance = new Profesional();
        instance.setFechaGraduacion("");
    } 
}
