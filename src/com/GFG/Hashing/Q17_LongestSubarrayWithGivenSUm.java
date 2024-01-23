package com.GFG.Hashing;

import java.util.HashMap;

public class Q17_LongestSubarrayWithGivenSUm {
    public static void main(String[] args) {
        int arr[] = new int[]{-1,1,2,3};
        int n = arr.length;
        int sum = 6;

        System.out.println(largestSubarrayWithSumX(arr, n, sum));

    }

    private static int largestSubarrayWithSumX(int[] arr, int n, int k){
        HashMap<Integer, Integer> table = new HashMap<>();
        int sum =0;
        int longest = 0;
        for (int i = 0; i < n; i++) {
            //accumulate sum
            sum += arr[i];

            //when sub-array starts with index 0
            if(sum == k){
                longest++;
            }

            // make an entry for 'sum' if it is
            // not present in 'map'
            if(!table.containsKey(sum)){
            table.put(sum,i);
            }


            // check if 'sum-k' is present in 'map'
            // or not
            if(table.containsKey(sum-k)){
                longest = Math.max(longest, i-table.get(sum-k));
            }
        }
        return longest;
    }
}
