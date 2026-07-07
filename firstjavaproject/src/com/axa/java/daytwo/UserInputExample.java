package com.axa.java.daytwo;

import java.sql.SQLOutput;
import java.util.Scanner;

public class UserInputExample {
    public static void main(String[] args) {
        //input reference variable is an object of Scanner class provided in Java
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number");
        int num = input.nextInt();
        System.out.println("Enter second number");
        int num2 = input.nextInt();
        System.out.println("Input number is "+num);
        System.out.println("Second input number is "+num2);
        System.out.println("Addition of two numbers is "+(num+num2));
        System.out.println("Enter a character - ");
        char ch = input.next().charAt(0);
        System.out.println("Enter a character - ");
        char ch2 = input.next().charAt(0);
        System.out.println(ch+ch2);
        System.out.println(ch);
        System.out.println(ch2);
        System.out.println("Enter a double  number - ");
        double ip2 = input.nextDouble();
        System.out.println("Enter a double  number - ");
        double ip3 = input.nextDouble();
        System.out.println(ip2);
        System.out.println(ip3);
        System.out.println(ip2+ip3);
    }
}
