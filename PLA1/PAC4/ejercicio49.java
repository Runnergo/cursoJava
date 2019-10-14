//De la entra del nombre del usuario, decir la ultima letra con un metodo char
package PLA1.PAC4;

import java.util.Scanner;

public class ejercicio49 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("Cual es tu nombre ?");
		String nombreUsuario= entrada.nextLine();
		lastCharacter(nombreUsuario);
		char ultimoCaracter=lastCharacter(nombreUsuario);
		System.out.println("La ltima letra de tu nombre "+nombreUsuario+" es "+ultimoCaracter);
		entrada.close();
	}
	public static char lastCharacter(String text) {
		int ultimoCaracter=text.length();
		return text.charAt(ultimoCaracter-1);
	}
}