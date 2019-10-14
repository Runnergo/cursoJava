
public class Restaurante {

	private MenuComidas menu;
	private double precio;
	private double balance;

	public Restaurante(MenuComidas menu, double precio) {

		this.menu = menu;
		this.precio = precio;
		this.balance = 100000;

	}

	public void pagar(double pago) {
		this.balance += pago;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public MenuComidas getMenu() {
		return menu;
	}

	public void setMenu(MenuComidas menu) {
		this.menu = menu;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

}
