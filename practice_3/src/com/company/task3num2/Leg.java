package com.company.task3num2;

public class Leg {
    private double sizeOfLeg;

    public Leg(double sizeOfLeg) {
        setSizeOfLeg(sizeOfLeg);
    }

    public double getSizeOfLeg() {
        return sizeOfLeg;
    }

    public void setSizeOfLeg(double sizeOfLeg) {
        this.sizeOfLeg = sizeOfLeg;
    }

    public String toString() {
        return "\nleg: " + getSizeOfLeg();
    }
}
