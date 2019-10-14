/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Runnergo
 */
public class BoundedCounter {

    private int value;
    private int upperLimit;

    public BoundedCounter(int upperLimit) {
        // write code here
        this.value = 0;
        this.upperLimit = upperLimit;
    }

    public void next() {
        // write code here
        if (value +1> upperLimit) {
            value = 0;
        } else {
            value++;
        }
    }

    public String toString() {
        // write code here
        if (value < 10) {
            return "0" + value;
        } else {
            return "" + value;
        }
    }

    public int getValue() {
        return value;
    }
    public void setValue(int valueInitial){
        if (valueInitial>0 && valueInitial<=upperLimit){
            value=valueInitial;
        }
    }
}
