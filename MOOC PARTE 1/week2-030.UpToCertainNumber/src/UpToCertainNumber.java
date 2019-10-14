
import java.util.Scanner;


public class UpToCertainNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("¿Hasta que numero quieres contar? ");
	
    int numeroFinalCuenta=Integer.parseInt(reader.nextLine());
	int i=0;
	
		while (i!=numeroFinalCuenta) {
			i++;
			System.out.println(i);
			}
		reader.close();
		}
	
}
