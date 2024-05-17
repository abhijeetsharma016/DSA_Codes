package com.GFG.String;

import java.util.Arrays;

public class Q13_KMP_AlgorithmForSearchingInAString {
    public static int[] computePrefixArray(String pattern) {
        int[] prefixArray = new int[pattern.length()];
        int j = 0;
        for (int i = 1; i < pattern.length(); i++) {
            if (pattern.charAt(i) == pattern.charAt(j)) {
                prefixArray[i] = j + 1;
                j++;
            } else if (j > 0) {
                j = prefixArray[j - 1];
                i--;
            } else {
                prefixArray[i] = 0;
            }
        }
        return prefixArray;
    }

    public static int KMP(String text, String pattern) {
        int[] prefixArray = computePrefixArray(pattern);
        int j = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == pattern.charAt(j)) {
                if (j == pattern.length() - 1) {
                    return (i - pattern.length() + 1); // pattern found
                }
                j++;
            } else if (j > 0) {
                j = prefixArray[j - 1];
                i--;
            }
        }
        return -1; // pattern not found
    }

    public static void main(String[] args) {
        String text = "ABABDABACDABABCABAB";
        String pattern = "ABABCABAB";
        int index = KMP(text, pattern);
        if (index != -1) {
            System.out.println("Pattern found at index: " + index);
        } else {
            System.out.println("Pattern not found in the text.");
        }
    }
}