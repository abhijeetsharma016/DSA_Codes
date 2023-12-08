package com.GFG.Array;

import java.util.Arrays;
import java.util.Scanner;

public class Q9_RemoveDuplicatesFromASortedArray {
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
        removeDuplicates(arr,size);
        System.out.println(Arrays.toString(arr));
    }
    public static void removeDuplicates(int[] arr, int size){
        int count = 1;
        for(int i = 1; i<size; i++){
            if(arr[count-1]!=arr[i]){
                arr[count]=arr[i];
                count++;
            }
        }
    }
}
