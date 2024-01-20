package com.GFG.Hashing;

import java.util.Arrays;
import java.util.HashSet;

public class Q10_PairWithGivenSumInUnsortedArray {
    public static void main(String[] args) {
        int arr[] = new int[]{3, 8, 4, 7, 6, 1};
        int len = arr.length;
        int x = 14;
        System.out.println(Arrays.toString(pairWithSumX(arr, len, x)));
    }
    private static int[] pairWithSumX(int[] arr, int len, int x){
        HashSet<Integer> myHash = new HashSet<>(); //if we need to return index we will use hashmap instead;
        for(int i =0; i<arr.length;i++){
            int complement = x-arr[i];
            if(myHash.contains(complement)){
                return new int[]{complement, arr[i]};
            }
            else{
                myHash.add(arr[i]);
            }
        }
        return new int[] {};
    }
}
