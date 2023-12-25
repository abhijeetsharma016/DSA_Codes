package com.GFG.Searching;

import java.util.Arrays;
import java.util.Scanner;

public class Q21_AllocatingMinimumPages_Efficient {
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
        System.out.print("Enter number of students: ");
        int k = sc.nextInt();
        System.out.println(minimumPages(arr,size,k));
    }
    public static int minimumPages(int[] arr, int size,int k){
        int sum = 0, max =0;
        for(int i=0;i<size;i++){
            sum+=arr[i];
            max = Math.max(arr[i],max);
        }
        int low = max,high=sum, res =0;
        while(low<=high){
            int mid = (low+high)/2;
            if(isFessible(arr,size,k,mid)){
                res = mid;
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return res;
    }
    public static boolean isFessible(int[] arr,int size, int k, int mid){
        int req=1, sum =0; //req = no of students required
        for(int i =0;i<size;i++){
            if(sum+arr[i]>mid){
                req++;
                sum=arr[i];
            }
            else{
                sum+=arr[i];
            }
        }
        return (req<=k);
    }
}
