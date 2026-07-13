package com.axa.java.dayfive.oopsconcepts.associations;

public class Demo {
    public static void main(String[] args) {
        Customer customer = new Customer();
        Address address = new Address();
        address.setAddrId(11);
        address.setBuildingNo(12321);
        address.setBuildingName("Hitler Tower");
        address.setCity("Berlin");
        address.setState("Kiev");
        address.setZip("12345");

        customer.setCustomerId(11111);
        customer.setCustomerName("Adolf Hitler");
        customer.setAddress(address);
        System.out.println(customer);

    }
}
