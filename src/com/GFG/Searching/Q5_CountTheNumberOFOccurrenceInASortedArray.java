package com.GFG.Searching;

import java.util.Arrays;
import java.util.Scanner;

//Here we need to find the number of occurrence Of a given number in a sorted array using Binary Search
public class Q5_CountTheNumberOFOccurrenceInASortedArray {
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
        System.out.println("The number of Occurrences are: " + NoOFOccurrence(arr,size,element));
    }

    public static int findFirstIndex(int[] arr, int size, int element) {
        int firstIndex = -1;
        int l=0,r=size-1;
        while(l<=r){
            int mid = (l+r)/2;
            if(((mid==0)|| arr[mid-1]!=arr[mid])&&arr[mid]==element){
                return mid;
            }
            if(arr[mid]>element || (mid>0 && arr[mid-1] == element)){
                r = mid-1;
            }
            else{
                l = mid +1;
            }
        }
        return firstIndex;
    }
    public static int findLastIndex(int[] arr, int size, int element){
        int lastIndex = -1;
        int l=0,r= size-1;
        while(l<=r){
            int mid =(l+r)/2;
            if(((mid==size-1)||arr[mid+1]!=arr[mid])&& arr[mid]==element){
                return mid;
            }
            if(arr[mid]<element || (arr[mid+1]!= size && arr[mid+1]==element)){
                l= mid+1;
            }
            else{
                r=mid-1;
            }
        }
        return lastIndex;
    }
    public static int NoOFOccurrence(int[] arr, int size, int element){
        if(findFirstIndex(arr,size,element)==-1){
            return -1;
        }
        int res = (findLastIndex(arr,size,element)-findFirstIndex(arr, size, element))+1;
        return res;
    }
}
