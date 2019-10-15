
import java.util.ArrayList;

public class Suitcase {

    private ArrayList<Thing> things;
    private int weightMax;

    // constructor con parametro de capacidad maxima de maleta
    // y una Array de cosas que meter en ella
    public Suitcase(int weightMax) {
        this.things = new ArrayList<Thing>();
        this.weightMax = weightMax;
    }

    // Añade cosas a la maleta si no excede del peso maximo
    public void addThing(Thing thing) {

        if (totalWeight() + thing.getWeight() <= this.weightMax) {
            things.add(thing);
        }
    }

    // Suma el peso de los objetos que estan dentro de la maleta 
    public int totalWeight() {
        int totalWeight = 0;
        for (Thing list : things) {
            totalWeight += list.getWeight();
        }
        return totalWeight;
    }

    /* Sobreescribe el toString y devuelve una cadena de texto
    *  Si esta la maleta vacia dira que esta empty
    *  Si solo tiene un objetos, hablara en singular
    *  y si no en plural
     */
    @Override
    public String toString() {
        String size = "";
        if (things.size() < 1) {
            size = "empty (";
        }
        if (things.size() == 1) {
            size = things.size() + " thing (";
        }
        if (things.size() > 1) {
            size = things.size() + " things (";
        }
        return size + totalWeight() + " kg)";
    }

    // Printa el listado de la array, es decir los objetos dentro de la maleta
    public void printThings() {
        for (Thing list : things) {
            System.out.println(list);
        }
    }

    /* Devuelve el objeto mas pesado de la maleta 
     * (si hay dos con el mismo peso, devuelve uno de ello)
     * Si la maleta esta vacia devuelve nulo
    */
    public Thing heaviestThing() {
        if (things.isEmpty()) {
            return null;
        }
        Thing heaviesthing = things.get(0);
        for (Thing list : things) {
            if (list.getWeight() > heaviesthing.getWeight()) {
                heaviesthing = list;
            }
        }
        return heaviesthing;
    }
}
