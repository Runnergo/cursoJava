
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class PersonDB {

    private ArrayList<Person> person;

    public PersonDB() {
        this.person = new ArrayList<Person>();
    }

    // Añade a la Array de person un nuevo objeto con el
    // nombre del ojeador y el pajaro visto
    public void addPerson(String namePerson, String nameBird) {
        person.add(new Person(namePerson, nameBird));
    }

    // listado completo de ojeadores
    public String printPersons() {
        
        if (person.isEmpty()) {
            return Menu.noRegistred();
        }
        String cadena = "";
        for (Person listPerson : person) {
            cadena += listPerson + "\n";
        }
        return cadena;
    }

    // Busqueda y printado por nombre de pajaro
    public String printQueryBird(String nameBird) {
        int i = 0;
        String cadena = "";
        if (person.isEmpty()) {
            return Menu.noRegistred();
        }
        for (Person listPerson : person) {
            if (listPerson.getNameBird().equalsIgnoreCase(nameBird)) {
                cadena += listPerson.getNamePerson() + "\n";
                i = 1;
            }
        }
        if (i == 0) {
            cadena = "None have been seen\n";
        }
        return "Senn by:\n" + cadena;
    }

    // Busqueda y printado por nombre de ornitologo
    public String printQueryOrnithologist(String namePerson) {
        int i = 0;
        String cadena = "";
        if (person.isEmpty()) {
            return Menu.noRegistred();
        }
        for (Person listPerson : person) {
            if (listPerson.getNamePerson().equalsIgnoreCase(namePerson)) {
                cadena += listPerson.getNameBird() + "\n";
                i = 1;
            }
        }
        if (i == 0) {
            cadena = Menu.noRegistred();
            return cadena;
        }
        String name = Character.toUpperCase(namePerson.charAt(0)) + namePerson.substring(1, namePerson.length());
        return "The Ornithologist " + name + " has seen a:\n" + cadena;
    }
}
