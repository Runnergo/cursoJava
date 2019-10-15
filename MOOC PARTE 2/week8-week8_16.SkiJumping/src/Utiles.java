
import java.util.ArrayList;
import java.util.Scanner;

public class Utiles {

    public static String ask(Scanner reader) {
        return reader.nextLine();
    }

    public static int azar(int max, int min) {
        return (int) ((Math.random() * ((max+1) - min)) + min);
    }

    public static void setJumpers(ArrayList<Jumper> jumpers) {
        for (Jumper list : jumpers) {
            System.out.println(list);
        }
    }
}
