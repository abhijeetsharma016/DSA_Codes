package com.GFG.Hashing;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Q18_LongestConsecutiveSubsequence {
    public static void main(String[] args) {
        int arr[] = new int[]{1, 9, 3, 4, 2, 10, 13};

        int n = arr.length;

        System.out.println(findLongest(arr, n ));
    }

    private  static int findLongest(int[] arr, int n){
        Set<Integer> table = new HashSet<>();
        int res =0;
        for(int i=0;i<n;i++){
            table.add(arr[i]);
        }
        for(int element : arr){
         if(!table.contains(element-1)){
             int x = element;
             int len =0;
             while(table.contains(x)){
                 len++;
                 x = x+1;
             }
             res = Math.max(res, len);
         }
        }
        return res;
    }
}
