package com.GFG.Sorting;

import java.util.Arrays;

public class Q25_SortingArrayWithTwoTypesOfElement {
    public static void main(String[] args) {
        int[] arr = {-12,18,-10,15};
        hoarsePartition(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void hoarsePartition(int[] arr){
        int n = arr.length;
        int i = -1, j = n;
        while(true){
            do {
                i++;
            }while (arr[i]<0);
            do{
                j--;
            }while (arr[j]>=0);
            if(i>=j){
                return;
            }
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
}
