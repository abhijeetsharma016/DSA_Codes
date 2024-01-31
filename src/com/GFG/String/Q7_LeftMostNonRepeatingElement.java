package com.GFG.String;

import java.util.Arrays;

public class Q7_LeftMostNonRepeatingElement {
    public static void main(String[] args){
   String str = "geeksforgeeks";
            System.out.println("Index of leftmost non-repeating element:");
            System.out.println(nonRep(str));
    }

    static final int CHAR = 256;
    public static int nonRep(String str) {
        int[] arr = new int[CHAR];
        Arrays.fill(arr, -1);
        for(int i=0; i<str.length(); i++){
            if(arr[str.charAt(i)] == -1){
                arr[str.charAt(i)] =i;
            }
            else{
                arr[str.charAt(i)] = -2;
            }
        }
        for(int i=0; i<arr.length; i++){
            if(arr[i] >0){
                return arr[i];
            }
        }
        return -1;
    }
}
