package com.axa.java.dayfour;

public class Employee {
    int id;
    String name;
    int salary;

    /*public void setId(int no) {
        id = no;
    }

    public void setName(String n) {
        name = n;
    }

    public void setSalary(int s) {
        salary = s;
    }*/

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void getEmployeeDetails() {
        System.out.println(name+"  "+salary);
    }
}
