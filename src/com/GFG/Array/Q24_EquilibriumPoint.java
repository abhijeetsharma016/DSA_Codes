package com.GFG.Array;

import java.util.Arrays;
import java.util.Scanner;

//equilibrium point is the point in an array from which sum of all the elements in left side of array
//is equal to sum of all the elements in right side of array
public class Q24_EquilibriumPoint {
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
        if(findEquilibriumPoint(arr,size)==-1){
            System.out.println("No Equilibrium point Exist: ");
        }
        else
            System.out.println("Exist at position: " + findEquilibriumPoint(arr,size));
    }
    public static int findEquilibriumPoint(int[] arr,int size) {
        int sum = arr[0];
        for(int i=1;i<size;i++){
            sum+= arr[i];
        }
        int leftSum = 0;
        for (int i = 0; i < size; i++) {
            sum -= arr[i];
            if (sum == leftSum){
                return i;
            }
            leftSum += arr[i];
        }
        return -1;
    }
}

