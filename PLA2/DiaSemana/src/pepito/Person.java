package pepito;


/* clase Person con los metodos, nombre, edad, peso, altura,
 * indice de masa corporal, mayor o menor de edad y suma de años
 */


import java.util.Scanner;

public class Person {
	private String name;
	private String sex;
	private int age;
	private double weight;
	private double height;
	private String date;
	private int diaNacimiento;
	private int mesNacimiento;
	private int añosNacimiento;
	private String horoscopo;
	private Boolean añoBisiesto;
	private String diaSemana;
	private String[] numerarDiasSemana = { "Domingo", "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado" };

	public static Person person = new Person();

	public static Scanner reader = new Scanner(System.in);

	public static void main(String[] args) {

		// ENTRADA DE DATOS
		System.out.println("\n-----------------------------");
		System.out.println("|Formulario datos personales|");
		System.out.println("-----------------------------\n");

		// READER NAME
		System.out.print("Nombre: ");
		String name = reader.nextLine();
		person.setName(name);

		// READER SEX
		System.out.print("Sexo (h/m): ");
		String sex = reader.nextLine();
		person.setSex(sex);

		// READER AGE
		System.out.print("Edad: ");
		int age = Integer.parseInt(reader.nextLine());
		person.setAge(age);

		// READER WEIGHT
		System.out.print("Peso: ");
		double weight = Double.parseDouble(reader.nextLine());
		person.setWeight(weight);

		// READER HEIGHT
		System.out.print("Altura: ");
		double height = Double.parseDouble(reader.nextLine());
		person.setHeight(height);

		// BIRTH DATE
		System.out.print("Fecha de nacimiento formato dd/mm/aaaa: ");
		String date = reader.nextLine();
		person.setDate(date);

		// METODO PARA PRINTAR RESULTADO
		person.printPerson();

		// METODO QUE SOBREESCRIBE toString (quitar doble barra para usar))
		// person.toString();

		// PREGUNTA AL USUARIO SI QUIERE AÑADIR UN AÑO

		while (true) {
			System.out.print("\nDesea sumar un año (true/false)");
			boolean unAñoMas = Boolean.parseBoolean(reader.nextLine());
			if (unAñoMas == true) {
				System.out.println("Los datos actualizados son los siguientes:\n");
				person.becomeOlder();
				person.printPerson();
				unAñoMas = false;
			} else {
				System.out.println("Gracias y hasta pronto");
				break;
			}
		}
	}

	public String toString() {

		System.out.print("\nNombre: " + person.getName() + "  Edad: " + person.getAge() + " años ");
		person.isAdult();

		System.out.println("\nSexo " + person.getSex() + "    Altura: " + person.getHeight() + " mts  Peso de "
				+ person.getWeight() + " kg");

		person.bodyMassIndex();

		person.horoscopo();
		System.out.println("Fecha de nacimiento: " + person.diaNacimiento + "-" + person.mesNacimiento + "-"
				+ person.añosNacimiento + "      Signo del zodiaco: " + person.horoscopo);

		System.out.print("Año de nacimiento ");
		person.bisiesto();
		System.out.print("          Dia de la semana: ");

		person.diaSemana();
		System.out.print(person.diaSemana);

		return null;
	}

	// SALIDA POR PANTALLA DE FICHA

	public void printPerson() {
		System.out.print("\n================================================================================");
		System.out.print("\nNombre: " + person.getName() + "  Edad: " + person.getAge() + " años ");
		person.isAdult();
		System.out.print("\n¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");
        person.sex();
		System.out.println("\nSexo: "+person.getSex()+"   Altura: " + person.getHeight() + " mts     Peso de " + person.getWeight() + " kg");
		System.out.print("\n¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯\n");

		person.bodyMassIndex();
		System.out.print("\n================================================================================\n");

		person.horoscopo();
		System.out.println("Fecha de nacimiento: " + person.diaNacimiento + "-" + person.mesNacimiento + "-"
				+ person.añosNacimiento + "      Signo del zodiaco: " + person.horoscopo);

		System.out.print("Año de nacimiento ");
		person.bisiesto();
		System.out.print("          Dia de la semana: ");

		person.diaSemana();
		System.out.print(person.diaSemana);
		System.out.print("\n================================================================================\n");
	}

	// get Name
	public String getName() {
		return name;
	}

