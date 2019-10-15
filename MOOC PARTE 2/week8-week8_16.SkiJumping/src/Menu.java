
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Menu extends Score {

    private Jumper distanciaSalto;
    private Scanner reader;
    private List<Jumper> jumpers;
    private Score votos;
    private int ronda;

    public Menu(Scanner reader) {

        this.votos = votos;
        this.reader = reader;
        this.jumpers = new ArrayList<Jumper>();
        this.ronda = 0;

    }

    public void input(Scanner reader) {
        System.out.println("Kumpula ski jumping week\n");
        System.out.println("Write the names of the participants "
                + "one at a time; an empty string"
                + " brings you to the jumping phase.");
        while (true) {
            System.out.print("  Participant name: ");
            String ask = Utiles.ask(reader);
            if (ask.equals("")) {
                saltar();
                break;
            } else {
                Jumper jumper = new Jumper(ask, distanciaSalto, 0, 0);
                jumpers.add(jumper);
            }
        }
    }

    public void saltar() {

        System.out.println("\nThe tournament begins!");
        while (true) {
            System.out.print("\nWrite \"jump\" to jump; otherwise you quit: ");
            String ask = Utiles.ask(reader);
            if (ask.equalsIgnoreCase("jump")) {
                ronda++;
                System.out.println("\nRound " + ronda + "\n");

                votosOptenidos();

            }
            if (ask.equalsIgnoreCase("quit")) {
                quit();
                break;
            }
        }
    }

    public void listJumpers() {
        Collections.sort(jumpers);
        System.out.println("Jumping order:");
        for (Jumper list : jumpers) {
            System.out.println("  " + (jumpers.indexOf(list) + 1) + ". " + list.getName() + " (" + list.getPoints() + " points)");
        }

    }

    public void votosOptenidos() {
        Collections.sort(jumpers);
        listJumpers();
        System.out.println("\nResults of round " + ronda);

        for (Jumper list : jumpers) {
            int salto = 0;
            int sumaSaltos = 0;
            int sumaVotos = 0;
            Score votos = new Score();
            System.out.println("  " + list.getName());
            votos.crearVotos(5);

            salto = super.getLength();
            list.setDistanciaSalto(salto);
            sumaSaltos = list.sumaSaltos();

            sumaVotos = list.setSumaVotosJueces(votos.sumaVotos());

            list.setPoints(sumaSaltos + sumaVotos);

            sumaVotos = list.getPoints() + sumaSaltos;

            System.out.println("    length: " + salto);
            System.out.println("    judge votes: " + votos.printVotos());

        }
    }

    /* public int compareTo(Participant other) {
        return this.totalScore() - other.totalScore();
    }*/
    public void quit() {
        Collections.sort(jumpers);
        Collections.reverse(jumpers);
        System.out.println("\nThanks!");
        System.out.println("\nTournament results:");
        System.out.println("Position    Name");
        for (Jumper list : jumpers) {
            System.out.println((jumpers.indexOf(list) + 1) + "           " + list.getName() + " (" + list.getPoints() + " points)");
            System.out.print("            jump lengths: ");

            list.getDistanciaSalto();
            System.out.println();
        }

    }
}
