package wordinspection;

import java.io.File;

public class Main {

    public static void main(String[] args) throws Exception {
        // test your code here

        File file = new File("src/shortList.txt");

        WordInspection word = new WordInspection(file);

        System.out.println("words: " + word.wordCount());
        System.out.println("Characters whit 'Z': " + word.wordsContainingZ());
        System.out.println("Character 'l' final word: " + word.wordsEndingInL());
        System.out.println("Palindromos: "+ word.palindromes());
        System.out.println("Vocales Finlandesas: "+word.wordsWhichContainAllVowels());
    }
}
