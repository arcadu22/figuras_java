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
public class ImpresoraFigurasTest {
    
    public ImpresoraFigurasTest() {
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
     * Test of imprimir2 method, of class ImpresoraFiguras.
     */
    @Test
    public void testImprimir2() {
        System.out.println("Cuadrado");
        double ancho = 5;
        Cuadrado Cuadrado = new Cuadrado(ancho);
        Cuadrado.imprimir();
   
    }
        @Test
    public void testImprimir() {
        System.out.println("Triangulo");
        double lado1 = 6;
        double lado2 = 6;
        double lado3 = 6;
        Triangulo Triangulo = new Triangulo(lado1, lado2, lado3);
        Triangulo.imprimir();

    }
        @Test
    public void testImprimir3() {
        System.out.println("Circulo");
        double radio = 5;
        Circulo Circulo = new Circulo(radio);
        Circulo.imprimir();

    }
}
