
import java.util.ArrayList;
import java.util.Scanner;

public class BirdDB {

    private ArrayList<Bird> birds;
   
    public BirdDB() {
        this.birds = new ArrayList<Bird>();
    }

    // Añade un pajaro a la ArrayList de pajaros
    public void addBird(String nameBird, String nameBirdLatin) {
        Bird birdTemp = new Bird(nameBird, nameBirdLatin);
        birds.add(birdTemp);
    }

    // Si el nombre de la lista de pajaros coincide con el del parametro
    // llama al metodo addObservation que incrementa en uno
    // el numero de veces observado
    public void addObservationBird(String nameBird) {
        for (Bird list : birds) {
            if (list.getNameBird().equalsIgnoreCase(nameBird)) {
                list.addObservation();
                return;
            }
        }
        System.out.println("The bird is not!");
    }

    // Metodo usado por si el pajaro observado no esta en la lista
    // en ese gaso preguntara su nombre en latin y lo añadira a la lista
    public void isBird(String nameBird,Scanner reader) {
        for (Bird list : birds) {
            if (list.getNameBird().equalsIgnoreCase(nameBird)) {
                return;
            }
        }
        System.out.println("The bird is not!");
        System.out.println("will be added to the database");
        String nameBirdLatin = Menu.ask("Name Bird Latin: ", reader);
        addBird(nameBird, nameBirdLatin);

    }

    // Listado de pajaros con nombre igual al dado por parametro
    public void printBird(String nameBird) {
        if (birds.isEmpty()){
            System.out.println("Database is empty");
        }
        for (Bird list : birds) {
            if (list.getNameBird().equalsIgnoreCase(nameBird)) {
                System.out.println(list);
                return;
            }
        }
        System.out.println("Bird database: ");
        System.out.println("Is not a bird!");
    }

    // Printado completo la ArrayList de pajaros
    public void printListBirds() {
        for (Bird list : birds) {
            System.out.println(list);
        }
    }

    public ArrayList<Bird> getBirds() {
        return birds;
    }
}
