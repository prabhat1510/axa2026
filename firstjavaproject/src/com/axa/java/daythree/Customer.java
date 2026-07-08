package com.axa.java.daythree;

/**
 * Customer class is blue print of a real world object customer
 * with properties as custId,firstName,lastName,email,address
 */
public class Customer {
    //Properties of a customer object
    //In Java classes below properties
    // custId,firstName,lastName,email,address are referred as instance or object variables
    //or data fields
    private int custId;
    private String firstName;
    private String lastName;
    private String email;
    private String address;

    //No argument constructor or default constructor
    public Customer(){

    }

    //All Arguments constructor or parameterized constructor
    public Customer(int cId, String fName, String lName, String email, String addr) {
        this.custId = cId;
        this.firstName = fName;
        this.lastName = lName;
        this.email = email;
        this.address = addr;
    }

    //Accessor Methods to access or modify the object data outside the class
    //Getter and Setter Methods
    public int getCustId() {
        return custId;
    }

    public void setCustId(int custId) {
        this.custId = custId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
