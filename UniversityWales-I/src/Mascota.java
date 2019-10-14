import java.util.ArrayList;
import java.util.ArrayList;

public class Mascota {

	private String nameMascota;
	private String tipoAnimal;
	private Date nacimiento;
	private ArrayList<Vaccine> vacunas;

	public Mascota(String name, String tipoAnimal, Date nacimiento) {

		this.nameMascota = name;
		this.tipoAnimal = tipoAnimal;
		this.nacimiento = nacimiento;
		this.vacunas = new ArrayList<Vaccine>();
	}

	public String getNameMascota() {
		return nameMascota;
	}

	public void setNameMascota(String name) {
		this.nameMascota = name;
	}

	public String getTipoAnimal() {
		return tipoAnimal;
	}

	public void setTipoAnimal(String tipoAnimal) {
		this.tipoAnimal = tipoAnimal;
	}

	public Date getNacimiento() {
		return nacimiento;
	}

	public void setNacimiento(Date nacimiento) {
		this.nacimiento = nacimiento;
	}

	public void addVacuna(Vaccine vacuna) {

		vacunas.add(vacuna);
	}


	public void printVacunas() {
		System.out.println("Esta vacunado de:");
		for (Vaccine list : vacunas) {
			System.out.println(
					"Nombre: " + list.getNameVacuna() + " (Fecha de vacunacion: " + list.getFechaVacunado() + " // Años de duracion: "+ list.getRenovarVacuna() +")" ) ;
		}
	}

	public String toString() {
		return "Mi " + tipoAnimal + " se llama " + nameMascota + " nacio el " + nacimiento + " tiene " + nacimiento.getEdad()
				+ " años";
	}

}
