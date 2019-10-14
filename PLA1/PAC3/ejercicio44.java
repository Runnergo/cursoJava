// devuelve el numero menor dado por parametros
package PLA1.PAC3;

public class ejercicio44 {
	public static int least(int number1, int number2) {
	  return Math.min(number1, number2);
	}

	public static void main(String[] args) {
	    int answer =  least(2, 7);
	    System.out.println("Least: " + answer);
	}
}