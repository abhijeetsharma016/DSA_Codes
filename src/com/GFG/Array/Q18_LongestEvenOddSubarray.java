package com.GFG.Array;

import java.util.Arrays;
import java.util.Scanner;

public class Q18_LongestEvenOddSubarray {
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
        System.out.println("The longest chain of EvenOdd is of length: " + checkEvenOdd(arr,size));
    }


    public static int checkEvenOdd(int[] arr, int size){
        int res = 0;
        int count = 1;
        for(int i=1;i<size;i++){
            if(arr[i]%2 != arr[i-1]%2){
                count++;
            }
            else{
                count = 1;
            }
                res = Math.max(res,count);
        }
        if(res == 1){
            return 0;
        }
        return res;
    }

}
