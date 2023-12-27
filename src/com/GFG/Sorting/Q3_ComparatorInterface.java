package com.GFG.Sorting;

import java.util.Arrays;
import java.util.Comparator;

class Q3_Point {
    int x,  y;
    Q3_Point(int i, int j){
        this.x = i;
        this.y = j;
    }
}
class MySort implements Comparator<Q3_Point>{
    public int compare(Q3_Point a, Q3_Point b){
        return a.x - b.x;
    }
}
public class Q3_ComparatorInterface {
    public static void main(String[] args) {
        Q3_Point[] arr = {new Q3_Point(10, 20), new Q3_Point(3, 12), new Q3_Point(5, 7)};
        Arrays.sort(arr, new MySort());
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].x + " " + arr[i].y);
        }
        System.out.println(Arrays.toString(arr));//this will give id cant use it
    }
}