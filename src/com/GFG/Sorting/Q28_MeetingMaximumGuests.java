package com.GFG.Sorting;

public class Q28_MeetingMaximumGuests {
    public static void main(String[] args)
    {
        int [] arrl = new int[]{13, 28, 29, 14, 40, 17, 3 };
        int [] exit = new int[]{107, 95, 111, 105, 70, 127, 74};
        int n = arrl.length;
        System.out.println(findMaxGuests(arrl, exit, n));
    }

    public static int findMaxGuests(int[] arrl, int[] exit, int n){
        int enter = 0, leave = 0;
        int count = 0, maxGuest = 0;
        while(enter<n){
            if (arrl[enter] < exit[leave]) {
                enter++;
                count++;
                maxGuest = Math.max(maxGuest,count);
            }
            else if(arrl[enter]>exit[leave]){
                leave++;
                count--;
            }
        }
        return maxGuest;
    }
}
