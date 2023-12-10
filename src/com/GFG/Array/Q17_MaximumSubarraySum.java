package com.GFG.Array;

import java.util.Arrays;
import java.util.Scanner;

public class Q17_MaximumSubarraySum {
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
        System.out.println("The sum is: " + subarraySum(arr,size));
    }
    public static int subarraySum(int[] arr, int size){
        int endIndex = 0;
        int sum = arr[0];
        int res = 0;
        for(int i=1;i<size;++i){
            sum = Math.max(arr[i],sum+arr[i]);
            if(res<sum){
                res = sum;
                endIndex = i;
            }
        }
        int startIndex = endIndex;
        int temp = res;
        while(startIndex>0){
            temp -=arr[startIndex];
            if(temp==0){
                break;
            }
            startIndex--;
        }
        for(int i = startIndex; i <= endIndex; ++i)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
        return res;
    }
    }
