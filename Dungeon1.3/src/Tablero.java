
public class Tablero {
	
	
	private String draw;
	private int length;
	private int heigth;
	private int cantVampiros;
	private String[][] tablero;

	public Tablero(String draw, int length, int heigth, int cantVampiros) {
		this.draw = draw;
		this.length = length;
		this.heigth = heigth;
		this.tablero = new String[length][heigth];
	

		this.cantVampiros = cantVampiros;
	}
	

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getHeigth() {
		return heigth;
	}

	public void setHeigth(int heigth) {
		this.heigth = heigth;
	}

	public void crearTablero() {
		for (int y = 0; y < this.heigth; y++) {
			for (int x = 0; x < this.length; x++) {
				this.tablero[x][y] = draw;
			}
		}
	}
	
	public void setposicion(int x,int y, String charPj) {
		tablero[x][y]=charPj;
	}
	public String getposicion(int x,int y) {
		return tablero[x][y];
	}

	public void printarTablero() {
		for (int y = 0; y < this.heigth; y++) {
			for (int x = 0; x < this.length; x++) {
				System.out.print(this.tablero[x][y]);
			}
			System.out.println();
		}
	}

	public int posicionarTablero(int x, int y, String charA) {


		if (charA == "*" && !estaFueraTablero(x, y)) {
			tablero[x][y] = charA;			
		}
		if (charA == "@" && !estaFueraTablero(x, y)) {
			System.out.print("@ " + x + " " + y + "\n");
			tablero[x][y] = charA;		
		}
		if (charA == "V" && !estaFueraTablero(x, y)) {
			System.out.print("V " + x + " " + y + "\n");
			tablero[x][y] = charA;		
		}
		return 0;
	}

	public boolean estaFueraTablero(int x, int y) {

		if (x < 0 || x > (length - 1) || y < 0 || y > (heigth - 1)) {
			return true;
		}
		return false;
	}
}
