package com.GFG.Searching;

import java.util.Arrays;
import java.util.Scanner;

public class Q3_TernarySearch {
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
        System.out.println("The element is at position: " + ternarySearch(arr,size,element));
    }
    public static int ternarySearch(int[] arr, int size, int element){
        int l = 0;
        int r = size-1;
        for(int i=0;i<size;i++){

            int mid1 = l+(r-l)/3;
            int mid2 = r -(r-l)/3;
            if(arr[mid1]==element){
                return mid1;
            }
            else if(arr[mid2]==element){
                return mid2;
            }
            if(element>arr[mid2]){
                l = mid2+1;
            }
            else if(element<arr[mid1]){
                r = mid1-1;
            }
            else {
                l=mid1+1;
                r=mid2-1;
            }
        }
        return -1;
    }
}
