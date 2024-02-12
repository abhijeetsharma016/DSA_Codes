package com.GFG.String;
//Given a text and a pattern, the task is to find if there is anagram of pattern present in text.
public class Q15_SearchAnagram {
    static final int CHAR=256;
    public static void main(String[] args){
        String txt = "geeksforgeeks";
        String pat = "frog";
        if (isPresent(txt, pat))
            System.out.println("Anagram search found");
        else
            System.out.println("Anagram search not found");
    }

    public static boolean isPresent(String txt, String pat){
        int[] tempText=new int[CHAR];
        int[] tempPattern = new int[CHAR];
        for(int i =0; i<pat.length();i++){
            tempText[txt.charAt(i)]++;
            tempPattern[pat.charAt(i)]++;
        }
        for(int i =pat.length();i<txt.length();i++){
            if(isSame(tempText, tempPattern)){
                return true;
            }
            tempText[txt.charAt(i)]++;
            tempText[txt.charAt(i-pat.length())]--;
        }
        return false;
    }

    public static boolean isSame(int[] tempText, int[] tempPattern) {
        for(int i=0; i<tempText.length;i++){
            if(tempText[i] != tempPattern[i]){
                return false;
            }
        }
        return true;
    }
}
