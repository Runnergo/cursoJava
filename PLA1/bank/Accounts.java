package bank;

import java.util.Scanner;

public class Accounts {
	public static Scanner reader = new Scanner(System.in);

	public static void main(String[] args) {

		Account accountJuan = new Account("juan", 10000);
		Account accountPepito = new Account("Pepito", 10000);

		System.out.println("\n  ================");
		System.out.println("  MENU DE OPCIONES");
		System.out.println("  ================\n");
		System.out.println("1. Consulta de saldo");
		System.out.println("2. Ingresar Dinero");
		System.out.println("3. Retirada de Dinero");
		System.out.println("4. Peticion Credito");
		System.out.println("5. Transferencia");
		System.out.println("6. Cambio Euros/Dollar");
		System.out.println("7. Salir");

		while (true) {
			int optionsMenu = reader.nextInt();

			switch (optionsMenu) {

			case 1:
				System.out.println(accountJuan.toString());
				break;

			case 2:
				accountJuan.deposit(amountOperation());
				System.out.println(accountJuan.toString());
				break;

			case 3:
				double amountOperation = amountOperation();
				accountJuan.withdrawal(amountOperation);

				System.out.println(accountJuan.toString());
				break;

			case 4:
				personalCredit(accountJuan, amountOperation());
				System.out.println(accountJuan.toString());
				break;

			case 5:
				transfer(accountJuan, accountPepito, amountOperation());
				System.out.println(accountJuan.toString());
				break;

			case 6: changeMoney(accountJuan, amountOperation());
			    break;
			case 7: 
				 System.exit(0);
			
			default:
				System.out.println("Opcion no valida");
			}
		}

	}

	// transfereix un valor de un compte a un altre amb un return de //l’operació
	public static void transfer(Account accountOne, Account accountTwo, double quantity) {

		if (accountOne.getBalance() - quantity < 0) {
			// negativeBalance(accountOne);
		} else {
			accountOne.withdrawal(quantity);
			accountTwo.deposit(quantity);
			accountOne.toString();
		}

	}

	// depèn del valor del compte decideix si es pot concedir un crèdit o //no a
	// l’usuari
	public static void personalCredit(Account accountOne, double creditRequest) {
		
		double creditRequirements = accountOne.getBalance() * 0.4;
		if (creditRequest > creditRequirements) {
			System.out.println("Lo sentimos con su saldo actual de " + accountOne.getBalance() +

					" como maximo podemos concederle un credito de " + creditRequirements);
		} else {
			System.out.println("Su credito ha sido aceptado");
			accountOne.deposit(creditRequest);
		}
	}
    // Metodo para insertar cantidades
	public static double amountOperation() {
		System.out.println("Que cantidad desea");
		double amount = reader.nextDouble();
		return amount;
	}
    // Cambio de moneda a dollar 
	public static void changeMoney(Account accountOne, double euros) {
    double change=Math.round((euros*1.12) * 100) / 100d; 
    accountOne.withdrawal(euros);
    System.out.println("Cambio: "+euros+" Euros = "+change+" Dolares");
    System.out.println(accountOne.toString());
 
	}

}
