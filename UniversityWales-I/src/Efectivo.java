
public class Efectivo implements Pagar{

	private double balanceEfectivo;
	
	public Efectivo( double balanceEfectivo) {
	
		this.balanceEfectivo = balanceEfectivo;
		
	}

	@Override
	public double getSaldo() {
		return balanceEfectivo;
	}

	@Override
	public void setSaldo(double balance) {
		this.balanceEfectivo = balance;
	}
	
	@Override
	public void payMenu(double precioMenu) {
		if (balanceEfectivo >= precioMenu) {
			balanceEfectivo -= precioMenu;
		}
	}

	@Override
	public String toString() {
		return "The card has " + this.balanceEfectivo + " euros";
	}
	
}
