package com.myblog.myblog11;


//Grouping Age:- Set by Set..

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TestClass14 {
    public static void main(String []args){
        List<Employee> employees = Arrays.asList(
                new Employee("Ram",30,"Chennai"),
                new Employee("Ethan",23,"Pune"),
                new Employee("Thomas",24,"Bhopal"),
                new Employee("Krishna",20,"Vrindaban"),
                new Employee("Radha",20,"Mathura"),
                new Employee("Ram",35,"Ayodhya Dham"),
                new Employee("Sita",30,"Janakpur")

        );

        Map<Integer, List<Employee>> collect = employees.stream().collect(Collectors.groupingBy(e -> e.getAge()));

        for(Map.Entry<Integer,List<Employee>> entry : collect.entrySet()){
            int age = entry.getKey();
            List<Employee> employeessWithAge = entry.getValue();
            System.out.println("Age:"+age+"....");
            for(Employee e : employeessWithAge){
                System.out.println(e.getName());
                System.out.println(e.getCity());
            }
        }

    }

}
