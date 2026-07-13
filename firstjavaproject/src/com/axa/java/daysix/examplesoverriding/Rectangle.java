package com.axa.java.daysix.examplesoverriding;

class Rectangle extends Figure {
    Rectangle(double x, double y)	{			super(x,y);	}
    double area() //method overriding
    {
        System.out.print("Area of rectangle is :");
        return dimension1 * dimension2;
    }}


