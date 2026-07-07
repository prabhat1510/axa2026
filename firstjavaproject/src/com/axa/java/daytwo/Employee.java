package com.axa.java.daytwo;

/**
 * A class in  Java is a blueprint of an object
 * Employee object  --- empId,empName,age,salary
 */
public class Employee {
    //Properties of object emplyee is empId,empName,age,salary
    private int empId; // instance variable referred by empId
    private String empName;
    private int age;
    private double salary;

    //Behaviour object will be represented by methods
    public void displayEmployeeDetails(){
        System.out.println("Employee details:");
        System.out.println("Employee ID: "+this.empId);
        System.out.println("Employee Name: "+this.empName);
        System.out.println("Employee Age: "+this.age);
        System.out.println("Employee Salary: "+this.salary);
    }
}
