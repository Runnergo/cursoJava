
import java.util.Scanner;


public class TheSumBetweenTwoNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numeroInicial,numeroFinal,sum,i;
 		System.out.print("Número con el que iniciar la suma ");
		numeroInicial = Integer.parseInt(reader.nextLine());

		System.out.print("Número con el que finalizar la suma ");
		numeroFinal = Integer.parseInt(reader.nextLine());
		
		i = numeroInicial;
		sum = 0;
		while (i <= numeroFinal) {
			
			sum = sum + i;
                        i++;
		}
		System.out.print("la suma es" + sum);
		reader.close();
	}
}