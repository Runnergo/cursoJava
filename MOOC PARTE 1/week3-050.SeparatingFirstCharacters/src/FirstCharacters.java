import java.util.Scanner;

public class FirstCharacters {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
		System.out.print("Escribe es tu nombre: ");
		String nombreUsuario = reader.nextLine();
		int longitudNombre = nombreUsuario.length();
		
		if (longitudNombre > 3) {
			char primerCaracter = nombreUsuario.charAt(0);
			char segundoCaracter = nombreUsuario.charAt(1);
			char tercerCaracter = nombreUsuario.charAt(2);
			System.out.print("1. character: " + primerCaracter + "\n");
			System.out.print("2. character: " + segundoCaracter + "\n");
			System.out.print("3. character: " + tercerCaracter + "\n");
		}

		reader.close();
	}

}
