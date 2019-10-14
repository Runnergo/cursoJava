// De la entra del nombre del usuario, devuelve el nombre escrito alreves con un metodo
package PLA1.PAC4;

import java.util.Scanner;

public class ejercicio56 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		System.out.print("Escribe es tu nombre: ");
		String nombreUsuario = entrada.nextLine();

		reverse(nombreUsuario);
		String reversoNombre = reverse(nombreUsuario);
		
		System.out.println("El inverso es " + reversoNombre);
		entrada.close();
	}

	public static String reverse(String nombreUsuario) {
		int longitudNombre = nombreUsuario.length();
		int contadorAtras = longitudNombre;
		String caracter = "";

		for (int i = 0; i < longitudNombre; i++) {
			contadorAtras = contadorAtras - 1;
			caracter = caracter + nombreUsuario.charAt(contadorAtras);
		}
		return caracter;
	}
}
