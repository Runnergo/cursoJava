
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        
    // Añade productos al almacen (nombre producto, precio unidad, stock del producto)
    Storehouse store = new Storehouse();
    store.addProduct("coffee", 5, 10);
    store.addProduct("milk", 3, 20);
    store.addProduct("milkbutter", 2, 55);
    store.addProduct("bread", 7, 8);
    
    // Crea objeto con almcen y scanner como parametros 
    Shop shop = new Shop(store, new Scanner(System.in));
    
    // Asina con el metodo manage el nombre del cliente
    shop.manage("Pekka");

    }
}
