
import java.util.HashMap;
import java.util.Map;

public class ShoppingBasket {

    // HashMap de la cesta de la compra.
    private Map<String, Purchase> basket;

    public ShoppingBasket() {
        this.basket = new HashMap<String, Purchase>();
    }

    // Añade a la cesta un producto con su precio, 
    // si no se encuentra ya en ella,
    // o de lo contrario aumenta en uno si ya hay uno en ella. 
    public void add(String product, int price) {
        if (this.basket.containsKey(product)) {
            basket.get(product).increaseAmount();
        } else {
            basket.put(product, new Purchase(product, 1, price));
        }
    }

    // Suma el precio total de la cesta y retorna su valor. 
    public int price() {
        int priceTotal = 0;
        for (Purchase lista : basket.values()) {
            priceTotal += lista.price();

        }
        return priceTotal;
    }

    // Printa la cantidad y nombre de productos de la cesta
    public void print() {
        for (Purchase lista : basket.values()) {
            System.out.println(lista);
        }
    }
}
