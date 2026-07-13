package com.axa.java.dayfive.oopsconcepts.inheritancexample.mypack;

class X{
    X(){
        System.out.println("X Constructor");
    }
}
class Y extends X{
    Y(){
        System.out.println("Y Constructor");
    }
}
class Z extends Y{
    Z(){
        System.out.println("Z Constructor");
    }
}
public class OrderOfConstructorCallDemo {
    public static void main(String[] args) {
        Z z= new Z();
    }
}
