package com.axa.java.daysix;

class A1{}
class A2 extends A1{

}
public class A3 {
    public static void main(String[] args) {
        A1 x;// x is a type of base class A1
        A2 z=new A2(); //z is a type of derived class A2
        x= new A2();//valid
        //z=new A1();//invalid
    }
}
