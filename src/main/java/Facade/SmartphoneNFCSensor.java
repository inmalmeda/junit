package Facade;

public class SmartphoneNFCSensor implements SmartphoneSensor{
    @Override
    public void start() {
        System.out.println("NFC Comienza");
    }

    @Override
    public void stop() {
        System.out.println("NFC Para");
    }
}
