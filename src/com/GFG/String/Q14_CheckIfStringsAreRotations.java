package com.GFG.String;

public class Q14_CheckIfStringsAreRotations {
    public static void main(String[] args){
        String s1 = "ABCD";
        String s2 = "CDAB";
        System.out.println(arerotations(s1, s2));
    }

    public static boolean arerotations(String s1, String s2) {
        if(s1.length() != s2.length()){
            return false;
        }
        String temp = s1 + s2;
        return s1.indexOf(s2)!=-1;
    }
}
