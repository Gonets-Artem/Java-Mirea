package com.company;

public class Main {

    public static final String RESET = "\u001B[0m";

    public static void main(String[] args) {
        colorWrite("Zdravstvuite", ColorEnums.BLACK);
        colorWrite("Paivaa", ColorEnums.RED);
        colorWrite("Hello", ColorEnums.GREEN);
        colorWrite("Aleihum", ColorEnums.YELLOW);
        colorWrite("Aloha", ColorEnums.BLUE);
        colorWrite("Shalom", ColorEnums.MAGENTA);
        colorWrite("Gamardjobat", ColorEnums.CYAN);
        colorWrite("Guten", ColorEnums.WHITE);
    }

    public static void colorWrite(String s, ColorEnums ce) {
        System.out.println(ce.getField() + s + RESET);
    }
}
