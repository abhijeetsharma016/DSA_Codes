package com.GFG.Array;
//Our Task: The cost of a stock on each day is given in an array.
// Find the maximum profit that you can make by buying and selling on those days.
// If the given array of prices is sorted in decreasing order, then profit cannot be earned at all.
import java.util.Arrays;
import java.util.Scanner;

public class Q15_StockBuyAndSell {
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
        System.out.println(StockButAndSell(arr,size));
    }
    public static int StockButAndSell(int[] arr, int size){
        int profit = 0;
        for(int i =0; i<=size-2; i++){
            if(arr[i+1]>arr[i]){
                profit += arr[i+1] - arr[i];
            }
        }
        return profit;
    }
}
