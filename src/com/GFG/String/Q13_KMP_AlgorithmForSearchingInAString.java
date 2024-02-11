package com.GFG.String;

import java.util.Arrays;

public class Q13_KMP_AlgorithmForSearchingInAString {
    public static void main(String[] args){
        String txt = "ababcababaad",pat="ababa";
        KMP(pat,txt);
    }
    public static void KMP(String pat, String txt){
        int i =0, j =0;
        int[] lps = new int[pat.length()];
        FillLps(pat, lps);
        System.out.println(Arrays.toString(lps));
        while(i<txt.length()){
            if(pat.charAt(j) == txt.charAt(j)){
                i++;
                j++;
            }
            if(j==pat.length()){
                System.out.println("Found at: " + (i - j));
                j = lps[j-1];
            }
            else if(i<txt.length() && pat.charAt(j) != txt.charAt(i)){
                if(j == 0){
                    i++;
                }else{
                    j = lps[j-1];
                }
            }
        }
    }
    public static void FillLps(String pat, int[] lps){
        int len = 0, i=1;
        while(i<lps.length){
            if(pat.charAt(i)==pat.charAt(len)){
                len++;
                lps[i] = len;
                i++;
            }
            else{
                if(len == 0){
                    lps[i] = 0;
                    i++;
                }
                else{
                    len = lps[len-1];
                }
            }
        }
    }
}
