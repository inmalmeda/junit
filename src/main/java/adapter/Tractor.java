package adapter;

public class Tractor {

    private double speed;

    void changeMode(int mode){
        switch (mode){
            case 1:
                this.speed = 5; // tortuga
            case 2:
                this.speed = 15; // liebre
        }
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

}
