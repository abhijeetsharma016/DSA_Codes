package com.GFG.Sorting;

public class Q17_CountInversions {
    public static void main(String[] args) {
        int[] arr = { 2,4,1,3,5};
        System.out.println(mergeSortCount(arr,0,arr.length-1));
    }
    public static int mergeSortCount(int[] arr,int l, int r){

        int res = 0;
        if(l<r){
            int mid = l+(r-l)/2;
            res += mergeSortCount(arr,l,mid);
            res += mergeSortCount(arr,mid+1,r);
            res+= mergeAndCount(arr,l,r,mid);
        }
        return res;
    }

    public static int mergeAndCount(int[] arr, int l, int r, int mid) {
        int n1 = mid- l + 1;
        int n2 = r-mid;

        //creating two arrays
        int[] left = new int[n1];
        int[] right = new int [n2];
        for (int i = 0; i < n1; i++) {
            left[i] = arr[l+i];
        }
        for (int i = 0; i < n2; i++) {
            right[i] = arr[mid +i + 1];
        }


        int i = 0, j = 0, k = l;
        int res =0;
        while (i<n1 && j <n2) {
            if (left[i] <= right[j]) {
                arr[k] = left[i];
                i++;
            }
            else{
                arr[k] =  right[j];
                res+= n1-i;
                j++;
            }
            k++;
        }
        while(i<n1){
            arr[k] = left[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = right[j];
            j++;
            k++;
        }

        return res;
    }
}
