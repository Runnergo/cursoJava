
public class Reformatory {

    private int counterWeight;

    public int weight(Person person) {
        // return the weight of the person
        this.counterWeight++;
        return person.getWeight();
    }

    public void feed(Person person) {
        int valor = person.getWeight();
        valor++;
        person.setWeight(valor);
        ;
    }

    public int totalWeightsMeasured() {
        return this.counterWeight;
    }
}
