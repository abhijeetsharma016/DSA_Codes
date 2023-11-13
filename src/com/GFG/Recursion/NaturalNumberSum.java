package com.GFG.Recursion;

public class NaturalNumberSum {
    public static int Sum(int n){
        if(n<=1){
            return n;
        }
        return (n+Sum(n-1));
    }

    public static void main(String[] args) {
        System.out.println(Sum(0));
    }
}
