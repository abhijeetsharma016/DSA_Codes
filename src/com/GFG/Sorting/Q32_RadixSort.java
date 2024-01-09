package com.GFG.Sorting;

public class Q32_RadixSort {
    public static void main(String[] args) {
        int arr[] = { 319,212,6,8,100,50 };
        int n = arr.length;
        radixsort(arr, n);

        for (int i = 0; i < n; i++)
            System.out.print( arr[i] + " ");
    }

    public static void radixsort(int[] arr, int n) {
        int max = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        for (int exp = 1; max / exp > 0; exp *= 10) {
            CountSort(arr, n, exp);
        }
    }

    public static void CountSort(int[] arr, int n, int exp) {
        int[] count = new int[10];
        int[] output = new int[n];

        for (int i = 0; i < n; i++) {
            count[(arr[i]/exp)%10]++;
        }

        for (int i = 1; i < 10; i++) {
            count[i] = count[i]+count[i-1];
        }

        for (int i = n - 1; i >= 0; i--) {
            output[count[(arr[i]/exp)%10] -1] =  arr[i];
            count[(arr[i]/exp)%10]--;
        }
        for (int i = 0; i < n; i++)
            arr[i] = output[i];

    }
}
