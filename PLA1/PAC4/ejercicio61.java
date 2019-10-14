// devuelve la cantida de elemntos de una array a traves de un metodo
package PLA1.PAC4;

import java.util.ArrayList;

public class ejercicio61 {
	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();
		list.add("Hallo");
		list.add("Ciao");
		list.add("Hola");
		System.out.println("There are this many items in the list:");
		System.out.println(countItems(list));	
	}
	public static int countItems(ArrayList<String> list) {
		int numeroElementos=list.size();
		return numeroElementos;
	}
}
