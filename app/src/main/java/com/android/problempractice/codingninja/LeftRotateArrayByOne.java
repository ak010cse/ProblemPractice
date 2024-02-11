package com.android.problempractice.codingninja;

import android.icu.util.Output;

import java.util.Arrays;

public class LeftRotateArrayByOne {
    /*Problem Statement: Given an array of N integers, left rotate the array by one place.
    Input: N = 5, array[] = {1,2,3,4,5}
    Output: 2,3,4,5,1*/
    public static void main(String[] args){
        int[] arr ={1, 2, 3, 4, 5};
        int n = arr.length;
        System.out.println(Arrays.toString(rotateArray(arr,n)));
    }

    static int[] rotateArray(int[] arr, int n) {
        // Write your code here.
        int first = arr[0];
        int index=0;
        for (int i=1; i<n; i++){
            arr[index] = arr[i];
            index++;
        }
        arr[n-1] = first;

        return arr;
    }
}
