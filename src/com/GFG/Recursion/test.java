package com.GFG.Recursion;

import java.util.ArrayList;

public class test {
    public static void main(String[] args) {
        System.out.println(powerSet("ABC"));
    }
        public static void set(String s ,ArrayList<String>a , String crr, int i){

            if(i==s.length()){
                a.add(crr);
                return;
            }
            set(s,a,crr,i+1);
            set(s,a,crr+s.charAt(i),i+1);

        }
        //Function to return the lexicographically sorted power-set of the string.
        static ArrayList<String> powerSet(String s)
        {
            ArrayList<String> a = new ArrayList();
            set(s, a,"",0);
            return a;
        }
    }
