package com.axa.java.dayfour.exercise;

import java.util.Scanner;

public class CalculatorDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //User input for which operations to be performed
        while(true){
            System.out.println("Select what you want to do ");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Exit the program");
            int choice = sc.nextInt();
            if (choice == 1) {
                System.out.println("Please enter the first number");
                int a = sc.nextInt();
                System.out.println("Please enter the second number");
                int b = sc.nextInt();
                Calculator c = new Calculator();
                int result = c.add(a, b);
                System.out.println("Addition of two numbers "+a+" and "+b+" is "+result);
            }else if (choice == 2) {
                System.out.println("Please enter the first number");
                int a = sc.nextInt();
                System.out.println("Please enter the second number");
                int b = sc.nextInt();
                Calculator c = new Calculator();
                int result = c.sub(a, b);
                System.out.println("Subtraction of two numbers "+a+" and "+b+" is "+result);
            }else if (choice == 3) {
                System.exit(0);
            }else{
                System.out.println("Invalid choice");
            }
        }
    }
}
