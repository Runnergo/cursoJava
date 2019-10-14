
import java.util.Scanner;

public class Palindromi {

    public static boolean palindrome(String text) {
        // write code here
        reverse(text);
        if (reverse(text).equals(text)) {
            return true;
        } else {
            return false;
        }
    }

    // INVIERTE EL TEXTO
    public static String reverse(String text) {
        int longitudText = text.length();
        int contadorAtras = longitudText;
        String caracter = "";

        for (int i = 0; i < longitudText; i++) {
            contadorAtras = contadorAtras - 1;
            caracter = caracter + text.charAt(contadorAtras);
        }
        return caracter;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type a text: ");
        String text = reader.nextLine();
        if (palindrome(text)) {
            System.out.println("The text is a palindrome!");
        } else {
            System.out.println("The text is not a palindrome!");
        }
    }
}
