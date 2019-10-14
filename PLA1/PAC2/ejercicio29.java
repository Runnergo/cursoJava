// Imprimir numero pares del 2 al 100

package PLA1.PAC2;

public class ejercicio29 {

	public static void main(String[] args) {
		int contador = 0;
		
		while (true) {

			if (contador == 100) {
				break;

			} else {
				contador = contador + 2;
				System.out.println(contador);
			}
		}
	}
}
