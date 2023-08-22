package com.android.problempractice;

public class Enum {

    //An enum is a special "class" that represents a group of constants (unchangeable variables, like final variables).
    enum Level{
        HIGH,
        LOW,
        MEDIUM
    }
    public static void main(String[] args){

        for(Level myVar: Level.values()){
            System.out.println(myVar);
        }

        Level myVar=Level.MEDIUM;
        switch (myVar){
            case LOW:
                System.out.println("Low Level");
                break;
            case MEDIUM:
                System.out.println("Medium Level");
                break;
            case HIGH:
                System.out.println("High Level");
                break;
        }
    }
}
