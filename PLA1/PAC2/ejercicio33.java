// calcula la suma de un numero inicial y otro final insertado por el usuario
package PLA1.PAC2;

import java.util.Scanner;

public class ejercicio33 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Número con el que iniciar la suma ");
		int numeroInicial = Integer.parseInt(entrada.nextLine());

		System.out.print("Número con el que finalizar la suma ");
		int numeroFinal = Integer.parseInt(entrada.nextLine());
		
		int i = numeroInicial;
		int suma = 0;
		while (i != numeroFinal) {
			i++;
			suma = suma + i;
		}
		System.out.print("El número inicial es " + numeroInicial + "\nEl número final es " + numeroFinal
				+ "\nLa suma de la progresion es igual a " + suma);
		entrada.close();
	}
}