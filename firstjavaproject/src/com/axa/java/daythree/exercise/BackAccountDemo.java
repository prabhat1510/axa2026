package com.axa.java.daythree.exercise;

import java.sql.SQLOutput;
import java.util.Scanner;

/**
 * As user I should be able to
 * 1. Valid user  to should be able to perform below tasks
 * 2. deposit the money and display total balance after deposit
 * 3. withdraw the amount and display total balance after withdraw
 * 4. display balance - check balance
 * Consider initial balance as 1000 rupees
 */
public class BackAccountDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your account number");
        int accountNumber = sc.nextInt();
        System.out.println("Enter your pin");
        int pin = sc.nextInt();
        Account account = new Account(accountNumber,pin,1000);
        String isPinVerified =  account.verifyPin(pin);
        if(isPinVerified.equals("PIN VALID")){
        while(true){
                System.out.println("Select the operation you want to perform");
                System.out.println("1. Deposit");
                System.out.println("2. Withdraw");
                System.out.println("3. Check Balance");
                System.out.println("4. Exit");
                int choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        System.out.println("Enter amount to deposit ");
                        int amount = sc.nextInt();
                        account.deposit(amount);
                        System.out.println("Deposited "+amount);
                        System.out.println("Balance is  "+account.getBalance());
                        break;
                    case 2:
                        System.out.println("Enter amount to withdraw");
                        int amount2 = sc.nextInt();
                        System.out.println("Enter your pin");
                        int userpin = sc.nextInt();
                        if(account.verifyPin(userpin).equals("PIN VALID")){
                            if(account.getBalance()>=amount2){
                                account.withdraw(amount2);
                                System.out.println("Withdrawn "+amount2);
                                System.out.println("Balance is  "+account.getBalance());
                            }else{
                                System.out.println("Insufficient balance");
                            }

                        }else{
                            System.out.println("PIN INVALID");
                        }

                        break;
                    case 3:
                        System.out.println("Balance is  "+account.getBalance());

                        break;
                    case 4:
                        System.exit(0);
                    default:
                        System.out.println("Invalid choice");
                }

            }
        }else{
            System.out.println("Invalid Pin");
            System.exit(0);
        }
    }
}
