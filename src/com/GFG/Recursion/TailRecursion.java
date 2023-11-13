package com.GFG.Recursion;
//A program is said to be in tail recursion if the recursion is last thing a function do:
public class TailRecursion {
    public int tailFactorial(int n, int a){
        if(n==0){
            return a;
        }
        return(tailFactorial(n-1, n*a));
    }

    public static void main(String[] args) {
        TailRecursion t1 = new TailRecursion();
        System.out.println(t1.tailFactorial(5,1));
    }
}
