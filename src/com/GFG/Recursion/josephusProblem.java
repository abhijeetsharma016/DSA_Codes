package com.GFG.Recursion;

public class josephusProblem {
    public static int josephus(int n, int k){
        if(n==0){
            return 0;
        }
        return (josephus(n-1,k)+k-1)%n+1;//k-1 becausethe counting starts with person holding the knife,
        // n+1 because we start index from 1
    }

    public static void main(String[] args) {
        System.out.println(josephus(3,3));
    }
}
