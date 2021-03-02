package parametrized;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class MethodSourceTest {

    //Este metodo puede estar aqui o en las clases de java que no son testing
    private static Stream<String> namesProvider() {
        return Stream.of("Juan", "Antonio", "Calamardo");
    }


    //Se provee de un metodo los resultados
    @ParameterizedTest
    @MethodSource("namesProvider")
    void testNames(String name){
        System.out.println(name);
    }

    //Se provee de un metodo de otra clase
    @ParameterizedTest
    @MethodSource("names.NamesProvider#namesProvider")
    void testNamesFromOtherClass(String name){
        System.out.println(name);
    }


}
