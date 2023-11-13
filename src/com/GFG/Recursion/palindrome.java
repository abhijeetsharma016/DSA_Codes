package com.GFG.Recursion;

public class palindrome {
    public static boolean palindrome(String s, int start, int end){
        if(start>=end){
            return true;
        }
        return(s.charAt(start)==s.charAt(end)&&palindrome(s,start+1,end-1));
    }

    public static void main(String[] args) {
        String arg = "AbbA";
        System.out.println(palindrome(arg,0,(arg.length()-1)));
    }
}
