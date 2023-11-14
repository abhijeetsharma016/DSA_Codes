package com.GFG.Recursion;

import java.util.ArrayList;

public class test {
    public static void main(String[] args) {
        System.out.println(powerSet("ABC"));
    }
        public static ArrayList<String> set(String s, String crr, int i){
            ArrayList<String> a = new ArrayList();
            if(i==s.length()){
                a.add(crr);
                return a;
            }
            set(s,crr,++i);
            set(s,crr+s.charAt(i),++i);
            return a;

        }
        //Function to return the lexicographically sorted power-set of the string.
        static ArrayList<String> powerSet(String s)
        {
            return(set(s,"",0));
        }
    }
