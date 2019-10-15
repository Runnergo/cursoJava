
public class Purchase {

    // Atributos de nombre de producto, numero de ellos y
    // precio unitario.
    private String product;
    private int amount;
    private int unitPrice;

    public Purchase(String product, int amount, int unitPrice) {
        this.product = product;
        this.amount = amount;
        this.unitPrice = unitPrice;
    }

    // Devuelve el precio de un producto por su cantidad.
    public int price() {
        return amount * unitPrice;
    }

    // Incrementa la cantidad en uno.
    public void increaseAmount() {
        this.amount++;
    }

    // Sobrescribe toString, con la cadena de nombre de producto
    // y numero de ellos. 
    @Override
    public String toString() {
        return this.product + ": " + this.amount;
    }
}
