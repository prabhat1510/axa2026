package com.axa.java.dayfour.staticexample;

public class StaticBlockExample {
    public StaticBlockExample() {
        System.out.println("With in the constructor");
    }
    static{
        System.out.println("In static block");
    }
    public static void m1(){
        System.out.println("With in static method m1");
    }

    static{
        System.out.println("In 2nd static block");
        m1();
    }

    public static void main(String[] args) {
        System.out.println("In main");
        StaticBlockExample o = new StaticBlockExample();

    }
    static{
        System.out.println("In 3rd static block");
    }
}
