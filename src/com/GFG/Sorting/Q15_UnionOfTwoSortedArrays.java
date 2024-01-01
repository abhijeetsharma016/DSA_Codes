package com.GFG.Sorting;
public class Q15_UnionOfTwoSortedArrays {
    public static void main(String[] args) {
        int a[] = {1, 2, 5, 6, 2, 3, 5};
        int b[] = {2, 4, 5, 6, 8, 9, 4, 6, 5};

        printUnion(a, b);
    }

    public static void printUnion(int[] arr1, int[] arr2) {
        int i = 0, j = 0;
        while (i < arr1.length && j < arr2.length) {
            if (i > 0 && arr1[i] == arr1[i - 1]) {
                i++;
                continue;
            }
            if (j > 0 && arr2[j] == arr2[j - 1]) {
                j++;
                continue;
            }
            if (arr1[i] < arr2[j]) {
                System.out.print(arr1[i]);
                i++;
            } else if (arr1[i] > arr2[j]) {
                System.out.print(arr2[j]);
                j++;
            } else{
                System.out.print(arr1[i]);
                i++;
                j++;
            }
        }
            while (i < arr1.length) {
                if (i > 0 && arr1[i] != arr1[i - 1]) {
                    System.out.print(arr1[i]);
                }
                i++;
            }
            while (j < arr2.length) {
                if (j > 0 && arr2[j] != arr2[j - 1]) {
                    System.out.print(arr2[j]);
                }
                j++;
            }
        }
    }
