package com.axa.java.daysix;

public class B extends A{

    int c;
    B(int m, int n, int o){
        super(m,n);
        c = o;
    }
    void display() {
        System.out.println("c :" + c);
    }

}
