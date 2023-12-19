package com.GFG.Searching;

// Java code to implement the approach

// Java program to demonstrate working of
// an algorithm that finds an element in an
// array of infinite size

import java.util.Arrays;
import java.util.Scanner;

public class Q12_SearchingInInfiniteSizeArray {
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
        System.out.print("Enter the element to be searched: ");
        int element = sc.nextInt();
        System.out.println("element found at: " + findArrayRange(arr,element));
    }
    public static int searchingInInfiniteArray(int[] arr, int element,int l,int r){
        while(l<=r){
            int mid = (l+r)/2;
            if(arr[mid]==element){
                return mid;
            }
            else if(arr[mid]<element){
                l = mid+1;
            }
            else{
                r = mid-1;
            }
        }
        return -1;
    }

    public static int findArrayRange(int[] arr, int element) {
        int l= 0;int r =1;
        int val = arr[0];
        while (val < element){
            l = r;
            r = 2*r;
            val = arr[r];
        }
        return searchingInInfiniteArray(arr,element,l,r);
    }
}