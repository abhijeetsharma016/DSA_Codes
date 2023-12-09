package com.GFG.Array;

import java.util.Arrays;
import java.util.Scanner;

public class Q13_MaximumDifferenceProblem {
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
        System.out.println(maxDiff(arr, size));
        System.out.println(Arrays.toString(arr));
    }
    public static int maxDiff(int[] arr, int size){
        int maxDiff =  arr[1]-arr[0];
        int min = arr[0];
        for (int i=1;i<size;i++){
            if((arr[i]-min)>maxDiff){
                maxDiff = arr[i]- min;
            }
            if(arr[i]<min){
                min = arr[i];
            }
        }
        return maxDiff;
    }
}
