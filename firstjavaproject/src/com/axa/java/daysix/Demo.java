package com.axa.java.daysix;

public class Demo {
    public static void main(String[] args) {
        B subObj = new B(4,5,6);
        subObj.display();
        A subObj2 = new A(4,5);
        subObj2.display();
        CreditCardPayment obj = new CreditCardPayment();
        obj.getPayment(41);
        obj.getPayment(15);
        NetBankingPayment obj2 = new NetBankingPayment();
        obj2.getPayment(14);
        obj2.getPayment(15);
    }
}
