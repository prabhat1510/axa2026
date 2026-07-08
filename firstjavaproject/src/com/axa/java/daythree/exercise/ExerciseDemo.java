package com.axa.java.daythree.exercise;

import java.util.Scanner;

public class ExerciseDemo {
    public static void main(String[] args) {
        /**
         * Create an object of Student class to take user input
         * and display on standard output console
         *  Student class properties:-
         *      studentId
         *      studentName
         *      age
         *      email
         *      address
         * */
        //using new keyword we are calling constructor of Student class
        Student object1 = new Student();//object1 is a reference variable of Student class type
        //using new keword we are calling parameterized construtor of a student class
        Student object2 = new Student(11,"Baal Narendra",75,"narednra@adani.com","Antilia");
        //Take user input of student details from end user on standard input console
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Student ID ");
        int sId = sc.nextInt();
        System.out.println("Enter Student Name ");
        String sName = sc.next();
        sc.nextLine();
        System.out.println("Enter Student Age ");
        int age = sc.nextInt();
        System.out.println("Enter Student Email ");
        String sEmail = sc.next();
        System.out.println("Enter Student Address ");
        String sAddress = sc.next();
        //Setting the values take from user to an object
        object1.setStudentId(sId);
        object1.setStudentName(sName);
        object1.setAge(age);
        object1.setEmail(sEmail);
        object1.setAddress(sAddress);

        System.out.println(object1.getAddress());

        System.out.println("******************************************");
        Student object3 = new Student(sId,sName,age,sEmail,sAddress);
        System.out.println(object3.getAddress());
        System.out.println(object3.getAge());




    }
}
