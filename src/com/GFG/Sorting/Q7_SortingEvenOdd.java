package com.GFG.Sorting;

import java.util.Arrays;
import java.util.Comparator;

//Sort an Integer array in such a way that all even numbers come first followed by all the odd numbers.
public class Q7_SortingEvenOdd {
    public static void main(String[] args) {
        Integer[] arr = {1,2,3,4,5,6,7}; //We cant use int as comparator only works on objects
        Arrays.sort(arr, new Sort());
        System.out.println(Arrays.toString(arr));
    }
}

class Sort implements Comparator<Integer> {
    @Override
    public int compare(Integer a, Integer b) {
        return a % 2 - b % 2;
    }
}