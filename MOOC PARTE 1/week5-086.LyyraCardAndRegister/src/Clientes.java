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
import java.util.Scanner;

public class Clientes {

    private ArrayList<Person> person;

    public Clientes() {
        this.person = new ArrayList<Person>();

    }

    public void addClient(String name, double balanceCash, double balanceCard) {
        Person nuevoCliente = new Person(name, balanceCash, balanceCard);
        this.person.add(nuevoCliente);
    }

    public boolean verificarCliente(String name) {
        for (Person list : person) {
            if (list.getName().contains(name)) {
                return true;
            }
        }
        return false;
    }

    public ArrayList<Person> getClientes() {
        return this.person;
    }
        public Person getClient(int j) {
        return person.get(j);
    }

    public void deleteClient(int j) {
        this.person.remove(j);
    }

    public String getClientAll() {
        String printer = "";
        int j=0;
        for (Person cliente : person) {
            j++;
            printer +="Nº Ref: "+j+" Nombre: "+ cliente.getName() + "\n";
        }
        return printer;
    }

    public int search(String name) {
        int i=0;
        for (Person cliente : person) {
            i++;
            if (cliente.getName().equalsIgnoreCase(name)) {
                return i-1;
            }
        }
         return 0;
    }
}
