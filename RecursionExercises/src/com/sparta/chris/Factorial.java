package com.sparta.chris;

public class Factorial {

    public static void start(int input) {
        System.out.println("Factorial of " + input + " = " + factorialRecursive(input));
    }

    // Example of tail recursion as the recursion statement is at the end of the method
    public static long factorialRecursive(int num) {

        if(num < 1) {
            return 1;
        }
        else {
            return num * factorialRecursive(num - 1);
        }

    }

    // Example of head recursion as the recursion statement is at the start of the method
//    public static long factorialRecursive(int num) {
//
//        if(num > 0) {
//            return num * factorialRecursive(num - 1);
//        }
//        else {
//            return 1;
//        }
//
//    }
}
