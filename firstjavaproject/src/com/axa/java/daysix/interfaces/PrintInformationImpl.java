package com.axa.java.daysix.interfaces;

public class PrintInformationImpl implements PrintInformation{
    @Override
    public void printInformation() {
        System.out.println("Inside Interface printInformation method");
    }

    @Override
    public void printInfo() {
        System.out.println("Inside Interface printInfo method");
    }
}
