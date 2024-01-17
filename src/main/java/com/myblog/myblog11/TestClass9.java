package com.myblog.myblog11;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

//Consumer Functional Interface
public class TestClass9 {

   /* public static void main(String []args){
        Consumer<Integer> result = number->System.out.println(number);
        result.accept(100);
    }*/

    //Consumer forEach Examples

    public static void main(String []args){
        List<String> names = Arrays.asList("mike","adam","danny");
        Consumer<String> val = name-> System.out.println(name);
        names.forEach(val);
    }



}
