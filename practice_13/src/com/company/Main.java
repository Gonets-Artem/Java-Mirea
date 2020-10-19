package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Gas argon = new Gas();

        try {
            double volume = Double.parseDouble(new Scanner(System.in).nextLine());
            argon.addVolume(volume);
            System.out.println("No exceptions");
        }
        catch (MyException mex) {
            System.out.println("input negative number");
        }
        catch (NumberFormatException mfe) {
            System.out.println("Incorrect input format: string");
        }
        finally {
            System.out.println(argon);
        }

        throw new MyRuntimeException();
    }
}
