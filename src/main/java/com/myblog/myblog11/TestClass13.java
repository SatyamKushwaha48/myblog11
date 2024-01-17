package com.myblog.myblog11;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TestClass13 {
    //grouping
    public static void main(String []args){
        List<Employee> employees = Arrays.asList(
                new Employee("Ram",30,"Chennai"),
                new Employee("Ether",23,"Pune"),
                new Employee("Thomas",24,"Bhopal"),
                new Employee("Krishna",20,"Vrindaban"),
                new Employee("Radha",20,"Mathura"),
                new Employee("Ram",35,"Ayodhya Dham"),
                new Employee("Sita",30,"Janakpur")

        );
        //Map<String, List<Employee>> collect = employees.stream().collect(Collectors.groupingBy(e -> e.getCity()));
        Map<Integer, List<Employee>> collect = employees.stream().collect(Collectors.groupingBy(e -> e.getAge()));
        //Map<String, List<Employee>> collect = employees.stream().collect(Collectors.groupingBy(e -> e.getName()));
        //System.out.println(collect.get(20));

        for(Employee employee:employees){
            List<Employee> e = collect.get(employee.getAge());

            for(Employee x : e){
                System.out.println(x.getName());
                System.out.println(x.getCity());
                System.out.println(x.getAge());
            }

        }

    }
}
