package com.axa.java.daysix.examplesoverriding;

class Triangle extends Figure {
    Triangle(double x, double y) {	super(x,y);	}
    double area() {	//method overriding
		System.out.print("Area for triangle is :");
	return (dimension1 * dimension2 / 2);
}
}
