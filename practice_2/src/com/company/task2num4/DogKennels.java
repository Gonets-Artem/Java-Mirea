package com.company.task2num4;
import java.util.*;

public class DogKennels {
    public static void main(String[] args) {
        ArrayList<Dog> array = new ArrayList<>();
        Dog dog1 = new Dog("Шарик", 2);
        array.add(dog1);
        Dog dog2 = new Dog("Бимка", 6);
        array.add(0, dog2);
        Dog dog3 = new Dog("Снежок", 1);
        array.add(dog3);
        System.out.println(array.get(1));
        array.get(1).intoHumanAge();
    }
}