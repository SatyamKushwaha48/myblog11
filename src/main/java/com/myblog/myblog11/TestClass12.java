package com.myblog.myblog11;

import ch.qos.logback.core.net.SyslogOutputStream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestClass12 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(12, 33, 44, 56,4,6, 78);

        List<Integer> data = numbers.stream().filter(n1 -> n1 % 2 == 0).map(n2 -> n2 * n2).collect(Collectors.toList());
        System.out.println(data);
    }
}