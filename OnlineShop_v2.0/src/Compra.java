/* 
* Mejora de ejercicio 'Tienda online'
* MOOC Helsinki 2ºParte week8_12.OnlineShop. 
*
* Clase Compra: atributos y metodos que se usaran en HashMap de 
* la clase CestaCompra.        
*
* @author: Juan Jose Gonzalez Pozo
* @version: V2.0 - 23/08/2019 
*/
public class Compra {

    // Atributos de nombre de producto, numero de ellos y
    // precio unitario.
    private String producto;
    private int stockProducto;
    private double precioUnidad;

    public Compra(String producto, int cantidadProducto, double precioUnidad) {
        this.producto = producto;
        this.stockProducto = cantidadProducto;
        this.precioUnidad = precioUnidad;
    }

    public String producto() {
        return this.producto;
    }

    public int getStock() {
        return this.stockProducto;
    }

    public double precioSumaProducto() {
        return stockProducto * precioUnidad;
    }

    public void incrementaStockCesta() {
        this.stockProducto++;
    }

    public void decrementaStockCesta() {
        this.stockProducto--;
    }
}
