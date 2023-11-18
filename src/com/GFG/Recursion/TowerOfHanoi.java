package com.GFG.Recursion;

public class TowerOfHanoi {
    public static void hanoi(int n, char fromRoad, char toRoad, char auxRoad){
        if(n==0){
            return;
        }
        hanoi(n-1,fromRoad,auxRoad,toRoad);
        System.out.println("Move "+ n + " from "+ fromRoad + " to " + toRoad);
        hanoi(n-1,auxRoad,toRoad,fromRoad);
    }

    public static void main(String[] args) {
        hanoi(3,'A', 'C','B');
    }
}
