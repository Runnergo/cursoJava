// verifica usuario y contrase�a

package PLA1.PAC1;

import java.util.Scanner;

public class ejercicio20 {

	public static void main(String[] args) {

		System.out.print("Escribe nombre de usuario: ");
		Scanner entrada = new Scanner(System.in);
		String user = entrada.next();

		System.out.print("Escribe tu contrase�a: ");
		String password = entrada.next();

		if ((user.equals("alex") && password.equals("patopoderoso")) || (user.equals("emily") && password.equals("gato"))){
			System.out.println("Sistema conectado");
		} else {
			System.out.println("Tu usuario o contrase�a son erroneas");
		}
		entrada.close();
	}

}