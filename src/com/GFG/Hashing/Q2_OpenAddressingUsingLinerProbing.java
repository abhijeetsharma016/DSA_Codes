package com.GFG.Hashing;

import java.util.ArrayList;

public class Q2_OpenAddressingUsingLinerProbing {
    public static void main(String[] args) {
        Hash hashTable = new Hash(10);
        // Insert elements into the hash table
        hashTable.Insert(5);
        hashTable.Insert(25);
        hashTable.Insert(15);
        hashTable.display();

        System.out.println(hashTable.search(5));
        hashTable.delete(5);
        System.out.println(hashTable.search(5));
        hashTable.display();


    }
}

class Hash{

    int location;
    ArrayList <Integer> table;
    int Bucket;
    public Hash(int b){
        Bucket = b;
        table = new ArrayList<>();
        //Initialise table with -1 to represent empty slots
        for (int i = 0; i < b; i++) {
            table.add(-1);
        }
    }

    public void Insert(int element) {
        int index = element%Bucket;
        if (table.get(index) == -1 )
            table.set(index, element);

        else{
            int originalIndex = index;
            index = (index+1)%Bucket;
            while (table.get(index) != -1 && index != originalIndex) {
                index = (index+1) % Bucket;
            }
            if(index == originalIndex){
                System.out.println("Hashset full");
            }
            else {
                table.set(index, element);
            }
        }
    }
    public boolean search(int element) {
        int index = element % Bucket;
        if (table.get(index) == element) {
            location = index;
            return true;
        } else {
            int originalIndex = index;
            index = (index+1)%Bucket;
            while (table.get(index) != index && index != originalIndex) {
                index = (index + 1) % Bucket;
            }
            if(index == originalIndex) {
                return false;
            }
            else {
                location = index;
                return true;
            }
        }
    }
    public void display() {
        System.out.println("Hash Table:");
        for (int i = 0; i < Bucket; i++) {
            System.out.println(i + ": " + table.get(i));
        }
    }

    public void delete(int element) {
        if (search(element)) {
            table.set(location, -1);
        }
        else {
            System.out.println("element don't exist");
        }
    }
}
