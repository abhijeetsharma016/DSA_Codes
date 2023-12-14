package com.GFG.Searching;

import java.util.Arrays;
import java.util.Scanner;

//this question is a part of article(Sample Problems on Searching) which consist of multiple such questions
// Given an unsorted array of size n. Array elements are in the range from 1 to n.
// One number from set {1, 2, …n} is missing and one number occurs twice in the array. Our task is to find these two numbers.
    public class Q4_MissingAndRepeatingNumber {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number of elements: ");
            int size = sc.nextInt();
            int[] arr = new int[size];

            for (int i = 0; i < size; i++) {
                System.out.print("Enter the " + (i + 1) + " element: ");
                arr[i] = sc.nextInt();
            }
            System.out.println(Arrays.toString(arr));
            repeatAndMissing(arr, size);
        }

        public static void repeatAndMissing(int[] arr, int size) {
            int repeating = -1, missing = -1;
            for (int i = 0; i < size; i++) {
                int temp = arr[Math.abs(arr[i]) - 1];
                if (temp < 0) {
                    repeating = Math.abs(arr[i]);
                    break; //it will break here only so the value dont become +ve again
                }
                arr[Math.abs(arr[i]) - 1] = -arr[Math.abs(arr[i]) - 1];
            }
            for (int i = 0; i < size; i++) {
                if (arr[i] > 0) {
                    missing = i + 1;//i not arr[i] as we need to check the value which is still positive, then add 1 to it
                    // i represents the index, add 1 for the missing value
                    break;
                }
            }
            System.out.println("Repeating: " + repeating + "\n" + "Missing: " + missing);
        }
    }

