package com.myblog.myblog11;

//Supplier Functional InterFace (Auto printed Random Values)

import java.util.Random;
import java.util.function.Supplier;

public class TestClass10 {
    public static void main(String []args){

        System.out.println(new Random().nextInt(100));

        Supplier<Integer> x = ()->new Random().nextInt(1500);
        Integer y = x.get();
        System.out.println(y);

    }
}
