import java.io.Closeable;
import java.util.ArrayList;

public class ControleMove {

	private Tablero tablero;
	private ArrayList<Move> listaPJs;
	private int numVampires;

	public ControleMove(int length, int heigth, int numVampires, Tablero tablero) {
		this.listaPJs = new ArrayList<Move>();
		this.numVampires = numVampires;
		this.tablero = tablero;

	}

	public void addPlayer(int length, int heigth) {
		Player player = new Player("@", length, heigth);
		listaPJs.add(player);
	}

	public void addVampire(int length, int heigth) {
		int i = 0;

		while (i < this.numVampires) {
			Vampire vampire = new Vampire("V", length, heigth);
			if (!(tablero.getposicion(vampire.getX(),vampire.getY())=="V")){
			
				listaPJs.add(vampire);
				i++;
			}
		}
	}
	

	public int getNumVampires() {
		return numVampires;
	}

	public void setNumVampires(int numVampires) {
		this.numVampires = numVampires;
	}

	public void ponerYQuitarPJs(String direcccion) {
		for (Move lista : listaPJs) {
			if (tablero.posicionarTablero(lista.getX(), lista.getY(), "*")==0) {
							
			if (lista.getAvatar() == "@") {
				lista.moverPJ(direcccion);
				if (colision(lista)) {
			
					System.out.println("muerto");
					matarVampiro(lista.getX(),lista.getY());
					tablero.setposicion(lista.getX(),lista.getY(),"@");
				
					return;
				}
			}
			if (lista.getAvatar() == "V") {
				lista.moverPJ();
				if (colisionV(lista)) {
					
					System.out.println("muerto");
					matarVampiro(lista.getX(),lista.getY());
					tablero.setposicion(lista.getX(),lista.getY(),"@");
					
					return;
				}
			}
			}else {
				listaPJs.remove(lista);
				System.out.println("muerto");
			}
			tablero.posicionarTablero(lista.getX(), lista.getY(), lista.getAvatar());
			
		}

	}
	public boolean colision(Move posicion) {
		if (tablero.getposicion(posicion.getX(),posicion.getY())=="V") {
			
			return true;
		}
		return false;
	}
	public boolean colisionV(Move posicion) {
		if (tablero.getposicion(posicion.getX(),posicion.getY())=="@") {
			
			return true;
		}
		return false;
	}
	public void matarVampiro(int x, int y) {
		int indiceRemove=0;
		int cont=0;
		for (Move lista : listaPJs) {
			if (lista.getX()==x && lista.getY()==y && lista.getAvatar()=="V"){
				indiceRemove=listaPJs.indexOf(lista);
				cont=1;
			}
		}
		if (cont==1) {
			listaPJs.remove(indiceRemove);
			numVampires--;
		}

	}
}
