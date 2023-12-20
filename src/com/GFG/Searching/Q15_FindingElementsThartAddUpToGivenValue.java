package com.GFG.Searching;
// Our objective is to determine whether there exists a pair of integers in the array that adds up to a given target value.

import java.util.Arrays;
import java.util.Scanner;

public class Q15_FindingElementsThartAddUpToGivenValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");//asking for size just to ease on taking input not using it
        int size = sc.nextInt();
        int[] arr = new int[size];

        for(int i = 0; i<size; i++){
            System.out.print("Enter the " + (i+1) + " element: ");
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        System.out.print("Enter the sum to be searched: ");
        int element = sc.nextInt();
        elements(arr,size,element);
    }
    public static void elements(int[]arr,int size, int element){
        int l = 0;
        int r= size-1;
        while(l<=r){
            int sum = l+r;
            if(sum == element){
                System.out.println("The elements are: "+ l + " and "+ r);
                return;
            }
            if(sum<element){
                l++;
            }
            else{
                r--;
            }
        }
    }
}
