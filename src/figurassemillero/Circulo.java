
package figurassemillero;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Circulo extends Figuras2D {
    
    Scanner teclado = new Scanner(System.in);

    //Atributos
    double radio;
    double area;
    double perimetro;
    
    public Circulo(double radio) {
        this.radio = radio;
    }
    
    public Circulo() {}

    @Override
    public void leer (){
        
        try {
            System.out.println("Digite el Radio del circulo" );
            radio = teclado.nextDouble();
            valorNegativo(radio);
        } catch (InputMismatchException e) {
           System.out.println("\n No se permiten letras\n" + e);
           System.exit(0);
            
       } catch (ExcepcionNumerosNegativos e){
                      System.out.println("\n No se permiten numeros negativos o cero \n" + e);
           System.exit(0);
       }
    }
    
     public void  valorNegativo(double radio) throws ExcepcionNumerosNegativos {
         if (radio <= 0 ){
             throw new ExcepcionNumerosNegativos();
         }
     }
    
    @Override
    public double calcularArea(){
    area = Math.pow(radio, 2);
    return area;
    
    }
    
    @Override
    public double calcularPerimetro(){
    perimetro = radio * 2 * 3.14;
    return perimetro;
    }
    
    @Override
    public void imprimir(){
        System.out.println("Figura Circulo");
        System.out.println("\nPerimetro: "+calcularPerimetro() +"\nArea:" +calcularArea());
    }
}
