package com.GFG.BitMagic;

public class Q9_OccuringOfTwoNumbersOddNumberOfTimeInArray {
    public static void main(String[] args) {
        int [] arr = {1,1,2,2,3,4,5,5,6,6};
        int x = 0,y =0;
        int xor2 = arr[0];
        //doing xor of all numbers in array
        for(int i =0;i< arr.length;i++){
            xor2=xor2^arr[i];
        }
        //getting right most set bit of xor:
        int set_bit = xor2&(~xor2+1);
        //making 2 gorups of array one with right most set bit as 0 and one with right most set bit as 1
        for(int i = 0;i<arr.length;i++){
            if((arr[i]&set_bit) > 0){
                x = x^arr[i];
            }
            else{
                y = y^arr[i];
            }
        }
        System.out.println(x + "\n"+y);
    }
}