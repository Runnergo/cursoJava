
public class Person {

	private String nombre;
	private String apellido;
	private int id;
	private Date nacimiento;

	public Person(String nombre, String apellido, int id, Date cumple) {
		this.nombre = nombre.substring(0, 1).toUpperCase().trim()+nombre.substring(1,nombre.length()).trim();
		this.apellido = apellido.substring(0, 1).toUpperCase().trim()+apellido.substring(1,apellido.length()).trim();
		this.id = id;
		this.nacimiento= cumple;
	}
	public Person() {
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getNacimiento() {
		return nacimiento;
	}

	public void setNacimiento(Date nacimiento) {
		this.nacimiento = nacimiento;
	}

	public void incrementarEdad() {
		nacimiento.incrementarEdad();
	}
	@Override
	public String toString() {
		
		return "ID: "+id+" Nombre: "+nombre+ " Apellido: "+apellido+ " Edad: "+nacimiento.getEdad()+"\n";
	}
}
