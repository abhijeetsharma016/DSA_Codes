package com.GFG.BitMagic;

import java.util.Scanner;

public class Q1_PowerOf2OrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        int prevNum = num - 1;
        if ((num & prevNum) == 0) {
            System.out.println("Power of 2");
        } else {
            System.out.println("Not a powe of 2");
        }
    }
}