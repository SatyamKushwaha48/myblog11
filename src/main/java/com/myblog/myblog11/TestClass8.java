package com.myblog.myblog11;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestClass8 {
    public static void main(String []args){
        List<String> data = Arrays.asList("thomas","sarah","thunder","bharat","mia","SIGMA","MANHUS","CHIMKANDI","CHAPARGANJI");
        List<String> newData1 = data.stream().map(i -> i.toUpperCase()).collect(Collectors.toList());
        List<String> newData2 = data.stream().map(i -> i.toLowerCase()).collect(Collectors.toList());
        List<String> newData3 = data.stream().sorted().collect(Collectors.toList());
        System.out.println(newData1);
        System.out.println(newData2);
        System.out.println(newData3);
    }
}
