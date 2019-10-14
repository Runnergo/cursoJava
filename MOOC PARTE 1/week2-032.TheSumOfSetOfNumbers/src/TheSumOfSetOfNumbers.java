
import java.util.Scanner;

public class TheSumOfSetOfNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
		System.out.print("Hasta que numero quieres sumar? ");
		
		int numeroFinal = Integer.parseInt(reader.nextLine());
		int i=0;
		int suma=0;
		while (i!=numeroFinal) {
			i++;
			suma=suma+i;		
		}
		System.out.print("La suma hasta el numero "+numeroFinal+" es igual a "+suma);
		reader.close();
	}
}