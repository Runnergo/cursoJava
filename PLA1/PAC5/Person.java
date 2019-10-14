/* clase Person con los metodos, nombre, edad, peso, altura,
 * indice de masa corporal, mayor o menor de edad y suma de años
 */
package PLA1.PAC5;

import java.util.Scanner;

public class Person {
	public static Person person = new Person();
	public static Scanner reader = new Scanner(System.in);

	public static void main(String[] args) {
        
		// ENTRADA DE DATOS
		System.out.println("Formulario datos personales");

		System.out.print("Nombre: ");
		String name = reader.nextLine();
		person.setName(name);

		System.out.print("Edad: ");
		int age = Integer.parseInt(reader.nextLine());
		person.setAge(age);

		System.out.print("Peso: ");
		double weight = Double.parseDouble(reader.nextLine());
		person.setWeight(weight);

		System.out.print("Altura: ");
		double height = Double.parseDouble(reader.nextLine());
		person.setHeight(height);

		person.printPerson();
		
		// PREGUNTA AL USUARIO SI QUIERE AÑADIR UN AÑO
		System.out.print("\nDesea sumar un año (true/false)");
		boolean unAñoMas = Boolean.parseBoolean(reader.nextLine());
		while (true) {
			if (unAñoMas == true) {
				System.out.println("Los datos actualizados son los siguientes:\n");
				person.becomeOlder();
				person.printPerson();
			} else {
				System.out.println("Gracias y hasta pronto");
				break;
			}
		}

		System.out.println("Gracias y hasta pronto");
	}
	// SALIDA POR PANTALLA DE FICHA
	public void printPerson() {

		System.out.print("Nombre de la persona " + person.getName() + " con " + person.getAge() + " años ");
		person.isAdult();
		System.out.println(
				"Para una altura de " + person.getHeight() + " mts y un peso de " + person.getWeight() + " kg");
		person.bodyMassIndex();

	}

	private String name;
	private int age;
	private double weight;
	private double height;

	// get name
	public String getName() {
		return name;
	}

	// set name
	public void setName(String name) {
		this.name = name;
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
			System.out.println(", menor de edad,");
		}
		System.out.println(", mayor de edad,");

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
			System.out.print("Tiene sobrepeso grado 1");
		}
		if (imc >= 27 && imc <= 29.9) {
			System.out.println("Tiene sobrepeso grado 2");
		}
		if (imc >= 30 && imc <= 34.9) {
			System.out.println("Tiene obesidad tipo 1");
		}
		if (imc >= 35 && imc <= 39.9) {
			System.out.println("Tiene obesidad tipo 2");
		}
		if (imc >= 40 && imc <= 49.9) {
			System.out.println("Tiene obesidad tipo 3");
		}
		if (imc > 50) {
			System.out.println("Tiene obesidad tipo 4");
		}
		System.out
				.println("Su peso ideal esta entre " + Math.round(weightIdealMin) + " y " + Math.round(weightIdealMax));

	}

}