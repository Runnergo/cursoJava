// Calculo perimetro dando el usuario el radio. Ejercicio 10

package PLA1.PAC1;

import java.util.Scanner;

public class ejercicio10 {

	public static void main(String[] args) {
		System.out.print("Inserta el radio del circulo: ");
		Scanner entrada = new Scanner(System.in);
		double radio = entrada.nextDouble();
		double perimetro = radio * 2 * Math.PI;
		System.out.println("El perimetro del circulo con el radio " + radio + " = " + perimetro);
		entrada.close();
	}
	
}
