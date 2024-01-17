package com.myblog.myblog11;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestClass7 {
    public static void main(String []args){
        List<Integer> data = Arrays.asList(76,32,12,68,79,10,92,34,06,90,3,99,59,49,39,19,99,76,68,10,6,92);
        List<Integer> newNumber1 = data.stream().map(i -> i+10).collect(Collectors.toList());
        List<Integer> newNumber2 = data.stream().sorted().collect(Collectors.toList());
        //Duplicate values removed
        List<Integer> newNumber3 = data.stream().distinct().collect(Collectors.toList());

        System.out.println(newNumber1);
        System.out.println(newNumber2);
        System.out.println(newNumber3);
    }
}
