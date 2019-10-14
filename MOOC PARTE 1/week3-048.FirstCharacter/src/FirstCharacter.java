import java.util.Scanner;

public class FirstCharacter {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
  		System.out.print("Cual es tu nombre ?");
		String nombreUsuario= reader.nextLine();
		firstCharacter(nombreUsuario);
		char primerCaracter=firstCharacter(nombreUsuario);
		System.out.println("La primera letra de tu nombre "+nombreUsuario+" es "+primerCaracter);
		reader.close();
	}
	public static char firstCharacter(String text) {
		
		return text.charAt(0);
	}
}
