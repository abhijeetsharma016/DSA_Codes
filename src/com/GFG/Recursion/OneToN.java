package com.GFG.Recursion;

public class OneToN {
public static int OneToN(int n){
    if(n==0){
        return 0;
    }
    System.out.println(temp-n);
    return(OneToN(n-1));
}
    public static int temp;
    public static void main(String[] args) {
        int n = 10;
        temp = n+1;
        OneToN(n);
    }
}