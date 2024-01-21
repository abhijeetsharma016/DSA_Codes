package com.GFG.Hashing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Q15_LongestSubarrayWithEqualNumberOf0and1 {
    public static void main(String[] args) {
        int arr[] = new int[]{1,0,1,0,1,1,0,0};
        int len = arr.length;

        System.out.println(check(arr));
    }

    private static int check(int[] arr) {
        HashMap<Integer, Integer> myHash = new HashMap<>();
        int count = 0;
        int sum =0;
        //replace all 0's with -1
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = -1;
            }
        }

        //now check if sum is 0 or not
        myHash.put(0,0);
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (myHash.containsKey(sum)) {
                count = Math.max(count, ((i+1) - myHash.get(sum)));
            }
            else{
                myHash.put(sum,i+1);
            }
        }
        return count;

    }
}
