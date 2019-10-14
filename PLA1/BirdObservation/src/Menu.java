
import java.util.Scanner;

public class Menu {

    public static void menu() {
        System.out.println("================");
        System.out.println("   Option Menu");
        System.out.println("================");
        System.out.println("1. Add bird");
        System.out.println("2. Bird list");
        System.out.println("3. add observation");
        System.out.println("4. Ornithologist list");
        System.out.println("5. Query by Bird");
        System.out.println("6. Query by Ornithologist");
        System.out.println("7. Exit");
    }

    public static void ok() {
        System.out.println("----------------");
        System.out.println("Confirmed operation");
    }

    public static void exit() {
        System.out.println("----------------");
        System.out.println("See you soon");
        System.out.println("================");
    }

    public static String ask(String commentary, Scanner reader) {
        System.out.print(commentary);
        String ask = reader.nextLine().trim();
        return ask;
    }

    public static void error() {
        System.out.println("----------------");
        System.out.println("Invalid option");
    }
}
