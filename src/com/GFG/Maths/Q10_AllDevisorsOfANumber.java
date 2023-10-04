//here i print all the divisors of a number in assending number
//Time Complexity: O(n*log(log(n)))
//Auxiliary Space: O(n)
package com.GFG.Maths;

import java.util.Scanner;
import java.util.Vector;

public class Q10_AllDevisorsOfANumber {
    public static void printDevisors(int N){
        Vector<Integer>v = new Vector<>();
        for (int i = 1; i<= Math.sqrt(N); i++){
            if(N%i == 0){
                if(N/i == i){
                    System.out.println(i);
                }
                else{
                    System.out.println(i);
                    v.add(N/i);
                }
            }
        }
        for(int i=v.size()-1;i>=0;i--){
            System.out.println(v.get(i));
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int a = sc.nextInt();
        printDevisors(a);
    }
}
