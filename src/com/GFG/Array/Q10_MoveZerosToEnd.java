package com.GFG.Array;

import java.util.Arrays;
import java.util.Scanner;

public class Q10_MoveZerosToEnd {
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
        System.out.println(Arrays.toString(moveZeros(arr, size)));
    }
    public static int[] moveZeros(int[] arr, int size){
        int cout = 0;
        for(int i =0;i<size;i++){
            if(arr[i]!=0){
                int temp = 0;
                temp = arr[cout];
                arr[cout]=arr[i];
                arr[i]=temp;
                cout++;
            }
        }
        return arr;
    }
}
