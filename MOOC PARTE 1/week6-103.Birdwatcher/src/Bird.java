/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Runnergo
 */
import java.util.Scanner;

public class Bird {
    
    private String nameBird;
    private String nameBirdLatin;
    private int observations;
           
    public Bird(String nameBird, String nameBirdLatin){
        this.nameBird=nameBird;
        this.nameBirdLatin=nameBirdLatin;
        this.observations=0;
        
    }
    public String getNameBird(){
        return this.nameBird;
    }
    public String getNameBirdLatin(){
        return this.nameBirdLatin;
    }
    public void addObservation(){
        observations++;
    }
    public String toString(){
        return nameBird+" ("+nameBirdLatin+"): "+observations+" observations ";
    }
}
