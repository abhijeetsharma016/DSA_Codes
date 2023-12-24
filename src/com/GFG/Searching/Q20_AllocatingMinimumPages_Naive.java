package com.GFG.Searching;

import java.util.Arrays;
import java.util.Scanner;

public class Q20_AllocatingMinimumPages_Naive {
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
        System.out.print("Enter the number of students: ");
        int k = sc.nextInt();
        System.out.println("element found at: " + minimumPages(arr,size,k));
    }
    public static int minimumPages(int[] arr, int size,int k){
        if(k==1){
            return sum(arr, 0, size - 1);
        }
        if(size == 1){
            return arr[0];
        }
        int res = Integer.MAX_VALUE;
        for(int i =0;i<size;i++){
            res = Math.min(res,Math.max(sum(arr,i,size-1),minimumPages(arr,i,k-1)));
        }
        return res;
    }
    public static int sum(int[] arr, int start, int end){
        int sum = 0;
        while(start<=end){
            sum+=arr[start];
            start++;
        }
        return sum;
    }
}
