package com.android.problempractice;

public class Singleton {
//Singleton is a design pattern that ensures that a class can only have one object.
    private static Singleton instance;
    String s;

    private Singleton(){
        s="Hello Arvind";
    }

    public static Singleton getInstance() {

        if (instance==null){
            instance = new Singleton();
        }
        return instance;
    }
}

class Data{

    public static void main(String[] args){
        Singleton singleton=Singleton.getInstance();
        System.out.println(singleton.s);
    }
}
