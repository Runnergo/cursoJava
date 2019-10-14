
import java.util.ArrayList;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Runnergo
 */
public class BirdDb {

    private ArrayList<Bird> birds;

    public BirdDb() {
        this.birds = new ArrayList<Bird>();
    }

    public void addBird(String nameBird, String nameBirdLatin) {
        Bird birdTemp = new Bird(nameBird, nameBirdLatin);
        birds.add(birdTemp);
    }

    public void addObservationBird(String nameBird) {
        for (Bird list : birds) {
            if (list.getNameBird().equalsIgnoreCase(nameBird)) {
                list.addObservation();
                return;
            }
        }
        System.out.println("Is not a bird!");
    }

    public void printBird(String nameBird) {
        for (Bird list : birds) {
            if (list.getNameBird().equalsIgnoreCase(nameBird)) {
                System.out.println(list);
                return;
            }
        }
        System.out.println("Is not a bird!");
    }

    public void printListBirds() {
        for (Bird list : birds) {
            System.out.println(list);
        }
    }
}
