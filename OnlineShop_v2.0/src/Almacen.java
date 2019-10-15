/* 
* Mejora de ejercicio 'Tienda online'
* MOOC Helsinki 2ºParte week8_12.OnlineShop. 
*
* Clase Almacen: HashMap de los atributos del Almacen y sus metodos     
*
* @author: Juan Jose Gonzalez Pozo
* @version: V2.0 - 23/08/2019 
*/

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

// Almacen.
public class Almacen {

    // Atributos de precio y stock del producto.
    private Map<String, Double> precioProducto;
    private Map<String, Integer> stockProducto;
    private String producto;

    // Constructor de dos HashMap.
    public Almacen() {
        this.precioProducto = new HashMap<String, Double>();
        this.stockProducto = new HashMap<String, Integer>();
    }

    // Añade nombre de producto y precio a un HasMap y
    // nombre de producto y stock al otro.
    public void addProducto(String producto, double precio, int stock) {
        this.precioProducto.put(producto, precio);
        this.stockProducto.put(producto, stock);
        this.producto = producto;
    }

    // Alta de producto 
    public void altaProducto(Scanner reader, Almacen almacen) {
        Menu.titulo("Alta Producto");
        String producto = Scan.askProducto(reader);
        
        if (producto.isEmpty()) {         // Si la entrada no esta vacia
            Menu.titulo("Nombre Producto no valido", "-", "", false);
            
          // Si el producto no esta llama al metodo addProducto para
          // añadirlo al HashMap.
        } else if (!precioProducto.containsKey(producto)) { 
            double precio = Scan.askPrecio(reader);
            int cantidad = Scan.askStock(reader);
            almacen.addProducto(producto, precio, cantidad);
            Menu.titulo("Alta Realizada", "-", "", false);
        } else {
            Menu.titulo("Este producto ya existe", "-", "", false);
        }
    }

    // Elimina el producto siempre que este en almacen
    public void bajaProducto(Scanner reader) {
        Menu.titulo("Baja Producto");
        String producto = Scan.askProducto(reader);
        if (precioProducto.containsKey(producto)) {
            this.precioProducto.remove(producto);
            Menu.titulo("Baja Realizada", "-", "", false);
        } else {
            Menu.titulo("No hay alta de este Producto", "-", "", false);
        }
    }

    // Edita el precio de un producto, siempre que este en el almacen 
    public void editarPrecio(Scanner reader) {
        Menu.titulo("Editar Precio");
        String producto = Scan.askProducto(reader);
        if (precioProducto.containsKey(producto)) {
            double precio = Scan.askPrecio(reader);
            this.precioProducto.replace(producto, precio);
            Menu.titulo("Precio Editado", "-", "", false);
        } else {
            Menu.titulo("No hay alta de este Producto", "-", "", false);
        }
    }

    // edita el Stock de un producto siempre que este en el almacen
    public int addStock(Scanner reader) {
        Menu.titulo("Añadir Stock");
        String producto = Scan.askProducto(reader);
        int stock = Scan.askStock(reader);

        if (stockProducto.containsKey(producto)) {
            int valor = this.stockProducto.get(producto);
            Menu.titulo("Ampliado Stock", "-", "", false);
            return this.stockProducto.put(producto, valor + stock);
        } else {
            Menu.titulo("No hay alta de este Producto", "-", "", false);
        }
        return 0;
    }

    // Devuelve el stock y precio de un producto
    // si este se encuentra en el,si no retorna 0.
    public void consultaProducto(Scanner reader) {
        Menu.titulo("Consulta Producto");
        String producto = Scan.askProducto(reader);
        if (stockProducto.containsKey(producto)) {

            System.out.println("Stock: " + this.stockProducto.get(producto)
                    + " Precio: " + this.precioProducto.get(producto));
        } else {
            Menu.titulo("No hay alta de este Producto", "-", "", false);
        }
    }
    
    // Printa todos los productos del almacen con su stock y precio
    public void printAllProductos(Almacen almacen) {
        Menu.titulo("Productos Almacen");
        Menu.printAllProductos();
        for (String producto : almacen.productos()) {
            Menu.printChar(producto, 19, " ", false, ">");
            Menu.printChar("| " + almacen.stockProducto.get(producto).toString(), 11, " ", false, ">");
            Menu.printChar("| " + almacen.precioProducto.get(producto) + " €", 0, "", true, ">");
        }
        Menu.printChar("", 40, "-", true, ">");
    }

    // Devuelve el precio del producto si esta en el almacen
    // si no retorna -99.
    public void precio(Scanner reader) {
        String producto = Scan.askProducto(reader);
        if (precioProducto.containsKey(producto)) {
            System.out.println(this.precioProducto.get(producto));
        } else {
            Menu.titulo("No hay alta de este Producto", "-", "", false);
        }
    }

    // Devuelve el precio de un producto
    public double precio(String producto) {
        if (precioProducto.containsKey(producto)) {
            return this.precioProducto.get(producto);
        }
        return -99;
    }

    // Devuelve el Stock de un producto
    public int stock(String producto) {
        if (stockProducto.containsKey(producto) && stockProducto.get(producto) > 0) {
            return this.stockProducto.get(producto);
        }
        return 0;
    }

    // Si el producto esta en el almacen y es mayor de 0, restara uno
    // y retornara true, de lo contrario retorna false.
    public boolean salidaAlmacen(String producto, int cesta) {
        if (stockProducto.containsKey(producto) && stockProducto.get(producto) > 0) {
            stockProducto.put(producto, stockProducto.get(producto) - cesta);
            return true;
        }
        return false;
    }

    // Imprime el nombres del producto
    public Set<String> productos() {
        return precioProducto.keySet();
    }
}
