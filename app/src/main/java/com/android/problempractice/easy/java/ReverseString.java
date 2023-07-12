package com.android.problempractice.easy.java;

import java.util.Arrays;

public class ReverseString {

    public static void main(String[] args) {

        char[] s = {'h', 'e', 'l', 'l', 'o'};
        reverseString(s);
    }

    public static void reverseString(char[] s) {
        char[] arr=new char[s.length];
        int index=0;
        for (int i = s.length-1; i >= 0; i--) {
            arr[index]=s[i];
            index++;
        }
        System.arraycopy(arr, 0, s, 0, arr.length);
        System.out.println(Arrays.toString(s));
    }
}
