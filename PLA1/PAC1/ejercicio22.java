// configurar una contrase�a que ha de ser verificado por el usuario para dar un mensaje
package PLA1.PAC1;

import java.util.Scanner;

public class ejercicio22 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		// Entrada contrase�a

		System.out.print("Inserta contrase�a a programar: ");
		String programarPassword = entrada.nextLine();

		// Confirmar contrase�a y mensaje si es correcta
		while (true) {
			System.out.print("Inserta contrase�a para entrar: ");
			String entradaPassword = entrada.nextLine();
			if (entradaPassword.equals(programarPassword)) {
				System.out.println("La contrase�a es correcta ");
				System.out.println("El mensaje secreto es : agarrate fuerte que vienen curvas ");
				break;
			} else {
				System.out.println("La contrase�a no es correcta");
			}
		}
		entrada.close();
	}
}
