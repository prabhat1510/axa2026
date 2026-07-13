package com.axa.java.daysix;

public class CreditCardPayment extends Payment {
    public void getPayment(int amount){
        System.out.println("Payment with credit card ,received :" + amount);
    }
}
