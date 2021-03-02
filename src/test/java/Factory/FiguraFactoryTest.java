package Factory;

import Factory.error.FiguraNotFoundException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.w3c.dom.css.Rect;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Pruebas creación de figuras")
class FiguraFactoryTest {

    @Test
    @DisplayName("Null")
    void createNull() {
         assertThrows(FiguraNotFoundException.class, () -> FiguraFactory.createFigura(null));
    }

    @Test
    @DisplayName("Empty")
    void createEmpty() {
        assertThrows(FiguraNotFoundException.class, () -> FiguraFactory.createFigura(""));
    }

    @Test
    @DisplayName("Non existent")
    void createNonExistent(){
        assertThrows(FiguraNotFoundException.class, () -> FiguraFactory.createFigura("ojoefj"));
    }

    @Test
    @DisplayName("Triangle")
    void createTriangle() throws FiguraNotFoundException {
        Figura figura = FiguraFactory.createFigura("triangulo");
        assertTrue(figura instanceof Triangulo); //Para saber si es el objeto triangulo

    }

    @Test
    @DisplayName("Circle")
    void createCircle() throws FiguraNotFoundException {
        Figura figura = FiguraFactory.createFigura("circulo");
        assertTrue(figura instanceof Circulo); //Para saber si es el objeto circulo

    }

    @Test
    @DisplayName("Rectangle")
    void createRectangle() throws FiguraNotFoundException {
        Figura figura = FiguraFactory.createFigura("rectangulo");
        assertTrue(figura instanceof Rectangulo); //Para saber si es el objeto triangulo

    }


}