import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.Date;

public class Main {

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);
		CreateDate date = new CreateDate();
		DiaSemana diaSemana = new DiaSemana(date);

		while (true) {
			try {
				date.leerFecha(reader);

				System.out.println("Ese dia fue " + diaSemana.diaSemana());
				System.out.println("Hay "
						+ calcularDias(date.getA�osNacimiento(), date.getMesNacimiento(), date.getDiaNacimiento())
						+ " dias de diferencia con respecto al (1978-1-1)");
				break;
			} catch (Exception e) {
				errorEntrada();
			}
		}

	}

	public static int calcularDias(int a�o, int mes, int dia) {
		Date fecha1 = new Date(1978, 1, 1);
		Date fecha2 = new Date(a�o, mes, dia);
		long startTime = fecha1.getTime();
		long endTime = fecha2.getTime();
		long diffTime = endTime - startTime;
		return (int) TimeUnit.DAYS.convert(diffTime, TimeUnit.MILLISECONDS);
	}

	public static int validarFecha(int dia, int mes, int a�o) {
		int diasTemp = 0;
		if (a�o >= 1978) {
			if (mes > 0 || mes < 13 && dia > 0) {
				if ((mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) && dia <= 31) {
					return 1;
				}
				if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia <= 30) {
					return 1;
				}

				if (a�oBisiesto(a�o) == 1) {
					diasTemp = 29;
				} else {
					diasTemp = 28;
				}
				if (mes == 2 & dia <= diasTemp) {
					return 1;
				} else {
					if (dia == 29) {
						System.out.println("El a�o no es bisiesto, solo hay 28 dias en Febrero");
					}
				}
			}
		}
		return 0;
	}

	public static int a�oBisiesto(int a�os) {
		if ((a�os % 4 == 0) && (a�os % 100 != 0) || (a�os % 400 == 0)) {
			return 1;
		} else {
			return 0;
		}
	}

	public static int ask(Scanner reader) {
		return Integer.parseInt(reader.nextLine());
	}

	public static void errorEntrada() {
		System.out.println("Entrada no valida");
	}

}
