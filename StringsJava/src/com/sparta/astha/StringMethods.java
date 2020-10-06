package com.sparta.astha;

public class StringMethods {

    public void stringMethods(String s){
        //s=ProgrammingWithJava
        System.out.println("------STRING METHODS STARTS-----");
        //length()-calculate length
        System.out.println(s.length());

        //charAt()-returns character at a specified index otherwise throws exception
        System.out.println(s.charAt(0));

        //indexOf()-looks at character in the string and returns the first index that matches the desired value otherwise returns -1
        System.out.println(s.indexOf("c"));
        System.out.println(s.indexOf("c",5));

        //substring()-looks for characters in a string and returns part of the string-substring(startAt) or substring(startAt, endAt) excludes endAt and returns the rest
        System.out.println(s.substring(3));
        System.out.println(s.substring(3,6));

        //Lower and Upper Case-String is immutable so it is going to return a copy of the string in upper case or lower case
        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());
        System.out.println(s);

        //equals(Object obj)-checks whether two String Objects contain exactly the same characters in the same order. Takes an object rather than a string because the method is same of all objects
        //equalsIgnoreCase(String str)-same as above just that it ignores the case as well. Only applies to String
        System.out.println("abc".equals("ABC"));
        System.out.println("ABC".equals("ABC"));
        System.out.println("abc".equalsIgnoreCase("ABC"));

        ////startsWith() and endsWith()-looks at whether the provided value matches part of the String. It is case-sensitive

        System.out.println(s.startsWith("p"));
        System.out.println(s.startsWith("P"));
        System.out.println(s.endsWith("a"));
        System.out.println(s.endsWith("A"));

        System.out.println("---CONTAINS-----");
        //contains()-method looks for matches in the String. The match can be anywhere. It is case-sensitive.

        System.out.println(s.contains("a"));
        System.out.println(s.contains("A"));

        //replace()-does a simple search and replaces the string  replace(target_old, replacement_new)
        //takes in char

        System.out.println(s.replace('a', 'A'));

        //takes in string
        System.out.println(s.replace("mm","AM"));
        System.out.println(s);
        //Homework-Demo on split(),strip(), trim(), stripLeading(), stripTrailing()
        System.out.println("------STRING METHODS END-----");






    }
}
