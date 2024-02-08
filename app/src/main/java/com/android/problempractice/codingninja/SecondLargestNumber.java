package com.android.problempractice.codingninja;

import java.util.Arrays;

public class SecondLargestNumber {
    /*You have been given an array ‘a’ of ‘n’ unique non-negative integers.
    Find the second largest and second smallest element from the array.
    Return the two elements (second largest and second smallest) as another array of size 2.
    Example :
    Input: ‘n’ = 5, ‘a’ = [1, 2, 3, 4, 5]
    Output: [4, 2]*/
    public static void main(String[] args) {
        int[] arr = {4,5,3,6,7};
        int n = arr.length;
        System.out.println(Arrays.toString(getSecondOrderElements(n, arr)));

    }

    public static int[] getSecondOrderElements(int n, int[] a) {
        // Write your code here.
        int[] result = new int[2];
        result[0] = secondHighest(a,n);
        result[1] = secondLowest(a,n);

        return result;
    }

    public static int secondHighest(int[] arr, int n) {
        if (n < 2) {
            return -1;
        }
        int max = arr[0];
        int secondMax = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];
            } else if ( arr[i] > secondMax && arr[i]>max) {
                secondMax = arr[i];
            }
        }
        return secondMax;
    }
    public static int secondLowest(int[] arr, int n){
        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;
        if(n<2){
            return -1;
        }
        for(int i=0;i<n;i++){
            if (arr[i] < min){
                secondMin = min;
                min = arr[i];
            }else  if( arr[i] != min && arr[i] < secondMin){
                secondMin = arr[i];
            }
        }
        return secondMin;
    }
}
