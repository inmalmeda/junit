package timeout;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

public class TimeoutMethodTest {

    @Test
    @Timeout(4) // Si excede este tiempo, el test dara fallo
    void testMultiply() throws InterruptedException {

        Thread.sleep(4000l);
        System.out.println("Hola dsde timeout");
    }
}
