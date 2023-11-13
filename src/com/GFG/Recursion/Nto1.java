package com.GFG.Recursion;

public class Nto1 {
    public static int Nto1(int n){
        if(n==0){
            return 0;//0 will never be printed
        }
        System.out.println(n);//we print n as it is already in reverse order n = 10 then 9 then 8 ...
        return(Nto1(n-1));//we are going in reverse order
    }

    public static void main(String[] args) {
        Nto1(10);
    }
}
