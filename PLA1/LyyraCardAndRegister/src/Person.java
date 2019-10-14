/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Runnergo
 */
public class Person {

    private String name;
    private double balanceCash;
    private double balanceCard;

    public Person(String name, double balanceCash, double balanceCard) {

        this.name = name;
        this.balanceCash = balanceCash;
        this.balanceCard = balanceCard;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getbalanceCash() {
        return balanceCash;
    }

    public void addBalanceCash(double balanceCash) {
        this.balanceCash += balanceCash;
    }

    public void chargeCash(double chargeCash) {
        this.balanceCash -= chargeCash;
    }

    public double getbalanceCard() {
        return this.balanceCard;
    }

    public void addBalanceCard(double balanceCard) {
        this.balanceCard += balanceCard;
    }

    public void chargeCard(double chargeCard) {
        this.balanceCard -= chargeCard;
    }

    public String toString() {
        return "Nombre: " + this.name + " balance en efectivo: " + this.balanceCash + " balance Card: " + this.balanceCard+"\n";
    }

}
