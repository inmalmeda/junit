package Factory;

import Factory.error.FiguraNotFoundException;

/*Permite crear jerarquias de clases.
* */
public class Main {
    public static void main(String[] args) {
      Rectangulo rect= new Rectangulo();
      rect.otherMethod();

      try {
          Figura triangulo = FiguraFactory.createFigura("triangulo");
          Figura circulo = FiguraFactory.createFigura("circulo");
          Figura rectangulo = FiguraFactory.createFigura("rectangulo");

          rectangulo.area();


          System.out.println(triangulo);
          System.out.println(circulo);
          System.out.println(rectangulo);


      }catch(FiguraNotFoundException e){

      }





    }
}
