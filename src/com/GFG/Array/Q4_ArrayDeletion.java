package com.GFG.Array;

import java.util.Arrays;
import java.util.Scanner;

public class Q4_ArrayDeletion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input array size
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Input array elements
        System.out.println("Enter the array elements:");
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        // Input the position to delete
        System.out.print("Enter the position to delete (0 to " + (size - 1) + "): ");
        int position = scanner.nextInt();

        // Validate the position
        if (position < 0 || position >= size) {
            System.out.println("Invalid position. Please enter a valid position.");
        } else {
            // Delete the element at the specified position
            array = deleteElement(array, position);

            // Display the updated array
            System.out.println("Array after deletion: " + Arrays.toString(array));
        }

        scanner.close();
    }

    // Function to delete an element at a specific position in the array
    private static int[] deleteElement(int[] arr, int position) {
        int[] newArray = new int[arr.length - 1];
        int j = 0;

        for (int i = 0; i < arr.length; i++) {
            if (i != position) {
                newArray[j] = arr[i];
                j++;
            }
        }

        return newArray;
    }
}
