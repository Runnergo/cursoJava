// Presenta en consola los numeros del 100 al 1

package PLA1.PAC2;

public class ejercicio28 {

	public static void main(String[] args) {
		int contador = 100;
		while (true) {
			if (contador != 0) {
				
				System.out.println(contador);
				contador--;
			
			} else {
				break;
			}
		}
	}
}
