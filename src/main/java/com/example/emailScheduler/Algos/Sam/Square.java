package com.example.emailScheduler.Algos.Sam;

public class Square extends Rectangle {

protected double side;
    public Square(double side) {
        super(side, side);
//        super(side);
//        this.side = side;
    }

    @Override
    public double calculateArea(){
        return getSide()* getSide();
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
    public static void main(String[] args) {
//        Square a = new Square(4,5);
        Square b = new Square(6.0);
        Rectangle c = new Rectangle(b);
//        c.print();
        System.out.println(b.calculateArea());
        System.out.println(c.calculateArea());
    }

//    public void print() {
//        System.out.println("I am a square of side " + length);
//    }
}

