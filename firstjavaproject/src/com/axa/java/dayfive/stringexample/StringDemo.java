package com.axa.java.dayfive.stringexample;

import java.sql.SQLOutput;

public class StringDemo {

    public static void main(String[] args) {
        //Create a new String
        String str = "abc";// String object is created in a memory
        System.out.println(str.hashCode());
        str=str.toUpperCase(); //str.toUpperCase() this creates a new object whose value is ABC
        System.out.println(str.hashCode());

        System.out.println(str);
        System.out.println(str.length());
        //             012345678910   start position is 0 and end with length-1
        String str2 = "Hello World";
        System.out.println(str2.length());
        System.out.println(str2.hashCode());
        char ch = str2.charAt(6);
        System.out.println(ch);
        System.out.println(str2.charAt(2));
        System.out.println(str2.indexOf('l'));
        String name="Bill";
        //                01234567891011
        String greetigs ="Good Morning";
        for(int i=0;i<greetigs.length();i++){
            if(greetigs.charAt(i) == 'o'){
                System.out.println("Index of "+ greetigs.charAt(i) +" is "+i);
            }
        }
        Employee e = new Employee();//employee object in memory referred by e variable
        e.setFirstName("Bill");//setting value to variable firstName so in memory a new object
        e.setLastName("Gates");
        e.setEmail("Bill@gates");
        e.setSalary(10000);
        e.setId(10);
        System.out.println(e.getFirstName());
        System.out.println("***********************");
        String str3="Hello";
        System.out.println(str3.hashCode());
        String str4="Hello";
        System.out.println(str4.hashCode());
        str4="All";
        System.out.println(str4.hashCode());

        System.out.println("*************Concatenation of two String*********");
        String myname = "Varun";
        String message="Hello "+myname;
        System.out.println(message);
        System.out.println("Hello All "+"How you doing ?");
        System.out.println("Addition of two numbers "+15+" + "+10+" = "+(15+10));

    }
}
