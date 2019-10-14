// condicion rango de edad

package PLA1.PAC1;

import java.util.Scanner;

public class ejercicio19 {

	public static void main(String[] args) {

		System.out.print("Que edad tienes: ");
		Scanner entradaEdad = new Scanner(System.in);
		int edad = entradaEdad.nextInt();
		if (edad <0 || edad>120 ) {
			System.out.print("No puedes tener esa edad");
		} else {
			System.out.print("Todo correcto");
		}
		entradaEdad.close();
	}
}
