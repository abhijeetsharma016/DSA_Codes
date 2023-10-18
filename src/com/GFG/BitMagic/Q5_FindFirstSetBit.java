package com.GFG.BitMagic;
import java.util.*;
import java.lang.*;
import java.io.*;

class Q5_FindFirstSetBit {

    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();//taking testcases
        while(t-->0){
            int n=sc.nextInt();//input n
            Solution ob=new Solution();
            System.out.println(ob.getFirstSetBit(n));//calling method
        }
    }
}

class Solution
{
    //Function to find position of first set bit in the given number.
    public static int getFirstSetBit(int n){
        int count =1;
        while(n !=0){
            if((n&1) == 1){
                return count;
            }
            else{
                count++;
                n = n>>1;
            }
        }
        return 0;
    }
}
