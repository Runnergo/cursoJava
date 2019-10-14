import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
		System.out.print("Hasta que numero quieres sumar? ");
		
		int numeroFinal = Integer.parseInt(reader.nextLine());
		int i=0;
		int sum=1;
		while (i!=numeroFinal) {
			i++;
			sum=sum*i;		
		}
		System.out.print("El factorial de "+numeroFinal+" es igual a "+sum);
		reader.close();
	}
}