
import java.util.ArrayList;
import java.util.Scanner;

public class RecurringWord {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> wordList = new ArrayList<String>();

        while (true) {
            System.out.print("Escribe una palabra ");
            String palabra = reader.nextLine();
            wordList.add(palabra);
            int i = 0;
            for (String wordLista : wordList) {
                if (wordLista.contains(palabra)) {
                    i++;
                }
            }
            if (i == 2) {
                System.out.print("Repitio la palabra " + palabra + " dos veces");
                break;
            }
        }
        reader.close();
    }
}
