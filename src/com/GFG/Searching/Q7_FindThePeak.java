package com.GFG.Searching;

import java.util.Arrays;
import java.util.Scanner;

public class Q7_FindThePeak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        for(int i = 0; i<size; i++){
            System.out.print("Enter the " + (i+1) + " element: ");
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));

        System.out.println("The peak is: " + findPeak(arr,size));
    }

    public static int findPeak(int[] arr, int size) {
        int l = 0;
        int r = size-1;
        int mid = 0;

        while (l <= r) {

            // finding mid by binary right shifting.
            mid = (l + r) >> 1;

            // first case if mid is the answer
            if ((mid == 0
                    || arr[mid - 1] <= arr[mid])
                    && (mid == size - 1
                    || arr[mid + 1] <= arr[mid]))
                break;

            // move the right pointer
            if (mid > 0 && arr[mid - 1] > arr[mid])
                r = mid - 1;

                // move the left pointer
            else
                l = mid + 1;
        }

        return mid;
    }
}
