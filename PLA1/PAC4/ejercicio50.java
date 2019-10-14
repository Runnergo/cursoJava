/* De la entra del nombre del usuario, decir la tres primeras letras y en el caso
*  de que la longitud sea menor de caracteres, dar mensaje en blanco
*/
package PLA1.PAC4;

import java.util.Scanner;

public class ejercicio50 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		System.out.print("Escribe es tu nombre: ");
		String nombreUsuario = entrada.nextLine();
		int longitudNombre = nombreUsuario.length();
		
		if (longitudNombre > 3) {
			char primerCaracter = nombreUsuario.charAt(0);
			char segundoCaracter = nombreUsuario.charAt(1);
			char tercerCaracter = nombreUsuario.charAt(2);
			System.out.print("1. character: " + primerCaracter + "\n");
			System.out.print("2. character: " + segundoCaracter + "\n");
			System.out.print("3. character: " + tercerCaracter + "\n");
		}

		entrada.close();
	}

}
