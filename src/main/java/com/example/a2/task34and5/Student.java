package com.example.a2.task34and5;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

@Component
public class Student {
    @Value("${studentId}")
    private int studentId;
    @Value("${studentName}")
    private String studentName;
    @Value("${company}")
    private String company;
    @Autowired
    private Address address;
    @Autowired
    @Qualifier("javaScriptProgramming")
    private Programming programming;

    public void check(){
        System.out.println("The student id and name is" + " " + studentId + " " + studentName);
        address.checking();
        programming.programming();
        System.out.println(company);

    }
}