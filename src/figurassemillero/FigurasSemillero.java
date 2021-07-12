
package figurassemillero;

import java.util.Scanner;


public class FigurasSemillero {

  
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        int opcion ;
        
         do {            
            System.out.print(" ----------------- BIENVENIDO ----------------- \n");
            System.out.print("1) Cuadrado \n");
            System.out.print("2) Circulo \n");
            System.out.print("3) Tiangulo \n");
            System.out.print("4) Salir \n");
            System.out.print("Escoja una opcion del 1 - 4 \n");
            opcion = teclado.nextInt();

                switch(opcion){
                    case 1:
                        ImpresoraFiguras imprimeCuadrado = new ImpresoraFiguras();
                        Figuras2D cuadrado = new Cuadrado();
                        cuadrado.leer();
                        imprimeCuadrado.imprimir2(cuadrado);
                        
                    break;

                    case 2:
                         ImpresoraFiguras impresora = new ImpresoraFiguras();
                         Figuras2D circulo = new Circulo();
                         circulo.leer();
                         impresora.imprimir2(circulo);
                    break;

                    case 3:
                       ImpresoraFiguras imprimeTriangulo = new ImpresoraFiguras();
                       Figuras2D triangulo = new Triangulo();
                       triangulo.leer();
                       imprimeTriangulo.imprimir2(triangulo);
                    break;

                    case 4:
                       System.exit(0);
                    break;

                    default:
                        System.out.print("opcion no valida \n \n");
                    break;
               }
        } while (opcion >= 4);       
    } 
}
