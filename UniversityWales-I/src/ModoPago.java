
enum Pago {
	CARD, EFECTIVO
}

public class ModoPago {

	Pago pago;
	private double precioMenu;
	
	public ModoPago(Pago pago, double precioMenu) {
		
	this.pago=pago;
	this.precioMenu=precioMenu;
	}
	
	public void comoPago() {
		System.out.print("El pago se realiza en ");
		switch (pago) {		
		case CARD:
			
			System.out.println(pago.CARD.name());;
			break;
		case EFECTIVO:
			
			System.out.println(pago.EFECTIVO.name());
			break;
		}
	}
	public String toString() {
		return "Precio Menu: " +precioMenu +" €";
	}

}