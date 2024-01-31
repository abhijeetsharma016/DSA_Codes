package com.GFG.String;

//reverse each word in a string eg. last word = first word so on
//Welcome to Gfg = Gfg to Welcome
public class Q8_ReverseWordsInAString {
    public static void main(String[] args){
        String s = "Welcome to Gfg";int n=s.length();
        char[] str = s.toCharArray();
        System.out.println("After reversing words in the string:");
        reverseWords(str,n);
        System.out.println(str);
    }

    public static void reverseWords(char[] str, int n){
        int start = 0;
        for(int i=0; i<n; i++){
            if(str[i] == ' '){
                reverseArr(str, start, i-1);
                start = i+1;
            }
        }
        reverseArr(str,start,n-1);
        reverseArr(str,0,n-1);
    }
    public static void reverseArr(char[] str, int start, int end){
        while(start<end){
            char temp = str[start];
            str[start] = str[end];
            str[end] = temp;
            start++;
            end--;
        }
    }
}
