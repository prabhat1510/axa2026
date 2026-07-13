package com.axa.java.dayfive.oopsconcepts.associations.composition;
//Container Class
public class House {

    private final Room livingRoom;

    //Room is created INSIDE the House
    public House() {
        this.livingRoom = new Room("Living Room");
    }

}
