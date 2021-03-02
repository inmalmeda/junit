package parametrized;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

//Test parametrizados
public class ValueSourceTest {

    //Se ejecuta tantas veces cmo elementos lleve el array
    @ParameterizedTest
    @ValueSource(strings = {"Alan", "Juanma", "Sergio", "Monica"})
    void listNames(String name){
        System.out.println(name);
    }


    @ParameterizedTest(name = "{index} - Prueba con argumento = {arguments}" ) //Sirve para modificar el texto en el resultado
    @ValueSource(ints = {5,10,15,20})
    void listNumbers(int num){
        System.out.println(num);
    }


}
