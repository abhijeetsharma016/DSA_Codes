//Time complexity: O(sqrt(n))
//Auxiliary space: O(1)
package com.GFG.Maths;

import java.util.Scanner;

public class Q8_CheckforPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = sc.nextInt();
        boolean i = prime(n);
        System.out.println(i);
    }
    public static boolean prime(int n){
        if((n%2 == 0)&&(n!=2)){
            return false;
        }
        else if((n%3 == 0)&&(n!=3)){
            return false;
        }
        //every number have a pair after √n eg pair of 10 is (1,10) and (2,5)
        //prime number work in a patter like i,i+2,i+6,(i+6)+2,(i+6)+6 ...
        //this pattern excludes 2 and 3
        for(int i=5; i<=Math.sqrt(n); i=i+6){
            if((n%i==0) || (n%(i+2)== 0)){
                return false;
            }
        }
        return true;
    }
}
