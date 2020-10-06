package com.sparta.astha;

public class HashCodeDemo {


    public void hashCodeMethod(){
        var s1 = "Hello World";
        String s2 = "Hello World";
        String s3 = new String("Hello World");
        String s4 = "Hello World";
        String s5 = new String("Hello World");



        // We can add an existing string to the pool using the intern method
        String s6 = s5.intern();
        if (s2.equals(s3)) {
            System.out.println("TRUE");
        }


        //Hash code is overriden - should return the same value for each string
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());
        System.out.println(s4.hashCode());
        System.out.println(s5.hashCode());

        Object o1=new Object();
        Object o2=new Object();

        Integer i1=1;
        Integer i2=1;



        System.out.println(o1.equals(o2));
        System.out.println(o1.hashCode());
        System.out.println(o2.hashCode());
        System.out.println(i1.equals(i2));
        System.out.println(i1.hashCode());
        System.out.println(i2.hashCode());

        //returns the original, not overridden, hashcode - shows different values for new strings
        System.out.println("");
        System.out.println(System.identityHashCode(s1));
        System.out.println(System.identityHashCode(s2));
        System.out.println(System.identityHashCode(s3));
        System.out.println(System.identityHashCode(s4));
        System.out.println(System.identityHashCode(s5));
        System.out.println(System.identityHashCode(s6));

        System.out.println("");
        System.out.println(System.identityHashCode("Hello World"));
        System.out.println(System.identityHashCode(new String("Hello World")));
    }
}
