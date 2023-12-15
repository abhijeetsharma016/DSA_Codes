package com.GFG.Searching;

import java.util.Arrays;
import java.util.Scanner;

public class Q8_IndexOfTheFirstOccurrence {
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
        System.out.print("Enter the element to be searched: ");
        int element = sc.nextInt();
        System.out.println("First one occur at: " + indexOfFirstOccurrence(arr,size,element));
    }
    public static int indexOfFirstOccurrence(int[] arr,int size,int element){
        int l = 0;
        int r = size-1;
        while(l<=r){
            int mid = (l+r)/2;
            if ((((mid==0)|| arr[mid-1]!=arr[mid])&&arr[mid]==element)){
                return mid;
            }
            if(arr[mid]>element || (mid>0 && arr[mid-1] == element)){
                r = mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return -1;
    }

}


