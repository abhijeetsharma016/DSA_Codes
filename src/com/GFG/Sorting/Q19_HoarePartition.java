package com.GFG.Sorting;

import java.util.Arrays;

public class Q19_HoarePartition {
    public static void main(String[] args) {
        int[] arr = {10,3,12,16,5,7,19}; //pivot is not at correct position in hovers partition
        System.out.println(hoarePartition(arr));
        System.out.println(Arrays.toString(arr));
    }
     static int hoarePartition(int[] arr){
        int pivot = arr[0];//considering first element as pivot
        int i = -1, j = arr.length;
        while(true) {
            do {
                i++;
            } while (arr[i] < pivot);
            do {
                j--;
            } while (arr[j] > pivot);
            if (j <= i) {
                return j;
            } else {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
     }
}
