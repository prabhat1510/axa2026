package com.axa.java.dayfive.oopsconcepts.inheritancexample.mypack;

public class Manager extends Employee {
    String deptName;

    public Manager(int employeeNo, String s, String deptName) {
        super(employeeNo, s); //parent class 2-arg constructor is called
        System.out.println("Manager 3 arg constructor Begins");
        this.deptName = deptName;
        System.out.println("Manager 3 arg constructor Ends");
    }
    void display(){
        super.display();
        System.out.println("Department Name : "+this.deptName);

    }
}
