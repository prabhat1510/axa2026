package com.axa.java.dayfour;

public class Customer {
    int id;
    String name;
    int age;

    public Customer() {
        this(15,"John");//Calling the constructor using this()
        System.out.println("Default Customer Constructor calling another construtor");

    }

    public Customer(int id, String name) {
        this(25);//Calling the constructor using this()
        this.id = id;
        this.name = name;
        System.out.println("Customer Constructor with id and name as an argument "+this.id+"  "+this.name);

    }

    public Customer(int age) {
        this.age = age;
        System.out.println("Customer Constructor with age argument "+this.age);
    }

    public Customer(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

}
