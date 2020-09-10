package com.learning.nileshsirclasses.day01;

import static java.lang.System.out;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = new int[10];
        arr[1] = 10;
        arr[2] = 20;
        arr[3] = 30;
        arr[4] = 40;
        arr[5] = 50;
        arr[6] = 60;
        arr[7] = 70;
        arr[8] = 80;
        arr[9] = 90;
        arr[0] = 0;

        out.println(linearSearch(arr, 70));
    }

    static int linearSearch(int[] a, int key) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == key) {
                return i;
            }
        }
        return -1;
    }
}
