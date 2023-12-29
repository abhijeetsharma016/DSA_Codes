package com.GFG.Sorting;

import java.util.Arrays;

public class Q11_MergeTwoSortedArrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7, 9};
        int[] arr2 = {2, 4, 6, 8};
        int[] arr3 = new int[arr1.length+arr2.length];
        Merge(arr1,arr2,arr3);
        System.out.println(Arrays.toString(arr3));
    }
    public static void Merge(int[] arr1,int[] arr2,int[] arr3){
        int i =0,j=0,k=0;
        while (i < arr1.length && j < arr2.length) {
            if(arr1[i]<arr2[j]) {
                arr3[k] = arr1[i];
                i++;
            }
            else{
                arr3[k] = arr2[j];
                j++;
            }
            k++;
        }
        while(i<arr1.length){
            arr3[k]=arr1[i];
            i++;
            k++;
        }
        while(j<arr2.length){
            arr3[k] = arr2[j];
            j++;
            k++;
        }
    }
}
