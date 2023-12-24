package com.GFG.Searching;

public class Q17_MedianOfTwoSortedArray {
    public static void main(String[] args) {
        int[] arr1 = {-5, 3, 6, 12, 15};
        int[] arr2 = {-12, -10, -6, -3, 4, 10};
        System.out.println("Median of two arrays are: ");
        System.out.println(Median(arr1,arr2));
    }
    public static double Median(int[] arr1, int[] arr2){
        int size1 = arr1.length;
        int size2 = arr2.length;
        int BmidImaginary = (size2+size1+1)/2;
        if(size1>size2){
            return Median(arr2,arr1);
            //arr1 should be smaller than arr 2
        }
        int start=0;
        int end = size1;
        while(start<=end){
            int mid = (start+end)/2;
            int Amid = mid;
            int Bmid = BmidImaginary - mid;

            int leftA = (Amid > 0) ? arr1[(Amid - 1)] : Integer.MIN_VALUE;
            int leftB = (Bmid > 0) ? arr2[(Bmid - 1)] : Integer.MIN_VALUE;
            int rightA = (Amid<size1)?arr1[Amid]:Integer.MAX_VALUE;
            int rightB = (Bmid < size2) ? arr2[Bmid] : Integer.MAX_VALUE;

            if (leftA <= rightB && leftB <= rightA) {
                if ((size1 + size2) % 2 == 0) {
                    return ((Math.max(leftA,leftB)+Math.min(rightA,rightB))/2.0);
                }
                else
                    return Math.max(leftA,leftB);

            } else if (leftA>rightB) {
                end = mid-1;
            }
            else {
                start=mid+1;
            }
        }
        return  0.0;
    }
}
