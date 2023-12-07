package com.GFG.Array;

import java.util.Arrays;
import java.util.Scanner;

public class Q8_RotatingAnArray {
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
        System.out.println(Arrays.toString(rotateArray(arr, size)));
    }
    public static int [] rotateArray(int[] arr, int size){
        int start=0, end=size-1;
        while(start!=end){
            int temp = arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        return arr;
    }
}
