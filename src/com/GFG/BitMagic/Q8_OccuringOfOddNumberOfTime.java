//int this question we have to find the number which is occurring odd number of times in an array
package com.GFG.BitMagic;

public class Q8_OccuringOfOddNumberOfTime {
    public static void main(String[] args) {
        int arr [] = {2,2,5,5,5,5,10,4,4,3,3};
        System.out.println(findOddOccurance(arr));
    }
    public static int findOddOccurance(int [] n){
        int result =0;
        for(int i=0; i<n.length;i++){
            result = result^n[i];
        }
        return result;
    }
}