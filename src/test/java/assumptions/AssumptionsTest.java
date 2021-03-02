package assumptions;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assumptions.assumeTrue;

public class AssumptionsTest {

    @Test
    void prueba1(){

        String desktop = System.getenv("DESKTOP_SESSION");
        assumeTrue("ubuntu".equals(desktop)); //Comprobar que se cumple, si no se cumple, falla

        System.out.println("Hola!");
    }
}
