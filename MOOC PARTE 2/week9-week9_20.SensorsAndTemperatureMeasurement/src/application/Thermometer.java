
package application;

import java.util.Random;


public class Thermometer implements Sensor {

    private boolean siwtch;

    public Thermometer() {

        this.siwtch = false;
    }

    @Override
    public boolean isOn() {
        return this.siwtch;
    }

    @Override
    public int measure() {
        if (siwtch) {
            Random random = new Random();
            return random.nextInt(61) - 30;
        } else {
            throw new IllegalStateException();
        }
    }

    @Override
    public void on() {
        this.siwtch = true;
    }

    @Override
    public void off() {
        this.siwtch = false;
    }
}
