package com.GFG.Array;

import java.util.Arrays;
import java.util.Scanner;

public class Q20_MajorityElement {
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
        if(checkMajority(arr,size)){
            System.out.println(FindCandidate(arr,size));
        }
        else{
            System.out.println("No majority candidate: ");
        }
    }

    public static int FindCandidate(int[] arr, int size){
        int count =1;
        int majority = arr[0];
        for(int i = 1; i<size;i++){
            if(arr[i]==majority){
                count++;
            }
            else{
                count--;
            }
            if(count == 0){
                majority = arr[i];
                count =1;
            }
        }
        return majority;
    }
    public static boolean checkMajority(int[] arr, int size){
        int candidate = FindCandidate(arr,size);
        int count = 0;
        for (int i=0;i<size;i++) {
            if (arr[i] == candidate) {
                count++;
            }
        }
        if(count>size/2){
            System.out.println(count);
            return true;
        }
        return false;
    }
}
