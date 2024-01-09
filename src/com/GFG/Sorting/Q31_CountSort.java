package com.GFG.Sorting;

// time complexity is n+k for small values, but may grow exponentially for larger values hence we use count sort as subroutine in
// Radix sort
public class Q31_CountSort {
    public static void main(String[] args) {
        int arr[] = { 1,4,4,1,0,1 };
        int n = arr.length; int k=5; //k is the max value present in arr + 1 as 0 is also present in array
        countSort(arr, n, k);

        for (int i = 0; i < n; i++)
            System.out.print( arr[i] + " ");
    }

    public static void countSort(int[] arr, int n, int k) {
        int[] count = new int[k];
        for (int i = 0; i < k; i++) {
            count[i]=0;
        }
        for(int i = 0;i<n;i++){
            count[arr[i]]++; //Use an auxiliary array to keep a track of all elements including duplicate elements present in array
        }
        for(int i=1;i<k;i++){
            count[i] = count[i-1]+count[i]; //modifying the value of count as, new value = all elements present which are smaller
            // then current element + number of duplicates present
        }
        int[] output = new int[n];
        for (int i = n - 1; i >= 0; i--) {//starting from last element as we need array to be stable
            output[count[arr[i]]-1] = arr[i]; //first find element in arr then find its location in sorted output array
            // using count, count contain number of element smaller than current element + number of duplicates present
            // we did -1 to find index of the element;
            count[arr[i]]--;
        }

        //now update origignal array
        for(int i = n-1;i>=0;i--){
            arr[i] = output[i];
        }


        }
}
