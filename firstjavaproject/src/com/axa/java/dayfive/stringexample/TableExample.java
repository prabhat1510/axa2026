package com.axa.java.dayfive.stringexample;

import java.util.Scanner;

public class TableExample {
    public static void main(String[] args) {
        /*
            10 * 1 = 10
            10 * 2 = 20
            ...........
            10 * 10 = 100
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = sc.nextInt();
        for(int i=1;i<=10;i++) {
            System.out.println(number + " * " + i + " = " + (number * i));
        }

        int c=1;
        while(c<=10){
            System.out.println(number + " * " + c + " = " + (number * c));
            c++;
        }

    }
}
