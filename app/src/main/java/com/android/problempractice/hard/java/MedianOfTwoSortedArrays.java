package com.android.problempractice.hard.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class MedianOfTwoSortedArrays {

    public static void main(String[] args) {
        int[] nums1 = {};
        int[] nums2 = {2,3};
        System.out.println(findMedianSortedArrays(nums1, nums2));
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

        double result = 1.0;
        int length=nums1.length + nums2.length;
        int index = 0;
        int[] resultArr = new int[length];

        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int k : nums1) {
            arrayList.add(k);
        }
        for (int j : nums2) {
            arrayList.add(j);
        }
        arrayList.sort(Comparator.naturalOrder());
        for (int i = 0; i < arrayList.size(); i++) {
                result = arrayList.get((arrayList.size()) / 2) + arrayList.get((arrayList.size() / 2) - 1);
        }
        if (arrayList.size()>3){
            result/=2;
        }

        return result;

    }
}
