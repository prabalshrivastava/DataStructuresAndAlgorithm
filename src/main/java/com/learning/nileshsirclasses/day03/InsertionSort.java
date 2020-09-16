package com.learning.nileshsirclasses.day03;

import java.util.Arrays;

import static java.lang.System.out;

public class InsertionSort {
    //1,3,4,5,6,2
    //the array is almost sorted except for the case where the 2 is unsorted

    //insertion technique
    //start comparing 2 with all elements in opposite direction
//    1,3,4,5,6,2


    public static void main(String[] args) {
        Integer[] arr = {1, 3, 4, 5, 6, 2};
        Integer[] arr1 = {1, 4, 5, 6, 2, 3};
        out.println(Arrays.deepToString(insertionSortAscending(arr)));
        out.println(Arrays.deepToString(insertionSortAscending(arr1)));
    }

    public static Integer[] insertionSortAscending(Integer[] arr) {
        int counter = 0;
        int i;
        int j;
        for (i = 0; i < arr.length; i++) {
            Integer temp = arr[i];
            for (j = i - 1; j > -1 && arr[j] > temp; j--) {
                arr[j + 1] = arr[j];
                counter++;
            }
            arr[j + 1] = temp;
        }

        out.println("Number of counters : " + counter);
        return arr;
    }
}
