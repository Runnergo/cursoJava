
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInAlphabeticalOrder {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // create here an ArrayList
        ArrayList<String> wordList = new ArrayList<String>();

            System.out.println("Type a word: ");
        String wordReader = reader.nextLine();

        while (!wordReader.isEmpty()) {
            wordList.add(wordReader);
            System.out.println("Type a word: ");
            wordReader = reader.nextLine();
        }
        Collections.sort(wordList);
        System.out.println("You typed the following words: ");
        for (String word : wordList) {

            System.out.println(word);
        }

    }
}
