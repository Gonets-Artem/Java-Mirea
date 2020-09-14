package com.company.task2num4;

public class Main {
    public static void main(String[] args) {
        DogKennels array = new DogKennels();
        Dog dogFirst = new Dog("Шарик", 2);
        Dog dogSecond = new Dog("Бимка", 4);
        Dog dogThree = new Dog("Снежок", 1);
        array.matrix(dogFirst, dogSecond, dogThree);
        System.out.println(array.getKennels().get(1));
        array.getKennels().get(1).intoHumanAge();
    }
}
