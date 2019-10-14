import java.util.Scanner;

public class Dungeon {
	private Scanner reader;
	private ControleMove controleMove;
	private Tablero tablero;
	private int vidas;
	private int cantVampiros;

	public Dungeon(int lenght, int height, int cantVampiros, int vidas) {

		this.reader = new Scanner(System.in);
		this.tablero = new Tablero("*", lenght, height, cantVampiros);
		this.vidas = vidas;
		this.cantVampiros = cantVampiros;
		this.controleMove = new ControleMove(lenght, height, cantVampiros, tablero);

	}

	public void inputUser() {

		tablero.crearTablero();
		tablero.setposicion(0, 0, "@");

		controleMove.addVampire(tablero.getLength(), tablero.getHeigth());
		controleMove.addPlayer(tablero.getLength(), tablero.getHeigth());
		
		controleMove.ponerYQuitarPJs("V");
		String pj = "";		
		tablero.printarTablero();
		
		while (true) {
			System.out.println("Vidas: " + vidas);
			String input = reader.nextLine();

			for (int i = 0; i < input.length(); i++) {

				pj = (Character.toString(input.charAt(i)));
				controleMove.ponerYQuitarPJs(pj);
			}
			vidas--;
			tablero.printarTablero();
			if (controleMove.getNumVampires()==0) {
				System.out.println("\nHAS GANADO!");
				System.exit(0);
			}

			if (vidas == 0) {
				System.out.println("HAS PERDIDO!");
				System.out.println("GAME OVER!");
				break;
			}
		}
	}
}
