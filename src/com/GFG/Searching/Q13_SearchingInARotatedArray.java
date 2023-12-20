package com.GFG.Searching;

import java.lang.*;
import java.util.Arrays;
import java.util.Scanner;


class Q13_SearchingInARotatedArray
{ public static void main(String[] args) {
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
    System.out.println("element found at: " + searchInRotatedArr(arr,size ,element));
    }

    public static int searchInRotatedArr(int[] arr, int size, int element) {
    int low = 0;
    int high = size-1;
        while (low < high) {
            int mid = (low+high)/2;

            if(arr[mid]== element){
                return mid;
            }


            if(arr[low]<arr[mid]){
                //left half is sorted
                if(arr[mid]>= element && arr[low]<= element){//element is present in left half
                    high = mid-1;
                }
                else{
                    low = mid+1;
                }
            }
            else{//right half is sorted
                if(arr[mid]<= element && arr[high]>= element){//arr lies in right half
                    low = mid+1;
                }
                else{// arr lies in left half
                    high = mid-1;
                }

            }
        }
        return -1;
    }
}