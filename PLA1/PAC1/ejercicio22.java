// configurar una contraseña que ha de ser verificado por el usuario para dar un mensaje
package PLA1.PAC1;

import java.util.Scanner;

public class ejercicio22 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		// Entrada contraseña

		System.out.print("Inserta contraseña a programar: ");
		String programarPassword = entrada.nextLine();

		// Confirmar contraseña y mensaje si es correcta
		while (true) {
			System.out.print("Inserta contraseña para entrar: ");
			String entradaPassword = entrada.nextLine();
			if (entradaPassword.equals(programarPassword)) {
				System.out.println("La contraseña es correcta ");
				System.out.println("El mensaje secreto es : agarrate fuerte que vienen curvas ");
				break;
			} else {
				System.out.println("La contraseña no es correcta");
			}
		}
		entrada.close();
	}
}
