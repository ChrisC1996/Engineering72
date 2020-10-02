package com.sparta.chris;

import java.sql.SQLOutput;

public class Fibonacci {

    public static void start(int input) {
        System.out.println(Fibonacci.fibonacciRecursive(input));
        Fibonacci.listSteps(input);
    }



    public static void listSteps(int steps) {
        for(int i=0; i<=steps; i++) {
            System.out.print(Fibonacci.fibonacciRecursive(i) + ", ");
        }
        System.out.print("\n");
    }

    public static int fibonacciRecursive(int steps) {

        if(steps == 0 ) {
            return 0;
        }
        if(steps == 1) {
            return 1;
        }
        else {
            return fibonacciRecursive(steps-1) + fibonacciRecursive(steps - 2);
        }

    }

}
