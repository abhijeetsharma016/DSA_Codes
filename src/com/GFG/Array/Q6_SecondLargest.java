package com.GFG.Array;

import java.util.Scanner;

public class Q6_SecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        for(int i = 0; i<size; i++){
            System.out.print("Enter the " + (i+1) + " element: ");
            arr[i] = sc.nextInt();
        }
        System.out.println(secondLargest(arr, size));
    }
    public static int secondLargest(int[] arr,int size){
        int first = 0, second = -1;
        for(int i = 0; i<size;i++){
            if(arr[i]>first){
                second = first;
                first = arr[i];
            }
            else if(arr[i]>second|| second == -1){
                second = arr[i];
            }
        }
        return second;
    }
}
