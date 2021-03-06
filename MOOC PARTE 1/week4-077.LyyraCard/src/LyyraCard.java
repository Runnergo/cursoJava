/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Runnergo
 */
public class LyyraCard {

    private double balance;

    public LyyraCard(double saldo) {
        this.balance = saldo;

    }

    @Override
    public String toString() {
        return "The card has " + this.balance + " euros";

    }

    public void payEconomical() {
        if (balance >= 2.5) {
            balance -= 2.5;
        }
    }

    public void payGourmet() {
        if (balance >= 4) {
            balance -= 4;
        }
    }

    public void loadMoney(double amount) {
        if (amount > 0) {
            if (balance + amount > 150) {
                balance = 150;
            } else {
                balance += amount;
            }
        }
    }
}
