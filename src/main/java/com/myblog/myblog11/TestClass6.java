package com.myblog.myblog11;

import java.util.Arrays;
import java.util.function.Function;

public class TestClass6 {
    public static void main(String []args){
        Function<Integer,Integer> result = i->i+10;
        Integer val = result.apply(30);
        System.out.println(val);
    }
}
