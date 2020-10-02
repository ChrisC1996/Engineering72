package com.sparta.chris;

public class Factorial {

    public static void showFactorial(int num) {
        System.out.println("Factorial of " + num + " is " + calcFactorial(num));
    }

    public static long calcFactorial(int number) {

        int factorial = 1;

        if(number==0) {
            return 1;
        }
        else {
            for(int i=1;i<=number;i++) {
                factorial *= i;
            }
        }

        return factorial;

    }

}
