package com.GFG.BitMagic;

import java.util.Scanner;

public class Q2_MostSignificantBit {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("enter number: ");
        int num = sc.nextInt();
        System.out.println(findMSB(num));
    }

    public static int findMSB(int num) {
        if (num == 0)
            return 0;
        int msb = (int) (Math.log(num) / Math.log(2));
        return (1 << msb);

    }
}
