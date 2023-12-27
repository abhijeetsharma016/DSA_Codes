package com.GFG.Sorting;
import java.util.Arrays;

public class Q6_UsingComparatorWithinClass {
    public static void main(String[] args) {
        Q6_Point[] p = {new Q6_Point(5,2),new Q6_Point(9,3),new Q6_Point(6,1)};
        Arrays.sort(p);
        for(Q6_Point i : p) {
            System.out.println(i.x + " " + i.y);
        }
    }
}
class Q6_Point implements Comparable<Q6_Point>{
    int x;
    int y;
    Q6_Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Q6_Point p){
        // Compare first by x, then by y if x values are equal
        if (this.x == p.x) {
            return this.y - p.y;
        }
      return this.x - p.x; // compares wrt x
    }
}
