
package figurassemillero;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Cuadrado extends Figuras2D{
  
    Scanner teclado = new Scanner(System.in);
    
    //Atributo}
     double ancho;
     
     public Cuadrado() {
    }
     
    public Cuadrado(double ancho) {
        this.ancho = ancho;
    }

    @Override
     public void leer(){
         String mensaje = "";
         try {
             System.out.println("Escriba por favor el ancho del cuadrado");
            ancho = teclado.nextInt();
            valorNegativo(ancho);
        } catch (InputMismatchException e) {
             System.out.println("\n Esto no es valido \n" + e);
             System.exit(0);
        } catch (ExcepcionNumerosNegativos e){
            System.out.println("\n Esto no es valido\n"+ e);
            System.exit(0);
        }
        System.out.println(mensaje);
    }
     
     public void  valorNegativo(double ancho) throws ExcepcionNumerosNegativos {
         if (ancho < 0 ){
             throw new ExcepcionNumerosNegativos();
         }
     }
    
     //Metodos
    @Override
    public double calcularArea(){
   double area = Math.pow(ancho, 2);
   return area;
    }
    
    @Override
    public double calcularPerimetro(){
        double perimetro = ancho * 4;
        return perimetro;
    }
    
    @Override
    public void imprimir(){
     System.out.println("\"Figura: Cuadrado\nPerimetro: "+calcularPerimetro()+"\nArea: "+calcularArea());
    } 
}
