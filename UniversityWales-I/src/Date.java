import java.time.LocalDate;
import java.time.Period;

public class Date {
	private int dia;
	private int mes;
	private int año;
	LocalDate fechaActual;
	Period intervalo;
	private int edad;

	public Date(int año, int mes, int dia) {
		this.dia = dia;
		this.mes = mes;
		this.año = año;
		this.fechaActual = LocalDate.now();
		this.intervalo = Period.between(LocalDate.of(año, mes, dia), fechaActual);
		this.edad = intervalo.getYears();
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
	}

	public LocalDate getFechaActual() {
		return fechaActual;
	}

	public void setFechaActual(LocalDate fechaActual) {
		this.fechaActual = fechaActual;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public Period getIntervalo() {
		return intervalo;
	}

	public void setIntervalo(Period intervalo) {
		this.intervalo = intervalo;
	}

	public boolean mayorDeEdad() {
		if (edad < 18) {
			return false;
		}
		return true;
	}

	public boolean cumpleaños() {

		if (this.dia == fechaActual.getDayOfMonth() && this.mes == fechaActual.getMonthValue()) {
			return true;
		}
		return false;
	}

	public void incrementarEdad() {
		edad++;
	}

	public String toString() {
		return año + "-" + mes + "-" +dia;
	}

	public String proximaVacuna(int añosDuracionVacuna) {
		return (año+añosDuracionVacuna) + " años, " + intervalo.getMonths() + " meses y " + intervalo.getDays() + " dias";
	}

	public boolean earlier(int duracionVacuna) {

        if ( this.año+ duracionVacuna < fechaActual.getYear() ) {    	   
            return true;
        }
             if ( this.año+ duracionVacuna == fechaActual.getYear() && this.mes <fechaActual.getMonthValue() ) {     
            return true;
        }
        if ( this.año+ duracionVacuna == fechaActual.getYear() && this.mes == fechaActual.getMonthValue() &&
                this.dia < fechaActual.getDayOfMonth()) {       
            return true;
        }
        return false;
	}
	
}
