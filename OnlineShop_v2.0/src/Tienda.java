/* 
* Mejora de ejercicio 'Tienda online'
* MOOC Helsinki 2ºParte week8_12.OnlineShop. 
*
* Clase Tienda: Contiene la inicializacion de los Metodos de los
* diversos menus de seleccion
*
* @author: Juan Jose Gonzalez Pozo
* @version: V2.0 - 23/08/2019 
*/
import java.util.Scanner;

public class Tienda {

    // Atributos objeto tipo almacen y scanner
    private Almacen almacen;
    private Scanner reader;

    public Tienda(Almacen store, Scanner reader) {
        this.almacen = store;
        this.reader = reader;
    }

    // Inicia los menus de seleccion
    public void inicio() {
        Menu.seleccionOpciones();
        seleccionOpciones();
    }

    // Menu para seleccionar Almacen ,Tienda o salir
    public void seleccionOpciones() {

        while (true) {
            Menu.titulo("Seleccion de Opciones");
            Menu.seleccionOpciones();

            int entrada = Scan.askInt(reader);
            switch (entrada) {
                case 1:
                    gestionAlmacen();
                    break;
                case 2:
                    gestionTienda();
                    break;
                case 3:
                    Menu.salida();
                default:
                    Menu.titulo("Entrada no valida", "-", "-", true);
            }
        }
    }

    // Menu gestion Almacen
    public void gestionAlmacen() {

        while (true) {
            Menu.opcionesAlmacen();

            int entrada = Scan.askInt(reader);
            switch (entrada) {
                case 1:
                    almacen.altaProducto(reader, almacen);
                    break;
                case 2:
                    almacen.bajaProducto(reader);
                    break;
                case 3:
                    almacen.editarPrecio(reader);
                    break;
                case 4:
                    almacen.addStock(reader);
                    break;
                case 5:
                    almacen.consultaProducto(reader);
                    break;
                case 6:
                    almacen.printAllProductos(almacen);
                    break;
                case 7:
                    seleccionOpciones();
                    break;
                default:
                    Menu.titulo("Entrada no valida", "-", "-", true);
            }
        }
    }

    // Menu Gestion Tienda
    public void gestionTienda() {

        CestaCompra cesta = new CestaCompra();
        while (true) {

            // Visualizacion permanente de la cantidad total de productos
            // de la cesta y su precio total.
            Menu.productosEnCesta(cesta.getStockTotalCesta(), cesta.precio());
            Menu.opcionesClientes();

            // Menu tienda
            int entrada = Scan.askInt(reader);
            switch (entrada) {

                case 1:
                    Menu.titulo("Añadir a la Cesta");
                    String producto = Scan.askProducto(reader);

                    if (producto.isEmpty()) {// Si la entrada esta vacia
                        Menu.titulo("Entrada no valida", "-", "-", true);
                        break;
                    }
                    // Añade producto a la cesta si esta en el almacen s
                    // y hay stock. De lo contrario lo elimina de la cesta
                    // nota: solo se descontara del almacen cuando se pague
                    if (almacen.productos().contains(producto)) {
                        cesta.addCesta(producto, almacen.precio(producto));
                        if (cesta.sotckCestaMayorAlmacen(almacen, producto) == false) {
                            Menu.titulo("Producto Añadido", "-", "-", true);
                        } else {
                            Menu.titulo("No hay Stock en el Almacen", "-", "-", true);
                        }
                    } else {
                        Menu.titulo("No hay Producto en Almacen", "-", "-", true);
                    }
                    break;
                case 2:
                    Menu.titulo("La cesta se ha vaciado", "-", "-", true);
                    cesta.resetStockCesta();
                    break;
                case 3:
                    almacen.printAllProductos(almacen);
                    break;
                case 4:
                    Menu.titulo("Listado Cesta");
                    cesta.print();
                    break;
                case 5:
                    cesta.pagar(almacen);// orden de pago
                    cesta.print();       // printar ticket
                    Menu.productosEnCesta(cesta.getStockTotalCesta(), cesta.precio());
                     Menu.titulo("Venta Realizada","-","=",true);
                    cesta.resetStockCesta();                  
                    gestionTienda();                   
                    break;
                case 6:
                    seleccionOpciones(); // vuelve al menu anterior
                    break;
                default:
                    Menu.titulo("Entrada no valida", "-", "-", true);
            }
        }
    }
}
