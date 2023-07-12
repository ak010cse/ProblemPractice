package com.android.problempractice.easy.java;

public class ReverseVowelsString {

    public static void main(String[] args){

        String s = "hello";
        System.out.println(reverseVowels(s));
    }
    public static String reverseVowels(String s) {
        String result="";
        s=s.toLowerCase();
        for (int i=s.length()-1;i>=0;i--){
            if (s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u'){
                result += s.charAt(i);
            }else {
//                result += s;
            }
        }

        return result;
    }
}
