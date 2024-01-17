package com.myblog.myblog11;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestClass4 {
    public static void main(String []args){
        List<String> numbers = Arrays.asList("Thomas","Mike","Adam","Thomas","Sarah");
        List<String> data1 = numbers.stream().filter(s -> s.startsWith("S")).collect(Collectors.toList());
        List<String> data2 = numbers.stream().filter(s -> s.equals("Adam")).collect(Collectors.toList());
        List<String> data3 = numbers.stream().filter(s -> s.endsWith("h")).collect(Collectors.toList());
        System.out.println(data1);
        System.out.println(data2);
        System.out.println(data3);
    }
}

