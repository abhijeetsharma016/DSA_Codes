package com.GFG.Sorting;

import java.util.Arrays;

public class Q1_SortingBuiltInMethords {
    public static void main(String[] args) {

        // 1. Sorting notmal array
        int[] arr = {13, 7, 6, 45, 21, 9, 101, 102};
        //int[] temp = Arrays.copyOf(arr,arr.length);
        //OR
        int[] temp = arr.clone();
        Arrays.sort(arr);
        System.out.printf("Modified arr[] : %s",
                Arrays.toString(arr));

        //reassigning values
        arr = temp;
        System.out.println(Arrays.toString(arr));

        //2. Sorting sumArray
        Arrays.sort(arr,1,4);
        System.out.println(Arrays.toString(arr));
    }
}
