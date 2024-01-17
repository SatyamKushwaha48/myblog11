package com.myblog.myblog11;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestClass3 {
    public static void main(String []args){
        List<Integer> numbers =  Arrays.asList(10,12,1,4,5,67,88,46,33);
        List<Integer> evenNumbers = numbers.stream().filter(n->n%2 != 0).collect(Collectors.toList());
        System.out.println(evenNumbers);
    }
}
