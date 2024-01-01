package com.GFG.Sorting;

import java.util.Map;
import java.util.TreeMap;

public class Q12_MergingTwoArraysUsingMap {
    public static void main(String[] args) {
        int a[] = {1, 1, 3, 5, 7}, b[] = {1, 4, 6, 8};
        int size = a.length;
        int size1 = b.length;

        // Function call
        mergeArrays(a, b, size, size1);
    }

    public static void mergeArrays(int[] a, int[] b, int size1, int size2) {
        Map<Integer,Boolean> mp = new TreeMap<>(); //We are using tree ma to short in (O(nlog(n) + mlog(m)) Time

        for(int i=0;i<size1;i++){
            mp.put(a[i],true);
        }
        for(int i=0;i<size2;i++){
            mp.put(b[i],true);
        }

        for(Map.Entry<Integer,Boolean> me : mp.entrySet()){
            System.out.println(me.getKey() + " ");
        }
    }
}
