
package figurassemillero;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Triangulo extends Figuras2D{
    
    Scanner teclado = new Scanner(System.in);
    
    //Atrivutos
    double lado1;
    double lado2;
    double lado3;
    
    public Triangulo() {
    }

    public Triangulo(double lado1, double lado2, double lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }
    
    @Override
    public void leer(){
        
        try { 
        System.out.println("Digite lado 1");
        lado1 = teclado.nextDouble();
        System.out.println("Digite lado 2");
        lado2 = teclado.nextDouble();
        System.out.println("Digite lado 3");
        lado3 = teclado.nextDouble();
        valorNegativo(lado1,lado2,lado3);
        
        } catch (InputMismatchException e) {
           System.out.println("\n No se permiten letras\n" + e);
           System.exit(0);
        }catch (ExcepcionNumerosNegativos e){
            System.out.println("\n Ingresa valores positivos y mayores a cero\n"+ e);
            System.exit(0);
        } 
    }
    
    public void  valorNegativo(double lado1, double lado2, double lado3) throws ExcepcionNumerosNegativos {
         if (lado1 <= 0 || lado2 <= 0 || lado3 <=0 ){
             throw new ExcepcionNumerosNegativos();
         }
     }
     @Override
    public double calcularArea(){
        double area = (lado3*Math.sqrt((lado1*lado2) - ((lado3*lado3)/4)))/2;
        return Math.round(area);
    }
    
    @Override
    public double calcularPerimetro(){
        double perimetro = lado1 + lado2 + lado3;
        return Math.round(perimetro);
    }
    public String tipo(){
        String resultado;
        if ((lado1+lado2>lado3 && (lado1+lado3)>lado2) && (lado2+lado3)>lado1) {

            System.out.println("Esto es un Triangulo");
            //resultado = "";
            
            if (lado1==lado2 && lado1 == lado3 && lado2==lado3) {

                resultado = "Esto es un Triangulo Equilatero";
            }
            else if (lado1==lado2 || lado1==lado3 || lado2==lado3){

                resultado = "Esto es un Tieangulo Isosceles";
            }
            else{

                resultado ="Esto es un Tieangulo Escaleno";
            }
        }else{

            resultado = "Los lados no corresponden a un Triangulo";
        }
        return resultado;
    }
    
    @Override
    public void imprimir(){
        System.out.println("\nPerimetro: "+calcularPerimetro()+"\nArea: "+calcularArea() +" "+ tipo() );
    }   
}
