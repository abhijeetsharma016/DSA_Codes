package com.GFG.Hashing;

import java.util.HashSet;

public class Q12_IntersectionOfTwoUnsortedArray {
    public static void main(String[] args) {
        int[] arr1 = { 10, 20,30};
        int[] arr2 = {30,20,10,40,50 };
        int m = arr1.length;
        int n = arr2.length;

        intersect(arr1, arr2, m, n);
    }
    public static void intersect(int[] arr1,int[] arr2, int m, int n){
        HashSet<Integer> myHash = new HashSet<>();
        for (int e: arr2){
            myHash.add(e);
        }

        for(int e: arr1)
        if(myHash.contains(e)){
            System.out.println(e);
        }
    }
}
