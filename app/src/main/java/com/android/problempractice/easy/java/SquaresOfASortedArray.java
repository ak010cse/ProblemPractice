package com.android.problempractice.easy.java;

import java.util.Arrays;

public class SquaresOfASortedArray {

    public static void main(String[] args) {
        int[] nums = {-7,-3,2,3,11};
        System.out.println(Arrays.toString(sortedSquares(nums)));
    }

    public static int[] sortedSquares(int[] nums) {
        int square;
        for (int i = 0; i < nums.length; i++) {
            square = nums[i] * nums[i];
            nums[i]=square;
        }
        Arrays.sort(nums);
        return nums;
    }
}
