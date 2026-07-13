package com.axa.java.daysix.abstractclasses;

public abstract class Figure {
    abstract double area(double dim1 ,double dim2);//abstract keyword is mandatory, method declaration
     abstract double perimeter();
    void display(){
        System.out.println("Inside Figure::display");
    }
    final void display2(){
        System.out.println("Inside Figure::display2");
    }
}
