package com.GFG.BitMagic;

import java.util.Scanner;

public class Q7_PowerOfTwoOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = sc.nextInt();
        System.out.println("Solving using methord one: " + powerOfTwo1(a));
        System.out.println("Solving using mehtord two: " + powerOfTwo2(a));
    }
    //Methord one
    public static boolean powerOfTwo1(int n){
        if(n == 0){
            return true;
        }
        return (Math.ceil(Math.log(n)/Math.log(2)) == (Math.floor(Math.log(n)/Math.log(2))));
    }

    public static boolean powerOfTwo2(int n){
        return((n!=0) && (n & (n-1)) == 0);
    }
}
