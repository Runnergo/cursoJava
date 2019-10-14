import java.util.Scanner;

public class CreateDate {
	
	private String date;
	private int dia;
	private int mes;
	private int a�o;

	public CreateDate( ) {		
		this.dia=0;
		this.mes=0;
		this.a�o=0;
	}
	
	public CreateDate( int a�os,int mes, int dia) {
		this.dia=dia;
		this.mes=mes;
		this.a�o=a�o;
	}
		
	public  void leerFecha(Scanner reader) {

		while (true) {
			System.out.print("Inserta a�o: ");
			int a�oNacimiento = Main.ask(reader);

			System.out.print("Inserta mes: ");
			int mesNacimiento = Main.ask(reader);

			System.out.print("Inserta dia: ");
			int diaNacimiento = Main.ask(reader);

			if (Main.validarFecha(diaNacimiento, mesNacimiento, a�oNacimiento) == 1) {
				
				this.dia=diaNacimiento;
				this.mes=mesNacimiento;
				this.a�o=a�oNacimiento;
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

	public int getA�osNacimiento() {
		return a�o;
	}

	public void setA�osNacimiento(int a�osNacimiento) {
		this.a�o = a�osNacimiento;
	}

}
