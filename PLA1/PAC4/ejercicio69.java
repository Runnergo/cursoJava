// crear un metodo que devuelva si es texto insertado es un palindromo o no
package PLA1.PAC4;

import java.util.Scanner;

public class ejercicio69 {

	/*
	 * llama al metodo reverse que devuelve el texto a la inversa luego compara si
	 * es igual al texto y de ser asi devuelve un true
	 */
	public static boolean palindrome(String text) {
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

	// METODO MAIN --> IMPRIME EN PANTALLA SI ES O NO UN PALINDROMO
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		System.out.println("Type a text: ");
		String text = reader.nextLine();
		if (palindrome(text)) {
			System.out.println("The text is a palindrome!");
		} else {
			System.out.println("The text is not a palindrome!");
		}
		reader.close();
	}
}
