// imprimir en pantalla una cuenta desde un mumero hasta otro elegidos por usuario 

package PLA1.PAC2;

import java.util.Scanner;

public class ejercicio31 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		// asignar numero de inicio cuenta

		System.out.print("Indica numero inicial de la cuenta ");
		int numeroInicialCuenta = Integer.parseInt(entrada.nextLine());

		// asignar numero final cuenta

		System.out.print("Indica numero final de la cuenta ");
		int numeroFinalCuenta = Integer.parseInt(entrada.nextLine());

		// compara si el numero inicial es mayor que el final y de lo contrario empieza
		// contar

		if (numeroInicialCuenta <= numeroFinalCuenta) {

			while (numeroInicialCuenta <= numeroFinalCuenta) {

				System.out.println(numeroInicialCuenta);
				numeroInicialCuenta++;
			}

		} else {
			System.out.println("error, el número inicial es mayor que el número final");
		}
		entrada.close();
	}

}
