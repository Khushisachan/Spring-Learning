package com.jsp.model;

import org.springframework.stereotype.Component;

@Component
public class Student {
    private String name;
    private int rollNo;

    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }
}
