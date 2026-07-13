package com.axa.java.dayfive.oopsconcepts.inheritancexample;
//Inheritance- Rectangle class extends the behaviour of Shape class
public class Rectangle extends Shape{
    private Integer a;
    private Integer b;

    public Integer getA() {
        return a;
    }

    public void setA(Integer a) {
        this.a = a;
    }

    public Integer getB() {
        return b;
    }

    public void setB(Integer b) {
        this.b = b;
    }

    void perimeter(Integer length, Integer width){
        System.out.println("Perimeter of a rectangle is "+2*(length+width));

    }
 }
