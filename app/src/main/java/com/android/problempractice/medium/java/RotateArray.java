package com.android.problempractice.medium.java;

import java.util.ArrayList;
import java.util.Arrays;

public class RotateArray {

    public static void main(String[] args){
        int[] arr={1,2,3/*1,2,3,4,5,6,7*//*-1,-100,3,99*/};
        int k=4;
        rotate(arr,k);

    }

    public static void rotate(int[] nums, int k) {
       /* ArrayList<Integer>arrayList=new ArrayList<>();
        if (nums.length>k){
            for (int j = (nums.length)-k;j<nums.length;j++){
                arrayList.add(nums[j]);
            }
            for (int i=0;i<(nums.length)-k;i++){
                arrayList.add(nums[i]);
            }

        }else if (nums.length>1 && nums.length<k){
            for (int i=nums.length-1;i>=0;i--){
                arrayList.add(nums[i] );
            }

        }
        for (int x=0;x<arrayList.size();x++){
            nums[x]=arrayList.get(x);
        }
        System.out.println(Arrays.toString(nums));*/

        ArrayList<Integer>arrayList=new ArrayList<>();
        int n=nums.length;
        k=k%n;
        for (int i=0;i<n;i++){
            if (i<k){
                arrayList.add(nums[n + i - k]);
            }else {
                arrayList.add(nums[i - k]);
            }
        }
        for (int x=0;x<arrayList.size();x++){
            nums[x]=arrayList.get(x);
        }
        System.out.println(Arrays.toString(nums));
    }
}
