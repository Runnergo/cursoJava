import java.time.LocalDate;
public class Vaccine {

	private Date fechaVacunado;
	private int renovarVacuna;
	private String nameVacuna;

	public Vaccine(String nameVacuna, Date fechaVacunado, int renovarVacuna) {
		this.fechaVacunado = fechaVacunado;
		this.nameVacuna = nameVacuna;
		this.renovarVacuna = renovarVacuna;

	}

	public Date getFechaVacunado() {
		return fechaVacunado;
	}

	public void setFechaVacunado(Date fechaVacunado) {
		this.fechaVacunado = fechaVacunado;
	}

	public int getRenovarVacuna() {
		return renovarVacuna;
	}

	public void setRenovarVacuna(int renovarVacuna) {
		this.renovarVacuna = renovarVacuna;
	}

	public String getNameVacuna() {
		return nameVacuna;
	}

	public void setNameVacuna(String nameVacuna) {
		this.nameVacuna = nameVacuna;
	}

	public String toString() {
		return "La vacuna contra el " + nameVacuna + " se puso en la fecha " + fechaVacunado.toString() + "\nDura "
				+ renovarVacuna + " años hasta el dia " + (fechaVacunado.getAño() + renovarVacuna) + "/" + fechaVacunado.getMes() + "/"
				+ fechaVacunado.getDia()+" su duracion es de "+renovarVacuna+ "\n";
	}

}
