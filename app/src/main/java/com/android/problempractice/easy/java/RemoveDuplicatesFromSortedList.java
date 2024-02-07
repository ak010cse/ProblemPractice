package com.android.problempractice.easy.java;

import java.util.ArrayList;
import java.util.Stack;

public class RemoveDuplicatesFromSortedList {
    public static void main(String[] args) {
        int[] arr = {1, 2, 6, 3, 4, 7, 2, 5, 6, 1, 7};
        ArrayList<Integer>arrayList=new ArrayList<>();

        for(int i:arr){
            if (arrayList.contains(i)){
                System.out.println(i);

            }else {
                arrayList.add(i);
            }
        }
        System.out.println(arrayList);
    }

}
