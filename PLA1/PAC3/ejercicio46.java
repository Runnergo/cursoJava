//calcula el promedio de los números que obtiene como parámetros. Dentro del método debes usar el método sum
package PLA1.PAC3;

public class ejercicio46 {
	public static double average(int number1, int number2, int number3, int number4) {
		double resultado=(double)(sum(number1, number2, number3, number4))/4;
			
		return resultado;	
	}

	public static int sum(int number1, int number2, int number3, int number4) {
		return number1 + number2 + number3 + number4;
	}

	public static void main(String[] args) {
		double answer = average(4, 3, 6, 1);
		System.out.println("average: " + answer);
	}
}
