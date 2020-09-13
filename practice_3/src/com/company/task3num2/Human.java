package com.company.task3num2;

public class Human {
    private String name;
    private int age, height, weight;
    private String text = "";

    public Human(String name, int age, int height, int weight, double sizeOfHead, double sizeOfHand, double sizeOfLeg) {
        setName(name);
        setAge(age);
        setHeight(height);
        setWeight(weight);

        Head head = new Head(sizeOfHead);
        Hand hand = new Hand(sizeOfHand);
        Leg leg = new Leg(sizeOfLeg);

        text += head.toString();
        text += hand.toString();
        text += leg.toString();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String toString() {
        return "\nname: " + getName() +
                "\nage: " + getAge() +
                "\nheight: " + getHeight() +
                "\nweight: " + getWeight() + text;
    }
}
