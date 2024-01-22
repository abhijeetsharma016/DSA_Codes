package com.GFG.Hashing;

//In this particular problem, we are presented with two binary arrays (ie. containing only 0's and 1's) of equal size.
// Our objective is to find the longest common span with equal sum that exists in the arrays. To accomplish this,
// we will explore two distinct approaches: a Naive approach utilizing nested loops, and an Efficient solution employing Hashing .

import java.util.HashMap;
import java.util.HashSet;

public class Q16_LongestCommonSpanWIthSameSum {
    public static void main(String[] args) {
        int[] arr1 = {0, 1, 0, 1, 1, 1, 1};
        int[] arr2 = {1, 1, 1, 1, 1, 0, 1};
        int n = arr1.length;
        System.out.println(longestCommonSum(arr1, arr2, n));
    }

    private static int longestCommonSum(int[] arr1, int[] arr2, int n) {
        int[] count = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            count[i] = arr1[i] - arr2[i];
        }

        //now we jsut need to find the longest subarray with zero sum
        HashMap<Integer, Integer> myHash = new HashMap();
        int sum =0;
        int maxLen = 0;
        for (int i = 0; i < n; i++) {
            sum += count[i];
            if (sum == 0) {
                maxLen += 1;
            }
            if(myHash.containsKey(sum)){
                maxLen = Math.max(maxLen, i- myHash.get(sum));
            }
            else{
                myHash.put(sum, i);
            }
        }
        return maxLen;
    }
}
