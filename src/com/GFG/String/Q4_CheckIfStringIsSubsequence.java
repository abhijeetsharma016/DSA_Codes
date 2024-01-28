package com.GFG.String;

import java.util.Scanner;

public class Q4_CheckIfStringIsSubsequence {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String s1, s2;
        s1 = sc.next();
        s2 = sc.next();
        int n = s1.length();
        int m = s2.length();

        System.out.println(isSubSeq(s1, s2, n, m));
    }
    public static boolean isSubSeq(String s1, String s2, int n, int m){
        m = m-1;
        n = n-1;
        while(n >= 0 && m >=0){
            if(s1.charAt(n) == s2.charAt(m)){
                m--;
                n--;
            }
            else{
                n--;
            }
        }
        if(m < 0){
            return true;
        }
        return false;
    }
}
