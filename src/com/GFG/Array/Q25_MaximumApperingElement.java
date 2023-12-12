package com.GFG.Array;

import java.util.Arrays;
import java.util.Scanner;

public class Q25_MaximumApperingElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int size = sc.nextInt();
        int[] rightarr = new int[size];
        int[] leftarr = new int [size];

        for(int i = 0; i<size; i++){
            System.out.print("Enter the "+ i+1 + " starting range of left arr: ");
            leftarr[i] = sc.nextInt();
            System.out.print("Enter the "+ i+1 + " starting range of right arr: ");
            rightarr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(leftarr));
        System.out.println(Arrays.toString(rightarr));

        System.out.println(findMaximumApperaingElement(rightarr,leftarr,size));

    }

    public static int findMaximumApperaingElement(int[] rightArr, int[] leftArray, int size) {
        int[] resultArray = new int[1000000];
        int maxi = -1; //tells us the index of last element in resArray which is not 0;
        for(int i=0;i<size;i++){
            resultArray[leftArray[i]] += 1;
            resultArray[rightArr[i]+1] -= 1;

            if (rightArr[i] > maxi) {
                maxi = rightArr[i];//tells us the index of last element in resArray which is not 0;,
            }

        }
        return MaxAppering(resultArray, maxi);
    }

    private static int MaxAppering(int[] resultArray, int maxi) {
        int ind = 0;
        int maxSum = resultArray[0];
        for(int i=1;i<maxi+1;i++){//maxi+1 because we update -1 to the next element of right array
            resultArray[i] += resultArray[i-1];
            if(maxSum<resultArray[i]){
                maxSum = resultArray[i];
                ind = i;
            }
        }
        return ind;
    }

}
