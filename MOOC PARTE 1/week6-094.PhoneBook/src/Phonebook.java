
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
public class Phonebook {
    
    private ArrayList<Person> agenda;
    
    public Phonebook(){
        
     this.agenda=new ArrayList<Person>();
        
    }
    public void add(String name, String number){
        Person contacto=new Person(name,number);
        this.agenda.add(contacto);
    }
    public void printAll(){
        for (Person list:agenda){
            System.out.println(list);
        }
    }
    public String searchNumber(String name){
        for (Person list:agenda){
            if (list.getName().equals(name)){
                return list.getNumber();
            }
        }
        return "number not known";
    }
}
