package com.GFG.Array;

import java.util.Arrays;
import java.util.Scanner;

public class Q12_LeaderFromRight {
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
        printLeader(arr, size);
        System.out.println(Arrays.toString(arr));
    }
    public static void printLeader(int[] arr,int size){
        int leader = arr[size-1];
        System.out.println("leader is: " + leader);
        for(int i=size-2;i>=0;i--){
            if(arr[i]>leader){
                leader = arr[i];
                System.out.println("leader is: "+ leader);
            }
        }
    }
}
