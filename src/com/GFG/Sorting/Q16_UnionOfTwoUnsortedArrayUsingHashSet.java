package com.GFG.Sorting;
// Java program for the union of two arrays using Set
import java.util.*;

class Q16_UnionOfTwoUnsortedArrayUsingHashSet {
    static void getUnion(int a[], int n, int b[], int m)
    {
        // find min of n and m
        int min = (n < m) ? n : m;

        // set container
        Set<Integer> set = new HashSet<>();

        // add elements from both the arrays for
        // index from 0 to min(n, m)-1
        for (int i = 0; i < min; i++) {
            set.add(a[i]);
            set.add(b[i]);
        }

        // add remiaining elements to the set from the other
        // array (having greater length)
        // note that only one of the loops will execute
        if (n > m) {
            for (int i = m; i < n; i++) {
                set.add(a[i]);
            }
        }
        else if (n < m) {
            for (int i = n; i < m; i++) {
                set.add(b[i]);
            }
        }

        // driver code to print the output
        System.out.println(
                "The union set of both arrays is :");
        System.out.print(set.toString());
    }
    // Driver Code
    public static void main(String[] args)
    {
        int a[] = { 1, 2, 5, 6, 2, 3, 5, 7, 3 };
        int b[] = { 2, 4, 5, 6, 8, 9, 4, 6, 5, 4 };

        getUnion(a, 9, b, 10);
    }
}
