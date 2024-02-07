package com.android.problempractice.codingninja;

import android.icu.util.Output;

public class LargestElement {
    /*Given an array ‘arr’ of size ‘n’ find the largest element in the array.
     Example:
    Input: 'n' = 5, 'arr' = [1, 2, 3, 4, 5]
    Output: 5
    Explanation: From the array {1, 2, 3, 4, 5}, the largest element is 5.*/

    public static void main(String[] args) {

        int[] arr = {4, 7, 8, 6, 7, 6};
        int n = arr.length;
        System.out.println(largestElement(arr, n));
    }

    static int largestElement(int[] arr, int n) {
        int max = arr[0];
        for (int i = 0; i < n; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }
}
