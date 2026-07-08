package com.axa.java.dayfour;

class NewEmployee{
    int id;
    String name;
    int salary;

    public void setId(int no) {
        id = no;
    }

    public void setName(String n) {
        name = n;
    }

    public void setSalary(int s) {
        salary = s;
    }
    public void getEmployeeDetails() {
        System.out.println(name+"  "+salary);
    }
}
public class NewEmployeeDemo
{
    public static void main(String[] args) {
        NewEmployee obj = new NewEmployee();
        obj.setId(11);
        obj.setName("Jack");
        obj.setSalary(5000);
        obj.getEmployeeDetails();
    }
}
