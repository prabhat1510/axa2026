package com.axa;

public class LogicalOperators {
    public static void main(String[] args) {
        boolean a = false;
        boolean b = false;
        System.out.println(a && b);
        //b=true;
        System.out.println(a || b);
        a=true;
        System.out.println(a && b);
        System.out.println(a || b);
        System.out.println(!(a && b));
    }
}
