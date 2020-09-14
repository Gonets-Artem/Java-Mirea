package com.company.task3num2;

public class Hand {
    private double sizeOfHand;

    public Hand() {};

    public double getSizeOfHand() {
        return sizeOfHand;
    }

    public void setSizeOfHand(double sizeOfHand) {
        this.sizeOfHand = sizeOfHand;
    }

    public String toString() {
        return "\nhand: " + getSizeOfHand();
    }
}
