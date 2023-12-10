package com.GFG.Array;

import java.util.Arrays;
import java.util.Scanner;
//Our Task: Given a binary array, we need to convert this array into an array that either contains all 1s or all 0s.
// We need to do it using the minimum number of group flips.
public class Q21_MinimumConsicutiveFlips {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        for(int i = 0; i<size; i++){
            System.out.print("Enter the " + (i+1) + " element: ");
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        consiutiveFlips(arr,size);

    }

    public static void consiutiveFlips(int[] arr, int size) {
        for (int i = 1; i < size; i++) {
            if (arr[i - 1] != arr[i]) {
                if(arr[i]!=arr[0]){
                    System.out.print("From " + i+ " to ");
                }
                else{
                    System.out.println(i-1);
                }
            }
        }
        if(arr[size-1]!= arr[0]){
            System.out.println(size-1);
        }
    }
}
