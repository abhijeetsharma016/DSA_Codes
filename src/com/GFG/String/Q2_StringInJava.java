package com.GFG.String;

import java.util.SortedMap;

public class Q2_StringInJava {
    public static void main(String[] args) {
        String str = "Abhijeet";
        String str2 = "eet";
        System.out.println(str.charAt(2));
        System.out.println(str.length());
        System.out.println(str.substring(2));
        System.out.println(str.substring(2,4));

        int res = str.compareTo(str2);//compares the alphabets not the length
        if(res == 0)
            System.out.println("Same");

        if(res > 0)
            System.out.println("str is Greater");

        if(res < 0)
            System.out.println("str is Smaller");


        System.out.println(str.equals(str));
        System.out.println(str.contains(str2));

        // Creating two string literals
        String s1 = "geeks";
        String s2 = "geeks";

        // Checking if both point to the
        // same object or not
        if(s1 == s2)
            System.out.println("Yes");
        else
            System.out.println("No");

        // Creating a string using
        // new operator
        String s3 = new String("geeks");

        // Checking if both point to the
        // same object or not
        if(s1 == s3)
            System.out.println("Yes");
        else
            System.out.println("no");

        s1 = s1 + "forGeeks";// now it points to a new string
        System.out.println(s1);
        System.out.println(s1 == s2);//it points to new object,
        // not false because it compares string false because it poitns to new object




    }
}
