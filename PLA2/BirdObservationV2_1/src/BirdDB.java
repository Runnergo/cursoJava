
import java.util.ArrayList;
import javax.swing.JOptionPane;

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
        JOptionPane.showMessageDialog(null, "Is not a bird!");
    }

    // Metodo usado por si el pajaro observado no esta en la lista
    // en ese gaso preguntara su nombre en latin y lo añadira a la lista
    public boolean isBird(String nameBird) {
        for (Bird list : birds) {
            if (list.getNameBird().equalsIgnoreCase(nameBird)) {            
                return true;
            }
        }
        return false;
     }

    // Listado de pajaros con nombre igual al dado por parametro
    public String printBird(String nameBird) {

        String cadena = "";
        int i = 0;
        if (birds.isEmpty()) {
            return Menu.noRegistred();
        }
        for (Bird list : birds) {
            if (list.getNameBird().equalsIgnoreCase(nameBird)) {
                cadena += list + "\n";
                i = 1;
                return cadena;
            }
        }
        if (i == 0) {
            cadena = Menu.noRegistred();
        }
        return cadena;
    }

    // Printado completo la ArrayList de pajaros
    public String printListBirds() {
        String cadena = "";
        if (birds.isEmpty()) {
            return Menu.noRegistred();
        }
        for (Bird list : birds) {
            cadena += list + "\n";
        }
        return cadena;
    }

    public ArrayList<Bird> getBirds() {
        return birds;
    }
}
