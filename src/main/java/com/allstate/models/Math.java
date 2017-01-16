package com.allstate.models;

import java.util.stream.Stream;

public class Math {
    public static int square(int num){
        return num * num;
    }
    public static int factorial(int num){
       return Stream.iterate(1,n -> n + 1)
                .limit(num)
                .reduce(1,(acc,res) -> acc * res);
    }
    public static int fibonacci(int num){
        if(num<2)
            return num;
        return fibonacci(num-1) + fibonacci(num-2);
    }

}
