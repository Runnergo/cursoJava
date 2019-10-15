
public class Airplane {

    private String codeAirplane;
    private int weightPlane;

    // Constructor con nombre avion y numero pasajeros
    public Airplane(String codeAirplane, int weightPlane) {
        this.codeAirplane = codeAirplane;
        this.weightPlane = weightPlane;
    }

    // Devuelve el nombre del avion
    public String getcodeAirplane() {
        return this.codeAirplane;
    }

    // Devuelve el peso del avion
    public int getweightPlane() {
        return this.weightPlane;
    }

    // Retorna una cadena de texto con nombre y peso del avion
    @Override
    public String toString() {
        return this.codeAirplane + " (" + this.weightPlane + " ppl)";
    }
}
