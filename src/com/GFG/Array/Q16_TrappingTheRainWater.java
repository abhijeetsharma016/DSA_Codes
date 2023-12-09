package com.GFG.Array;

import java.util.Arrays;
import java.util.Scanner;

public class Q16_TrappingTheRainWater {
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
        System.out.println(WaterAmount(arr,size));
    }
    public static int WaterAmount(int[] arr, int size){
        int water = 0;
        int[] leftMax = new int [size];
        int[] rightMax = new int[size];
        leftMax[0] = arr[0];
        rightMax[size-1]=arr[size-1];

        //creating left max array to hold the maximum block height towards the left of the index
        for(int i=1; i<size; i++){
            if(leftMax[i-1]<arr[i])
                leftMax[i]= arr[i];
            else
                leftMax[i]= leftMax[i-1];
        }

        //creating right max array to hold the maximum block height towards the right of the index
        for(int i = size-2; i>=0;i--){
            if(rightMax[i+1]<arr[i])
                rightMax[i]=arr[i];
            else
                rightMax[i] = rightMax[i+1];
        }

        System.out.println("left max array just for reference: " + Arrays.toString(leftMax));
        System.out.println("right max array just for reference: " + Arrays.toString(rightMax));
        for(int i=1; i<size-1;i++){
            water += Math.min(leftMax[i],rightMax[i]) - arr[i];
        }
        return water;
    }
}
