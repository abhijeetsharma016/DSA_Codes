package com.GFG.Hashing;

import java.util.HashSet;

public class Q9_SizeOfUnionOfArrays {
    public static void main(String[] args) {
        int arr1[] = new int[]{2, 8, 3, 5, 6};
        int arr2[] = new int[]{4, 8, 3, 6, 1};
        int m = arr1.length;
        int n = arr2.length;

        printSize(arr1,  arr2);
    }

    private static void printSize(int[] arr1, int[] arr2) {
        HashSet<Integer> myHashset = new HashSet<>();
        for(int e: arr1){
            myHashset.add(e);
        }
        for(int e: arr2){
            myHashset.add(e);
        }
        System.out.println(myHashset.size());
        System.out.println(myHashset);
    }
}

