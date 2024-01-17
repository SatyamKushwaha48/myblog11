package com.myblog.myblog11;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class TestClass1 {
    public static void main(String []args){
        //List<Integer> numbers = Arrays.asList(10, 20, 24, 15, 45, 46, 19);
        Predicate<Integer> val = y->y%2==0;
        boolean result = val.test(10);
        System.out.println(result);
    }
}
