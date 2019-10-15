package application;

import java.util.ArrayList;
import java.util.List;

public class AverageSensor implements Sensor {

    private ArrayList<Sensor> sensors;
    private List readings;

    public AverageSensor() {
        sensors = new ArrayList<Sensor>();
        readings = new ArrayList();
    }

    @Override
    public void on() {
        for (Sensor listSensor : sensors) {
            listSensor.on();
        }
    }

    @Override
    public void off() {
        for (Sensor listSensor : sensors) {
            listSensor.off();
        }
    }

    @Override
    public boolean isOn() {
        for (Sensor listSensors : sensors) {
            if (listSensors.isOn()) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int measure() {
        if (!isOn() || sensors.isEmpty()){
            throw new IllegalStateException();
        }
        int suma=0;
        for (Sensor listSensors : sensors) {
            suma += listSensors.measure();
        }
        int media =suma/sensors.size();
        readings.add(media);
        return media;
    }

    public void addSensor(Sensor additional) {
        sensors.add(additional);
    }

    public List<Integer> readings() {
        return this.readings;
    }
}
