
import java.util.ArrayList;


public class PersonDB  {

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
    public void printPersons() {
        for (Person listPerson : person) {
            System.out.println(listPerson);
        }
    }

    // Busqueda y printado por nombre de pajaro
    public void printQueryBird(String nameBird) {
        int i = 0;
        System.out.println("Senn by:");
        for (Person listPerson : person) {
            if (listPerson.getNameBird().equalsIgnoreCase(nameBird)) {
                System.out.println(listPerson.getNamePerson());
                i = 1;
            }
        }
        if (i == 0) {
            System.out.println("None have been seen");
        }
    }

    // Busqueda y printado por nombre de ornitologo
    public void printQueryOrnithologist(String namePerson) {
        int i = 0;
        System.out.println("Ornithologist:");
        for (Person listPerson : person) {
            if (listPerson.getNamePerson().equalsIgnoreCase(namePerson)) {
                System.out.println(listPerson.getNamePerson()
                        + " has seen a " + listPerson.getNameBird());
                i = 1;
            }
        }
        if (i == 0) {
            System.out.println("Name not registered");
        }
    }
}
