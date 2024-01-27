package com.GFG.String;

public class Q1_CountOfCharacterInAString {
    public static void main(String[] args) {
        String str="geeksforgeeks";
        int[] count=new int[26];
        coutCharacter(str,count);
    }
    public static void coutCharacter(String str, int[] count){
        for(int i=0; i<str.length();i++){
            count[str.charAt(i) - 'a']++;
        }
        for(int i=0; i<26;i++){
            if(count[i] >0){
                System.out.println((char) (i + 'a') + " " + count[i]);
            }
        }
    }
}
