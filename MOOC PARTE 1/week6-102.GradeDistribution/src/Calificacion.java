
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Runnergo
 */
public class Calificacion {

   
    private int[] grados;
    private int aceptados;

    public Calificacion() {
       
        this.grados = new int[6];
    }

    public void seleccionPorPuntuacion(int points) {

        if (points < 30) {
            this.grados[0]++;
            
        } else if (points < 35) {
            this.aceptados++;
            this.grados[1]++;
            
        } else if (points < 40) {
            this.aceptados++;
            this.grados[2]++;
            
        } else if (points < 45) {
            this.aceptados++;
            this.grados[3]++;
            
        } else if (points < 50) {
            this.aceptados++;
            this.grados[4]++;
            
        } else if (points <= 60) {
            this.aceptados++;
            this.grados[5]++;
        }
    }

    public void representacionCalificaciones() {
        System.out.println("Grade distribution:");
        for (int i = grados.length - 1; i >= 0; i--) {
            System.out.print(i + ": ");
            printAsterisk(grados[i]);
            System.out.println();
        }

    }

    public static void printAsterisk(int repeticion) {
        for (int i = 0; i < repeticion; i++) {
            System.out.print("*");
        }
    }

    public double porcentaje(int i) {
        if (i > 0) {
            double porcentaje = 100 * (double)aceptados / i;
            return porcentaje;
        }
        return 0;
    }
}
