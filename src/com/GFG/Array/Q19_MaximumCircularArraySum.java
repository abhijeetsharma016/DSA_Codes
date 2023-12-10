package com.GFG.Array;

import java.util.Arrays;
import java.util.Scanner;

public class Q19_MaximumCircularArraySum {
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
        System.out.println(curcularSubarraySum(arr, size));
    }
    public static int NormalSubarraySum(int[] arr, int size){
        int sum = arr[0];
        int res = arr[0];
        for(int i=1;i<size;i++) {
            sum = Math.max(arr[i], arr[i] + sum);
            res = Math.max(sum, res);
        }
        return res;
    }
    public static int curcularSubarraySum(int[] arr, int size){
        int normalSubarraySum = NormalSubarraySum(arr,size);
        int sum =0;
        if(normalSubarraySum<0){
            return normalSubarraySum; //Verrrry Imp as if we get negative array without this statement we would get wrong answer.
        }
        for(int i=0; i<size;i++){
            sum += arr[i];
            arr[i]= - arr[i];
        }
        int circularSubarraySum = sum+NormalSubarraySum(arr,size); //we need to subtract but adding cause we reversed the signs of array
                                                                    //to find minimum
        return Math.max(normalSubarraySum,circularSubarraySum);
    }
}
