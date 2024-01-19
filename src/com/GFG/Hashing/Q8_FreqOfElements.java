package com.GFG.Hashing;

import java.util.*;

public class Q8_FreqOfElements {
    public static void main(String[] args) {
        Integer arr[] = {10, 20, 20, 10, 10, 20, 5, 20};
        int size = arr.length;
        frequencyNumber(arr,size);
    }

    private static void frequencyNumber(Integer[] arr, int size) {
        LinkedHashMap<Integer, Integer> myHashmap = new LinkedHashMap<>();

        for(int i=0;i<size;i++) {
            if (myHashmap.containsKey(arr[i])) {
                myHashmap.put(arr[i], myHashmap.get(arr[i]) + 1);
            }else{
                myHashmap.put(arr[i], 1);
            }
        }
        for(Map.Entry<Integer,Integer> e : myHashmap.entrySet()) {
            System.out.println(e.getKey() + "  :   " + e.getValue());
        }
    }
}