package com.axa.java.dayfour.staticexample;

public class StaticDemo {
    public static void main(String[] args) {
        Student student=new Student();
        student.setName("John");
        student.setStudentID(1111);
        System.out.println(student.getName());
        System.out.println(Student.collegeId);
        Student student2=new Student();
        student2.setName("Jack");
        student2.setStudentID(11111111);
        System.out.println("******************************");
        System.out.println(student2.getName());
        System.out.println(student2.getStudentID());
        System.out.println(Student.collegeId);
        //Student.collegeId=22;
        student2.setCollegeId(22);
        System.out.println(Student.collegeId);
        Student.setCollegeId(3333);
    }
}
