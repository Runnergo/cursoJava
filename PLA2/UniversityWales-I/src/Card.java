
public class Card implements Pagar {

	private double balanceCard;

	public Card (double balanceCard) {
		
		this.balanceCard = balanceCard;
	}

	@Override
	public double getSaldo() {
		return balanceCard;
	}

	@Override
	public void setSaldo(double balance) {
		this.balanceCard = balance;
	}

	@Override
	public String toString() {
		return "The card has " + this.balanceCard + " euros";

	}

	@Override
	public void payMenu(double precioMenu) {
		if (balanceCard >= precioMenu) {
			balanceCard -= precioMenu;
		}
	}

}
