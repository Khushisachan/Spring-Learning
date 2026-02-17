package com.jsp.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {

    //DI
//    field
//    constructors
//    setters
//    @Value(value="")

    //@Value(value = "Himanshi")
    private String name;
    //@Value(value = "23")
    private int age;

    public String getName() {
        return name;
    }

    //    @Value(value = "Himanshi")
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    //    @Value(value = "22")
    public void setAge(int age) {
        this.age = age;
    }

    public Student(@Value(value = "${name}") String name, @Value(value = "${id}") int age) {
        this.name = name;
        this.age = age;
    }
}
