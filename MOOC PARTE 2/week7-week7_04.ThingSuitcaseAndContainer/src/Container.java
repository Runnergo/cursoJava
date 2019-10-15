
import java.util.ArrayList;

public class Container {

    // Atributos de peso maximo de contenedor de maletas y Array de maletas
    private ArrayList<Suitcase> suitcaseArray;
    private int weightMaxContainer;

    /* Constructor con parametro maximo peso contenedor
    *  y crea objeto tipo array de maletas
    */
    public Container(int weightMaxContainer) {
        this.weightMaxContainer = weightMaxContainer;
        this.suitcaseArray = new ArrayList<Suitcase>();
    }

    // Suma el peso de las maletas que estan dentro del contenedor 
    public int totalWeightContainer() {
        int totalWeightContainer = 0;
        for (Suitcase list : suitcaseArray) {
            totalWeightContainer += list.totalWeight();
        }
        return totalWeightContainer;
    }

     // Añade maletas al contenedor si no excede del peso maximo
    public void addSuitcase(Suitcase suitcase) {
        if (totalWeightContainer() + suitcase.totalWeight() <= weightMaxContainer) {
            suitcaseArray.add(suitcase);
        }
    }

    // Printa cadena de de texto de cuantas maletas hay y su peso total 
    public String toString() {
        return suitcaseArray.size() + " suitcases (" + totalWeightContainer() + " kg)";
    }

    // Printa las maletas que estan dentro del contenedor
    public void printThings() {
        for (Suitcase list : suitcaseArray) {
            list.printThings();
        }
    }
}
