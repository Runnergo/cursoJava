import java.util.Scanner;

public class CreateDate {
	
	private String date;
	private int dia;
	private int mes;
	private int año;

	public CreateDate( ) {		
		this.dia=0;
		this.mes=0;
		this.año=0;
	}
	
	public CreateDate( int años,int mes, int dia) {
		this.dia=dia;
		this.mes=mes;
		this.año=año;
	}
		
	public  void leerFecha(Scanner reader) {

		while (true) {
			System.out.print("Inserta año: ");
			int añoNacimiento = Main.ask(reader);

			System.out.print("Inserta mes: ");
			int mesNacimiento = Main.ask(reader);

			System.out.print("Inserta dia: ");
			int diaNacimiento = Main.ask(reader);

			if (Main.validarFecha(diaNacimiento, mesNacimiento, añoNacimiento) == 1) {
				
				this.dia=diaNacimiento;
				this.mes=mesNacimiento;
				this.año=añoNacimiento;
				System.out.println("Fecha correcta");
				break;
			}else {
				System.out.println("fecha no valida");
			}
		}
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getDiaNacimiento() {
		return dia;
	}

	public void setDiaNacimiento(int diaNacimiento) {
		this.dia = diaNacimiento;
	}

	public int getMesNacimiento() {
		return mes;
	}

	public void setMesNacimiento(int mesNacimiento) {
		this.mes = mesNacimiento;
	}

	public int getAñosNacimiento() {
		return año;
	}

	public void setAñosNacimiento(int añosNacimiento) {
		this.año = añosNacimiento;
	}

}
