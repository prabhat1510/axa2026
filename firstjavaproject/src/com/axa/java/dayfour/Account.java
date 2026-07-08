package com.axa.java.dayfour;

public class Account {
    //instance variable
    private double balance;

    public Account() {
    }

    public Account(double balance) {
        this.balance = balance;
    }

    //amount is an argument or parameter of the method
    public void  deposit(double amount){
        this.balance = this.balance + amount;
    }
    public void withdraw(double amount){
        int min_balance = 100; //min_balance is a local variable to withdraw method
        if (this.balance < min_balance){
            System.out.println("Insufficient balance");
        }else{
            this.balance = this.balance - amount;
        }
    }
    public double getBalance(){
        return this.balance;
    }
}
