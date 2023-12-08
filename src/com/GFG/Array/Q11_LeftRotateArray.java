package com.GFG.Array;
//left rotate by d place
import java.util.Arrays;
import java.util.Scanner;

public class Q11_LeftRotateArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        for(int i = 0; i<size; i++){
            System.out.print("Enter the " + (i+1) + " element: ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the no of elements you need to left shift");
        int d = sc.nextInt();
        System.out.println(Arrays.toString(arr));
        leftRotate(arr,d, size);
        System.out.println(Arrays.toString(arr));
    }

    public static void leftRotate(int[] arr, int d, int size){
        int[] temp = new int[d];
        for (int i =0; i<d;i++){
            temp[i]=arr[i];
        }
        for(int i = d; i<size;i++){
            arr[i-d]=arr[i];
        }
        for (int i =0;i<d;i++){
            arr[size - d + i]=temp[i];
        }
    }
}
