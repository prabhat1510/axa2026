//pacakage is reserved keyword in Java program to refer a package which contain Java classes
package com.axa;
//HelloWorld is a user defined class of a Java Program
//class is a reserved keyword of Java Program to represent a Java Class
public class HelloWorld {
    /**
     * Below is main method of a Java Class
     * In this java provided keywords are
     * public --- is a reserved keyword known as access modifier or specifier in Java program
     * static - is a reserved keyword to make the method as a class level method
     * void --- is the return type of method which means method is not returning anything
     * String -- is a built in class provided by Java to deal with group of characters
     * */
    public static void main(String[] args) {
        //System.out.println is a built in method provided by Java to print on standard output console
        System.out.println("Hello World");
        System.out.println(15+10);
        //calling the methods
        int res= addition(20,25);
        System.out.println(res);
        //calling void methods
        subtraction(25,20);
        displayInformation();
    }

    public static int addition(int num1, int num2){
        int result=num1+num2;
        return result;
    }
    public static void subtraction(int num1, int num2){
        int result=num1-num2;
        System.out.println(result);
    }
    public static void displayInformation(){
        System.out.println("Hello All !!! Good Morning");
    }
}
