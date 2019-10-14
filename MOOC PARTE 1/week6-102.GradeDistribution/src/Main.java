
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calificacion puntuacion = new Calificacion();
        System.out.println("Type exam scores, -1 completes:");
        int points = 0;
        int i=0;
        while (true) {

            points = Integer.parseInt(scanner.nextLine());
            if (points == -1) {
                puntuacion.representacionCalificaciones();
                break;
            }
            if (points >= 0 && points <= 60) {
                puntuacion.seleccionPorPuntuacion(points);
                i++;
            }
        }

        System.out.println("Acceptance percentage: " + puntuacion.porcentaje(i));
    }
}
