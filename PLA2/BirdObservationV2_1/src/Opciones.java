
import javax.swing.JOptionPane;

public class Opciones {

    public Opciones() {
    }

    public void seleccion() {
        BirdDB birdDb = new BirdDB();
        PersonDB personDB = new PersonDB();
        int option = 0;
        while (true) {

            option = Integer.parseInt(JOptionPane.showInputDialog(null, Menu.menu()));

            switch (option) {

                case 1:
                    // ADD BIRD
                    String nameBird = JOptionPane.showInputDialog(null, "Name Bird").trim();
                    if (birdDb.isBird(nameBird) == true) {
                        JOptionPane.showMessageDialog(null, Menu.noRegistred());
                        break;
                    }
                    String nameBirdLatin = JOptionPane.showInputDialog(null, "Name Bird Latin").trim();
                    birdDb.addBird(nameBird, nameBirdLatin);
                    break;
                case 2:
                    // BIRD LIST
                    JOptionPane.showMessageDialog(null, birdDb.printListBirds());
                    break;
                case 3:
                    // ADD OBSERVATION
                    String namePerson = JOptionPane.showInputDialog(null, "Name Ornithologist: ").trim();
                    String nameBirdSeen = JOptionPane.showInputDialog(null, "Name Bird: ").trim();
                    if (birdDb.isBird(nameBirdSeen) == false) {
                        String nameBirdLati = JOptionPane.showInputDialog(null, Menu.isBird());
                        birdDb.addBird(nameBirdSeen, nameBirdLati);
                    }
                    personDB.addPerson(namePerson, nameBirdSeen);
                    birdDb.addObservationBird(nameBirdSeen);
                    break;
                case 4:
                    // ORNITHOLOGIST LIST
                    JOptionPane.showMessageDialog(null, personDB.printPersons());
                    //Menu.ok();
                    break;
                case 5:
                    // QUERY BY BIRD
                    String askNameBird = JOptionPane.showInputDialog(null, "Search bird: ").trim();
                    if (birdDb.printBird(askNameBird).equals("There are no registered\n")) {
                        JOptionPane.showMessageDialog(null, birdDb.printBird(askNameBird));
                        break;
                    } else {
                        JOptionPane.showMessageDialog(null, birdDb.printBird(askNameBird)
                                + personDB.printQueryBird(askNameBird));
                    }
                    break;
                case 6:
                    // QUERY BY ORNITHOLOGIST
                    String askName = JOptionPane.showInputDialog(null, "Search Ornithologist: ").trim();
                    JOptionPane.showMessageDialog(null, personDB.printQueryOrnithologist(askName));
                    break;
                case 7:
                    // EXIT
                    JOptionPane.showMessageDialog(null, Menu.exit());
                    System.exit(0);
                default:
                    JOptionPane.showMessageDialog(null, Menu.error());
            }
        }
    }
}
