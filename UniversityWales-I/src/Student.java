
public class Student extends Person {

	private String userName;
	private int Password;
	private Subject notas;
	private Mascota animal;
	private Apartament piso;
	private Pagar pagar;
	

	public Student(String nombre, String apellido, int id, Date cumple,Subject notas,Mascota animal, Apartament piso,Pagar pagar) {
		super(nombre, apellido, id, cumple);
		this.userName = createUserName();
		this.Password= createPassword();
		this.notas=notas;
		this.animal=animal;
		this.piso=piso;
		this.pagar=pagar;
		
	}
	public Student(ModoPago card, ModoPago efectivo) {
		
	}
	

	public Apartament getPiso() {
		return piso;
	}

	public void setPiso(Apartament piso) {
		this.piso = piso;
	}

	public Mascota getAnimal() {
		return animal;
	}

	public void setAnimal(Mascota animal) {
		this.animal = animal;
	}

	public Subject getNotas() {
		return notas;
	}

	public void setNotas(Subject notas) {
		this.notas = notas;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	
	public int getPassword() {
		return Password;
	}

	public void setPassword(int password) {
		Password = password;
	}
	

	public String createUserName() {

		String user = super.getNombre().substring(0, 1) + "_" + super.getApellido().substring(0, 1);
		return user.toUpperCase();
	}

	public int createPassword() {
		int temp = 0;
		for (int i = 0; i < super.getNombre().length(); i++) {
			temp += super.getNombre().codePointAt(i) + super.getApellido().codePointAt(i);
		}
		String pass = Integer.toString(temp * super.getId());
		int password = Integer.parseInt(pass.substring(0, 4));

		return password;
	}
	public String toString() {
	
		return super.toString()+"Estudiante del Centro de enseñanza CIFO\n";
	}

}
