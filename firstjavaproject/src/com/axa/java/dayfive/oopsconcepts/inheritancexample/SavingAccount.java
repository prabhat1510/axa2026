package com.axa.java.dayfive.oopsconcepts.inheritancexample;

public class SavingAccount extends Account{

    public void depositInterest(Double interestRate,Double balanceAmount){
        Double interest = balanceAmount * interestRate;
        Double balance = interest + balanceAmount;
        System.out.println("Balance along with interest is ---"+balance);

    }
}
