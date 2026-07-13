package com.axa.java.daysix.interfaces;



public class Demo {
    public static void main(String[] args) {
        Calculator calculator = new CalculatorImpl();
        int result = calculator.add(10, 20);
        System.out.println("Result is: " + result);
    }
}
