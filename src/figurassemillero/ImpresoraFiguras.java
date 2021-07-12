
package figurassemillero;


public class ImpresoraFiguras extends Figuras2D{
    
    
    public ImpresoraFiguras() {
    }
    
    public void imprimir2 (Object objeto){
     if (objeto instanceof Circulo){
      
        ((Circulo) objeto).imprimir();
        
     }
     
     else if (objeto instanceof Cuadrado){
         ((Cuadrado) objeto).imprimir();
     }
     else if (objeto instanceof  Triangulo)
         ((Triangulo) objeto).imprimir();
    }  
}
