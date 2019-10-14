package bank;

import java.util.Scanner;

public class Account {

	public static Scanner reader = new Scanner(System.in);
	private double balance;
	private String owner;

	public Account(String owner, double balance) {
		this.balance = balance;
		this.owner = owner;
	}

	public void deposit(double amount) {
		balance += amount;
	}

	public void withdrawal(double amount) {

		balance -= amount;
		if (this.balance < 0) {
			System.out.println(
					"Su operacion le dara un saldo negativo de" + this.getBalance() + "\n¿Desea continuar (s/n)?");
			String continueOperation = reader.nextLine();
			if ((continueOperation.equals("s")) || (continueOperation.equals("S"))) {
				return;
			} else {
				balance += amount;
			}
		}
	}

	public double getBalance() {
		return balance;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return owner + " balance: " + balance;
	}

}