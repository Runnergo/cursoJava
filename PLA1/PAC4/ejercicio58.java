// El usuario ingresa palabras repetidamente hasta que repita una de ellas
package PLA1.PAC4;

import java.util.Scanner;
import java.util.ArrayList;

public class ejercicio58 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		ArrayList<String> wordList = new ArrayList<String>();
		
		while (true) {
			System.out.print("Escribe una palabra ");
			String palabra = entrada.nextLine();
			wordList.add(palabra);
			int i = 0;
			for (String wordLista : wordList) {
				if (wordLista.contains(palabra)) {
					i++;
				}
			}
			if (i == 2) {
				System.out.print("Repitio la palabra " + palabra + " dos veces");
				break;
			}
		}
		entrada.close();
	}
}
