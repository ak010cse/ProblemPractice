package com.android.problempractice.leetcode;

import android.icu.util.Output;

import java.util.ArrayList;

public class RotateArray {
    /*Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.
    Input: nums = [1,2,3,4,5,6,7], k = 3
    Output: [5,6,7,1,2,3,4]*/
    public static void main(String[] args){
        int[] nums = {1,2,3,4,5,6,7};
        int k = 3;
        rotate(nums,k);
    }
    public static void rotate(int[] nums, int k) {
        int n= nums.length;
        k = k % n;
        ArrayList<Integer>arrayList = new ArrayList<>();
        for(int i=0;i<n;i++){
            if (i<k){
                arrayList.add(nums[n + i - k]);
            }else {
                arrayList.add(nums[i-k]);
            }
        }
        System.out.println(arrayList);
    }
}
