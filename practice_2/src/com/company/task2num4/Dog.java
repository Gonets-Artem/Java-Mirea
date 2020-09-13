package com.company.task2num4;

public class Dog {
    private String name;
    private int age;

    public Dog(String name, int age) {
        setName(name);
        setAge(age);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return getName() + " " + getAge();
    }

    public void intoHumanAge() {
        System.out.println("Human (new) age: " + getName() + " " + getAge() * 7);
    }
}
