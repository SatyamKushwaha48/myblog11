package com.myblog.myblog11;

import java.util.function.Function;

public class TestClass5 {
    public static void main(String []args){
        Function<String ,Integer> result = str->str.length();
        Integer val = result.apply("Thomas");
        System.out.println(val);
    }
}
