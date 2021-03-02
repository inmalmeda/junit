package conditionals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledIfSystemProperty;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD) //Para crear una anotación propia para que solo corra en una, evita tener que
//copiar en todos los metodos @EnabledIfSystemProperty(named = "user.name", matches = "Usuario")
// como en SystemPropertiesTest
@Retention(RetentionPolicy.RUNTIME) //Para que se ejecute en tiempo de ejecución
@Test
@EnabledOnOs({OS.WINDOWS}) //Se dice donde quieres ejecutarlo
@EnabledIfSystemProperty(named = "os.version", matches = "10.0")
public @interface RunOnlyOnWindows {


}

