package com.GFG.Hashing;

import java.util.Arrays;
import java.util.HashSet;

public class Q13_SubArrayWithZeroSum {
    public static void main(String[] args) {
        int arr[] = new int[]{5, 3, 9, -4, -6, 7, -1};
        int n = arr.length;

        System.out.println(ZeroSumSubarray(arr, n));
    }
    private static boolean ZeroSumSubarray(int[] arr, int n){
        HashSet<Integer> table = new HashSet<>();
        int prefixSum =arr[0];
        table.add(0);
        for(int i=0;i<n;i++) {
            if (table.contains(prefixSum)) {
                return true;
            }
            table.add(prefixSum);
        }
        return false;

        }
}
