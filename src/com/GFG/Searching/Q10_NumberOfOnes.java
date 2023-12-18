package com.GFG.Searching;

import java.util.Arrays;
import java.util.Scanner;

public class Q10_NumberOfOnes {
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
        System.out.println("Number of ones are: " + countOnes(arr,size));
    }
    public static int countOnes(int[] arr, int size){
        int low = 0;
        int high = size-1;
        int firstOccurrence = -1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]==0){
                low = mid+1;
            }
            else if(arr[mid] == 1 && arr[mid-1]==0){
                firstOccurrence = mid;
                break;
            }
            else{
                high = mid-1;
            }
        }
        return (firstOccurrence == -1)?0:size-firstOccurrence;
    }
}
