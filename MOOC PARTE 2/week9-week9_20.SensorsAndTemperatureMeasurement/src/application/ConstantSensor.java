
package application;



public class ConstantSensor implements Sensor {
    
    private int temperatura;

    public ConstantSensor(int temperatura) {
        this.temperatura = temperatura;
    }
    
    @Override
    public boolean isOn() { 
        return true;
    }

    @Override
    public void on() { }

    @Override
    public void off() { }

    @Override
    public int measure() {
        return temperatura;
    }
    
}
