
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

// Almacen.
public class Storehouse {

    // Atributos de precio y stock del producto.
    private Map<String, Integer> pricesProduct;
    private Map<String, Integer> stockProduct;

    // Constructor de dos HashMap.
    public Storehouse() {
        this.pricesProduct = new HashMap<String, Integer>();
        this.stockProduct = new HashMap<String, Integer>();
    }

    // Añade nombre de producto y precio a un HasMap y
    // nombre de producto y stock al otro.
    public void addProduct(String product, int price, int stock) {
        this.pricesProduct.put(product, price);
        this.stockProduct.put(product, stock);
    }

    // Devuelve el precio del producto si esta en el almacen
    // si no retorna -99.
    public int price(String product) {
        if (pricesProduct.containsKey(product)) {
            return this.pricesProduct.get(product);
        }
        return -99;
    }

    // Devuelve el stock que hay en el almacen
    // de un producto si este se encuentra en el,
    // si no retorna 0.
    public int stock(String product) {
        if (stockProduct.containsKey(product)) {
            return this.stockProduct.get(product);
        }
        return 0;
    }

    // Si el producto esta en el almacen y es mayor de 0, restara uno
    // y retornara true, de lo contrario retorna false.
    public boolean take(String product) {
        if (stockProduct.containsKey(product) && stockProduct.get(product) > 0) {
            stockProduct.put(product, stockProduct.get(product)-1);
            return true;
        }
        return false;
    }
    
    // Imprime la lista de productos del almacen
    public Set<String> products(){
       return pricesProduct.keySet();
    }
}

