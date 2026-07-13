package com.axa.java.dayfive.oopsconcepts.inheritancexample.ex;

public class B extends A{
    int total;
    void sum( ){
        //total = money + pocketMoney;//Error
        total = money + getPocketMoney();
    }
}

