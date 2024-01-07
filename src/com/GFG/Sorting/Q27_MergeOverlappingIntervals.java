package com.GFG.Sorting;

import java.util.Arrays;

public class Q27_MergeOverlappingIntervals            {
    public static void main(String[] args) {
        Interval[] arr ={new Interval(5,10),new Interval(3,15),new Interval(18,30),
                new Interval(2,7)};
        mergeIntervals(arr);
    }
    public static void mergeIntervals(Interval[] arr){
        Arrays.sort(arr);//Sort the array first
        int update = 0;
        for(int i=1; i<arr.length;i++){
            if(arr[update].e>=arr[i].s){
                arr[update].e = Math.max(arr[i].e,arr[update].e);
                arr[update].s = Math.min(arr[i].s,arr[update].s);
            }
            else {
                update++;
                arr[update] = arr[i];
            }
        }
        printArray(arr,update);
    }
    public static void printArray(Interval[] arr,int update){
        for(int i =0; i<=update;i++){
            System.out.println("[" + arr[i].s + " , " + arr[i].e + "]");
        }
    }
}
class Interval implements Comparable<Interval>{
    int s, e;
    Interval(int s, int e){
        this.s = s;
        this.e = e;
    }
    public int compareTo(Interval a){
        return this.s - a.s;
    }
}