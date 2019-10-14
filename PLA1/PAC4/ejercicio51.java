// De la entra del nombre del usuario, numerar sus letras
package PLA1.PAC4;

import java.util.Scanner;

public class ejercicio51 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		System.out.print("Escribe es tu nombre: ");
		String nombreUsuario = entrada.nextLine();
		int longitudNombre = nombreUsuario.length();
		
		for (int i=0; i< longitudNombre; i++) {
			char Caracter = nombreUsuario.charAt(i);	
			System.out.print((i+1)+". character: " + Caracter + "\n");			
		}
		entrada.close();
	}
}
