
public class Thing {

    // Atributo de nombre y peso de objetos que se pueden añadir a la maleta
    private String name;
    private int weight;

    public Thing(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    // LLama al nombre del objeto
    public String getName() {
        return name;
    }

    // LLama  al peso del objeto
    public int getWeight() {
        return weight;
    }

    // Cadena de texto con nombre y peso
    @Override
    public String toString() {
        return name + " (" + weight + " kg)";
    }
}