	// set name
	public void setName(String name) {
		this.name = name;
	}

	// get Sex
	public String getSex() {
		return sex;
	}

	// set Sex
	public void setSex(String sex) {
		this.sex = sex;
	}

	// get age
	public int getAge() {
		return age;
	}

	// set age
	public void setAge(int age) {
		this.age = age;
	}

	// get weight
	public double getWeight() {
		return weight;
	}

	// set weight
	public void setWeight(double weight) {
		this.weight = weight;
	}

	// get height
	public double getHeight() {
		return height;
	}

	// set height
	public void setHeight(double height) {
		this.height = height;
	}

	// AÑADE UN AÑO
	public void becomeOlder() {
		this.age++;
	}

	// MAYOR O MENOR DE EDAD
	public void isAdult() {
		if (this.age < 18) {
			System.out.println(" menor de edad");
		} else {
			System.out.println(" mayor de edad");
		}
	}

	// INDICE DE MASA CORPORAL
	public void bodyMassIndex() {

		double imc = ((double) weight / Math.pow(this.height, 2));
		double weightIdealMin = 18.5 * Math.pow(this.height, 2);
		double weightIdealMax = 24.9 * Math.pow(this.height, 2);
		System.out.println("Su Indice de masa corporal es: " + Math.round(imc * 100) / 100d);
		if (imc < 18.5) {
			System.out.println("Le hace falta ganar peso");
		}
		if (imc >= 18.5 && imc <= 24.9) {
			System.out.print("Esta dentro de lo normal");
		}
		if (imc >= 25 && imc <= 26.9) {
			System.out.print("Tiene sobrepeso leve");
		}
		if (imc >= 27 && imc <= 29.9) {
			System.out.println("Tiene sobrepeso grado 2");
		}
		if (imc >= 30 && imc <= 34.9) {
			System.out.println("Tiene obesidad leve");
		}
		if (imc >= 35 && imc <= 39.9) {
			System.out.println("Tiene obesidad media");
		}
		if (imc >= 40 && imc <= 49.9) {
			System.out.println("Tiene obesidad mórbida");
		}
		if (imc > 50) {
			System.out.println("Tiene obesidad tipo 4");
		}
		System.out
				.println("Su peso ideal esta entre " + Math.round(weightIdealMin) + " y " + Math.round(weightIdealMax));

	}

	// set Date
	public void setDate(String date) {
		this.diaNacimiento = Integer.parseInt(date.substring(0, 2));
		this.mesNacimiento = Integer.parseInt(date.substring(3, 5));
		this.añosNacimiento = Integer.parseInt(date.substring(6, 10));
		this.date = date;

	}

	// HOROSCOPO
	public void horoscopo() {
		if ((this.diaNacimiento >= 21 && this.mesNacimiento == 3)
				|| (this.diaNacimiento <= 19 && this.mesNacimiento == 4)) {
			this.horoscopo = "Aries";
		}
		if ((this.diaNacimiento >= 20 && this.mesNacimiento == 4)
				|| (this.diaNacimiento <= 20 && this.mesNacimiento == 5)) {
			this.horoscopo = "Tauro";
		}
		if ((this.diaNacimiento >= 21 && this.mesNacimiento == 5)
				|| (this.diaNacimiento <= 20 && this.mesNacimiento == 6)) {
			this.horoscopo = "Geminis";
		}
		if ((this.diaNacimiento >= 21 && this.mesNacimiento == 6)
				|| (this.diaNacimiento <= 22 && this.mesNacimiento == 7)) {
			this.horoscopo = "Cancer";
		}
		if ((this.diaNacimiento >= 23 && this.mesNacimiento == 7)
				|| (this.diaNacimiento <= 22 && this.mesNacimiento == 8)) {
			this.horoscopo = "Leo";
		}
		if ((this.diaNacimiento >= 23 && this.mesNacimiento == 8)
				|| (this.diaNacimiento <= 22 && this.mesNacimiento == 9)) {
			this.horoscopo = "Virgo";
		}
		if ((this.diaNacimiento >= 23 && this.mesNacimiento == 9)
				|| (this.diaNacimiento <= 22 && this.mesNacimiento == 10)) {
			this.horoscopo = "Libra";
		}
		if ((this.diaNacimiento >= 23 && this.mesNacimiento == 10)
				|| (this.diaNacimiento <= 21 && this.mesNacimiento == 11)) {
			this.horoscopo = "Escorpio";
		}
		if ((this.diaNacimiento >= 22 && this.mesNacimiento == 11)
				|| (this.diaNacimiento <= 21 && this.mesNacimiento == 12)) {
			this.horoscopo = "Sagitario";
		}
		if ((this.diaNacimiento >= 22 && this.mesNacimiento == 12)
				|| (this.diaNacimiento <= 19 && this.mesNacimiento == 1)) {
			this.horoscopo = "Capricornio";
		}
		if ((this.diaNacimiento >= 20 && this.mesNacimiento == 1)
				|| (this.diaNacimiento <= 18 && this.mesNacimiento == 2)) {
			this.horoscopo = "Acuario";
		}
		if ((this.diaNacimiento >= 19 && this.mesNacimiento == 2)
				|| (this.diaNacimiento <= 20 && this.mesNacimiento == 3)) {
			this.horoscopo = "Piscis";
		}
	}

