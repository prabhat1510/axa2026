package com.axa.java.dayfive.oopsconcepts.inheritancexample;

public class InheritanceDemo {
    public static void main(String[] args) {
        A s1 = new A();	// creating objects -- Super or Parent or Base class
        B s2 = new B();//Derived Class or Subclass or Child Class
        s1.m = 10; s1.n = 20;
        System.out.println("State of object A:");
        s1.display1();
        s2.m = 7; s2.n = 8; s2.c = 9;
        System.out.println("State of object B:");
        s2.display1();
        s2.display2();
        System.out.println("sum of m, n and c in object B is:");
        s2.sum();



    }
}
