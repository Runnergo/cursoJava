// calcula la suma de 1 hasta un numero insertado por el usuario
package PLA1.PAC2;

import java.util.Scanner;

public class ejercicio32 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Hasta que numero quieres sumar? ");
		
		int numeroFinal = Integer.parseInt(entrada.nextLine());
		int i=0;
		int suma=0;
		while (i!=numeroFinal) {
			i++;
			suma=suma+i;		
		}
		System.out.print("La suma hasta el numero "+numeroFinal+" es igual a "+suma);
		entrada.close();
	}
}