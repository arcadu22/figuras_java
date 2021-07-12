/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurassemillero;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author RENSO
 */
public class CirculoTest {
    
    public CirculoTest() {
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
     * Test of leer method, of class Circulo.
     */
    /*
    @Test
   
    

    /**
     * Test of valorNegativo method, of class Circulo.
     */
    
    @Test
    public void testValorNegativo() throws Exception {
        System.out.println("valorNegativo");
        double ancho = 5;
        
        Circulo instance = new Circulo(ancho);
        instance.valorNegativo(ancho);
        
    }

    /**
     * Test of calcularArea method, of class Circulo.
     */
    @Test
    public void testCalcularArea() {
        System.out.println("calcularArea");
        double ancho = 5;
        
        Circulo instance = new Circulo(ancho);
        double expResult = 25;
        
        double result = instance.calcularArea();
        assertEquals(expResult, result, 0.0);
        
    }

    /**
     * Test of calcularPerimetro method, of class Circulo.
     */
    @Test
    public void testCalcularPerimetro() {
        System.out.println("calcularPerimetro");
        double radio = 6;
        Circulo instance = new Circulo(radio);
        double expResult = 37.68;
        double result = instance.calcularPerimetro();
        assertEquals(expResult, result, 0.0);

    }  
}
