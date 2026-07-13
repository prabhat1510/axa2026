package com.axa.java.daysix.examplesoverriding;
class Figure {
    double dimension1;
    double dimension2;

    Figure(double x, double y){
        dimension1 = x;
        dimension2 = y;
    }

    double area() {
        System.out.println("Area of Figure is undefined");
        return 0;
    }
}
