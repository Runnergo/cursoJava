
public class EvenNumbers {

    public static void main(String[] args) {
        // Write your code here
		int contador = 0;
		
		while (true) {

			if (contador == 100) {
				break;

			} else {
				contador = contador + 2;
				System.out.println(contador);
			}
		}
	}
}
