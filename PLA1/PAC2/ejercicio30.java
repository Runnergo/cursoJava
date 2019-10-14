// imprimir en pantalla una cuenta hasta el numero elegido por usuario 

package PLA1.PAC2;

import java.util.Scanner;

public class ejercicio30 {
	public static void main(String[] args) {
	
	System.out.print("¿Hasta que numero quieres contar? ");
	Scanner entrada = new Scanner(System.in);
	
    int numeroFinalCuenta=Integer.parseInt(entrada.nextLine());
	int i=0;
	
		while (i!=numeroFinalCuenta) {
			i++;
			System.out.println(i);
			}
		entrada.close();
		}
	
}
