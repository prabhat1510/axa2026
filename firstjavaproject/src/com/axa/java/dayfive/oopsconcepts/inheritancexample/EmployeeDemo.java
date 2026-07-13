package com.axa.java.dayfive.oopsconcepts.inheritancexample;

public class EmployeeDemo {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.setId(111);
        e.setName("Alex");
        System.out.println(e);
        Manager m = new Manager();
        Director d = new Director();
        /*System.out.println(e instanceof Employee);
        System.out.println(m instanceof Manager);
        System.out.println(d instanceof Employee);*/
        System.out.println("salary d is called :");
        salary(d);
        System.out.println("salary e is called :");
        salary(e);
        System.out.println("salary m is called :");
        salary(m);


    }
    public static void salary(Object obj){
        if(obj instanceof Employee){
            System.out.println("Employee salary 10000 $");
        }else if(obj instanceof Manager){
            System.out.println("Manager salary 20000 $");
        }else if(obj instanceof Director){
            System.out.println("Director salary 30000 $");
        }else{
            System.out.println("No Salary");
        }
    }
}
