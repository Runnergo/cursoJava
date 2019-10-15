
public class CD implements ToBeStored {

    // Atributos de cantante, titulo, año de publicacion y peso del CD
    private String singer;
    private String titleCD;
    private int year;
    private double weightCD;

    public CD(String singer, String titleCD, int year) {
        this.singer = singer;
        this.titleCD = titleCD;
        this.year = year;
        this.weightCD = 0.1;
    }

    // Metodo implementado, peso CD
    @Override
    public double weight() {
        return this.weightCD;
    }

    // toString sobrescrito del CD
    @Override
    public String toString() {
        return this.singer + ": " + this.titleCD + " (" + this.year + ")";
    }
}
