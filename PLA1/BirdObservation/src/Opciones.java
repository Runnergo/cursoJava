
import java.util.Scanner;

public class Opciones {

    Scanner reader;

    public Opciones() {
        reader = new Scanner(System.in);
    }

    public void seleccion() {
        BirdDB birdDb = new BirdDB();
        PersonDB personDB = new PersonDB();

        while (true) {
            Menu.menu();

            int ask = Integer.parseInt(Menu.ask("Elige oipcion:", reader));
            switch (ask) {

                case 1:
                    // ADD BIRD
                    System.out.println("----------------");
                    String nameBird = Menu.ask("Name Bird: ", reader);
                    String nameBirdLatin = Menu.ask("Name Bird Latin: ", reader);
                    birdDb.addBird(nameBird, nameBirdLatin);
                    Menu.ok();
                    break;
                case 2:
                    // BIRD LIST
                    System.out.println("----------------");
                    birdDb.printListBirds();
                    Menu.ok();
                    break;

                case 3:
                    // ADD OBSERVATION
                    System.out.println("----------------");
                    String namePerson = Menu.ask("Name Ornithologist: ", reader);
                    String nameBirdSeen = Menu.ask("Name Bird: ", reader);
                    personDB.addPerson(namePerson, nameBirdSeen);
                    birdDb.isBird(nameBirdSeen, reader);
                    birdDb.addObservationBird(nameBirdSeen);
                    Menu.ok();
                    break;
                case 4:
                    // ORNITHOLOGIST LIST
                    System.out.println("----------------");
                    personDB.printPersons();
                    Menu.ok();
                    break;
                case 5:
                    // QUERY BY BIRD
                    System.out.println("----------------");
                    String askNameBird = Menu.ask("Search bird: ", reader);
                    birdDb.printBird(askNameBird);
                    personDB.printQueryBird(askNameBird);
                    Menu.ok();
                    break;
                case 6:
                    // QUERY BY ORNITHOLOGIST
                    System.out.println("----------------");
                    String askName = Menu.ask("Search Ornithologist: ", reader);
                    personDB.printQueryOrnithologist(askName);
                    Menu.ok();
                    break;
                case 7:
                    // EXIT
                    Menu.exit();
                    System.exit(0);
                default:
                    Menu.error();
            }
        }
    }
}
