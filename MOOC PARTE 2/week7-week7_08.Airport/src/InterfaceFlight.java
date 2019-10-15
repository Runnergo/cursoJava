
import java.util.Scanner;

public class InterfaceFlight {

    private Scanner reader;
    private Airport airport;

    public InterfaceFlight(Scanner reader, Airport airport) {
        this.reader = reader;
        this.airport = airport;
    }

    // Devuelve String entrada usuario. 
    public String ask() {
        return reader.nextLine().trim();
    }

    // devuelve int entrada usuario.
    public int askInt() {
        return Integer.parseInt(reader.nextLine());
    }

    // Printa titulo panel aeropuerto.
    public void titleAirportPanel() {
        System.out.println("Airport panel");
        System.out.println("--------------------");
        System.out.println("");
    }

    // Printa menu panel aeropuerto.
    public void printAirportPanel() {
        System.out.println("Choose operation:");
        System.out.println("[1] Add airplane");
        System.out.println("[2] Add flight");
        System.out.println("[x] Exit");
        System.out.print("> ");
    }

    // Condiciones panel de aeropuerto.
    public void airportPanel() {
        titleAirportPanel();

        while (true) {

            printAirportPanel();
            String ask = ask();

            if (ask.equalsIgnoreCase("1")) {
                System.out.print("Give plane ID: ");
                String planeID = ask();
                System.out.print("Give plane capacity: ");
                int capacity = askInt();
                this.airport.addAirplane(planeID, capacity);

            } else if (ask.equals("2")) {
                System.out.print("Give plane ID: ");
                String planeID = ask();
                System.out.print("Give departure airport code: ");
                String departure = ask();
                System.out.print("Give destination airport code: ");
                String arrival = ask();
                this.airport.addFlightPlan(planeID, departure, arrival);

            } else if (ask.equalsIgnoreCase("x")) {
                flightService();
                break;
            } else {
                System.out.println("Unvalid entry!");
            }
        }
    }

    // Printa titulo menu Servicios de vuelo.
    public void titleFlightService() {
        System.out.println("\nFlight service");
        System.out.println("------------");
        System.out.println("");
    }

    // Printa menu servicios de vuelo
    public void printFlightService() {
        System.out.println("Choose operation:");
        System.out.println("[1] Print planes");
        System.out.println("[2] Print flights");
        System.out.println("[3] Print plane info");
        System.out.println("[x] Quit");
        System.out.print("> ");
    }

    // Condiciones servicios de vuelo
    public void flightService() {
        titleFlightService();

        while (true) {
            printFlightService();
            String ask = ask();

            if (ask.equals("1")) {
                airport.printAirPlanes();
            } else if (ask.equals("2")) {
                airport.printFlightPlan();
            } else if (ask.equals("3")) {
                System.out.print("Give plane ID: ");
                String planeID = ask();
                airport.printFlightInfo(planeID);
            } else if (ask.equalsIgnoreCase("x")) {
                break;
            } else {
                System.out.println("Unvalid entry!");
            }
        }
    }
}
