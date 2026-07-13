package com.axa.java.dayfive.oopsconcepts.ecapsulation;

public class Point {
    private int x;
    private int y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x= (x > 79 ? 79 : (x < 0 ? 0 :x));
        //this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        //this.y = y;
        this.y= (y > 24 ? 24 : (y < 0 ? 0 : y));

    }
}
