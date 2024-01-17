package com.myblog.myblog11;

//10/01/2024

public class Employee {
    private String name;
    private int age;
    private String city;

    public Employee(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCity() {
        return city;
    }
}
