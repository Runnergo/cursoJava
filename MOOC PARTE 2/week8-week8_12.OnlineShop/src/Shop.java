
import java.util.Scanner;

public class Shop {

    // Atributos objeto tipo almacen y scanner
    private Storehouse store;
    private Scanner reader;

    public Shop(Storehouse store, Scanner reader) {
        this.store = store;
        this.reader = reader;
    }

    // 
    public void manage(String customer) {
        ShoppingBasket basket = new ShoppingBasket();
        System.out.println("Welcome to our shop " + customer);
        System.out.println("below is our sale offer:");

        // Printa productos del almacen
        for (String product : store.products()) {
            System.out.println(product);
        }

        // Menu de opciones donde el cliente añade el nombre del 
        // producto que desea comprar, si no se inserta valor,
        // termina el proceso.
        while (true) {
            System.out.print("what do you want to buy (press enter to pay):");
            String product = reader.nextLine();
            if (product.isEmpty()) {
                break;
            }
            
            // Si hay Stock en el almacen restara uno y lo
            // añadira a la cesta con nombre de producto y precio unitario          
            if (store.stock(product) > 0) {
                store.take(product);
              basket.add(product, store.price(product));
            }
        }

        // Printa los productos de la cesta y su cantidad.
        System.out.println("your purchases are:");
        basket.print();
        
        // Printa el coste total de los productos de la cesta.
        System.out.println("basket price: " + basket.price());
    }
}
