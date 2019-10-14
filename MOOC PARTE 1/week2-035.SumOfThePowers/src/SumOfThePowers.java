
import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
		System.out.print("Hasta que numero quieres la potencia? ");
		
		int numeroFinal = Integer.parseInt(reader.nextLine());
		int i=0;
		int sumaPotencia=1;
		while (i!=numeroFinal) {
			i++;
			sumaPotencia=sumaPotencia+((int)Math.pow(2,i));			
		}
		System.out.print("El factorial de "+numeroFinal+" es igual a "+sumaPotencia);
		reader.close();
	}
}