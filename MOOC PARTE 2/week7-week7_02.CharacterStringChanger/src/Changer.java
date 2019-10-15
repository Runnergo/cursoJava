
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Runnergo
 */
public class Changer {
    private ArrayList<Change> cadena;
    
    public Changer(){
      this.cadena= new ArrayList<Change>();  
    }
    public void addChange(Change change){
        cadena.add(change);
    }
    public String change(String characterString){
        for (Change list: cadena){
            characterString=list.change(characterString);
        }
        return characterString;
    }
}
