package com.company;

public class Main {

    public static void main(String[] args) {
        MovablePoint point = new MovablePoint(2, 3, 1, 1);
        point.moveDown();
        point.moveLeft();
        System.out.println(point);

        MovableCircle circle = new MovableCircle(0, 0, 2, 3, 2);
        circle.moveUp();
        circle.moveRight();
        System.out.println(circle);
    }
}
