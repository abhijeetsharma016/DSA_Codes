package com.GFG.Sorting;

public class Q29_CycleSort {
    public static void main(String[] args) {
        int arr[] = {1, 8, 3, 9, 10, 10, 2, 4};
        int n = arr.length;
        cycleSort(arr, n);

        System.out.println("After sort : ");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }

    public static void cycleSort(int[] arr, int n) {
        for (int cycle_start = 0; cycle_start < n - 1; cycle_start++) {
            int item = arr[cycle_start];
            int pos = 0;

            for (int i = cycle_start + 1; i < n; i++) {
                //fixing first element
                if (item > arr[i]) {
                    pos++;
                }
            }
            if (pos == cycle_start) {
                continue;
            }
            while (arr[pos] == item) {
                pos++;
            }
            if (pos != cycle_start) {
                int temp = arr[pos];
                arr[pos] = item;
                item = temp;
            }


            while (pos != cycle_start) {
                pos = cycle_start;
                for (int i = cycle_start + 1; i < n; i++) {
                    if (item > arr[i]) {
                        pos++;
                    }
                }
                while (arr[pos] == item) {
                    pos++;
                }
                if (item != arr[pos]) { //item is not already at its correct position
                    int temp = arr[pos];
                    arr[pos] = item;
                    item = temp;
                }
            }
        }
    }
}