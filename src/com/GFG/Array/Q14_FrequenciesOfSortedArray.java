package com.GFG.Array;

import java.util.Arrays;
import java.util.Scanner;

public class Q14_FrequenciesOfSortedArray {
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
        frequency(arr,size);
    }

    public static void frequency(int[] arr, int size){
        int freq = 1;
        for (int i = 1; i <size; i++){
            if(arr[i]== arr[i-1]){
                freq++;
            }
            else{
                System.out.println("No of occurrence of " + arr[i-1]+ "is: "+ freq);
                freq=1;
            }
        }
        System.out.println("No of occurrence of " + arr[size-1]+ "is: "+ freq);
    }
}