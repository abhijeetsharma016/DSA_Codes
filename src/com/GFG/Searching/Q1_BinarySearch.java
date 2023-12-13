package com.GFG.Searching;

import java.util.Arrays;
import java.util.Scanner;

public class Q1_BinarySearch {
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
        System.out.println("The element is at position: " + findElement(arr,size,element));
    }
    public static int findElement(int[] arr, int size, int element){
        int low = 0;
        int high = size-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]==element){
                return mid;
            }
            else if (element>arr[mid]) {
                low = mid+1;
            }
            else{
                high = mid -1;
            }
        }
        return-1;
    }
}
