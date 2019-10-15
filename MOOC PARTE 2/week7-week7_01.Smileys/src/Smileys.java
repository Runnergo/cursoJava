
public class Smileys {

    public static void main(String[] args) {
        // Test your method at least with the following
        // printWithSmileys("Method");
        // printWithSmileys("Beerbottle");
        // printWithSmileys("Interface");
        printWithSmileys("Mikael");
        printWithSmileys("Matt");
    }

    private static void printWithSmileys(String characterString) {

        int longitudCadena = characterString.length();
        int filaCarita = (longitudCadena + 1) / 2+3;
        
        loopCaritas(filaCarita);
        
        if (longitudCadena % 2 == 0) {
            System.out.println(":) " + characterString + " :)");
        } else {
            System.out.println(":) " + characterString + "  :)");
        }
        loopCaritas(filaCarita);
    }

    private static void loopCaritas(int numeroCaritas) {
        int i = 0;
        for (i = 0; i < numeroCaritas; i++) {
            System.out.print(":)");
        }
        System.out.println();
    }

}
