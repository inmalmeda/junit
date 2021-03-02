package Facade;

/**
 * Patron facade o fachada
 *
 * Facade
 * Subclases
 * Cliente o main
 *
 * La fachada puede ser una clase candidata a ser Singleton
 *
 * Crea clases con las funciones que va a tener, el orden de cada funcion etc...
 *
 *
 */
public class Main {
    public static void main(String[] args) {
        SmartphoneFacade facade = new SmartphoneFacade();
        Smartphone oneplus = facade.start();

        System.out.println(oneplus);

        facade.stop(oneplus);


    }
}
