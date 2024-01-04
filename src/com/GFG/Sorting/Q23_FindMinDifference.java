package com.GFG.Sorting;

import java.util.Arrays;

//Check question of max difference in Array package
public class Q23_FindMinDifference {
    public static void main(String[] args) {
        int[] arr = {10,9,6,1,2,4,8,7};
        sortArray(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
        System.out.println(findMinDifference(arr));
    }
    public static void sortArray(int[] arr, int l, int h){
        if(l<h) {
            int p = hoareSort(arr, l, h);
            sortArray(arr, l, p);
            sortArray(arr, p + 1, h);
        }
    }
    public static int hoareSort(int [] arr, int l, int h){
        int i = l, j = h;
        int pivotIndex = l + (int) (Math.random() * (h - l + 1));
        int pivot = arr[pivotIndex];
        while(true) {
            while (i< arr.length && arr[i] < pivot) {
                i++;
            }
            while(j>=0 && arr[j]>pivot){
                j--;
            }
            if(i>=j){
                return j;
            }
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    public static int findMinDifference(int[] arr) {
        int min = Integer.MAX_VALUE;
        if(arr.length ==1){
            return arr[0];
        }
        for (int i = 1; i < arr.length; i++) {
            if(min>(arr[i] - arr[i-1])){
                min = arr[i] - arr[i-1];
            }
        }
        return min;
    }
}