// De dos n�meros insertados por el usuario, decir cual es el mayor. Ejercicio 11

package PLA1.PAC1;

import java.util.Scanner;

public class ejercicio11 {
	
	public static void main(String[] args) {
		
	System.out.println("se ha de inserta dos n�meros para saber cual es el el mayor");
	System.out.print("Inserta el primer numero: ");
	Scanner entrada = new Scanner(System.in);
	int primerNumero = entrada.nextInt();
	
	System.out.print("Inserta el segundo numero: ");
    int segundoNumero = entrada.nextInt();
    
    int mayor=Math.max(primerNumero, segundoNumero);
    System.out.println("El numero mayor entre "+primerNumero+" y "+segundoNumero+" es "+mayor);
    entrada.close();
}
}