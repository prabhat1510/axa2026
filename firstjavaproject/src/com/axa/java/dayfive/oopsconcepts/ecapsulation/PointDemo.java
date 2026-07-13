package com.axa.java.dayfive.oopsconcepts.ecapsulation;

public class PointDemo {
    public static void main(String[] args) {
        /*Point p = new Point();
        p.setX(50);
        p.setY(150);
        System.out.println(p.getX());*/
        int a, b;
        Point p1 = new Point();
        p1.setX(22);
        p1.setY(44);
        a = p1.getX();
        System.out.println("The value of a is "+a);
        b = p1.getY();
        System.out.println("The value of b is "+b);

    }
}
