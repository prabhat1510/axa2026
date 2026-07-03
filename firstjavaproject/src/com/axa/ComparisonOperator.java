package com.axa;
//Comparison or Relational Operator
public class ComparisonOperator {
    public static void main(String[] args) {
        int a = 15;
        int b = 10;
        int c = 15;

        System.out.println(a == b);//False
        System.out.println(a == c);//True
        System.out.println(b != c);//True
        System.out.println(c >= a); //True
        System.out.println(c < b);//false
        System.out.println(c > b); //True
    }
}
