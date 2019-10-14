package PLA1.PAC3;

import java.util.Scanner;

public class ejercicioPerimetros {

	public static Scanner entrada = new Scanner(System.in);
	
	// ENTRADA MENU DE OPCIONES
	public static String seleccionMenu() {
		System.out.println("[Calculo perimetro de un poligono]\n\n Menu opciones\n--------------- ");
		System.out.println("\n  cuadrado\n  rectangulo\n  triangulo\n\n   salir\n\n(Escribe opcion)");
		String poligono = entrada.nextLine();
		return poligono;
	}
	// MAIN--> OPCION DE MENU SELECCIONADA
	public static void main(String[] args) {
		
		String opcion = seleccionMenu();

		if (opcion.equals("cuadrado")) {
			cuadrado();
		} else {
			if (opcion.equals("rectangulo")) {
				rectangulo();
			} else {
				if (opcion.equals("triangulo")) {
					triangulo();
				} else {
					if (opcion.equals("salir")) {
						salir();
					} else {
						error();
					}
				}
			}
		}
	}

	// CALCULO CUADRADO
	public static void cuadrado() {
		System.out.print("inserta tamaño de un lado: ");
		int cuadradoLado = Integer.parseInt(entrada.nextLine());
		resultadoPerimetro(cuadradoLado * 4);
	}

	// CALCULO RECTANGULO
	public static void rectangulo() {
		System.out.print("inserta tamaño de la base: ");
		int rectanguloBase = Integer.parseInt(entrada.nextLine());

		System.out.print("inserta tamaño de la altura: ");
		int rectanguloAltura = Integer.parseInt(entrada.nextLine());

		resultadoPerimetro((rectanguloBase * 2) + (rectanguloAltura * 2));
	}

	// CALCULO TRIANGULO
	public static void triangulo() {
		System.out.print("inserta tamaño de la base: ");
		int trianguloBase = Integer.parseInt(entrada.nextLine());

		System.out.print("inserta tamaño de un lado: ");
		int trianguloLadoUno = Integer.parseInt(entrada.nextLine());

		System.out.print("inserta tamaño del otro lado: ");
		int trianguloLadoDos = Integer.parseInt(entrada.nextLine());

		resultadoPerimetro(trianguloBase + trianguloLadoUno + trianguloLadoDos);
	}

	// IMPRIMIR RESULTADO
	public static void resultadoPerimetro(int resultado) {
		System.out.println("\nEl resultado del perimetro del poligono es " + resultado+"\n");
		seleccionMenu();
	}

	// SALIR
	public static void salir() {
		System.out.println("\nGracias por visitarnos ");
	}

	// ERROR OPCION
	public static void error() {
		System.out.println("\nLo sentimos la opcion no es valida\nvuelva a intentarlo\n\n");
		seleccionMenu();
	}
}
