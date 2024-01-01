package com.GFG.Sorting;

import java.util.Arrays;

public class Q18_LamutoPartition {
    public static void main(String[] args) {
        int arr[] = { 10,80,30,90,40,50,70 };
        LamutoPartition(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void LamutoPartition(int[] arr) {
        int pivot = arr[arr.length - 1]; //if pivot is some other number then swap
        int i = -1; int j = 0;
        while(j<arr.length-1){
            if(arr[j]<=pivot) //handles same element and avoids the original pivot
            {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            j++;
        }
        int temp = arr[++i];//incrementing i
        arr[i] = arr[arr.length-1];
        arr[arr.length-1] = temp;
    }
}
