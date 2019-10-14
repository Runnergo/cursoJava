
import java.util.Scanner;

public class LengthOfName {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // call your method from here
		System.out.print("cual es tu nombre ?");
		String nombreUsuario= reader.nextLine();
		calculateCharacters(nombreUsuario);
		int len=calculateCharacters(nombreUsuario);
		System.out.println("Tu nombre "+nombreUsuario+" tiene "+len+" caracteres");
		reader.close();
	}
	public static int calculateCharacters(String text) {
		
		return text.length();
	}
}
