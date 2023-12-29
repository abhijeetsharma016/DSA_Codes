package com.GFG.Sorting;

import java.util.Arrays;

public class Q10_InsertionSort {
    public static void main(String[] args) {
        int[] arr = {3,2,1,3,4};
        InsertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void InsertionSort(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j>=0 && key < arr[j]){
            arr[j + 1] = arr[j];
            j--;
        }
            arr[j+1]= key;
        }
    }
}
