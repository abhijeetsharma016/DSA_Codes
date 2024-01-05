package com.GFG.Sorting;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Q24_ChocolateDistributionProblem {
    public static void main(String[] args) {
        int[] arr = {7, 3, 1, 8, 9, 12, 56};
        int m = 3;
        System.out.println(minDiff(arr,m));
    }

    public static int minDiff(int[] arr, int m) {
        Arrays.sort(arr);
        int n = arr.length - 1;
        if(m>n){
            return -1;
        }
        int res = arr[m-1] - arr[0];
        for(int i=0;(i+m-1)<n;i++){
            res = Math.min(res, arr[i+m-1]-arr[i]);
        }
        return res;
    }
}
