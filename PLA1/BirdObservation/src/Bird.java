
public class Bird {

    private String nameBird;
    private String nameBirdLatin;
    private int observations;

    public Bird(String nameBird, String nameBirdLatin) {
        this.nameBird = nameBird;
        this.nameBirdLatin = nameBirdLatin;
        this.observations = 0;

    }

    public String getNameBird() {
        return this.nameBird;
    }

    public String getNameBirdLatin() {
        return this.nameBirdLatin;
    }

    public void addObservation() {
        observations++;
    }

    @Override
    public String toString() {
        return "Name bird: " + nameBird + " (" + nameBirdLatin + "): " + observations + " observations ";
    }
}
