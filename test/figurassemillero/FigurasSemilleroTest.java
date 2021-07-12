
package figurassemillero;

import org.hamcrest.Matcher;
import static org.hamcrest.core.Is.is;
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
public class FigurasSemilleroTest {
    
    public FigurasSemilleroTest() {
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
     * Test of main method, of class FigurasSemillero.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        
        int opcion = 1;
        double radio = 5;
        double ancho = 5;
        double lado1 = 6;
        double lado2 = 6;
        double lado3 = 6;
        
              
        switch (opcion){
            
            case 1:
                try {
                    if(radio > 0){
                        ImpresoraFiguras imprimeCuadrado = new ImpresoraFiguras();
                        Figuras2D cuadrado = new Cuadrado();
                        cuadrado.leer();
                        imprimeCuadrado.imprimir2(cuadrado);
                    }
                }catch(Exception e){
                        assertThat(e.getMessage(),is("Error"));
                        }
            break;
            
            case 2:
                try {
                    if(ancho > 0){
                        Figuras2D cuadrado = new Cuadrado();
                        ImpresoraFiguras imprimeCuadrado = new ImpresoraFiguras();
                        imprimeCuadrado.imprimir2(cuadrado);
                    }
                }catch(Exception e){
                        assertTrue(e.getMessage(),is("Error"));
                        }
            break;
            
            case 3:
                try {
                    if(lado1 > 0 && lado2 > 0 && lado3 > 0){
                        Figuras2D cuadrado = new Cuadrado();
                        ImpresoraFiguras imprimeCuadrado = new ImpresoraFiguras();
                        imprimeCuadrado.imprimir2(cuadrado);
                    }
                }catch(Exception e){
                        assertTrue(e.getMessage(),is("Error"));
                        }
                break;
                default:
                        System.out.print("opcion no valida \n \n");
                    break;
            
        }

    }

    private void assertTrue(String message, Matcher<String> is) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
