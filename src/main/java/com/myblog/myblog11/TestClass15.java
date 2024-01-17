package com.myblog.myblog11;


//Grouping Age:- Set by Set..

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TestClass15 {
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
                new Employee("Lauri",34,"Khandwa"),
                new Employee("Valentina",26,"USA"),
                new Employee("Shiva",23,"Khandwa")
        );

        Map<String, List<Employee>> collect = employees.stream().collect(Collectors.groupingBy(e -> e.getCity()));

        for(Map.Entry<String,List<Employee>> entry : collect.entrySet()){
            String city = entry.getKey();
            List<Employee> employeessWithCity = entry.getValue();
            System.out.println("City:"+city+"....");
            for(Employee e : employeessWithCity){
                System.out.println(e.getName());
                System.out.println(e.getAge());
            }

        }

    }

}
