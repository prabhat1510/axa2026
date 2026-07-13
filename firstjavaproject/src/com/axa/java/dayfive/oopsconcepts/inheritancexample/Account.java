package com.axa.java.dayfive.oopsconcepts.inheritancexample;
//Account class is Super Class or Parent Class or Base Class
public class Account {
    private Integer accountId;
    private Double balance;

    public void withdraw(Integer amount){
        if(this.balance >= amount){
            this.balance = this.balance - amount;
        }else{
            System.out.println("Insufficient balance");
        }
    }

    public void deposit(Integer amount){
        if(amount > 0){
            this.balance += amount;
        }
    }
    public Double checkBalance(){
        return this.balance;
    }
}
