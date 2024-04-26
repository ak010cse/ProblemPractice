package com.android.problempractice.codingninja;

import java.util.Arrays;

public class MoveZeroEnd {

    public static void main(String[] args){
        int[] arr= {2,0,3,0,1};
        int n = arr.length;
        System.out.println(Arrays.toString(moveZeros(n,arr)));
    }

    public static int[] moveZeros(int n, int []a) {
        // Write your code here.
        int[] result = new int[n];
        int index=0;
        for(int i=0;i<n;i++){
            if(a[i] != 0){
                result[index++] = a[i];
                System.out.println(a[i]);
            }
        }
        return result;
    }
}
