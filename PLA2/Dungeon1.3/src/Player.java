
public class Player extends Move {

	public Player(String avatar, int length, int heigth) {
		super(avatar, length, heigth);
		super.setX(0);
		super.setY(0);
	}

	@Override
	public void  moverPJ(String direccion) {

		if (direccion.equalsIgnoreCase("a") && !(super.getX()-1 < 0)) {
			super.decrementaX();
		}
		if (direccion.equalsIgnoreCase("d") && !(super.getX()+1 > super.getLength()-1)) {
			super.incrementaX();
		}
		if (direccion.equalsIgnoreCase("s") && !(super.getY()+1 >super.getHeigth()-1)) {
			super.incrementaY();
		}
		if (direccion.equalsIgnoreCase("w") && !(super.getY()-1 < 0)) {
			super.decrementaY();
		}
	}

}
