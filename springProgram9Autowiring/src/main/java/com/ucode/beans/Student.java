package com.ucode.beans;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {
    private int rollNo;
    private String name;

    @Autowired
    private Address address;
    @Autowired
    private Subjects subjects;

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                ", address=" + address +
                ", subjects=" + subjects +
                '}';
    }
}
