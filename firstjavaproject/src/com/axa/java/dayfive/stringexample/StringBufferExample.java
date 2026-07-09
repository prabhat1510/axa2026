package com.axa.java.dayfive.stringexample;

public class StringBufferExample {

    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("Hi Narendra");
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        sb.append(" Hope Monsoon Session of Parliament will be good one");
        System.out.println(sb);
        sb.insert(3,"Rahul and ");
        System.out.println(sb);
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        System.out.println("*********************************");
        StringBuffer sb1 = new StringBuffer();
        System.out.println(sb1.capacity());//Default capacity is 16
        System.out.println("****************SB1 Start*****************");
        System.out.println(sb1.length());//0
        sb1.append("Hi");
        System.out.println(sb1.capacity());
        System.out.println(sb1.length());
        System.out.println("*************SB1 End********************");
        StringBuffer sb2 = new StringBuffer("Hi Narendra");//16 +11
        System.out.println(sb2.capacity());//Default capacity is 16
        System.out.println(sb2.length());
        System.out.println("***************SB2 End*******************");
        StringBuffer sb3 = new StringBuffer();
        System.out.println(sb3.capacity());//default 16
        System.out.println(sb3.length());//0
        sb3.append("Hi Narendra How ");//Exact 16 characters
        System.out.println(sb3.capacity());//16
        System.out.println(sb3.length());//16
        sb3.append("are");//3 more character Formula to calculate -> nc=(oc*2)+2
        System.out.println(sb3.capacity());
        System.out.println(sb3.length());
    }
}
