// Ordena una lista de nombres y borra el ultimo con un metodo
package PLA1.PAC4;

import java.util.ArrayList;

public class ejercicio62 {
	public static void main(String[] args) {

		ArrayList<String> brothers = new ArrayList<String>();
		brothers.add("Dick");
		brothers.add("Henry");
		brothers.add("Michael");
		brothers.add("Bob");

		System.out.println("brothers:");
		System.out.println(brothers);

		// sorting brothers
		brothers.sort(null);

		// removing the last item
		removeLast(brothers);

		System.out.println(brothers);
	}
	private static String removeLast(ArrayList<String> list) {
		int lista = list.size();
		return list.remove(lista-1);
	}
}
