package com.GFG.Sorting;

import java.util.Arrays;

public class Q13_MergeSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        int l = 0, r = arr.length - 1;
        MergeSort(arr,l,r);
        System.out.println(Arrays.toString(arr));
    }
    public static void MergeSort(int[] arr,int l, int r){
        int mid = l+(r-l)/2;
        if(l<r) {

            MergeSort(arr, l, mid);
            MergeSort(arr, mid + 1, r);

            //Merge two array
            Merge(arr, l, mid, r);
        }
    }


    public static void Merge(int[] arr, int l, int mid, int r){
        int n1 = mid-l+1;//arr1 contains mid
        int n2 = r - mid;//arr2 dont contains mid

        int[] arr1 = new int[n1];
        int[] arr2 = new int[n2];

        for (int i = 0; i < n1; i++) {
            arr1[i] = arr[l+i];
        }
        for (int i = 0; i < n2; i++) {
            arr2[i] = arr[mid+1+i];
        }

        //Merging temp arrays
        int i =0, j =0, k =l;
        while (i < n1 && j < n2) {
            if (arr1[i] <= arr2[j]) {
                arr[k] = arr1[i];
                i++;
            } else {
                arr[k] = arr2[j];
                j++;
            }
            k++;
        }
        while(i<n1){
            arr[k] = arr1[i];
            i++;
            k++;
        }
        while(j<n2){
            arr[k] = arr2[j];
            j++;
            k++;
        }
    }
}