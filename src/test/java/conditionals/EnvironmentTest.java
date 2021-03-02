package conditionals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;

public class EnvironmentTest {

    //Para imrpimir las variables de entorno
    @Test
    void printEnvironment(){
        System.getenv().forEach((key, value) -> System.out.println(key + " - " + value));
    }

    @Test
    @EnabledIfEnvironmentVariable(named= "USERNAME", matches = "Usuario")
    void printOnlyUser(){
        System.out.println("HOLAS");
    }
}
