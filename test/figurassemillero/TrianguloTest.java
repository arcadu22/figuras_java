
package figurassemillero;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class TrianguloTest {
    
    public TrianguloTest() {
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

    /**
     * Test of calcularArea method, of class Triangulo.
     */
    @Test
    public void testCalcularArea() {
        System.out.println("calcularArea");        
        double lado1 = 5;
        double lado2 = 5;
        double lado3 = 5;
        Triangulo instance = new Triangulo(lado1,lado2,lado3);

        double expResult = 11 ;
        double result = instance.calcularArea();
        assertEquals(expResult, result, 0.0);

    }

    /**
     * Test of calcularPerimetro method, of class Triangulo.
     */
    @Test
    public void testCalcularPerimetro() {
        System.out.println("calcularPerimetro");
        double lado1 = 5;
        double lado2 = 5;
        double lado3 = 5;
        Triangulo instance = new Triangulo(lado1,lado2,lado3);
        double expResult = 15;
        double result = instance.calcularPerimetro();
        assertEquals(expResult, result, 0.0);

    }

    /**
     * Test of tipo method, of class Triangulo.
     */
    @Test
    public void testTipo() {
        System.out.println("Tipo Isosceles");
        double lado1 = 16.16;
        double lado2 = 16.16;
        double lado3 = 12;
        
        Triangulo instance = new  Triangulo(lado1, lado2, lado3);
        String expResult = "Esto es un Tieangulo Isosceles";
        
        
        String result = instance.tipo();
        assertSame(expResult, result);
    }
    @Test
    public void testTipo2() {
        System.out.println("Tipo Equilatero");
        double lado1 = 16;
        double lado2 = 16;
        double lado3 = 16;
        
        Triangulo instance = new  Triangulo(lado1, lado2, lado3);
        String expResult = "Esto es un Triangulo Equilatero";
        
        
        String result = instance.tipo();
        assertSame(expResult, result);
    }
    
    @Test
        public void testTipo3() {
        System.out.println("Tipo Escaleno");
        double lado1 = 14;
        double lado2 = 12;
        double lado3 = 16;

        Triangulo instance = new  Triangulo(lado1, lado2, lado3);
        String expResult = "Esto es un Tieangulo Escaleno";


        String result = instance.tipo();
        assertSame(expResult, result);
    }

    /**
     * Test of imprimir method, of class Triangulo.
     */
}
