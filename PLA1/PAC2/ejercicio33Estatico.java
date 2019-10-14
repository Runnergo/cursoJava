// calcula la suma de un numero inicial y otro final insertado por el usuario
package PLA1.PAC2;

import java.util.Scanner;

public class ejercicio33Estatico {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Número con el que iniciar la suma ");
		int numeroInicial = Integer.parseInt(entrada.nextLine());

		System.out.print("Número con el que finalizar la suma ");
		int numeroFinal = Integer.parseInt(entrada.nextLine());

		calculo(numeroInicial, numeroFinal);
		entrada.close();
	}
    // calcula la suma del recorrido entre dos numeros
	
	public static void calculo(int numeroInicial, int numeroFinal) {
		int registroNumeroInicial = numeroInicial;
		int suma = 0;
		while (numeroInicial != numeroFinal) {
			numeroInicial++;
			suma = suma + numeroInicial;
		}
		resultado(registroNumeroInicial, numeroFinal, suma);
	}
	// imprime en pantalla el resultado
	
	public static void resultado(int numeroInicial, int numeroFinal, int suma) {
		System.out.print("El número inicial es " + numeroInicial + "\nEl número final es " + numeroFinal
				+ "\nLa suma de la progresion es igual a " + suma);
	}
}
