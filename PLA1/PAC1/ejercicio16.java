//Indica si un numero es par o impar de una entrada por usuario

package PLA1.PAC1;

import java.util.Scanner;

public class ejercicio16 {

	public static void main(String[] args) {

		System.out.print("Inserta un numero: ");
		Scanner entrada = new Scanner(System.in);
		int numeroEntrada = entrada.nextInt();
		if (numeroEntrada%2==0) {
			System.out.print("El número "+numeroEntrada+" es par");	
		}else {
			System.out.print("El número "+numeroEntrada+" es impar");	
		}
		entrada.close();
	}
}
