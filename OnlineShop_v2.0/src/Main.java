/* 
* Mejora de ejercicio 'Tienda online'
* MOOC Helsinki 2ºParte week8_12.OnlineShop. 
*
* Clase Main: Inicia aplicacion y controla sus posibles excepciones 
*
* @author: Juan Jose Gonzalez Pozo
* @version: V2.0 - 23/08/2019 
*/
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Almacen almacen = new Almacen();

        // Mensaje de bienvenida e inicio de programa 
        // controlando las excepciones por entradas no deseadas
        Menu.titulo("Bienvenido a CIFO-Store", "*", "*", true);
        while (true) {
            try {
                Tienda tienda = new Tienda(almacen, new Scanner(System.in));
                tienda.seleccionOpciones();
            } catch (Exception e) {
                Menu.titulo("¡Error de Entrada! Reinicio Menu", "-", "-", true);
            }
        }
    }
}
