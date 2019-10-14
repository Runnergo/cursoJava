
public class DiaSemana {

	private CreateDate createDate;
	private String diaSemana;
	private String[] numerarDiasSemana = { "Domingo", "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado" };

	public DiaSemana(CreateDate date) {
		this.createDate = date;
	}

	// DIA DE LA SEMANA DEL DIA DE NACIMIENTO
	public String diaSemana() {

		// coeficiente A

		int coeficienteA = 0;
		int coeficienteB = 0;
		int coeficienteC = 0;
		int coeficienteD = 0;
		int cifrasFinalsA�o = 0;
		if (createDate.getA�osNacimiento() >= 1700 && createDate.getA�osNacimiento() <= 1799) {
			coeficienteA = 5;
		}
		if (createDate.getA�osNacimiento() >= 1800 && createDate.getA�osNacimiento() <= 1899) {
			coeficienteA = 3;
		}
		if (createDate.getA�osNacimiento() >= 1900 && createDate.getA�osNacimiento() <= 1999) {
			coeficienteA = 1;
		}
		if (createDate.getA�osNacimiento() >= 2000 && createDate.getA�osNacimiento() <= 2099) {
			coeficienteA = 0;
		}
		if (createDate.getA�osNacimiento() >= 2100 && createDate.getA�osNacimiento() <= 2199) {
			coeficienteA = -2;
		}
		if (createDate.getA�osNacimiento() >= 2200 && createDate.getA�osNacimiento() <= 2299) {
			coeficienteA = -4;
		}

		// coeficiente B
		String cifrasTemp = Integer.toString(createDate.getA�osNacimiento()).substring(2, 4);

		cifrasFinalsA�o = Integer.parseInt(cifrasTemp);
		coeficienteB = (cifrasFinalsA�o / 4) + cifrasFinalsA�o;

		// coeficiente C

		if (Main.a�oBisiesto(createDate.getA�osNacimiento()) == 1
				&& (createDate.getMesNacimiento() == 1 || createDate.getMesNacimiento() == 2)) {
			coeficienteC = -1;
		} else {
			coeficienteC = 0;
		}

		// coeficiente D

		if (createDate.getMesNacimiento() == 1 || createDate.getMesNacimiento() == 10) {
			coeficienteD = 6;
		}
		if (createDate.getMesNacimiento() == 2 || createDate.getMesNacimiento() == 3
				|| createDate.getMesNacimiento() == 11) {
			coeficienteD = 2;
		}
		if (createDate.getMesNacimiento() == 4 || createDate.getMesNacimiento() == 7) {
			coeficienteD = 5;
		}
		if (createDate.getMesNacimiento() == 5) {
			coeficienteD = 0;
		}
		if (createDate.getMesNacimiento() == 8) {
			coeficienteD = 1;
		}
		if (createDate.getMesNacimiento() == 6) {
			coeficienteD = 3;
		}
		if (createDate.getMesNacimiento() == 9 || createDate.getMesNacimiento() == 12) {
			coeficienteD = 4;
		}

		// RESULTADO ALGORITMO

		int coeficienteResultado = (coeficienteA + coeficienteB + coeficienteC + coeficienteD
				+ createDate.getDiaNacimiento()) % 7;

		this.diaSemana = this.numerarDiasSemana[coeficienteResultado];
		return diaSemana;
	}

}
