import java.util.Scanner;


public class LastCharacter {


    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
 		System.out.print("Cual es tu nombre ?");
		String nombreUsuario= reader.nextLine();
		lastCharacter(nombreUsuario);
		char ultimoCaracter=lastCharacter(nombreUsuario);
		System.out.println("La ltima letra de tu nombre "+nombreUsuario+" es "+ultimoCaracter);
		reader.close();
	}
	public static char lastCharacter(String text) {
		int ultimoCaracter=text.length();
		return text.charAt(ultimoCaracter-1);
	}
}