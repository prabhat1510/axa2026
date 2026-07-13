package com.axa.java.daysix.examplesoverriding;

public class FindArea {
    public static void main(String args[]){
        Figure f    		= new Figure(10,10);
        Rectangle r 		= new Rectangle(9,5);
        Triangle t  		= new Triangle(10,8);
        Figure fig;		//reference variable

        fig = r;
        System.out.println("Area of rectangle is :" + fig.area());
        fig = t;
        System.out.println("Area of triangle is :" + fig.area());
        fig = f;
        System.out.println(fig.area());
    }
}
