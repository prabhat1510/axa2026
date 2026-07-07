package com.axa.java.daytwo;

public class ArraysCopyExample {

    public static void main(String[] args) {
        int source[] = {1,2,3,4,5,6};
        int dest[] = new int[10];
        System.arraycopy(source,0,dest,0,source.length);
        System.out.println(dest.length);
        System.out.println(dest[2]);//3
        System.out.println(dest[3]);
//        System.out.println(dest[4]);
        //{1,2,3,4,5,6}
        //System.arraycopy(source,2,dest,0,source.length);
        //source[2]
        //source[3]
        //source[4]
        //source[5]
        //source[6]//Error
        //source[7] //Error

        System.arraycopy(source,2,dest,0,3);
        System.out.println(dest[3]);
    }
}
