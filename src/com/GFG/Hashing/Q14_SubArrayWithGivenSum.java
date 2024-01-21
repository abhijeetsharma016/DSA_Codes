package com.GFG.Hashing;

import java.util.HashSet;

public class Q14_SubArrayWithGivenSum {
    public static void main(String[] args) {
        int arr[] = new int[]{5, 8, 6, 13, 3, -1};
        int sum=22;
        int n = arr.length;

        System.out.println(isSum(arr, n, sum));
    }
    private static boolean isSum(int[] arr,int n,int sum){
        HashSet<Integer> table = new HashSet<>();
        int pre_sum = 0;
        table.add(0);
        for(int i=0;i<n;i++){
            pre_sum+= arr[i];
            if(table.contains(pre_sum-sum)){
                return true;
            }
            else {
                table.add(pre_sum);
            }
        }
        return false;
    }
}
