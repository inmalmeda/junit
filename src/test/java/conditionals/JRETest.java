package conditionals;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledOnJre;
import org.junit.jupiter.api.condition.EnabledForJreRange;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.JRE;

public class JRETest {

    @Test
    @EnabledOnJre(JRE.JAVA_8) //Deshabilita en base a la condición de que se cumpla el jre
    void runOnlyJava8(){

        System.out.println("Hola mundo desde java 8");

    }

    @Test
    @DisabledOnJre(JRE.JAVA_15) //No se ejecuta en java 15
    void runOnlyJava15(){

        System.out.println("Hola mundo desde java 8");

    }

    @Test
    @EnabledForJreRange(min = JRE.JAVA_9, max= JRE.JAVA_11 ) //Rango entre los que si se ejecuta
    void runOnlyJavaRange9to11(){

        System.out.println("Hola mundo");

    }



}
