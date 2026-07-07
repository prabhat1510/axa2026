package com.axa.java.daythree;

/**
 * What is class in a Java Program?
 * A class is a blueprint of a real world object
 * Objects will have its own properties and behavior
 * For Example : Customer -- custId,custName,address,mobile
 *          Transaction--- transactionId,transcationDateandTime,status,amount
 *          Payment --- amount,modeofpayment,customer,transaction
 *          Policy --- policyId,policyType,inceptionDateAndTime,expirationDateAndTime,covers,noOfInsured,policyHolder,paymentsDetails,insuredAmount
 */
public class OOPSConceptExample {

    public static void main(String[] args) {
        //Creating an object of a Customer by calling Constructor of the class using new keyword
        Customer customer1 = new Customer(); //customer1 is an object or instance of a Customer class
        Customer customer2 = new Customer();
        Customer customer3 = new Customer();
        //Creating an object using parameterized constructor
        Customer customer4 = new Customer(11,"Rahul","Gandhi","rahul@inc.com","New Delhi");

        //Accessing object data using accessor methods
        int customer1Id = customer1.getCustId();
        System.out.println(customer1Id);
        int customer2Id = customer2.getCustId();
        System.out.println(customer2Id);
        String customer1firstName = customer1.getFirstName();
        String customer1lastName = customer1.getLastName();
        System.out.println(customer1firstName);
        System.out.println(customer1lastName);
        int customer4Id = customer4.getCustId();
        String customer4firstName = customer4.getFirstName();
        System.out.println(customer4firstName);
        System.out.println(customer4Id);


    }
}
