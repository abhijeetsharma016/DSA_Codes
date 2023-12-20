package com.GFG.Searching;

import java.util.Arrays;
import java.util.Scanner;

//an element is peak element if element on adjacent to it are smaller that the element.
// in corner element we consider it peak if the only available adjacent element is smaller than it
public class Q14_FindPeakElement {
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

        System.out.println("element found at: " + findPeak(arr,size));
    }
    public static int findPeak(int[] arr, int size){
        int l = 0;
        int r = size-1;
        while(l<=r){
            int mid = (l + r) / 2;

            if(mid==0 && arr[mid+1]<arr[mid]){
                return mid;
            }

            if(mid==size-1&&arr[mid-1]<arr[mid]){
                return mid;
            }

            if(arr[mid]>arr[mid+1] && arr[mid]>arr[mid-1]){
                return mid;
            }
            //if element at the right is greater than mid then there is 100% change there is a peak element at right side
            // element my or may not be present at left side so we don't take risk
            else if(mid!=size-1 && arr[mid]<arr[mid+1]){
                l = mid+1;
            }
            //if element at the left is greater than mid then there is 100% change there is a peak element at left side
            // element my or may not be present at right side so we don't take risk
            else{
                r = mid-1;
            }
        }
        return -1;
    }
}
