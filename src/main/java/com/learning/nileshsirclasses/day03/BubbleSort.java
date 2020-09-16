package com.learning.nileshsirclasses.day03;

import java.util.Arrays;

import static java.lang.System.out;

public class BubbleSort {
    public static void main(String[] args) {

        Integer[] arr = {5, 4, 2, 6, 3, 1};
        out.println(Arrays.deepToString(bubbleSortAscending(arr)));
        out.println(Arrays.deepToString(bubbleSortImprovedAscending(arr)));
        out.println(Arrays.deepToString(bubbleSortImprovedForSortedArrayAscending(arr)));
    }

    public static Integer[] bubbleSortAscending(Integer[] arr) {
        int counter = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                counter++;
                //for ascending use arr[i] > arr[j] for descending arr[i] < arr[j]
                if (arr[j] > arr[j + 1]) {
                    //swap(arr[i], arr[j]);
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        out.println("Number of counters : " + counter);
        return arr;
    }

    public static Integer[] bubbleSortImprovedAscending(Integer[] arr) {
        int counter = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                counter++;
                //for ascending use arr[i] > arr[j] for descending arr[i] < arr[j]
                if (arr[j] > arr[j + 1]) {
                    //swap(arr[i], arr[j]);
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        out.println("Number of counters : " + counter);
        return arr;
    }

    public static Integer[] bubbleSortImprovedForSortedArrayAscending(Integer[] arr) {
        int counter = 0;
        boolean flag = true;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                counter++;
                //for ascending use arr[i] > arr[j] for descending arr[i] < arr[j]
                if (arr[j] > arr[j + 1]) {
                    //swap(arr[i], arr[j]);
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                    flag = false;
                }
            }
            if(flag)
                break;
        }
        out.println("Number of counters : " + counter);
        return arr;
    }
}
