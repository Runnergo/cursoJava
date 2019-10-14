/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mati
 */
public class Counter {

    private int valueCounter;
    private boolean check;

    public Counter(int startingValue, boolean check) {
        this.valueCounter = startingValue;
        this.check = check;
    }

    public Counter(int startingValue) {
        this.valueCounter = startingValue;
        this.check = false;
    }

    public Counter(boolean check) {
        this.valueCounter = 0;
        this.check = true;
    }

    public Counter() {
        this.valueCounter = 0;
        this.check = false;

    }

    public int value() {
        return valueCounter;
    }

    public void increase() {
        valueCounter++;

    }

    public void decrease() {
        valueCounter--;
        if (valueCounter < 0 && this.check == true) {
            this.valueCounter = 0;
        }
    }

    public void increase(int increaseAmount) {

        if (increaseAmount >= 0) {
            valueCounter += increaseAmount;
        }
    }

    public void decrease(int decreaseAmount) {
        int valorCounterTemp = valueCounter;
        valorCounterTemp -= decreaseAmount;
        if (valorCounterTemp < 0 && check == true) {
            valueCounter = 0;
        } else {
          
            if (decreaseAmount >= 0) {
                valueCounter -= decreaseAmount;
            }
        }
    }
}
