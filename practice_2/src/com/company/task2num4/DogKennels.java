package com.company.task2num4;
import java.util.*;

public class DogKennels {
    private ArrayList<Dog> kennels = new ArrayList<>();

    public void matrix(Dog a, Dog... args) {
        for (int i = 0; i < args.length; i++) {
            kennels.add(args[i]);
        }
    }

    public ArrayList<Dog> getKennels() {
        return kennels;
    }
}