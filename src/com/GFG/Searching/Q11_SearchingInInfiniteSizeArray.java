package com.GFG.Searching;

// Java code to implement the approach

import java.io.*;
import java.util.*;

// Java program to demonstrate working of
// an algorithm that finds an element in an
// array of infinite size

public class Q11_SearchingInInfiniteSizeArray {

    static int findPos(int[] arr, int target)
    {
        // first find the range
        // first start with a box of size 2
        int start = 0;
        int end = 1;

        // condition for the target to lie in the range
        while (target > arr[end]) {
            int temp = end + 1; // this is my new start
            // double the box value
            // end = previous end + sizeofbox*2
            end = end + (end - start + 1) * 2;
            start = temp;
        }
        return binarySearch(arr, target, start, end);
    }
    static int binarySearch(int[] arr, int target,
                            int start, int end)
    {
        while (start <= end) {
            // find the middle element
            //		 int mid = (start + end) / 2; //
            //		 might be possible that (start +
            //		 end) exceeds the range of int in
            //		 java
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            }
            else if (target > arr[mid]) {
                start = mid + 1;
            }
            else {
                // ans found
                return mid;
            }
        }
        return -1;
    }

    // Driver code
    public static void main(String[] args)
    {
        int[] arr = { 3, 5, 7, 9, 10, 90,
                100, 130, 140, 160, 170 };
        int target = 10;
        // Function call
        int ans = findPos(arr, target);
        if (ans == -1)
            System.out.println("Element not found");
        else
            System.out.println("Element found at index "
                    + ans);
    }
}