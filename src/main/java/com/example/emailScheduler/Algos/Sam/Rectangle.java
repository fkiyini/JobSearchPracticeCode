package com.example.emailScheduler.Algos.Sam;

public class Rectangle {
    protected double length;
    protected double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public Rectangle(Rectangle r) {
        this.length = r.length;
        this.width = r.width;
    }

    public Rectangle(double length){
        this.length = length;
    }

    public double calculateArea() {
        return getLength() * getWidth();
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    //    public void print()
//    {
//        System.out.println("I am a rectangle of length " + length + " and width " + width);
//    }
}


