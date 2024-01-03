package com.GFG.Sorting;

import java.util.Arrays;

public class Q21_QuickSortUsingHoarePartition {
    public static void main(String[] args) {
        int[] arr = {5,4,6,5,3,2,1};
        int l = 0, h = arr.length-1;
        quckSortUsingHoarePartition(arr, l, h);
        System.out.println(Arrays.toString(arr));
    }
    public static void quckSortUsingHoarePartition(int[] arr, int l, int h){
        if(l<h) {
            int p = horaePartition(arr, l, h);
            quckSortUsingHoarePartition(arr, l, p);//cant do (arr, l, p-1) here and (arr, p, h) below as our pivot is the first element
            // and doing that can lead to an infinite loop.
            quckSortUsingHoarePartition(arr, p+1, h);
        }
    }

    public static int horaePartition(int[] arr, int l, int h) {
        int i = l-1;
        int j = h+1;
        int pivot = arr[i+1];
        while (true) {
            do {
                i++;
            } while (arr[i] < pivot);
            do {
                j--;
            } while (arr[j] > pivot);
            if (i >= j) {
                return j;
            }
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
}
