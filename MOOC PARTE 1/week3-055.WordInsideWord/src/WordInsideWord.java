
import java.util.Scanner;

public class WordInsideWord {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type the first word: ");
        String wordOne = reader.nextLine();

        System.out.print("Type the second word: ");
        String wordTwo = reader.nextLine();

        if (wordOne.contains(wordTwo)) {
            System.out.print("The word '" + wordTwo + "' is found in the word '" + wordOne + "'");
        } else {
            System.out.print("The word '" + wordTwo + "' is not found in the word '" + wordOne + "'");
        }
    }
}
