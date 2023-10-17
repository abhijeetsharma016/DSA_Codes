//Find the remainder of N by moduling it with 4.
//If rem = 0, then xor will be same as N.
//If rem = 1, then xor will be 1.
//If rem = 2, then xor will be N+1.
//If rem = 3 ,then xor will be 0.
package com.GFG.BitMagic;

import java.util.Scanner;

public class Q3_XORofAllNumberTillN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        if(num%4 == 0){
            System.out.println("Answer is: " + num);
        } else if (num % 4 == 1) {
            System.out.println("Answer is: " + 1);
        }
        else if(num%4 == 2){
            System.out.println("Answe is: " + (num+1));
        }
        else{
            System.out.println("Answe is: " + 0);
        }
    }
}
