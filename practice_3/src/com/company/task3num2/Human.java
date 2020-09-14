package com.company.task3num2;

public class Human {
    private String name;
    private int age, height, weight;
    Head head = new Head();
    Hand handLeft = new Hand();
    Hand handRight = new Hand();
    Leg legLeft = new Leg();
    Leg legRight = new Leg();

    public Human(String name, int age, int height, int weight, double sizeOfHead, double sizeOfHand, double sizeOfLeg) {
        setName(name);
        setAge(age);
        setHeight(height);
        setWeight(weight);
        head.setSizeOfHead(sizeOfHead);
        handLeft.setSizeOfHand(sizeOfHand);
        handRight.setSizeOfHand(sizeOfHand);
        legLeft.setSizeOfLeg(sizeOfLeg);
        legRight.setSizeOfLeg(sizeOfLeg);
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
                "\nweight: " + getWeight() +
                "\nhead: " + head.getSizeOfHead() +
                "\nleft hand: " + handLeft.getSizeOfHand() +
                "\nright hand: " + handRight.getSizeOfHand() +
                "\nleft leg: " + legLeft.getSizeOfLeg() +
                "\nright leg: " + legRight.getSizeOfLeg();
    }
}
