package com.axa.java.daytwo;

import java.util.Arrays;

public class ArraysExample {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5}; //Defining and initializing an array of 5 elements with values 1,2,3,4,5

        int[] x=new int[5]; //Defining an array of 5 integer elements
        //Adding elements in an array referred by variable x
        x[0]=11;// index position is 0 it is a first element of an array
        x[1]=21;
        x[2]=31;
        x[3]=41;
        x[4]=51;// last index is no. of elements -1

        int[] marks = new int[7];
        marks[0]=100;
        marks[1]=65;
        marks[2]=90;
        marks[3]=95;
        marks[4]=91;
        marks[5]=92;
        marks[6]=93;
        //marks[7]=94;//Error Index out of bound exception
        System.out.println(Arrays.toString(marks));
        System.out.println(marks[4]);
        System.out.println(marks.length);

    }
}
