package com.axa.java.dayfive.oopsconcepts.inheritancexample.mypack;

public class Employee {

    int employeeNo;
    String employeeName;

    public Employee() {
        System.out.println("Employee No Arg Constructor Begins ");
        employeeNo=0;
        employeeName= null;
        System.out.println("Employee No Arg Constructor Ends ");
    }

    public Employee(int employeeNo) {
        System.out.println("Employee 1 Arg Constructor Begins ");
        this.employeeNo = employeeNo;
        this.employeeName= "UNKNOWN";
        System.out.println("Employee 1 Arg Constructor Ends ");
    }

    public Employee(int employeeNo, String s) {
        System.out.println("Employee 2 Arg Constructor Begins ");
        this.employeeNo = employeeNo;
        this.employeeName = s;
        System.out.println("Employee 2 Arg Constructor Ends ");
    }
    void display(){
        System.out.println("Employee No : "+employeeNo);
        System.out.println("Employee Name : "+employeeName);
    }
}
