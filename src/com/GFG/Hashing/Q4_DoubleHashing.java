package com.GFG.Hashing;

import java.util.ArrayList;

public class Q4_DoubleHashing {
    public static void main(String[] args) {
        DoubleHashing myhash = new DoubleHashing(7,5);
        myhash.insert(10);
        myhash.insert(20);
        myhash.insert(30);
        myhash.insert(40);
        myhash.insert(50);
        myhash.insert(60);
        myhash.insert(70);
        myhash.insert(80);
    }
}
class DoubleHashing {
    ArrayList<Integer> myArrayList;
    int Bucket1;
    int Bucket2;
    int location;

    public DoubleHashing(int Bucket1,int Bucket2){
        myArrayList = new ArrayList<>();
        this.Bucket1 = Bucket1;
        this.Bucket2 = Bucket2;
        for (int i = 0; i < Bucket1; i++) {
            myArrayList.add(-1);
        }
    }

    public void insert(int element) {
        int index = element%Bucket1;
        if (myArrayList.get(index) == -1) {
            myArrayList.set(index, element);
        }
        else{
            int original = index;
            int index2 = element%Bucket2;
            int hash = (index + index2)%Bucket1;
            int i = 2;
            while (myArrayList.get(hash) != -1 && hash != original) {
                hash = (index + i*index2)%Bucket1;
                i++;
            }
            if (hash == original) {
                System.out.println("Arraylist full");
            } else {
                myArrayList.set(hash, element);
            }
        }
    }


}
