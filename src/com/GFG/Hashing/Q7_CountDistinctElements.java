package com.GFG.Hashing;

import java.util.Arrays;
import java.util.HashSet;

public class Q7_CountDistinctElements {
    public static void main(String[] args) {
        Integer[] arr = {1,2,2,3,4,4,4,5};
        System.out.println(count(arr));
    }

    public static int count(Integer[] arr) {
        HashSet<Integer> myHash = new HashSet<>(Arrays.asList(arr));
        return myHash.size();
    }
}
