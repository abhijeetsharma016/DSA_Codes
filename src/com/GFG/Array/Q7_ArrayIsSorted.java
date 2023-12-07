package com.GFG.Array;

import java.util.Scanner;

public class Q7_ArrayIsSorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        for(int i = 0; i<size; i++){
            System.out.print("Enter the " + (i+1) + " element: ");
            arr[i] = sc.nextInt();
        }
        System.out.println(isSorted(arr, size));
    }
    public static boolean isSorted(int[]arr, int size){
        if(size ==0 || size == 1){
            return true;
        }
        for(int i = 1; i<arr.length;i++){
            if(arr[i-1]>arr[i]){
                return false;
            }
        }
        return true;
    }
}
