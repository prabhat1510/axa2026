package com.axa.java.daysix.interfaces;

public interface PrintInformation {
    void printInformation();//abstract method
    void printInfo();
    default void display(){
        System.out.println("Inside Interface display method");
    }
    static void display2(){
        System.out.println("Inside display method2");
    }

}
