
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // implement your program here
        // do not put all to one method/class but rather design a proper structure to your program

        // Your program should use only one Scanner object, i.e., it is allowed to call 
        // new Scanner only once. If you need scanner in multiple places, you can pass it as parameter
        Scanner reader = new Scanner(System.in);
        BirdDb birdDb = new BirdDb();

        while (true) {
            String ask = reader.nextLine();
            if (ask.equalsIgnoreCase("Add")) {
                System.out.print("Name: ");
                String nameBird = reader.nextLine();
                System.out.print("Latin name: ");
                String nameBirdLatin = reader.nextLine();
                birdDb.addBird(nameBird, nameBirdLatin);
            } else if (ask.equalsIgnoreCase("Observation")) {
                String nameBirdObsevation = reader.nextLine();
                birdDb.addObservationBird(nameBirdObsevation);
            } else if (ask.equalsIgnoreCase("Statistics")) {
                birdDb.printListBirds();
            } else if (ask.equalsIgnoreCase("Show")) {
                String nameBirdToSearch = reader.nextLine();
                birdDb.printBird(nameBirdToSearch);
            } else if (ask.equalsIgnoreCase("Quit")) {
                break;
            }

        }

    }

}
