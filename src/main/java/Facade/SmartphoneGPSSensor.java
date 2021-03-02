package Facade;

public class SmartphoneGPSSensor implements SmartphoneSensor{
    @Override
    public void start() {
        System.out.println("GPS Comienza");
    }

    @Override
    public void stop() {
        System.out.println("GPS Para");
    }
}
