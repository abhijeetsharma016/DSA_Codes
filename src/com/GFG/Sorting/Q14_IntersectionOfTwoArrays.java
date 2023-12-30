package com.GFG.Sorting;
//taking two sorted arrays and picking out the intersection elements from the two arrays.
public class Q14_IntersectionOfTwoArrays {
    public static void main(String[] args) {
        int[] arr1 = {3,5,10,10,10,15,15,20};
        int[] arr2 = {5,10,10,15,30};
        Intersection(arr1,arr2);
    }

    public static void Intersection(int[] arr1, int[] arr2) {
        int i =0, j=0;
        while(i<arr1.length && j<arr2.length){
            if(i>0 && arr1[i-1]==arr1[i]){
                i++;
                continue;
            }
            if(j>0 && arr2[j-1]==arr2[j]){
                j++;
                continue;
            } else if (arr1[i]>arr2[j]) {
                j++;
            } else if (arr1[i]<arr2[j]) {
                i++;
            }
            else{
                System.out.println(arr1[i]);
                i++;
                j++;
            }

        }
    }
}
