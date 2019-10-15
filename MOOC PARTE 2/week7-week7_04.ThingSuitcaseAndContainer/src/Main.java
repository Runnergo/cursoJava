
public class Main {

    public static void main(String[] args) {
        // crea objeto contenedor con 1000 de carga maxima
        Container container = new Container(1000);

        /* LLama al metodo estatico para aññadir
         * objetos cosas y maletas al contenedor
         */
        addSuitcasesFullOfBricks(container);
        System.out.println(container);
    }

    public static void addSuitcasesFullOfBricks(Container container) {

        // Añade 100 objetos ladrillo, incrementados de uno en uno
        for (int i = 1; i < 101; i++) {
            Thing brick = new Thing("Brick", i);
            Suitcase suitcase = new Suitcase(100);
            suitcase.addThing(brick);
            container.addSuitcase(suitcase);
        }
    }
}
