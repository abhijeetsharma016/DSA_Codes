package com.GFG.Recursion;
//sum of N digits of a number
public class SumOfNDigits {
    public static int sumOfDigits(int n) {
        if (n <=9) {
            return n;
        }
        return (sumOfDigits(n/10)+n%10);
    }
    public static void main(String[] args) {
        System.out.println(sumOfDigits(1121111));
    }
}
