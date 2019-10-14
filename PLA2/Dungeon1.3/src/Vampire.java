import java.util.ArrayList;

public class Vampire extends Move {
	private ArrayList vampir;

	public Vampire(String avatar, int length, int heigth) {
		super(avatar, length, heigth);
		super.setX(azar(length-1, 0));
		super.setY(azar(heigth-1, 0));
	}

	@Override
	public void moverPJ() {
		int direccion = azar(3, 0);
		String direc = "";

		if (direccion == 0 && !((super.getX() - 1) < 0)) {
			super.decrementaX();
		}
		if (direccion == 1 && !((super.getX() + 1) > super.getLength() - 1)) {
			super.incrementaX();
		}
		if (direccion == 2 && !((super.getY() + 1) > super.getHeigth() - 1)) {
			super.incrementaY();
		}
		if (direccion == 3 && !((super.getY() - 1) < 0)) {
			super.decrementaY();
		}
	}

	public int azar(int maximo, int minimo) {
		return (int) (Math.random() * (maximo + 1) - minimo) + minimo;
	}

}
