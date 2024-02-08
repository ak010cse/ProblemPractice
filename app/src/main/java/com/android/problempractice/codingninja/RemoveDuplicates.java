package com.android.problempractice.codingninja;

import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicates {
    /*You are given a sorted integer array 'arr' of size 'n'.
        You need to remove the duplicates from the array such that each element appears only once.
        Return the length of this new array.
        Note:
        Do not allocate extra space for another array. You need to do this by modifying the given input array in place with O(1) extra memory.*/
    public static void main(String[] args){
        int[] arr = {1,2,2,2,3};
        int n=arr.length;
        System.out.println(removeDuplicates(arr,n));

    }
    public static int removeDuplicates(int[] arr,int n) {
        //Brute Force Approach
       /* HashSet<Integer>set = new HashSet<>();
        for(int i=0;i<n;i++){
           set.add(arr[i]);
        }
        return  set.size();*/

        //Optimal Approach

        int i=0;
        for(int j=1;j<n;j++){
            if(arr[i] != arr[j]){
                arr[i+1] = arr[j];
                i++;
            }
        }
        return i+1;
    }
}
