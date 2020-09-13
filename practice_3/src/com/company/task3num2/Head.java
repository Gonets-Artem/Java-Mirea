package com.company.task3num2;

public class Head {
    private double sizeOfHead;

    public Head(double sizeOfHead) {
        setSizeOfHead(sizeOfHead);
    }

    public double getSizeOfHead() {
        return sizeOfHead;
    }

    public void setSizeOfHead(double sizeOfHead) {
        this.sizeOfHead = sizeOfHead;
    }

    public String toString() {
        return "\nhead: " + getSizeOfHead();
    }
}