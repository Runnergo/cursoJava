/* 
* Mejora de ejercicio 'Tienda online'
* MOOC Helsinki 2ºParte week8_12.OnlineShop. 
*
* Clase Menu: Printados de las opciones de Menu
* y metodos para crear enmarcados.
*
* @author: Juan Jose Gonzalez Pozo
* @version: V2.0 - 23/08/2019 
*/

public class Menu {

    public static void seleccionOpciones() {
        Menu.printChar("1. Gestiones almacen", 10, " ", true, "<");
        Menu.printChar("2. Gestion Compras", 10, " ", true, "<");
        Menu.printChar("3. Salir", 10, " ", true, "<");

        System.out.print(">");
    }

    public static void opcionesAlmacen() {
        Menu.titulo("Gestion Almacen");
        Menu.printChar("1. Alta de producto", 10, " ", true, "<");
        Menu.printChar("2. Baja de producto", 10, " ", true, "<");
        Menu.printChar("3. Editar precio", 10, " ", true, "<");
        Menu.printChar("4. Añadir stock", 10, " ", true, "<");
        Menu.printChar("5. Consulta Producto", 10, " ", true, "<");
        Menu.printChar("6. Listado productos", 10, " ", true, "<");
        Menu.printChar("7. Atras", 10, " ", true, "<");
        System.out.print(">");
    }

    public static void opcionesClientes() {
        Menu.titulo("Venta a Clientes");
        Menu.printChar("1. Añadir a la cesta", 10, " ", true, "<");
        Menu.printChar("2. Borrar cesta", 10, " ", true, "<");
        Menu.printChar("3. Productos en tienda", 10, " ", true, "<");
        Menu.printChar("4. Productos en cesta", 10, " ", true, "<");
        Menu.printChar("5. Pagar", 10, " ", true, "<");
        Menu.printChar("6. Atras", 10, " ", true, "<");
        System.out.print(">");
    }

    public static void salida() {
        Menu.titulo("Gracias por su visita");
        System.exit(0);
    }

    public static void titulo(String titulo) {
        Menu.printChar("", 40, "=", true, ">");
        Menu.centrarTexto(titulo, 40, " ", true);
        Menu.printChar("", 40, "=", true, ">");
    }

    public static void titulo(String titulo, String c1, String c3, boolean b2) {
        Menu.printChar("", 40, c1, true, ">");
        Menu.centrarTexto(titulo, 40, " ", b2);
        Menu.printChar("", 40, c3, true, ">");
    }

    public static void printAllProductos() {
        Menu.printChar("Nombre", 21, " ", false, ">");
        Menu.printChar("Unid.", 11, " ", false, ">");
        Menu.printChar("Precio", 1, "", true, ">");

        Menu.printChar("", 40, "-", true, ">");
    }

    public static void productosEnCesta(int numeroProductos, double precio) {
        String precioTotal = String.valueOf(precio);
        String nProductos = Integer.toString(numeroProductos);
        Menu.printChar("", 20, "- ", true, ">");
        Menu.printChar("Cesta: " + nProductos, 0, " ", false, ">");
        Menu.printChar("Total: " + precioTotal + " €", 10, " ", true, "<");
    }

    /*  ----------------------------------------------------------------
    *   Descripcion parametros en metodo centrarTexto
    *   ----------------------------------------------------------------
    *  (texto a imprimir,longitud total texto rellenado con caracter, 
    *    caracter a insertar, true o false si se quiere salto de linea)
     */
    public static void centrarTexto(String cadenaTexto, int longLinea, String caracter, boolean saltoLinea) {
        int cantidadCaracteres = 0;
        cantidadCaracteres = (longLinea - (cadenaTexto.length())) / 2;
        String sumaCaracter = "";
        for (int i = 0; i < cantidadCaracteres; i++) {
            sumaCaracter += caracter;
        }
        if (saltoLinea == false) {
            System.out.print(sumaCaracter + cadenaTexto);
        } else {
            System.out.print(sumaCaracter + cadenaTexto);
            System.out.println();
        }
    }
    /*  ----------------------------------------------------------------
    *   Descripcion parametros en metodo printChar
    *   ----------------------------------------------------------------
    *  (texto a imprimir,longitud total texto rellenado con caracter, 
    *    caracter a insertar, true o false si se quiere salto de linea, 
    *    direccion donde se quiere insertar los caracteres
    *    ">" derecha o "<" izquierda)
     */
    public static void printChar(String cadenaTexto, int longTotal, String caracter, boolean saltoLinea, String delanteODetrasTexto) {
        int cantidadCaracteres = 0;
        if (delanteODetrasTexto.equalsIgnoreCase("<")) {
            cantidadCaracteres = longTotal;
        } else {
            cantidadCaracteres = longTotal - cadenaTexto.length();
        }     
        String sumaCaracter = "";
        for (int i = 0; i < cantidadCaracteres; i++) {
            sumaCaracter += caracter;
        }
        if (delanteODetrasTexto.equalsIgnoreCase(">")) {
            sumaCaracter = cadenaTexto + sumaCaracter;
        } else {
            sumaCaracter += cadenaTexto;
        }
        if (saltoLinea == false) {
            System.out.print(sumaCaracter);
        } else {
            System.out.print(sumaCaracter);
            System.out.println();
        }
    }
}
