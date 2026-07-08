package com.axa.java.dayfour.staticexample;

public class Student {

    private int studentID;//instance variables
    private String name;//instance variables
    static int collegeId=15;//class level variables

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void setCollegeId(int collegeId) {
        Student.collegeId = collegeId;
    }
}
