package com.axa.java.daysix.methodoverloading;

public class Calculator {
    //Base method
    public int add(int a,int b){
        return a+b;
    }

    //Overloaded method by changing the data type of parameters
    public double add(double a,double b){
        return a+b;
    }
    //Overloaded by changing the number of parameters
    public int add(int a,int b,int c){
        return a+b+c;
    }

    //Overloaded by changing the order of different data types
    public void display(String name,int id){
        System.out.println(name+" "+id);
    }
    public void display(int id,String name){
        System.out.println(name+" "+id);
    }
}
