package com.axa.java.dayfive.oopsconcepts.associations;

import java.util.List;

public class Customer {
    private Integer customerId;
    private String customerName;
    //One Customer has one address-- Association one to one
    private Address address;
    //One to many association  . Here List is a collection to store collection of data
    //private List<Address> addresses;

    public Customer() {
    }

    public Customer(Integer customerId, String customerName, Address address) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.address = address;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
