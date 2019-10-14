
import java.util.Scanner;

public class LowerLimitAndUpperLimit {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // write your code here
		// asignar numero de inicio cuenta

		System.out.print("Indica numero inicial de la cuenta ");
		int numeroInicialCuenta = Integer.parseInt(reader.nextLine());

		// asignar numero final cuenta

		System.out.print("Indica numero final de la cuenta ");
		int numeroFinalCuenta = Integer.parseInt(reader.nextLine());

		// compara si el numero inicial es mayor que el final y de lo contrario empieza
		// contar

		if (numeroInicialCuenta <= numeroFinalCuenta) {

			while (numeroInicialCuenta <= numeroFinalCuenta) {

				System.out.println(numeroInicialCuenta);
				numeroInicialCuenta++;
			}

		} else {
			System.out.println("error, el número inicial es mayor que el número final");
		}
		reader.close();
	}

}