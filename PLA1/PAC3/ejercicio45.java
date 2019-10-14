// devuelve el mayor de tres numeros dados por parametros
package PLA1.PAC3;

public class ejercicio45 {
	public static int greatest(int number1, int number2, int number3) {
		return Math.max(number1, Math.max(number2, number3));
	}

	public static void main(String[] args) {
		int answer = greatest(2, 7, 3);
		System.out.println("Greatest: " + answer);
	}
}
