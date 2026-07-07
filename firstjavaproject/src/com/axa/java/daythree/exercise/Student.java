package com.axa.java.daythree.exercise;

public class Student {
    private int studentId;
    private String studentName;
    private int age;
    private String email;
    private String address;

    public Student() {
    }

    public Student(int studentId, String studentName, int age, String email, String address) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.age = age;
        this.email = email;
        this.address = address;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
