import java.util.Scanner;

public class ReversingName {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
		System.out.print("Escribe es tu nombre: ");
		String nombreUsuario = reader.nextLine();
		
		int longitudNombre = nombreUsuario.length();
		int contadorAtras=longitudNombre;
		String caracter="";
		
		for (int i=0; i<longitudNombre; i++) {
			contadorAtras=contadorAtras-1;
			caracter = caracter + nombreUsuario.charAt(contadorAtras);			
		}
		System.out.print("El orden inverso es " + caracter);
		reader.close();
	}
}
