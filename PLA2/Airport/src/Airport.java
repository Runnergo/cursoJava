
import java.util.ArrayList;
import java.util.HashMap;

public class Airport {

    private ArrayList<Airplane> airplane;
    private HashMap<Airplane, FlightPlan> flightTracking;

    public Airport() {
        this.airplane = new ArrayList<Airplane>();
        this.flightTracking = new HashMap<Airplane, FlightPlan>();
    }

    // Crea un objeto con nombre y peso del avion, para añadirlo
    // a la Array de aviones
    public void addAirplane(String codeAirplane, int weightPlane) {
        Airplane plane = new Airplane(codeAirplane, weightPlane);
        airplane.add(plane);
    }

    // Printa el listado de aviones de la Array
    public void printAirPlanes() {
        for (Airplane lista : airplane) {
            System.out.println(lista);
        }
    }

    // Añade un plan de vuelo, Hashmap con objeto avion
    // y objeto con codigo aeropuertos  
    public void addFlightPlan(String planeID, String departure, String arrival) {
        for (Airplane lista : airplane) {
            if (lista.getcodeAirplane().equalsIgnoreCase(planeID)) {

                Airplane plane = new Airplane(lista.getcodeAirplane(), lista.getweightPlane());
                FlightPlan flight = new FlightPlan(departure, arrival);

                this.flightTracking.put(plane, flight);
                break;
            }
        }
    }

    // Printa listado de plan de vuelos del aeropuerto
    public void printFlightPlan() {
        for (Airplane lista : flightTracking.keySet()) {
            System.out.println(lista + " " + flightTracking.get(lista));
        }
    }

    // Printa el plande vuelo de un avion
    public void printFlightInfo(String flightInfo) {
        for (Airplane lista : airplane) {
            if (lista.getcodeAirplane().equalsIgnoreCase(flightInfo)) {
                System.out.println(lista);
            }
        }
    }
}
