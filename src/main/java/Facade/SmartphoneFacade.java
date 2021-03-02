package Facade;

import java.util.Arrays;
import java.util.List;

public class SmartphoneFacade {
    //Punto de acceso comun
    public Smartphone start(){
        Battery battery = new Battery();
        battery.on();

        CPU cpu = new CPU();
        cpu.bootLoad();

        SmartphoneGPSSensor gps = new SmartphoneGPSSensor();
        gps.start();
        SmartphoneNFCSensor nfc = new SmartphoneNFCSensor();
        nfc.start();

        List <SmartphoneSensor> sensors = Arrays.asList(gps,nfc);

        Smartphone oneplus = new Smartphone(battery,cpu,sensors);

        return oneplus;
    }

    public boolean stop(Smartphone smartphone){

        for (SmartphoneSensor sensor:  smartphone.getSensors() ){
            sensor.stop();
        }

        smartphone.getCpu().shutDown();
        smartphone.getBattery().of();

        return true;
    }
}
