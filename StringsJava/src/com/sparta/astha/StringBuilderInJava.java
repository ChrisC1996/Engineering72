package com.sparta.astha;

public class StringBuilderInJava {

    public void methodStringBuilder(){
        //StringBuilder is mutable but not thread-safe
        //Before StringBuffer-quite obsolete. It is synchronized-thread-safe but quite slow.
        //StringBUilder is compatible with StringBUffer and useful for applications which is a single thread one
        System.out.println("------STRING BUILDER START----");
        StringBuilder sb=new StringBuilder("hello");
        sb.append("hi");
        System.out.println(sb);

        String value=sb.toString();

        //Many methods-length(), reverse(), replace(), insert()

        System.out.println("------STRING BUILDER END----");

    }
}
