package com.axa.java.daytwo;

public class AccessingArrayElementsEx {
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 11;
        arr[1] = 20;
        arr[2] = 3;
        arr[3] = 14;
        arr[4] = 25;
        System.out.println(arr[0]);
        //in for loop
        for (int index = 0; index < arr.length; index++) {
            //Body of the loop
            System.out.println(arr[index]);
        }
    }
}
