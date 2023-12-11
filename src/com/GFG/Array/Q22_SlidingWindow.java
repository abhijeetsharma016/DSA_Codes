package com.GFG.Array;

import java.util.Arrays;
import java.util.Scanner;

public class Q22_SlidingWindow {
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
        System.out.println("enter the value of k: ");
        int k = sc.nextInt();
        System.out.println(slidingWindow(arr,size, k));
    }

    public static int slidingWindow(int[] arr, int size, int k) {
        int count = 0;
        for (int i = 0; i < k; i++) {
            count += arr[i];
        }
        int res = count;
        for(int i=k; i<size;i++){
         count = count-arr[i-k]+arr[i];
         res = Math.max(count, res);
        }
        return res;
    }
}
