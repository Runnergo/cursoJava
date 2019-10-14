/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Runnergo
 */
import java.util.ArrayList;

public class Player {
    

    private String name;
    private int goals;
    

    public Player(String name, int goals) {
        this.name = name;
        this.goals = goals;
      
    }

    public Player(String name) {
        this.name = name;
        this.goals =0;
    }

    public String getName() {
        return name;
    }
    public int goals(){
        return goals;
    }
    public String toString(){
        return name+", goals "+goals;
    }
    
}
