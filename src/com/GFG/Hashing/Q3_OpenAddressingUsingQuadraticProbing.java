package com.GFG.Hashing;

import java.util.ArrayList;

public class Q3_OpenAddressingUsingQuadraticProbing {
    public static void main(String[] args) {
        MyHash1 myHash = new MyHash1(3); // Change class name to MyHash
        myHash.insert(5);
        myHash.insert(6);
        myHash.insert(7);
        myHash.insert(8);
        myHash.display();
        System.out.println(myHash.search(6));
        myHash.delete(6);
        System.out.println(myHash.search(6));
    }
}

class MyHash1 { // Change class name to MyHash
    int Bucket;
    int location;
    ArrayList<Integer> table;

    public MyHash1(int b) {
        table = new ArrayList<>();
        Bucket = b;
        for (int i = 0; i < Bucket; i++) {
            table.add(-1);
        }
    }
    public void insert(int element) {
        int index = element % Bucket;
        int originalIndex = index;

        if (table.get(index) == -1) {
            table.set(index, element);
        } else {
            int i = 1;
            index = (originalIndex + i * i) % Bucket;
            while (index != originalIndex && table.get(index) != -1) {
                i++;
                index = (originalIndex + i * i) % Bucket;
            }

            if (index == originalIndex) {
                System.out.println("Hash set is full");
            } else {
                table.set(index, element);
            }
        }
    }


    public boolean search(int element) {
        int index = element % Bucket;
        if (index == element) {
            location = index;
            return true;
        } else {
            int original = index;
            index = (index + 1 * 1) % Bucket;
            int i = 2;
            while (index != original && table.get(index) != -1) {
                index = (index + i * i) % Bucket;
                i = i + 1;
            }
            if (table.get(index) == element) {
                location = index;
                return true;
            }
            return false;
        }
    }

    public void delete(int element) {
        if (search(element)) {
            table.set(location, -1);
        } else {
            System.out.println("Element not found");
        }
    }

    public void display() {
        System.out.println("Hash Table:");
        for (int i = 0; i < Bucket; i++) {
            System.out.println(i + ": " + table.get(i));
        }
    }

}
