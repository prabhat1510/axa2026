package com.axa.java.daythree.exercise;

public class Account {
    private int accountNumber;
    private int pin;
    private int balance;

    public Account() {
    }

    public Account(int accountNumber, int pin, int balance) {
        this.accountNumber = accountNumber;
        this.pin = pin;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int withdraw(int amount) {
        if(balance >= amount){
            balance = balance - amount;
        }
        return balance;
    }
    public int deposit(int amount) {

        balance = balance + amount;
        return balance;
    }
    public String verifyPin(int pin) {
            if(this.pin == pin){
                return "PIN VALID";
            }else{
                return "PIN INVALID";
            }
    }
}
