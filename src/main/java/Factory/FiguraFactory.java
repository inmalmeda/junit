package Factory;

import Factory.error.FiguraNotFoundException;

public class FiguraFactory {

    public static Figura createFigura (String tipo) throws FiguraNotFoundException {

        if(tipo == null || tipo.isEmpty())
            throw new FiguraNotFoundException();

        switch (tipo){
            case "rectangulo":
                return new Rectangulo();
            case "circulo":
                return new Circulo();
            case "triangulo":
                return new Triangulo();
            default:
                throw new FiguraNotFoundException();
        }

    }


}
