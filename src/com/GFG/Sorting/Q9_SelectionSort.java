package com.GFG.Sorting;

import java.util.Arrays;

public class Q9_SelectionSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        SelectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void SelectionSort(int[] arr) {
        int n = arr.length;
        for(int i=0;i<n;i++){
            int min = i;
            for(int j=i+1;j<n;j++){
                if(arr[min]>arr[j]){
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }
}
