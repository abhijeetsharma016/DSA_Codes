package com.GFG.Practice;

import java.util.Arrays;

public class Q1_HoareQuickSort {
    public static void main(String[] args) {
        Solution mySol = new Solution();
        int[] arr= {3,5,4,2,1};
        mySol.findErrorNums(arr);
        System.out.println(Arrays.toString(arr));
    }

}
class Solution {
    public int[] findErrorNums(int[] nums) {
        sortArray(nums, 0, nums.length -1);
        return nums;
    }

    public static void sortArray(int[] nums,int l, int h){
        if(l<h){
            int p = Hoare(nums, l, h);
            sortArray(nums,l, p);
            sortArray(nums, p+1, h);
        }
    }
    public static int Hoare(int[] nums, int l, int h){
        int i =l, j = h;
        int pivot = nums[l];
        while(true){
            while(i<=j && nums[i]<pivot){
                i++;
            }
            while(j>=i && nums[j]>pivot){
                j--;
            }
            if(i>=j){
                return j;
            }
            else{
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;

            }
        }
    }


}
