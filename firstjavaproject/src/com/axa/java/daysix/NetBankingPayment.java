package com.axa.java.daysix;

public class NetBankingPayment extends Payment{
    public void getPayment(int amount){
        System.out.println("Payment via netbanking received :" + amount);
    }
}
