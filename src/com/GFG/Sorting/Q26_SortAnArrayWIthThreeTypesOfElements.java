package com.GFG.Sorting;

import java.util.Arrays;

/*This video discusses a famous interview problem in which you need to segregate an array of elements containing three types of elements. The types are:

Sort an array of 0s, 1s, 2s.
Three-way partitioning when multiple occurrences of a pivot may exist.
Partitioning around a range.*/
public class Q26_SortAnArrayWIthThreeTypesOfElements {
    public static void main(String[] args) {
        int[] arr = {0,1,2,0,1,2,2,2,2,0,0,1};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void sort(int[] arr){
        int mid =0, low = 0, high = arr.length-1;
        while(mid<high){
            if(arr[mid]==0){
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                mid++;
                low++;
            } else if (arr[mid]==1) {
                mid++;
            }
            else{
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
        }
    }
}
