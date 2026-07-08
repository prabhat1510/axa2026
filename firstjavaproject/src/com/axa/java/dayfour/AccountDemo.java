package com.axa.java.dayfour;

public class AccountDemo {
    public static void main(String args[]) {
        System.out.println(args[0]);
        System.out.println(args[1]);

        Account acc1; //acc1 is variable of type Account class
        acc1 = new Account();// using new operator we are calling constructor
        System.out.println(acc1);//acc1 is a reference variable or object or instance
        System.out.println(acc1.hashCode());


    }
}
