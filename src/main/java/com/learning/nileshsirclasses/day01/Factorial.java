package com.learning.nileshsirclasses.day01;

public class Factorial {
    public static void main(String[] args) {

        int n = 5;
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        System.out.println(result);
        System.out.println(factorial(5));
    }

    public static int factorial(int n) {
        if(n==1)
            return 1;
        return n * factorial(--n);
    }
}
