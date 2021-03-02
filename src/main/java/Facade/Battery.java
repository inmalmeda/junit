package Facade;

public class Battery {

    private Boolean on;

    public Boolean isOn() {
        return on;
    }

    public void setOn(Boolean on) {
        this.on = on;
    }

    public void on(){
        this.on = true;
        System.out.println("ENCENDIDA");
    }
    public void of(){
        this.on = false;
        System.out.println("APAGADA");
    }

}
