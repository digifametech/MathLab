package com.wind.myutils;

public class MyMaths {

    public static int sum(int a,int b){
        return a+b;
    }

    public static float div(int a,int b){
        if(b==0)
            throw new IllegalArgumentException("You can't divided by zero");
        else
            return Float.parseFloat(String.valueOf(a/b));
    }


}
