/* 
* Mejora de ejercicio 'Tienda online'
* MOOC Helsinki 2ºParte week8_12.OnlineShop. 
*
* Clase CestaCompra: HashMap con objeto de la
* Clase Compra( stock y precio) y atributo para 
* tener el total de articulos en la cesta
*
* @author: Juan Jose Gonzalez Pozo
* @version: V2.0 - 23/08/2019 
 */

import java.util.HashMap;
import java.util.Map;

public class CestaCompra {

    // HashMap de la cesta de la compra.
    private Map<String, Compra> cesta;
    private int stockCesta;

    public CestaCompra() {
        this.cesta = new HashMap<String, Compra>();
        this.stockCesta = 0;
    }

    // Añade elementos al HashMap e incrementa el Stock
    public void addCesta(String product, double precio) {

        if (this.cesta.containsKey(product)) {
            cesta.get(product).incrementaStockCesta();
        } else {
            cesta.put(product, new Compra(product, 1, precio));
        }
        incrementarStockCesta();
    }

    // Devuelve el total de elemntos en la cesta
    public int getStockTotalCesta() {
        return this.stockCesta;
    }

    public int incrementarStockCesta() {
        return stockCesta++;
    }

    public int decrementarStockCesta() {
        return stockCesta--;
    }

    public void resetStockCesta() {
        this.stockCesta = 0;
        cesta.clear();
    }

    // Suma el precio total de la cesta y retorna su valor. 
    public double precio() {
        double precioTotal = 0;
        for (Compra lista : cesta.values()) {
            precioTotal += lista.precioSumaProducto();

        }
        return precioTotal;
    }

    // Printa la cantidad y nombre de productos de la cesta
    public int print() {
        Menu.printAllProductos();
        int i = 0;
        for (Compra lista : cesta.values()) {
            Menu.printChar(lista.producto(), 19, " ", false, ">");
            Menu.printChar("| " + lista.getStock(), 10, " ", false, ">");
            Menu.printChar("| " + lista.precioSumaProducto() + " €", 0, "", true, ">");
            //System.out.println(lista);
            i++;
        }
        return i;
    }

    // Llama al metodo para hacer la salida del material del Almacen
    // este metodo solo seleccionado desde el menu de compra
    // una vez que queramos finalizarla. Por lo que los articulos
    // de la cesta no seran descontados, hasta que se aplique.
    public void pagar(Almacen almacen) {
        Menu.titulo("Ticket de Compra");
        for (String producto : cesta.keySet()) {
            almacen.salidaAlmacen(producto, cesta.get(producto).getStock());
        }
    }

    // Si el Stock del producto que esta en la cesta,
    // es mayor que el que esta en el Almacen o no esta
    // ese producto en el Almacen, decrementa el articulo de la cesta
    // y devuelve true.
    public boolean sotckCestaMayorAlmacen(Almacen almacen, String producto) {

        if ((cesta.get(producto).getStock() > almacen.stock(producto)) || almacen.stock(producto) == 0) {
            cesta.get(producto).decrementaStockCesta();
            decrementarStockCesta();
            return true;
        }
        return false;
    }
}
