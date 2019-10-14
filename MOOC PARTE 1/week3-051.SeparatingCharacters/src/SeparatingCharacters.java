
import java.util.Scanner;

public class SeparatingCharacters {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
 		System.out.print("Escribe es tu nombre: ");
		String nombreUsuario = reader.nextLine();
		int longitudNombre = nombreUsuario.length();
		
		for (int i=0; i< longitudNombre; i++) {
			char Caracter = nombreUsuario.charAt(i);	
			System.out.print((i+1)+". character: " + Caracter + "\n");			
		}
		reader.close();
	}
}
