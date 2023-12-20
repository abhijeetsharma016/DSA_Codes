package com.GFG.Searching;

import java.util.Arrays;
import java.util.Scanner;

//In this particular problem, we are provided with a sorted array of integers.
// Our objective is to determine whether there exists a triplet of integers in the array whose sum is equal to the target value given.
public class Q16_TripletsSum {
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
        System.out.print("Enter the element to be searched: ");
        int totalSum = sc.nextInt();
        tripletSum(arr,size, totalSum);
    }
    public static void tripletSum(int[]arr,int size, int totalSum){
        int element1 = 0, element2 = 1, element3 = size-1;
        while(element1<=size-3){
            int sum = totalSum-arr[element1];
            while(element2<element3){
                if(sum==(arr[element2]+arr[element3])){
                    System.out.println(arr[element1]+" " + arr[element2] + " "+arr[element3]);
                    return;
                }
                else if ((arr[element2]+arr[element3])<sum) {
                    element2++;
                }
                else{
                    element3--;
                }
            }
            element1++;
            element2 = element1+1;
            element3 = size-1;
        }
        System.out.println("No Triplet found 😟");
    }
}
