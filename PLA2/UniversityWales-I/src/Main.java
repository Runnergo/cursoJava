import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {

		// ModoPago efectivo =new Efectivo(Pago.EFECTIVO, 10,1500);
		// Pagar pagarEfectivo=new Efectivo(1000);
		// ModoPago card = new ModoPago(Pago.EFECTIVO,10);
		
		
		Pagar pagarCard = new Card(1500);

		Person person = new Student("pepe", "gordillo", genID(20000), genEdad(2003, 1959), genNotas(), genPet(),
				genPiso(), pagarCard);

		Student estudiante = (Student) person;

		MenuComidas menu1 = new MenuComidas("ensalada", "bistec", "helado");
		Restaurante menu = new Restaurante(menu1, 10);

		pagar(pagarCard, menu);
		System.out.println();
		pagar(pagarCard, menu);

		// VACUNAR
		Vaccine vacuna = new Vaccine("moquillo", genEdad(2019, 2004), azar(5, 1));
		Vaccine vacuna2 = new Vaccine("rabia", genEdad(2019, 2004), azar(5, 1));

		System.out.println("==========================================================");
		System.out.println(estudiante.getAnimal().toString());
		System.out.println("----------------------------------------------------------");
		estudiante.getAnimal().addVacuna(vacuna);
		estudiante.getAnimal().addVacuna(vacuna2);

		estudiante.getAnimal().printVacunas();
		System.out.println();

		esNecesarioVacuna(vacuna);
		esNecesarioVacuna(vacuna2);

		// ID USER PASS EDAD (MAYOR/MENOR/INCREMENTO)
		System.out.println("==========================================================");
		datosUser(estudiante);

		System.out.println("----------------------------------------------------------");
		System.out.println("incrementamos un año");
		System.out.println("----------------------------------------------------------");

		person.incrementarEdad();
		System.out.println(estudiante);
		System.out.println("----------------------------------------------------------");

		System.out.println(estudiante.getNotas().toString(estudiante));

		// APARATAMENTO
		System.out.println("==========================================================");
		Apartament piso2 = genPiso(); // PISO PARA COMPARAR
		compararPiso(estudiante.getPiso(), piso2);

	}

	// Devuelve un objeto Date con fecha aleatoria
	// que contiene entre parametros el rango de fechas.
	public static Date genEdad(int añoMax, int añoMin) {

		int cantDiasMes = 0;
		int año = azar(añoMax, añoMin);
		int mes = azar(12, 1);

		if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
			cantDiasMes = 31;
			if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
				cantDiasMes = 30;
			}
			if ((año % 4 == 0) && ((año % 100 != 0) || (año % 400 == 0))) {
				if (mes == 2) {
					cantDiasMes = 29;
				} else
					cantDiasMes = 28;
			}
		}
		int dia = azar(cantDiasMes, 1);

		Date edad = new Date(año, mes, dia);

		return edad;
	}

	// Avisa de si es necesario renovar la vacuna
	public static void esNecesarioVacuna(Vaccine vacuna) {
		if (vacuna.getFechaVacunado().earlier(vacuna.getRenovarVacuna())) {

			System.out.println("Necesitas renovar la vacuna de: " + vacuna.getNameVacuna());
		} else {

			System.out.println("No necesita ser vacunado de: " + vacuna.getNameVacuna());
		}
	}

	// Printa si es mayor o menor de edad
	public static void mayorOMenorEdad(Person person) {
		if (person.getNacimiento().mayorDeEdad()) {
			System.out.println("Eres mayor de edad");
		} else {
			System.out.println("Eres menor de edad");
		}
	}

	// Printa listado de datos del usuario
	public static void datosUser(Student estudiante) {
		System.out.println("\nUser: " + estudiante.getUserName());
		System.out.println("Password: " + estudiante.getPassword());
		System.out.println(estudiante);
		mayorOMenorEdad(estudiante);
	}

	// Devuelve un objeto Subject con las notas aleatorias.
	public static Subject genNotas() {
		int mates = azar(10, 1);
		int ingles = azar(10, 1);
		int programacion = azar(10, 1);
		int naturales = azar(10, 1);

		Subject notas = new Subject(mates, ingles, programacion, naturales);
		return notas;
	}

	// Genera un numero id con un valor maximo fijado por parametro
	public static int genID(int maxID) {
		return azar(maxID, 1);
	}

	// Devuelve un objeto Mascota aleatorio con Nombre,
	// tipo mascota y fecha de nacimiento.
	public static Mascota genPet() {
		String name[] = { "Rodolfo", "Bruto", "Balto", "Duke", "Odin", "Thor", "Athos", "Trasto", "Leia", "casper" };
		String tipoAnimal[] = { "Perro", "Gato", "Serpiente", "Pez", "Hamster", "Conejo", "Loro", "Raton" };
		String nameMascota = name[azar(9, 0)];
		String animal = tipoAnimal[azar(7, 0)];
		Mascota pet1 = new Mascota(nameMascota, animal, genEdad(2019, 2007));
		return pet1;
	}

	// Devuelve un objeto Apartament aleatorio con numero de habitaciones,
	// metros cuadrados de este y su precio total.
	public static Apartament genPiso() {
		int numeroHabitaciones = azar(5, 1);
		int metrosCuadradosPorHabitacion = azar(25, 8);
		int metrosTotal = metrosCuadradosPorHabitacion * numeroHabitaciones;
		int precioMetrocuadrado = azar(7000, 2000);
		Apartament piso = new Apartament(numeroHabitaciones, metrosTotal, precioMetrocuadrado);
		return piso;
	}

	public static void compararPiso(Apartament piso1, Apartament piso2) {
		System.out.println("Comparacion de actual piso con propuesta nueva\n");
		System.out.println("Rooms| m2 |PVP m2 |PVP Total");
		System.out.println("------------------------------");
		System.out.println(piso1);
		System.out.println(piso2);
		System.out.println("\nDiferencia: " + piso1.priceDifference(piso2) + " €");

		if (piso1.larger(piso2)) {
			System.out.println("Tu piso actual es mas grande");

		} else {
			System.out.println("Tu piso actual es mas pequeño");
		}

	}

	public static Pagar modoPago(double pago) {
		int modo = azar(2, 0);
		if (modo == 1) {
			System.out.println("El pago se realizara en efectivo");
			Pagar pagarEfectivo = new Efectivo(1000);
			return pagarEfectivo;
		}
		System.out.println("El pago se realizara con tarjeta");
		Pagar pagarCard = new Card(1500);

		return pagarCard;

	}

	public static void pagar(Pagar pagar, Restaurante menu) {

		System.out.println("Saldo actual estudiante: " + pagar.getSaldo());
		pagar.payMenu(menu.getPrecio());
		System.out.println("Balance Restaurante: " + menu.getBalance());
		menu.pagar(menu.getPrecio());

		System.out.println("Saldo despues del pago: " + pagar.getSaldo());
		System.out.println("Balance despues pago del Restaurante: " + menu.getBalance());
	}

	// Genera numeros aleatorios entre dos cifras.
	public static int azar(int a, int b) {
		return (int) (Math.random() * (a - b)) + b;
	}

}
