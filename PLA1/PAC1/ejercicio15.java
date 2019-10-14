// Segun edad del usuiario, decir si es mayor de edad

package PLA1.PAC1;

import java.util.Scanner;

public class ejercicio15 {

	public static void main(String[] args) {
	
		System.out.print("Que edad tienes: ");
		Scanner entradaEdad = new Scanner(System.in);
		int edad = entradaEdad.nextInt();
		if (edad>=18) {
			System.out.print("Eres mayor de edad ");	
		}else {
			System.out.print("Aun no tienes la mayoria de edad");	
		}
		entradaEdad.close();
	}
}