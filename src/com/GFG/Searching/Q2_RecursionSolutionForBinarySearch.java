package com.GFG.Searching;

import java.util.Arrays;
import java.util.Scanner;

public class Q2_RecursionSolutionForBinarySearch {
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
        System.out.println("Enter the element to be searched: ");
        int element = sc.nextInt();
        System.out.println("The element is at position: " + findElement(arr,size,element,0,size-1));
    }

    public static int findElement(int[] arr, int size, int element, int low, int high) {
        int mid = (low+high)/2;
        if(low>high){
            return -1;
        }
        if (arr[mid]==element){
            return mid;
        }
        else if (arr[mid]<element){
            return findElement(arr,size,element,mid+1,high);
        }
        else
            return findElement(arr,size,element,low,mid-1);
    }
}
