package com.android.problempractice;

import java.util.HashMap;
import java.util.Map;

public class Test {

    public static void main(String[] args) {

        System.out.println(romanToInt("MCMXCIV"));
        System.out.println(isArmstrongNumber(71));
    }

    public static int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int result = map.get(s.charAt(s.length() - 1));
        for (int i = s.length() - 2; i >= 0; i--) {
            if (map.get(s.charAt(i)) < map.get(s.charAt(i + 1))) {
                result -= map.get(s.charAt(i));
            } else
                result += map.get(s.charAt(i));
        }
        return result;
    }


    public static boolean isArmstrongNumber(int number){
        boolean isArmstrong = false;
        int originalNum= number;
        int reminder=0;
        int result=0;
        while (number!=0){
            reminder = number%10;
            result +=Math.pow(reminder,3);
            number /=10;
        }
        System.out.println(result+" : "+number);
        if (originalNum==result){
            isArmstrong =true;
        }
        return isArmstrong;
    }
}
