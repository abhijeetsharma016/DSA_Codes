package com.GFG.Hashing;
// Java program to demonstrate
// working of HashSet
import java.util.*;

class Q5_BuiltInHashSet
{
    public static void main(String[]args)
    {
        HashSet<String> h = new HashSet<String>();
        h.add("gfg");
        h.add("courses");
        h.add("ide");

        System.out.println(h);

        System.out.println(h.contains("gfg"));

        Iterator<String> i = h.iterator();
        while (i.hasNext()) {
            System.out.print(i.next() + " ");
            //The order of elements printed by the Iterator is determined by the internal implementation of the collection.
            // In the case of a HashSet, the order of elements is not guaranteed to be the same as the order in which they were inserted.
            // The HashSet class does not maintain the order of elements; instead, it uses a hash table to store and
            // retrieve elements efficiently.

        }
    }
}
