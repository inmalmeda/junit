package Facade;

import org.junit.jupiter.api.*;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@DisplayName("Smartphone structure")
class SmartphoneFacadeTest {

    private static SmartphoneFacade facade;

    @BeforeAll
    static void setupClass(){
        facade= new SmartphoneFacade();
        System.out.println("BeforeAll");
    }

    @AfterAll
    static void tearDownClass(){
        System.out.println("AfterAll");
    }

    @BeforeEach //Esto se ejecuta antes de cada metodo
    void setupTest(){
        System.out.println("BeforeEach");
    }

    @AfterEach //Se ejecuta despues de cada metodo
    void tearDownTest(){
        System.out.println("AfterEach");
    }

    @Test
    @DisplayName("turn on Smartphone")
    @Order(1)
    void start() {
        Smartphone smartphone = facade.start();

        assertNotNull(smartphone);
        assertNotNull(smartphone.getBattery());
        assertTrue(smartphone.getBattery().isOn());
        System.out.println("start");

    }

    @Test
    @DisplayName("turn off Smartphone")
    @Order(2)
    void stop() {

        Smartphone smartphone = facade.start();
        facade.stop(smartphone);
        assertFalse(smartphone.getBattery().isOn()); //Igual: assertTrue(!smartphone.getBattery().getOn());

        System.out.println("stop");
    }

    @Test
    @DisplayName("Smartphone sensors")
    @Order(3)
    @Disabled("Pendiente bugfix-74") //Para deshabilitarlo
    void sensors() {
        Smartphone smartphone = facade.start();
        List<SmartphoneSensor> sensors = smartphone.getSensors();
        assertNotNull(sensors);
        assertFalse(sensors.isEmpty());
        assertEquals(2,sensors.size());
    }

    //Clase anidada
    @Nested //Anidada
    @DisplayName("Exceptions")
    class SmartphoneFacadeExceptionTest{

        @Test
        @DisplayName("Creation")
        void checkCreationException(){

        }

        @Test
        @DisplayName("Modification")
        void checkModificationException(){

        }

    }

}