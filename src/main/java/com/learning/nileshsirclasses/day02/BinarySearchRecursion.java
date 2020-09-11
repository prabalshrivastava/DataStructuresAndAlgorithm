package com.learning.nileshsirclasses.day02;

import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class BinarySearchRecursion {
    public static void main(String[] args) {
        //Binary search can only be used when the array is in the sorted order.
        //if we have an array in random order then we need to sort it first.
        //complexity = sorting + binary search.

        //eg if we have to open 726 page number.
        //we will first look at the middle or maybe open 800
        //and then go towards previous side.

        //we are able to do so because our book is already in sequence.

        //We will always try to divide the array into equal parts
        //We will always search using binary search when :
        //1. When we have a sorted collection
        //2. Random access

        int[] arr = {11, 22, 33, 44, 55, 66, 77, 88, 99};
        out.println("Enter the element to be searched : ");
        Scanner scanner = new Scanner(System.in);
        int element = scanner.nextInt();
        int index = binarySearchRecursion(arr, element, 0, arr.length - 1);
        out.println(index);
        if (index == -1) {
            out.println("Element not Found");
        } else {
            out.println("Element Found at index : " + index);
        }
    }

    public static int binarySearchRecursion(int arr[], int element, int left, int right) {
        int mid = (left + right) / 2;
        if (right < left) {
            return -1;
        }
        int index;
        if (element == arr[mid]) {
            return mid;
        } else if (element < arr[mid]) {
            right = mid - 1;
            index = binarySearchRecursion(arr, element, left, right);
        } else {
            left = mid + 1;
            index = binarySearchRecursion(arr, element, left, right);
        }
        return index;
    }
}
