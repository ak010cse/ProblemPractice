package com.android.problempractice.leetcode;

public class BinarySearch {

    public static void main(String[] args){
        int[] arr = {-1,0,3,5,9,10,12,13};
        System.out.println(search(arr,0,arr.length));

    }
    public static int search(int[] arr, int target, int n) {
        int start =0;
        int end  = n-1;
        int mid = start + (end - start)/2;

        while (start<=end){
            if (arr[mid] == target){
                return mid;
            }
            if (target>arr[mid]){
                start = mid + 1;
            }else {
                end = mid -1;
            }
            mid = start + (end - start)/2;
        }
        return  -1;
    }
}
