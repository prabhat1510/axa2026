package com.axa.java.dayfive.stringexample;

public class StringEqualsExample {
    public static void main(String[] args) {

        String s1="Hello";
        String s2="Hello";
        System.out.println(s1==s2); //It will check the object reference return true if both are same
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        //invoking String is s1 and s2 is an object to be compared
        System.out.println(s1.equals(s2));//It will check the value of objects
        String s3="Good";
        String s4="Morning";
        System.out.println(s3==s4);
        System.out.println(s3.equals(s4));
        System.out.println(s1.equalsIgnoreCase("hello"));
        System.out.println("*************************************");
        String s5="Hi All";//Only one object is created in String Pool
        String s6=new String("Hi All");//Using new Object will be created in a Heap new address
        String s7=new String("Hi All");//different new address
        System.out.println(s5==s6); //false because s5 is a string pool object and s6 heap object
        System.out.println(s5.equals(s6));
        /**
         * For String, hashCode() is computed from the characters in the string, not
         * from the memory address.
         * Since all three strings contain exactly
         * their hash codes are identical.
         */
        System.out.println(s5.hashCode());
        System.out.println(s6.hashCode());
        System.out.println(s7.hashCode());
        System.out.println(s7==s6);
        /*
        equals() and hashCode() contract
        1. The first point of the contract is that if you override equals() method,
            you must override hashCode().

        2. If two objects are equal using the equals() method, then they must return
            the same hash code value using the hashCode() method.

        3. If two objects are not equal according to the equals() method, then it is
           not necessary that they must return the same hash code value.
           However, hashCode() method should be i  mplemented in such a way that it
           should return different hashcode for unequal objects, so that the
           performance of the map is better.

        4. Whenever hashcode() is invoked on the same object more than once during
        an execution of a Java program, the hashCode() method must consistently
        return the same integer, given that no information used in equals() method
        on the object is modified. This integer need not remain consistent from
        one execution to another execution of the same application.
        */
        String msg =" Hello World   ";
        System.out.println(msg);
        System.out.println(msg.trim());
        System.out.println(msg.strip());
        System.out.println(msg.stripLeading());
        System.out.println(msg.stripTrailing());
        System.out.println(msg.startsWith("Hello"));

        String msg1 ="Hello Every one how you doing ?";
        System.out.println(msg1.substring(6));
        System.out.println(msg1.substring(6,16));
        System.out.println("Hello ".concat("Rahul"));
        String h1= "hello";
        String h2= " Ramesh";
        System.out.println(h1.concat(h2));
        System.out.println(String.valueOf(15));
        String numStr= "1511";
        System.out.println(String.valueOf(numStr));
        String str="Hi Narendra";
        //str.replace("i","o");
        System.out.println(str.replace("i","o"));




    }
}
