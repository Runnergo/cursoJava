// calcular la longitud del nombre del usuario con un metodo
package PLA1.PAC4;

import java.util.Scanner;

public class ejercicio47 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("cual es tu nombre ?");
		String nombreUsuario= entrada.nextLine();
		calculateCharacters(nombreUsuario);
		int len=calculateCharacters(nombreUsuario);
		System.out.println("Tu nombre "+nombreUsuario+" tiene "+len+" caracteres");
		entrada.close();
	}
	public static int calculateCharacters(String text) {
		
		return text.length();
	}
}
