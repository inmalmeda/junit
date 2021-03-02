package timeout;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;

@Timeout(value = 4 , unit = TimeUnit.HOURS) //El test falla si pasan las 4horas
public class TimeoutClassTest {

    @Test
    @Timeout(2) // Si excede este tiempo, el test dara fallo
    void testMultiply() throws InterruptedException {

        TimeUnit.SECONDS.sleep(10);
        System.out.println("Hola dsde timeout");
    }
}
