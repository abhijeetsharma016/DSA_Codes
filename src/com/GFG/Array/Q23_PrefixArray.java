package com.GFG.Array;

import java.util.Arrays;
import java.util.Scanner;

public class Q23_PrefixArray {
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
        System.out.println("enter the Starting range ");
        int start = sc.nextInt();
        System.out.println("enter the ending range ");
        int end = sc.nextInt();
        System.out.println(prefixArray(arr,size, start, end));
    }
    public static int prefixArray(int[] arr,int size,int start, int end){
        int[] prefixArray = new int[size];
        fillPrefixArray(arr,size,prefixArray);
        System.out.println(Arrays.toString(prefixArray));
        return (prefixArray[end]-prefixArray[start-1]); //we subtract the sum of all previous elements before stating point

    }

    public static void fillPrefixArray(int[] arr, int size, int[] prefixArray) {
        prefixArray[0]=arr[0];
        for (int i = 1; i < size; i++) {
            prefixArray[i] = prefixArray[i - 1] + arr[i];
        }
    }
}
