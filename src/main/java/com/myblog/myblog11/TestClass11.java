package com.myblog.myblog11;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//10/01/2024

public class TestClass11 {
    public static void main(String []args){
        List<Employee> employees = Arrays.asList(
                new Employee("Luther",30,"Chennai"),
                new Employee("Ether",23,"Pune"),
                new Employee("Thomas",24,"Bhopal"),
                new Employee("Krishna",20,"Vrindaban"),
                new Employee("Radha",19,"Mathura"),
                new Employee("Ram",35,"Ayodhya Dham"),
                new Employee("Sita",30,"Janakpur")

        );

        List<Employee> emps = employees.stream().filter(emp -> emp.getAge() > 30).collect(Collectors.toList());

        for(Employee e : emps){
            System.out.println(e.getName());
            System.out.println(e.getAge());
            System.out.println(e.getCity());
        }
    }

}
