package com.GFG.Sorting;

public class Q22_KthSmallestElement {
    public static void main(String[] args) {
        int[] arr = {5};
        int k = 1;
        int l = 0, h = arr.length-1;
        findKthSmallest(arr, k, l, h);
    }

    public static void findKthSmallest(int[] arr, int k,int l,int h) {
        int p = hoarePartition(arr, l, h);
        if(p+1==k){
            System.out.println(arr[p]);
        } else if (p+1>k) {
         findKthSmallest(arr,k,l,p);
        }
        else{
            findKthSmallest(arr,k,p+1,h);
        }
    }

    public static int hoarePartition(int[] arr, int l, int h) {
        int i = l, j = h;
        int pivotIndex = (l) + (int) (Math.random() * (h - l + 1));
        int pivot = arr[pivotIndex];
        while (true){
            while(arr[i]<pivot){
                i++;
            }
            while (arr[j] > pivot) {
            j--;
        }
        if (i >= j) {
            return j;
        }
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        i++;
        j--;
    }
    }
}
