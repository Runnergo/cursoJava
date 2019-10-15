package wordinspection;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WordInspection {

    private File file;
    private List caracter;
    private List charFinalWord;
    private List palindromo;
    private List VocalesFinlandesas;

    public WordInspection(File file) {

        this.file = file;
        this.caracter = new ArrayList();
        this.charFinalWord = new ArrayList();
        this.palindromo = new ArrayList();
        this.VocalesFinlandesas = new ArrayList();
    }

    public int wordCount() throws Exception {
        Scanner reader = new Scanner(file, "UTF-8");
        int numeroPalabras = 0;
        while (reader.hasNext()) {

            numeroPalabras++;
            reader.next();
        }
        return numeroPalabras;
    }

    public List<String> wordsContainingZ() throws Exception {
        Scanner reader = new Scanner(file, "UTF-8");

        while (reader.hasNext()) {
            String word = reader.next();
            if (word.contains("z")) {
                caracter.add(word);
            }
        }
        return caracter;
    }

    public List<String> wordsEndingInL() throws Exception {
        Scanner reader = new Scanner(file, "UTF-8");

        while (reader.hasNext()) {
            String word = reader.next();
            if (word.endsWith("l")) {
                charFinalWord.add(word);
            }
        }
        return charFinalWord;
    }

    public List<String> palindromes() throws Exception {
        Scanner reader = new Scanner(file, "UTF-8");

        while (reader.hasNext()) {
            
            boolean isPalindromo=true; 
            String word = reader.next();
            int j=word.length();
            for (int i = 0; i < j; i++) {
                
                if (!(word.charAt(i) == word.charAt(j-1))) {
                 isPalindromo=false;   
                 break;
                }
                j--;   
            }
            if (isPalindromo){
                palindromo.add(word);
            }
        }
        return palindromo;
    }

    public List<String> wordsWhichContainAllVowels() throws Exception {

        String[] vocales = {"a", "e", "i", "o", "u", "y", "ä", "ö"};

        Scanner reader = new Scanner(file, "UTF-8");

        while (reader.hasNext()) {
            String word = reader.next();
            Boolean vocalesTrue = true;

            for (int i = 0; i < vocales.length; i++) {
                if (!word.contains(vocales[i])) {
                    vocalesTrue = false;
                }
            }
            if (vocalesTrue) {
                VocalesFinlandesas.add(word);
            }
        }
        return VocalesFinlandesas;
    }
}
