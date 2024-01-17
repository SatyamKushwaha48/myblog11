package com.myblog.myblog11;


//Grouping Age:- Set by Set..

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TestClass16 {
    public static void main(String []args){
        List<Employee> employees = Arrays.asList(
                new Employee("Vishnu",35,"Chennai"),
                new Employee("Ethan",23,"Pune"),
                new Employee("Thomas",24,"Bhopal"),
                new Employee("Krishna",20,"Mathura"),
                new Employee("Radha",20,"Mathura"),
                new Employee("Ram",30,"Ayodhya Dham"),
                new Employee("Sita",30,"Ayodhya Dham"),
                new Employee("Jorge",29,"USA"),
                new Employee("Vishnu",34,"Khandwa"),
                new Employee("Valentina",26,"USA"),
                new Employee("Thomas",23,"Khandwa"),
                new Employee("Thomas",83,"Pune")
        );

        Map<String, List<Employee>> collect = employees.stream().collect(Collectors.groupingBy(e -> e.getName()));

        for(Map.Entry<String,List<Employee>> entry : collect.entrySet()){
            String name = entry.getKey();
            List<Employee> employeessWithName = entry.getValue();
            System.out.println("Name:"+name+"....");
            for(Employee e : employeessWithName){
                System.out.println(e.getCity());
                System.out.println(e.getAge());
            }

        }

    }

}
