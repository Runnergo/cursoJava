
public class Bird {

    private String nameBird;
    private String nameBirdLatin;
    private int observations;

    public Bird(String nameBird, String nameBirdLatin) {
        this.nameBird = Character.toUpperCase(nameBird.charAt(0)) + nameBird.substring(1, nameBird.length());
        this.nameBirdLatin = Character.toUpperCase(nameBirdLatin.charAt(0)) + nameBirdLatin.substring(1, nameBirdLatin.length());
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
        String time="";
        if (observations>1 ){
            time=" times";
        }else{
            time=" time";
        }
        return "The bird called " + nameBird + " (" + nameBirdLatin + ") has been observed " + observations + time;
    }
}
