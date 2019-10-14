
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Runnergo
 */
public class NightSky {

    private double density;
    private int width;
    private int height;
    private int starsInLastPrint;

    public NightSky(double density, int width, int height) {
        this.density = density;
        this.width = width;
        this.height = height;
    }

    public NightSky(double density) {
        this.density = density;
        this.width=20;
        this.height=10;
    }

    public NightSky(int width, int height) {
        this.density=0.1;
        this.width = width;
        this.height = height;
    }

    public void print() {
        this.starsInLastPrint=0;
        for (int i=0; i < height; i++) {
            printLine();
        }
    }

    public void printLine() {
        Random random = new Random();
        int i = 0;
        for (i = 0; i < width; i++) {
            if (this.density > random.nextDouble()) {
                System.out.print("*");
                starsInLastPrint++;
            }
            System.out.print(" ");
        }
        System.out.println("");
    }

    public int starsInLastPrint() {
        return starsInLastPrint;
    }
}