	// AÑO BISIESTO
	public void bisiesto() {
		if ((this.añosNacimiento % 4 == 0) && (this.añosNacimiento % 100 != 0) || (this.añosNacimiento % 400 == 0)) {
			this.añoBisiesto = true;
			System.out.print("bisiesto");
		} else {
			this.añoBisiesto = false;
			System.out.print(" no bisiesto");
		}
	}

	// DIA DE LA SEMANA DEL DIA DE NACIMIENTO
	public void diaSemana() {

		// coeficiente A
		
		int coeficienteA = 0;
		int coeficienteB = 0;
		int coeficienteC = 0;
		int coeficienteD = 0;
		int cifrasFinalsAño = 0;
		if (this.añosNacimiento >= 1700 && this.añosNacimiento <= 1799) {
			coeficienteA = 5;
		}
		if (this.añosNacimiento >= 1800 && this.añosNacimiento <= 1899) {
			coeficienteA = 3;
		}
		if (this.añosNacimiento >= 1900 && this.añosNacimiento <= 1999) {
			coeficienteA = 1;
		}
		if (this.añosNacimiento >= 2000 && this.añosNacimiento <= 2099) {
			coeficienteA = 0;
		}
		if (this.añosNacimiento >= 2100 && this.añosNacimiento <= 2199) {
			coeficienteA = -2;
		}
		if (this.añosNacimiento >= 2200 && this.añosNacimiento <= 2299) {
			coeficienteA = -4;
		}

		// coeficiente B
		
		cifrasFinalsAño = Integer.parseInt(this.date.substring(8, 10));
		coeficienteB = (cifrasFinalsAño / 4) + cifrasFinalsAño;

		// coeficiente C
		
		if (this.añoBisiesto == true && (this.mesNacimiento == 1 || this.mesNacimiento == 2)) {
			coeficienteC = -1;
		} else {
			coeficienteC = 0;
		}

		// coeficiente D
		
		if (this.mesNacimiento == 1 || this.mesNacimiento == 10) {
			coeficienteD = 6;
		}
		if (this.mesNacimiento == 2 || this.mesNacimiento == 3 || this.mesNacimiento == 11) {
			coeficienteD = 2;
		}
		if (this.mesNacimiento == 4 || this.mesNacimiento == 7) {
			coeficienteD = 5;
		}
		if (this.mesNacimiento == 5) {
			coeficienteD = 0;
		}
		if (this.mesNacimiento == 8) {
			coeficienteD = 1;
		}
		if (this.mesNacimiento == 6) {
			coeficienteD = 3;
		}
		if (this.mesNacimiento == 9 || this.mesNacimiento == 12) {
			coeficienteD = 4;
		}

		// RESULTADO ALGORITMO
		
		int coeficienteResultado = (coeficienteA + coeficienteB + coeficienteC + coeficienteD + person.diaNacimiento)
				% 7;

		this.diaSemana = this.numerarDiasSemana[coeficienteResultado];
	}

    // SEX PERSON	
	public void sex() {
		if (this.sex.equals("h") || this.sex.equals("H")) {
			this.sex = "Hombre";
		} else {
			if (this.sex.equals("m") || this.sex.equals("M")) {
				this.sex = "Mujer";
			}else {
				this.sex="Sin respuesta";
			}

		}
	}
}
