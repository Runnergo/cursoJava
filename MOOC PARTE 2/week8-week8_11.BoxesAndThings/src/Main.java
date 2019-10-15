
public class Main {

    public static void main(String[] args) {
        // Crea objeto Box con el peso maximo permitida
        Box box = new Box(10);

        // se añade objetos Book a box que como parametros contiene
        // nombre del autor, titulo libro y su peso
        box.add(new Book("Fedor Dostojevski", "Crime and Punishment", 2));
        box.add(new Book("Robert Martin", "Clean Code", 1));
        box.add(new Book("Kent Beck", "Test Driven Development", 0.7));

        // se añaden objetos CD a box que como parametros contiene
        // cantante, titulo  CD y año de edicion.
        // el peso viene por defecto a 0.1Kg definido en su constructor.
        box.add(new CD("Pink Floyd", "Dark Side of the Moon", 1973));
        box.add(new CD("Wigwam", "Nuclear Nightclub", 1975));
        box.add(new CD("Rendezvous Park", "Closer to Being Here", 2012));

        System.out.println(box);
    }
}
