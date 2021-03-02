package conditionals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledIfSystemProperty;

public class SystemPropertiesTest {

    //Para ver las propiedades del sistema
    @Test
    void printSystemProperties(){
        System.getProperties().forEach(
                (key,value)-> System.out.println(key + " - " + value));
    }

    //Se ejecuta si concuerda, se meten expresiones regulares
    @Test
    @EnabledIfSystemProperty(named = "user.name", matches = "Usuario")
    void runOnlyOnUserName (){
        System.out.println("Java Oracle");
    }

    @Test
    @EnabledIfSystemProperty(named = "os.arch", matches = "amd64")
    void runOnlyOnOsArch (){
        System.out.println("Java Oracle");
    }


    @RunOnlyOnWindows
    void checkWindows(){
        System.out.println("HOLAAAAAAA");
    }


}
