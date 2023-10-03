//Time Complexity: O(log(min(a,b))
//Auxiliary Space: O(log(min(a,b))
package com.GFG.Maths;

import java.util.Scanner;

public class Q7_LCM {
    public static int gcd(int a, int b){
        if(b==0){
            return a;
        }
        else {
            return gcd(b,a % b);
        }
    }
    public static int lcm(int a, int b){
        return (a*b)/gcd(a,b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(lcm(a,b));
    }
}
