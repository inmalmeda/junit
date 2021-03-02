package parametrized;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CSVSourceTest {

    //Para enviar varios parametros
    @ParameterizedTest
    @CsvSource({
            "Peter, admin, 1",
            "Juan, normal, 2",
            "Diego, admin, 3",
            "Pedro, admin, 4"
    })
    void printUser(String name, String role, Long id){
        System.out.println("Usuario name: " + name + " role: " + role + ",id: " + id);
    }
}
