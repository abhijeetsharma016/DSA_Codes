//Time Complexity: O(log(min(a,b))
//Auxiliary Space: O(1)

package com.GFG.Maths;

import java.util.Scanner;

public class Q6_HCForGCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(GCD(a,b));
    }
        public static int GCD(int a, int b){
            if(b==0){
                return a;
            }
            else{
                return GCD(b,a%b);
            }
        }
    }
