// Verificar que un a�o sea bisiesto o no
package PLA1.PAC1;

import java.util.Scanner;

public class ejercicio21 {

	public static void main(String[] args) {

		System.out.print("Inserta un a�o: ");
		Scanner entrada = new Scanner(System.in);
		int a�o = entrada.nextInt();
		
		if ((a�o %4 == 0) && (a�o %100!=0) || (a�o %400 == 0)) {
			System.out.println("El a�o es bisiesto ");
		} else {
			System.out.println("El a�o no es bisiesto ");
		}
		entrada.close();
	}
}
