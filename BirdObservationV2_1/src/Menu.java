


public class Menu {

    public static String menu() {
        String menu = "=====================\n"
                + "              Option Menu\n"
                + "=====================\n"
                + "1. Add bird\n"
                + "2. Bird list\n"
                + "3. add observation\n"
                + "4. Ornithologist list\n"
                + "5. Query by Bird\n"
                + "6. Query by Ornithologist\n"
                + "7. Exit\n";
        return menu;
    }

    public static String exit() {
        String cadena = "           See you soon!!";
        return cadena;
    }

    public static String error() {
        return "Invalid option";
    }

    public static String isBird() {
        String cadena = "The bird is not registered!\n"
                + "will be added to the database\n\n"
                + " Input Name Bird Latin";
        return cadena;
    }
    public static String noRegistred(){
        return "There are no registered\n";
    }
    public static String yesRegistre(){
        return "Are you already registered";
    }
}
