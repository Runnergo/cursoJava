// Verificar que un año sea bisiesto o no
package PLA1.PAC1;

import java.util.Scanner;

public class ejercicio21 {

	public static void main(String[] args) {

		System.out.print("Inserta un año: ");
		Scanner entrada = new Scanner(System.in);
		int año = entrada.nextInt();
		
		if ((año %4 == 0) && (año %100!=0) || (año %400 == 0)) {
			System.out.println("El año es bisiesto ");
		} else {
			System.out.println("El año no es bisiesto ");
		}
		entrada.close();
	}
}
