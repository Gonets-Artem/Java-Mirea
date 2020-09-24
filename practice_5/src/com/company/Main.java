package com.company;

public class Main {

    public static void main(String[] args) {
        MovablePoint point = new MovablePoint(2, 3);
        System.out.println(point);
        point.move(4, -5);
        System.out.println(point);

        MovableCircle circle = new MovableCircle(0, 0, 2);
        System.out.println(circle);
        circle.move(2, 3);
        System.out.println(circle);
        circle.setRadius(1);
        circle.setCenter(1, 1);
        System.out.println(circle);

        MovableRectangle rectangle = new MovableRectangle(1, 1, 2, 2);
        System.out.println(rectangle);
        rectangle.setWidth(4);
        System.out.println(rectangle);
        rectangle.setLength(rectangle.getLength()*2);
        System.out.println(rectangle);
        rectangle.setLeftUp(2, 5);
        System.out.println(rectangle);
    }
}
