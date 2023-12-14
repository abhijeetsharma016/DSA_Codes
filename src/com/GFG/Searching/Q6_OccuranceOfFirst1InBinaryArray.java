package com.GFG.Searching;

import java.util.Arrays;
import java.util.Scanner;

public class Q6_OccuranceOfFirst1InBinaryArray {
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

        System.out.println("First one occur at: " + firstOne(arr,size));
    }
    public static int firstOne(int[] arr, int size){
        int low = 0;
        int high = size -1;
        while(low<=high){
            int mid = (low+high)/2;

            if(arr[mid]==1 && (mid==0 || arr[mid-1]==0)){
                return mid;
            }
            else if(arr[mid]==1){
                high = mid -1;
            }
            else{
                low = mid + 1;
            }
        }
        return -1;
    }
}
