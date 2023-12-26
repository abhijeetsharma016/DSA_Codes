package com.GFG.Sorting;

import java.util.Arrays;
import java.util.Comparator;

class Point{
    int x,  y;
    Point(int i, int j){
        this.x = i;
        this.y = j;
    }
}
class MySort implements Comparator<Point>{
    public int compare(Point a, Point b){
        return a.x - b.x;
    }
}
public class Q3_ComparatorInterface {
    public static void main(String[] args) {
        Point [] arr = {new Point(10, 20), new Point(3, 12), new Point(5, 7)};
        Arrays.sort(arr, new MySort());
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].x + " " + arr[i].y);
        }
        System.out.println(Arrays.toString(arr));//this will give id cant use it
    }

}
