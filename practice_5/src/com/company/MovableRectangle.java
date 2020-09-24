package com.company;

public class MovableRectangle extends Rectangle implements Movable{
    private MovablePoint leftUp;
    private MovablePoint rightDown;

    public MovableRectangle(double x1, double y1, double x2, double y2) {
        this.leftUp = new MovablePoint(x1, y1);
        this.rightDown = new MovablePoint(x2, y2);
        super.setWidth(Math.abs(x1-x2));
        super.setLength(Math.abs(y1-y2));
    }

    public MovablePoint getLeftUp() {
        return leftUp;
    }

    public void setLeftUp(double x, double y) {
        leftUp.setX(x);
        leftUp.setY(y);
        super.setWidth(Math.abs(x - rightDown.getX()));
        super.setLength(Math.abs(y - rightDown.getY()));
    }

    public MovablePoint getRightDown() {
        return rightDown;
    }

    public void setRightDown(double x, double y) {
        rightDown.setX(x);
        rightDown.setY(y);
        super.setWidth(Math.abs(x - leftUp.getX()));
        super.setLength(Math.abs(y - leftUp.getY()));
    }

    public void setWidth(double width) {
        double widthDop = getWidth();
        if (leftUp.getX()<rightDown.getX()) {
            leftUp.setX(leftUp.getX() - Math.abs(width - widthDop) / 2);
            rightDown.setX(rightDown.getX() + Math.abs(width - widthDop) / 2);
        }
        else {
            leftUp.setX(leftUp.getX() + Math.abs(width - widthDop) / 2);
            rightDown.setX(rightDown.getX() - Math.abs(width - widthDop) / 2);
        }
        super.setWidth(width);
    }

    public void setLength(double length) {
        double lengthDop = getLength();
        if (leftUp.getY()<rightDown.getY()) {
            leftUp.setY(leftUp.getY() - Math.abs(length - lengthDop) / 2);
            rightDown.setY(rightDown.getY() + Math.abs(length - lengthDop) / 2);
        }
        else {
            leftUp.setY(leftUp.getY() + Math.abs(length - lengthDop) / 2);
            rightDown.setY(rightDown.getY() - Math.abs(length - lengthDop) / 2);
        }
        super.setLength(length);
    }

    public void move(double xSpeed, double ySpeed) {
        leftUp.move(xSpeed, ySpeed);
        rightDown.move(xSpeed, ySpeed);
    }

    public String toString() {
        return "rectangle: LeftUp (" + leftUp.getX() +
                ", " + leftUp.getY() +
                "), RightDown (" + rightDown.getX() +
                ", " + rightDown.getY() +
                "), width = " + getWidth() +
                ", length = " + getLength();
    }
}