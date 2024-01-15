package com.GFG.Hashing;

import java.util.ArrayList;
import java.util.LinkedList;

public class Q1_ChainingInHashing {
    public static void main(String[] args) {
        MyHash mh = new MyHash(7);
        mh.insert(10);
        mh.insert(20);
        mh.insert(15);
        mh.insert(7);
        System.out.println(mh.search(10));
        mh.delete(15);
        System.out.println(mh.search(15));
    }

}
class MyHash {
    int Bucket;
    ArrayList<LinkedList<Integer>> table;

    public MyHash(int b) {
        Bucket = b;
        table = new ArrayList<LinkedList<Integer>>();
        for (int i = 0; i < b; i++) {
            table.add(new LinkedList<Integer>());
        }
    }

    void insert(Integer k) {
        int i = k % Bucket;
        table.get(i).add(k);
    }

    boolean search(Integer k) {
        int i = k%Bucket;
        return table.get(i).contains(k);
    }

    void delete(Integer k)
    {
        int i = k % Bucket;
        table.get(i).remove(k);
    }
}