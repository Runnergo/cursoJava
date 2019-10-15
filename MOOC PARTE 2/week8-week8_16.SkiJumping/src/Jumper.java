
import java.util.ArrayList;

public class Jumper implements Comparable<Jumper> {

    private String name;
    private ArrayList<Integer> distanciaSalto;
    private int points;
    private int sumaVotosJueces;

    public Jumper(String name, Jumper distanciaSalto, int points, int sumaVotosJueces) {

        this.name = name;
        this.distanciaSalto = new ArrayList();
        this.points = points;
        this.sumaVotosJueces = sumaVotosJueces;
    }

    public int setSumaVotosJueces(int votosJueces) {
        this.sumaVotosJueces += votosJueces;
        return sumaVotosJueces;
    }

    public int getSumaVotosJueces() {
        return sumaVotosJueces;
    }

    public String getName() {
        return name;
    }

    public void getDistanciaSalto() {
        for (int list : distanciaSalto) {
            System.out.print(list + " m,");
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDistanciaSalto(int distanciaSalto) {
        this.distanciaSalto.add(distanciaSalto);
    }

    public int sumaSaltos() {
        int suma = 0;
        for (int list : distanciaSalto) {
            suma += list;
        }
        return suma;
    }

    public String toString() {
        return name + " " + distanciaSalto;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    @Override
    public int compareTo(Jumper nextJumper) {
        return this.points - nextJumper.points;
    }
}
