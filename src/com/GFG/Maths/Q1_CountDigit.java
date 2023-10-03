//time complexity = O(log10(n))
// Auxiliary Space = O(1)
package com.GFG.Maths;
import java.util.Scanner;
class Q1_CountDigit {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int a = sc.nextInt();
        int count =0;
        for(int i = 0; a>0; i++){
            a = a/10;
            count++;
        }
        System.out.println("no of degits are:" + count);
    }
}