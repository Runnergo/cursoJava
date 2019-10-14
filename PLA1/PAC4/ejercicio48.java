//De la entra del nombre del usuario, decir la primera letra con un metodo char
package PLA1.PAC4;

import java.util.Scanner;

public class ejercicio48 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("Cual es tu nombre ?");
		String nombreUsuario= entrada.nextLine();
		firstCharacter(nombreUsuario);
		char primerCaracter=firstCharacter(nombreUsuario);
		System.out.println("La primera letra de tu nombre "+nombreUsuario+" es "+primerCaracter);
		entrada.close();
	}
	public static char firstCharacter(String text) {
		
		return text.charAt(0);
	}
}
