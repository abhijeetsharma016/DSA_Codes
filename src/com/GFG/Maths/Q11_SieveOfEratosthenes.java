//This methord is used in finding all the prime numbers smaller than given numbers
//Time Complexity: O(n*log(log(n)))
//Auxiliary Space: O(n)

package com.GFG.Maths;

import java.util.Scanner;

public class Q11_SieveOfEratosthenes {
    static void SieveOfEratosthenes(int n){
/* Create a boolean array "prime[0..n]" and
         initialize all entries it as true. A value in
         prime[i] will finally be false if i is Not a
         prime, else true.*/
        boolean [] prime = new boolean[n+1];
        for(int i =0;i<=n;i++){
            prime[i] = true;
        }
        //running loop till root of n, as the factors uccers in pairs
        for (int p = 2; p*p<=n;p++){
            if(prime[p]==true){//if a number is prime we will make all its multiple false, we do p*p as
                // all the previous ones which are not prime  are marked false by earlier values
                for(int j = p*p; j<=n;j+=p){//j+=p works just like table i*2 = i+i, i*3 = i+i+i ...
                    prime[j] =false;
                }
            }
        }
        //printing all prime numbers
        for(int i =2; i<=n; i++){
            if(prime[i]){
                System.out.println(i + " ");
            }
        }
    }
    public static void main(String[] args) {
        System.out.println("enter a number: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        SieveOfEratosthenes(a);
    }
}
