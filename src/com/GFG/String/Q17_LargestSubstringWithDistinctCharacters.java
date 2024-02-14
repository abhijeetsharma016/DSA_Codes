package com.GFG.String;

import java.util.Arrays;

public class Q17_LargestSubstringWithDistinctCharacters {
    public static int CHAR = 256;
    public static void main(String[] args) {
        String str = "geeksforgeeks";
        int len = longestDistinct(str);
        System.out.print("The length of the longest distinct characters substring is " + len);
    }

    public static int longestDistinct(String str) {
        int[] prev = new int[CHAR];
        Arrays.fill(prev, -1);
        int res =0;
        int start = 0;
        for (int i = 0; i < str.length(); i++) {
            start = Math.max(start, prev[str.charAt(i)]+1);
            res = Math.max(res,i-start+1);
            prev[str.charAt(i)] = i;
        }
        return res;
    }
}
