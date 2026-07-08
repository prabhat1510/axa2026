package com.axa.java.dayfour.staticexample;

public class StaticExample {
    private static int a=0;
    private int b;
    static final double pi=3.14;//Constant

    public void set(int i, int j) {
        a=i;
        b=j;
    }
    public void show(){
        System.out.println("This is static a: "+a);
        System.out.println("This is non static b: "+b);
    }
    public static void main(String[] args) {
        StaticExample example = new StaticExample();
        StaticExample example2 = new StaticExample();
        example.set(1,1);
        example.show();
        example2.set(2,2);
        example2.show();
        example.show();
        //set(5,5);
        double piValue= StaticExample.pi;


    }
}
