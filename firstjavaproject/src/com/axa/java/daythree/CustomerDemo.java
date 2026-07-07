package com.axa.java.daythree;

public class CustomerDemo {
    public static void main(String[] args) {
        Customer cust1=new Customer();
        //Setting the data after creating an object
        cust1.setCustId(111);
        cust1.setFirstName("Jack");
        cust1.setLastName("Sam");
        cust1.setEmail("jack@gmail.com");
        cust1.setAddress("Tokyo");
        Customer cust2=new Customer();
        //Setting the data after creating an object
        cust2.setCustId(222);
        cust2.setFirstName("Bill");
        cust2.setLastName("Clinton");
        cust2.setEmail("bill@ms.com");
        cust2.setAddress("Honolulu");
        System.out.println(cust1);
        System.out.println(cust2);
        //Accessing objcet cust1 data using getter methods
        System.out.println(cust1.getCustId());
        System.out.println(cust1.getFirstName());
        System.out.println(cust2.getCustId());
    }
}
