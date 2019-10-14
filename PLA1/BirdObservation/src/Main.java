
public class Main {

    public static void main(String[] args) {

        while (true) {
            Opciones start = new Opciones();
            try {
                start.seleccion();
            } catch (Exception e) {
                Menu.error();
            }
        }
    }
}
