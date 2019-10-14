// De la entra del nombre del usuario, devuelve el nombre escrito alreves
package PLA1.PAC4;

import java.util.Scanner;

public class ejercicio52 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		System.out.print("Escribe es tu nombre: ");
		String nombreUsuario = entrada.nextLine();
		
		int longitudNombre = nombreUsuario.length();
		int contadorAtras=longitudNombre;
		String caracter="";
		
		for (int i=0; i<longitudNombre; i++) {
			contadorAtras=contadorAtras-1;
			caracter = caracter + nombreUsuario.charAt(contadorAtras);			
		}
		System.out.print("El orden inverso es " + caracter);
		entrada.close();
	}
}
