package com.GFG.Recursion;
//check wether the sum of which subsets is equal to given sum
public class SumOfSubsets {
    public static void generateSubset(String arr, String curr, int i){
        if(i==arr.length()){
            System.out.println(curr);
            return;
        }
        generateSubset(arr, curr + arr.charAt(i),i+1);
        generateSubset(arr,curr,i+1);
    }

    public static void main(String[] args) {
        generateSubset("ABC", "", 0);
    }
}
