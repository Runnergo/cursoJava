package PLA1.PAC2;

// Presenta en consola los numeros del 1 al 100
public class ejercicio27 {

	public static void main(String[] args) {
		int contador = 0;
		while (true) {
			if (contador != 100) {
				contador++;
				System.out.println(contador);
			} else {
				break;
			}
		}
	}
}
