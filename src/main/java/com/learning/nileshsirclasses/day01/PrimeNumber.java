package com.learning.nileshsirclasses.day01;

import static java.lang.System.out;

public class PrimeNumber {
    public static void main(String[] args) {
        int n = 7;
        boolean isPrime = true;


        int lastElement = 5;
        for (int j = 1; j <= lastElement; j++) {
            int i;
            for (i = 2; i < j; i++) {
                if (j % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (i == j) {
                out.println("Prime " + j);
            } else {
                out.println("Non Prime " + j);
            }
        }
    }
}

//lastElement     i       j       i < j     true/false
//5               2       1       2 < 1     false
//
//5               1       2       1