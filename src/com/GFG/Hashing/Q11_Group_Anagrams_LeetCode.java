package com.GFG.Hashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Q11_Group_Anagrams_LeetCode {
    public static ArrayList<ArrayList<String>> groupAnagrams(String[] strs) {
        String[] arr = new String[strs.length];
        ArrayList<ArrayList<String>> list = new ArrayList<>();
        HashMap<String,Integer> myHashMap = new HashMap<>();
        int hashIndex = 0;


        //makes an arr[i] of sorted elements
        for(int i=0;i<strs.length;i++){
            char[] charArray = strs[i].toCharArray();
            Arrays.sort(charArray);
            arr[i] = Arrays.toString(charArray);
        }

            for(int i = 0;i <strs.length;i++){
            if(myHashMap.containsKey(arr[i])){
                list.get(myHashMap.get(arr[i])).add(strs[i]);
            }
            else{
                list.add(new ArrayList<>());
                myHashMap.put(arr[i], hashIndex);
                hashIndex++;
                list.get(myHashMap.get(arr[i])).add(strs[i]);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        String [] strs = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagrams(strs));
    }
}
