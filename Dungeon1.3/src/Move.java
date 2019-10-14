
public class Move  {

	private int x;
	private int y;
	private String avatar;
	private int length;
	private int heigth;

	public Move(String avatar, int length, int heigth) {
		this.avatar = avatar;
		this.length = length;
		this.heigth = heigth;
	}

	public  void moverPJ(String direccion) {
		
	}
	
	public  void moverPJ() {
		
	}
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
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

	public void incrementaX() {
		this.x++;
	}

	public void decrementaX() {
		this.x--;
	}

	public void incrementaY() {
		this.y++;
	}

	public void decrementaY() {
		this.y--;
	}
}
