package com.GFG.Maths;
import java.util.Scanner;
public class Q9_PrimeFactors {
    public static void main(String[] rgs) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a prime number: ");
        int a = sc.nextInt();
        while (a % 2 == 0 || a % 3 == 0) {
            if (a % 2 == 0) {
                System.out.println(2);
                a = a/2;
            }
            if (a % 3 == 0) {
                System.out.println(3);
                a=a/3;
            }
        }

        //every number have a pair after √n eg pair of 10 is (1,10) and (2,5)
        //prime number work in a patter linke i,i+2,i+6,(i+6)+2, (i+6)+6 ...
        //this patter excludes 2 and 3
        for(int i = 5;i<=Math.sqrt(a); i +=6){
            while(a%i == 0){
                System.out.println(i);
                a = a/i;
            }
            while(a%(i+2)==0){
                System.out.println(i+2);
                a = a/(i+2);
            }
        }
        //now if the last remaining prime facter is of power one eg -(7^1) then above loop won't be able to catch it
        //for example 84 = 2^2*3^1*7
        if(a>1){
            System.out.println(a);
        }
    }
}