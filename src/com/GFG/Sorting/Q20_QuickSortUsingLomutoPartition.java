package com.GFG.Sorting;

import java.util.Arrays;

public class Q20_QuickSortUsingLomutoPartition {
    public static void main(String[] args) {
        int[] arr = {8, 9, 6, 7, 1, 3};
        int l = 0, h = arr.length-1;
        quickSort(arr,l,h);
        System.out.println(Arrays.toString(arr));
    }


    public static void quickSort(int[] arr, int l, int h){
        if(l<h) {
            int p = LomutoPartition(arr, l, h);
            quickSort(arr, l, p-1);
            quickSort(arr, p+1, h);

        }

    }

    public static int LomutoPartition(int[] arr, int l, int h) {
        int i = l-1;
        int pivot = arr[h];
        for(int j = l; j<h; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            j++;
        }
        int temp = arr[i+1];
        arr[i+1] = arr[h];
        arr[h] = temp;
        return i+1;
    }
}
