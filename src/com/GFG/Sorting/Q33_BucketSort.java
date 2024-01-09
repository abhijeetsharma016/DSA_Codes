package com.GFG.Sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Vector;

public class Q33_BucketSort {
    public static void main(String[] args) {
        float arr[] = {(float) 0.897, (float) 0.565,
                (float) 0.656, (float) 0.1234,
                (float) 0.665, (float) 0.3434};

        int n = arr.length;
        bucketSort(arr, n, 4);
        //k=4
        System.out.println("Sorted array is ");
        for (float el : arr) {
            System.out.print(el + " ");
        }
    }

    static void bucketSort(float arr[], int n, int k) {

        float max_val=arr[0];
        for(int i=1;i<n;i++)
            max_val=Math.max(max_val,arr[i]);
        max_val++; //if we don't increase max value we will get the bucket index 4 for max element
        //but we only have buckets from index 0 to 3

        Vector<Float>[] bucket = new Vector[k];

        for (int i = 0; i < k; i++) {
            bucket[i] = new Vector<>();
        }

        for (int i = 0; i < n; i++) {
            int index = (int) ((arr[i] * k)/max_val);
            bucket[index].add(arr[i]);
        }

        for (int i = 0; i < k; i++) {
            Collections.sort(bucket[i]);
        }

        //Adding sorted elements back to array
        int index =0;
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < bucket[i].size(); j++) {
                arr[index++] = bucket[i].get(j);
            }
        }
    }
}
