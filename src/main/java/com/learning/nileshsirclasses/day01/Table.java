package com.learning.nileshsirclasses.day01;

public class Table {
    public static void main(String[] args) {
        int n = 10;
        for (int i = 1; i <= n; i++) {
            System.out.printf("%s X %s = %s%n", i, n, i * n);
        }
        //complexity is O(1)
    }
}
