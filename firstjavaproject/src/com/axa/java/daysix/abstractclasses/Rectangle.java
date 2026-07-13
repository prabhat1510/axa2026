package com.axa.java.daysix.abstractclasses;

public class Rectangle extends Figure {
    double dim1;
    double dim2;

    public Rectangle(double dim1, double dim2) {
        this.dim1 = dim1;
        this.dim2 = dim2;
    }

    @Override
    double area(double dim1 ,double dim2) {
        return dim1*dim2;
    }

    @Override
    double perimeter() {
        return 2*(dim1+dim2);
    }
    /*void display2(){
        System.out.println("Override final method");
    }*/
}
