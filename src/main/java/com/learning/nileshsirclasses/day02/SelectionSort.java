package com.learning.nileshsirclasses.day02;

import java.util.Arrays;

import static java.lang.System.*;

public class SelectionSort {
    public static void main(String[] args) {

        Integer[] arr = {5, 4, 2, 6, 3, 1};
        out.println(Arrays.deepToString(selectionSortAscending(arr)));
        out.println(Arrays.deepToString(selectionSortDescending(arr)));
    }

    public static Integer[] selectionSortAscending(Integer[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                //for ascending use arr[i] > arr[j] for descending arr[i] < arr[j]
                if (arr[i] > arr[j]) {
                    //swap(arr[i], arr[j]);
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    public static Integer[] selectionSortDescending(Integer[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                //for ascending use arr[i] > arr[j] for descending arr[i] < arr[j]
                if (arr[i] < arr[j]) {
                    //swap(arr[i], arr[j]);
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}
