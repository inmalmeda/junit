package names;

import java.util.stream.Stream;

public class NamesProvider {
    //Este metodo puede estar aqui o en las clases de java que no son testing
    public static Stream<String> namesProvider() {
        return Stream.of("Juan", "Antonio", "Calamardo");
    }

}
