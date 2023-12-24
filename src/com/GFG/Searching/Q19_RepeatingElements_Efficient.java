package com.GFG.Searching;

import java.util.Arrays;
import java.util.Scanner;
//finding repeating elements in an unsorted array where elements are always less than size of array
public class Q19_RepeatingElements_Efficient {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the 1 element: 0 1 2 3 4 5 6 7");

        for(int i = 0; i<size; i++){
            System.out.print("Enter the " + (i+1) + " element: ");
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(findRepeating(arr,size));
    }
    public static int findRepeating(int[] arr,int size){
        int slow = arr[0]+1;
        int fast = arr[0]+1;
        do {
            slow = arr[slow] + 1; // we add 1 to eliminate infinite looping image a case where 1st element say got to
            //element 4th and 4th element say go back to one after adding 1 it is only possible if both elements are same
            fast = arr[arr[fast] + 1] + 1;
            System.out.println(slow + "   " + fast); //understanding how loop works
            //the faster one will be in an infinite loop until show reachers up to it
        } while (slow != fast);
        slow = arr[0]+1;
        while (slow!=fast){//finding thr first occurrence of the repeating variable
            System.out.println(slow+ "  "+ fast);
            fast = arr[fast]+1;
            slow = arr[slow]+1;
        }
        return slow-1;
    }

}
