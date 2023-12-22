package com.GFG.Searching;

import java.util.Arrays;
import java.util.Scanner;
//This is a Naive method to find the repeating element in an array
public class Q18_RepeatingElements_Naive {
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
        System.out.println(findRepeatingElements(arr, size));
    }
    public static int findRepeatingElements(int[] arr, int size){
        Boolean[] BoolArray = new Boolean[1000000];
        for(int i = 0; i<size;i++){
            if(BoolArray[arr[i]]){
                return arr[i];
            }
            BoolArray[arr[i]]= true;
        }
        return -11;
    }
}
