/* 
* Mejora de ejercicio 'Tienda online'
* MOOC Helsinki 2ºParte week8_12.OnlineShop. 
*
* Clase Scan: Contine los Scaners usados en el resto de clases
*  del proyecto. Elimina espacios en blanco delante y detras del texto
*  y pasa los String al Mayusculas, para evitar errores de busqueda.         
*
* @author: Juan Jose Gonzalez Pozo
* @version: V2.0 - 23/08/2019 
*/
import java.util.Scanner;

public class Scan {

    public static int askInt(Scanner reader) {
        int entrada = Integer.parseInt(reader.nextLine());
        return entrada;
    }

    public static String askString(Scanner reader) {
        String entrada = reader.nextLine();
        return entrada.toUpperCase().trim();
    }

    public static double askDouble(Scanner reader) {
        double entrada = Double.parseDouble(reader.nextLine());
        return entrada;
    }

    public static String askProducto(Scanner reader) {
        System.out.print("Nombre Producto: ");
        return askString(reader).toUpperCase().trim();
    }

    public static int askStock(Scanner reader) {
        System.out.print("Numero de unidades: ");
        return askInt(reader);
    }

    public static double askPrecio(Scanner reader) {
        System.out.print("Precio unidad: ");
        return askDouble(reader);
    }
}
