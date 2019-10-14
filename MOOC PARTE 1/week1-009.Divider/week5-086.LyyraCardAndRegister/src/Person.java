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

public class Person {

    private ArrayList user;
    private String name;
    private double balanceCash;

    public Person(ArrayList user, String name, double balanceCash) {
        this.user = new ArrayList();
        this.name = name;
        this.balanceCash = balanceCash;

    }

    public ArrayList getUser(double balanceCash) {
        user.add(balanceCash);
        return user;
    }

    public ArrayList getUser(String name) {
        this.user.add(name);
        return user;
    }

   
    

}
