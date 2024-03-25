package com.workintech.pool;

public class Rectangle {

    private double width;
    private double length;

    public Rectangle(double width, double length) {
       setWidth(width);
        setLength(length);
    }

    public double getWidth() {
        return Math.max(0, width);
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return Math.max(0, length);
    }

    public void setLength(double height) {
        this.length = height;
    }

    public double getArea(){
        return width * length;
    }
}
