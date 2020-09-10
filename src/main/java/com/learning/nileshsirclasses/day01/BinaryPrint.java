package com.learning.nileshsirclasses.day01;

import static java.lang.System.out;

public class BinaryPrint {
    public static void main(String[] args) {
        int n = 10;
        int i = n;
        String s = "";
        while (i >= 1) {
            s = s + (i % 2);
            out.println(s);
            i = i / 2;
        }
        out.println(s);
    }
}
