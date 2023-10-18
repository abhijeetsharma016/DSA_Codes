package com.GFG.BitMagic;

import java.util.Scanner;

public class Q6_CountTheSetBits {
    static int [] table = new int[256];

    public static void main(String[] args) {
        createTable();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        System.out.println(numberOfBits(n));
    }
    public static void createTable() {
        table[0] = 0;
        for (int n = 0; n < 256; n++) {
            int temp = n;
            while (temp!=0){
                temp = (temp&(temp-1));
                table[n]++;
            }
        }
    }

    public static int numberOfBits(int n) {
        return (table[n & 255] +
                table[(n >> 8) & 255]+
                table[(n>>16)&255]+
                table[(n>>24)]);
    }
}