package com.axa.java.dayfour.staticexample;

public class Sample {
    int i_val=10;
    Sample(int i_val){
        this.i_val=i_val;
        System.out.println("Inside Sample "+this.i_val);
    }

    public static void main(String[] args) {
        /*System.out.println(this.i_val);
        System.out.println(Sample.i_val);
        Sample s=new Sample();
        s.i_val=10;*/
        Sample o = new Sample(20);
        //Sample o2 = new Sample();

    }
}
