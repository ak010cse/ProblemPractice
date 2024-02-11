package com.android.problempractice.codingninja;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class FindTheSingleElement {

    public static void main(String[] args){
        int[] arr= {1, 1, 2, 3, 3, 4, 4};
        System.out.println(getSingleElement(arr));
    }

    public static int getSingleElement(int []arr){
        // Write your code here.
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int j : arr) {
            int value = map.getOrDefault(j,0);
            map.put(j,value+1);


        }
        for(Map.Entry<Integer,Integer>it:map.entrySet()){
            if (it.getValue() == 1){
                return it.getKey();
            }
        }

      return  -1;
    }
}
