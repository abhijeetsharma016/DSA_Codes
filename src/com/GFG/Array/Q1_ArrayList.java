package com.GFG.Array;

import java.util.ArrayList;

public class Q1_ArrayList {
    public static void main(String[] args) {
        ArrayList myArrayList = new ArrayList();
        for (int i = 0; i < 10; i++) {
            myArrayList.add(i);
        }
        System.out.println(myArrayList);
        myArrayList.remove(4);
        System.out.println(myArrayList);
        for(int i=0; i<myArrayList.size(); i++){
            System.out.print(myArrayList.get(i));
        }
        System.out.println("");
        ArrayList myArrayList2 = new ArrayList(myArrayList);
        myArrayList2.add(1009);
        System.out.println(myArrayList2);
    }
}